package com.example.loginandregister2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText Name , Id, Address , Latitude ,Longitude ,Pincode,City,Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Name = (EditText) findViewById(R.id.etName);
        Id = (EditText) findViewById(R.id.etId);
        Address =(EditText) findViewById(R.id.etAddress);
        Latitude =(EditText) findViewById(R.id.etLatitude);
        Longitude = (EditText) findViewById(R.id.etLongitude);
        Pincode = (EditText) findViewById(R.id.etPincode);
        City = (EditText) findViewById(R.id.etCity);
        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);



    }
    public  void OnReg(View view){
        String str_Name = Name.getText().toString();
        String str_Id = Id.getText().toString();
        String str_Address = Address.getText().toString();
        String str_Latitude = Latitude.getText().toString();
        String str_Longitude = Longitude.getText().toString();
        String str_Pincode = Pincode.getText().toString();
        String str_City = City.getText().toString();
        String str_Username = Username.getText().toString();
        String str_Password = Password.getText().toString();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_Name, str_Id,str_Address,str_Latitude,str_Longitude,str_Pincode,str_City,str_Username,str_Password);

    }
}