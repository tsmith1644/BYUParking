package byu.byuparking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

/**
 * Created by samue on 10/17/2017.
 * this is the filter activity
 */

public class FilterActivity extends AppCompatActivity
{
    private RadioButton faculty;
    private RadioButton grad;
    private RadioButton ugrad;
    private RadioButton visitor;
    private RadioButton notPaid;
    @Override
    protected void onCreate(Bundle savedInstanceBundle)
    {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_filter);


    }



}
