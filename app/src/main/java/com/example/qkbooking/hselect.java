package com.example.qkbooking;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class hselect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hselect);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
      CardView cv=findViewById(R.id.h1);
       CardView h2=findViewById(R.id.h2);
        CardView h3=findViewById(R.id.h3);
        CardView h4=findViewById(R.id.h4);
        CardView h5=findViewById(R.id.h5);
        CardView h6=findViewById(R.id.h6);
        CardView h7=findViewById(R.id.h7);
        CardView h8=findViewById(R.id.h8);
        CardView h9=findViewById(R.id.h9);
        CardView h10=findViewById(R.id.h10);
        cv.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);
            Toast.makeText(this, "Selected 1", Toast.LENGTH_SHORT).show();});

        h2.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 2", Toast.LENGTH_SHORT).show();});

        h3.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 3", Toast.LENGTH_SHORT).show();});
        h4.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 4", Toast.LENGTH_SHORT).show();});
        h5.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 5", Toast.LENGTH_SHORT).show();});
        h6.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 6", Toast.LENGTH_SHORT).show();});
        h7.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 7", Toast.LENGTH_SHORT).show();});
        h8.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 8", Toast.LENGTH_SHORT).show();});

        h9.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 9", Toast.LENGTH_SHORT).show();});

        h10.setOnClickListener(v->{Intent intent = new Intent(this, opform.class);startActivity(intent);Toast.makeText(this, "Selected 10", Toast.LENGTH_SHORT).show();});







    }
}