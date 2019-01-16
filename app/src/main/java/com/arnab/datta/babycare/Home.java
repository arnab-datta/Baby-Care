package com.arnab.datta.babycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bt1=findViewById(R.id.buttonmp);
        bt2=findViewById(R.id.buttonvd);
        bt3=findViewById(R.id.buttonhc);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMyProfile();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityVaccineDetails();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHealthCare();
            }
        });



    }

    public  void openActivityMyProfile(){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }

    public  void openActivityVaccineDetails(){
        Intent intent = new Intent(this, Vaccine.class);
        startActivity(intent);
    }

    public  void openActivityHealthCare(){
        Intent intent = new Intent(this, HealthCare.class);
        startActivity(intent);
    }
}
