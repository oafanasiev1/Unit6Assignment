package com.example.unit6assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Call Makar function
    public void callMakar(View view) {
        TextView textView = (TextView) findViewById(R.id.textView4);
        // Use format with "tel:" and phone number to create phoneNumber.
        String phoneNumber = String.format("tel: %s",
                textView.getText().toString());
        // Create the intent.
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        // Set the data for the intent as the phone number.
        dialIntent.setData(Uri.parse(phoneNumber));
        // If package resolves to an app, send intent.
        if (dialIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(dialIntent);
        }
    }
    //Call Brandon function
    public void callBrandon(View view){
        TextView textView = (TextView) findViewById(R.id.textView5);
        // Use format with "tel:" and phone number to create phoneNumber.
        String phoneNumber = String.format("tel: %s",
                textView.getText().toString());
        // Create the intent.
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        // Set the data for the intent as the phone number.
        dialIntent.setData(Uri.parse(phoneNumber));
        // If package resolves to an app, send intent.
        if (dialIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(dialIntent);
        }
    }
    //Call Jack function
    public void callJack(View view){
        TextView textView = (TextView) findViewById(R.id.textView6);
        // Use format with "tel:" and phone number to create phoneNumber.
        String phoneNumber = String.format("tel: %s",
                textView.getText().toString());
        // Create the intent.
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        // Set the data for the intent as the phone number.
        dialIntent.setData(Uri.parse(phoneNumber));
        // If package resolves to an app, send intent.
        if (dialIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(dialIntent);
        }
    }
    //Text Makar function

    public void textMakar(View view)
    {
        // Find the TextView number_to_call and assign it to textView.
        TextView textView = (TextView) findViewById(R.id.textView4);
        // Concatenate "smsto:" with phone number to create smsNumber.
        String smsNumber = "smsto:" + textView.getText().toString();
        // Create the intent.
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        // Set the data for the intent as the phone number.
        smsIntent.setData(Uri.parse(smsNumber));
        // Add the message (sms) with the key ("sms_body").
        smsIntent.putExtra("sms_body", "Hi");
        // If package resolves (target app installed), send intent.
        if (smsIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(smsIntent);
        }
    }

    //Text Brandon function
    public void textBrandon(View view)
    {
        // Find the TextView number_to_call and assign it to textView.
        TextView textView = (TextView) findViewById(R.id.textView5);
        // Concatenate "smsto:" with phone number to create smsNumber.
        String smsNumber = "smsto:" + textView.getText().toString();
        // Create the intent.
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        // Set the data for the intent as the phone number.
        smsIntent.setData(Uri.parse(smsNumber));
        // Add the message (sms) with the key ("sms_body").
        smsIntent.putExtra("sms_body", "Hi");
        // If package resolves (target app installed), send intent.
        if (smsIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(smsIntent);
        }
    }
    //Text Jack function
    public void textJack(View view)
    {
        // Find the TextView number_to_call and assign it to textView.
        TextView textView = (TextView) findViewById(R.id.textView6);
        // Concatenate "smsto:" with phone number to create smsNumber.
        String smsNumber = "smsto:" + textView.getText().toString();
        // Create the intent.
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        // Set the data for the intent as the phone number.
        smsIntent.setData(Uri.parse(smsNumber));
        // Add the message (sms) with the key ("sms_body").
        smsIntent.putExtra("sms_body", "Hi");
        // If package resolves (target app installed), send intent.
        if (smsIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(smsIntent);
        }
    }

}