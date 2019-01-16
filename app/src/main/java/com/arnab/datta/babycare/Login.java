package com.arnab.datta.babycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private TextView t1;
    private Button btl;
    private EditText tu,tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tu = findViewById(R.id.editTextUser);
        tp = findViewById(R.id.editTextPass);

        t1 = findViewById(R.id.textViewSignUp);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySignUp();
            }
        });

        btl = findViewById(R.id.buttonLogin);
        btl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHome();
            }
        });



    }
    public  void openActivitySignUp(){
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }

    public  void openActivityHome(){

        if(TextUtils.isEmpty(tu.getText()) && TextUtils.isEmpty(tp.getText()))
        {
           tu.setError("Enter Username");
           tp.setError("Enter Password");
           tu.requestFocus();
           tp.requestFocus();
        }
        else
        {
            String stru =  tu.getText().toString();
            String strp = tp.getText().toString();
            if(stru.matches("Maria123") && strp.matches("admin"))
            {
                String str = "You have logged in successfully";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Home.class);
                startActivity(intent);
            }
            else
            {
                String str1 = "Type correct username or Password";
                Toast.makeText(getApplicationContext(),str1,Toast.LENGTH_SHORT).show();
            }

        }
    }

}
