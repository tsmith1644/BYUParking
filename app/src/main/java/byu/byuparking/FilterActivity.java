package byu.byuparking;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
    private Button save = (Button)findViewById(R.id.saveSettings);
    private FilterActivity aView;
    @Override
    protected void onCreate(Bundle savedInstanceBundle)
    {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_filter);
        aView = this;
        Intent intent = getIntent();
        String preferences = intent.getStringExtra("Preference");
        if(preferences.equals("All"))
        {
            all.setChecked(true);
        }
        else if(preferences.equals("Faculty"))
        {
            faculty.setChecked(true);
        }
        else if (preferences.equals("Grad"))
        {
            grad.setChecked(true);
        }
        else if ( preferences.equals("Ugrad"))
        {
            ugrad.setChecked(true);
        }
        else if (preferences.equals("Visitor"))
        {
            visitor.setChecked(true);
        }
        else if (preferences.equals("Notpaid"))
        {
            notPaid.setChecked(true);
        }

        save.setOnClickListener(new View.OnClickListener()
        {
            String returnPref = "";
            public void onClick(View v)
            {
                if(all.isChecked() == true)
                {
                    returnPref = "All";
                }
                else if ( faculty.isChecked())
                {
                    returnPref  = "Faculty";
                }
                else if (grad.isChecked())
                {
                    returnPref = "Grad";
                }
                else if (ugrad.isChecked())
                {
                    returnPref = "Ugrad";
                }
                else if (visitor.isChecked())
                {
                    returnPref = "Visitor";
                }
                else if (notPaid.isChecked())
                {
                    returnPref = "Notpaid";
                }

                Intent intent1 = new Intent(aView,MainActivity.class);
                intent1.putExtra("Preferences", returnPref);
                startActivity(intent1);
            }

        });
    }





}
