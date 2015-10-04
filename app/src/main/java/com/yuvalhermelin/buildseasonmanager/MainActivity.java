package com.yuvalhermelin.buildseasonmanager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Spinner mSpinner;
    private Button mButton;
    private CheckBox mCheckBox;
    private EditText mNameEditText;
    private TextView mLicenseEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLicenseEditText = (TextView) findViewById(R.id.licenseEditText);
        mLicenseEditText.setText("I hereby agree to use my name, and only my name when using this app. I also agree to not abuse my privileges as an admin, semi-admin, or standard user, and will be subject to banning from the app if done so. This application is solely for the Fremont High School Robotics team, and any unknown users will immediately be banned from usage of the app. Please report any bugs or vulnerabilities of the app to the creators of the app. Use app responsibly.\n");
        mSpinner = (Spinner) findViewById(R.id.subteamSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.subteam_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);
    }
}
