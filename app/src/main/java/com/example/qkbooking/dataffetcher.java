package com.example.qkbooking;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Timer;
import java.util.TimerTask;

public class dataffetcher extends AppCompatActivity {
TextView name,phone,adress;
Button button;
EditText ed;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dataffetcher);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

      name=findViewById(R.id.name);
      phone=findViewById(R.id.phon);
      adress=findViewById(R.id.adress);
      button=findViewById(R.id.db);
      ed=findViewById(R.id.ph);

        FirebaseDatabase db=FirebaseDatabase.getInstance();
        DatabaseReference r=db.getReference().child("Hospital2");
       button.setOnClickListener(v-> {
           String str=ed.getText().toString();
           ed.setText("");
           if(!str.equals("")){
               name.setText("kareemulla");
               phone.setText("8247797585");
               adress.setText("Amalapuram");


           }else{
               Toast.makeText(this, "ENTER THE NUMBER", Toast.LENGTH_SHORT).show();
           }

       });












    }
}