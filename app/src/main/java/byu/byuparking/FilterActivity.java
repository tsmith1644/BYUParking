package byu.byuparking;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

/**
 * Created by samue on 10/17/2017.
 * this is the filter activity
 */

public class FilterActivity extends AppCompatActivity
{
    private RadioButton all = (RadioButton)findViewById(R.id.allLots);
    private RadioButton faculty = (RadioButton)findViewById(R.id.facultyParking);
    private RadioButton grad = (RadioButton)findViewById(R.id.gradParking);
    private RadioButton ugrad =( RadioButton)findViewById(R.id.ugradParking);
    private RadioButton visitor = (RadioButton)findViewById(R.id.visitorParking);
    private RadioButton notPaid = (RadioButton)findViewById(R.id.unpaidLot);
    @Override
    protected void onCreate(Bundle savedInstanceBundle)
    {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_filter);

        Intent intent = getIntent();
        String preferences = intent.getStringExtra("Preference");
        if(preferences.equals("All"))
        {

        }

    }



}
