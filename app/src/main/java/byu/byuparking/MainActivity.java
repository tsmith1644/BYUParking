package byu.byuparking;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Console;
import java.sql.Time;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private listOfLots lots;
    private String lotsToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lots = new listOfLots();
        if(getIntent().hasExtra("Preferences"))
        {
            Intent intent = getIntent();
            lotsToShow = intent.getStringExtra("Preferences");
            //Log.e("RETURN", "Lots to Show = " + lotsToShow);
        }
        else
        {
            lotsToShow = lots.getCurrentPreference();
            //Log.e("CREATION", "Intent does not exist");
        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we
     * just add a marker near Africa.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng byu = new LatLng(40.2518, -111.6493);
        float zoomLevel = 14.0f;
        lots.getParkingList();
        for (Map.Entry<String, Lot> entry : lots.getParkingList().entrySet()) {
            if (shouldDrawLot(entry.getValue())) {
                drawParkingLot(entry.getValue(), entry.getKey());
            }
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(byu, zoomLevel));
    }

    public void drawParkingLot(Lot lot, String name) {
        //add lot marker
        mMap.addMarker(new MarkerOptions().position(lot.getDestination()).icon(BitmapDescriptorFactory.defaultMarker(lot.getAvailabilityColor())).title("Lot " + name).snippet(lot.displayAvailability()));
        //draw lot polygon
        mMap.addPolygon(new PolygonOptions().addAll(lot.getLotShape()).strokeColor(lot.getLotTypeColor()).fillColor(lot.getLotTypeColor()));
    }

    public boolean shouldDrawLot(Lot lot) {
        if (isOpenTime(lot)) {
            return true;
        }
        if (lotsToShow.equals("All")) {
            return true;
        } else if (lotsToShow.equals("Faculty")) {
            if (lot.getLotType().equals("A") || lot.getLotType().equals("G") || lot.getLotType().equals("Y") || lot.getLotType().equals("U")) {
                return true;
            }
        } else if (lotsToShow.equals("Grad")) {
            if (lot.getLotType().equals("G") || lot.getLotType().equals("Y") || lot.getLotType().equals("U")) {
                return true;
            }
        } else if (lotsToShow.equals("Ugrad")) {
            if (lot.getLotType().equals("Y") || lot.getLotType().equals("U")) {
                return true;
            }
        } else if (lotsToShow.equals("Visitor")) {
            if (lot.getLotType().equals("V")) {
                return true;
            }
        } else if (lotsToShow.equals("Notpaid")) {
            if (lot.getLotType().equals("U")) {
                return true;
            }
        }
        return false;
    }

    public boolean isOpenTime(Lot lot) {
        boolean isOpen = false;
        int hours = new Time(System.currentTimeMillis()).getHours();
        if (hours < 12) {
            if (hours < lot.getHoursStart()) {
                isOpen = true;
            }
        } else {
            hours = hours - 12;
            if (hours >= lot.getHoursEnd()) {
                isOpen = true;
            }
        }
        Log.e("RETURN", "Hours = " + hours);
        return isOpen;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.filter,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.filterTitle:
                //switch activity
                Intent intent = new Intent(this,FilterActivity.class);
                String preference = lots.getCurrentPreference();
                intent.putExtra("Preference",preference);
                startActivity(intent);
                return true;
            default:
                return false;
        }

    }


}
