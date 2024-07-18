package com.example.qkbooking;

import static android.app.PendingIntent.getActivity;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;
import java.net.URI;

public class opform extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opform);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button openLinkButton = findViewById(R.id.button_register);



        openLinkButton.setOnClickListener(v -> {

            try {
                Intent i=new Intent(this, MainActivity.class);

                String url =   "https://razorpay.me/@kopp?amount=T%2FpUAiSSrhOK7IH%2BNk7Kdg%3D%3D"; // Replace with your actual URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));


                startActivity(intent);



            Intent intent1=new Intent(getApplicationContext(),opform.class);
                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_IMMUTABLE);
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("9391732731","Rigisterd",null,pi,null);

                finish();







            } catch (UnsupportedOperationException e) {
                // Handle exceptions like missing default browser or I/O errors
                e.printStackTrace();
                // You can optionally show an error message to the user here
            }
        });


    }
}