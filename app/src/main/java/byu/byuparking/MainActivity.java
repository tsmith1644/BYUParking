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
import java.util.Map;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private listOfLots lots;
    private String lotsToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        lots = new listOfLots();
        if(getIntent() !=null)
        {
            Intent intent = getIntent();
            lotsToShow = intent.getStringExtra("Preferences");
            Log.e("RETURN", "Intent returned correctly");
        }
        else
        {
            lotsToShow = lots.getCurrentPreference();
            Log.e("CREATION", "Intent does not exist");
        }
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
            drawParkingLot(entry.getValue(), entry.getKey());
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(byu, zoomLevel));
    }

    public void drawParkingLot(Lot lot, String name) {
        //add lot marker
        mMap.addMarker(new MarkerOptions().position(lot.getDestination()).icon(BitmapDescriptorFactory.defaultMarker(lot.getAvailabilityColor())).title("Lot " + name + " Type: " + lot.getLotType() + " " + lot.displayAvailability()));
        //draw lot polygon
        mMap.addPolygon(new PolygonOptions().addAll(lot.getLotShape()).strokeColor(lot.getLotTypeColor()).fillColor(lot.getLotTypeColor()));
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
