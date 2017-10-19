package byu.byuparking;

import android.app.Activity;
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
    private RadioButton all;
    private RadioButton faculty;
    private RadioButton grad;
    private RadioButton ugrad;
    private RadioButton visitor;
    private RadioButton notPaid;
    private Button save;
    private FilterActivity aView;
    @Override
    protected void onCreate(Bundle savedInstanceBundle)
    {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_filter);
        all = (RadioButton)findViewById(R.id.allLots);
        faculty = (RadioButton)findViewById(R.id.facultyParking);
        grad = (RadioButton)findViewById(R.id.gradParking);
        ugrad =( RadioButton)findViewById(R.id.ugradParking);
        visitor = (RadioButton) findViewById(R.id.visitorParking);
        notPaid = (RadioButton) findViewById(R.id.unpaidLot);
        save = (Button)findViewById(R.id.saveSettings);
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
                setResult(Activity.RESULT_OK, intent1);
                finish();
            }

        });
    }





}
