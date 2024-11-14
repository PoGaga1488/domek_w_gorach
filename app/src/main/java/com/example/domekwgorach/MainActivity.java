package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView like;
    int count = 0;
    String text = " Polubień";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.TVLikes);
        Button bLike = findViewById(R.id.buttonl);
        Button bDelet = findViewById(R.id.buttond);
        Button bSave = findViewById(R.id.buttons);

        bLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count < 1) {
                    ++count;
                    like.setText(count + text);
                }
            }
        });
        bDelet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count > 0){
                    --count;
                    like.setText(count + text);
                }
            }
        });
    }

}