package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView D1;
    TextView D2;
    TextView D3;
    TextView D4;
    TextView D5;
    TextView D6;
    TextView D7;
    TextView D8;
    TextView D9;
    TextView D10;
    TextView D11;
    TextView D12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        D1 = findViewById(R.id.dName);
        D2 = findViewById(R.id.dAdd);
        D3 = findViewById(R.id.dDoB);
        D4 = findViewById(R.id.dSex);
        D5 = findViewById(R.id.dHT);
        D6 = findViewById(R.id.dWT);
        D7 = findViewById(R.id.dNationality);
        D8 = findViewById(R.id.dRestrictions);
        D9 = findViewById(R.id.dConditions);
        D10 = findViewById(R.id.dAGY);
        D11 = findViewById(R.id.dExpires);
        D12 = findViewById(R.id.dLicenseNumber);


        String nameDisplay;
        String addDisplay;
        String DoBDisplay;
        String sexDisplay;
        String HTDisplay;
        String WTDisplay;
        String nationalityDisplay;
        String restrictionsDisplay;
        String conditionsDisplay;
        String agyDisplay;
        String expiresDisplay;
        String licenseNoDisplay;
        nameDisplay = getIntent().getExtras().getString("strName");
        addDisplay = getIntent().getExtras().getString("strAddress");
        DoBDisplay = getIntent().getExtras().getString("strDoB");
        sexDisplay = getIntent().getExtras().getString("strSex");
        HTDisplay = getIntent().getExtras().getString("strHT");
        WTDisplay = getIntent().getExtras().getString("strWT");
        nationalityDisplay = getIntent().getExtras().getString("strNationality");
        restrictionsDisplay = getIntent().getExtras().getString("strRestriction");
        conditionsDisplay = getIntent().getExtras().getString("strCondition");
        agyDisplay = getIntent().getExtras().getString("strAGY");
        expiresDisplay = getIntent().getExtras().getString("strExpiration");
        licenseNoDisplay = getIntent().getExtras().getString("strLicenseNo");


        D1.setText(nameDisplay);
        D2.setText(addDisplay);
        D3.setText(DoBDisplay);
        D4.setText(sexDisplay);
        D5.setText(HTDisplay);
        D6.setText(WTDisplay);
        D7.setText(nationalityDisplay);
        D8.setText(restrictionsDisplay);
        D9.setText(conditionsDisplay);
        D10.setText(agyDisplay);
        D11.setText(expiresDisplay);
        D12.setText(licenseNoDisplay);



    }
}