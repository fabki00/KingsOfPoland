package com.android.msf.kingsofpoland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPiast = (Button) findViewById(R.id.bPiast);
        buttonPiast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code to start new activity
                Intent intent = new Intent(MainActivity.this, Piast.class);
                startActivity(intent);
            }
        });

    }


//    public void goHome(View view) {
//        ImageView imageView = (ImageView) findViewById(R.id.main_img);
//        imageView.setImageResource(R.drawable.kingsofpoland);
//
//        TextView textView = (TextView) findViewById(R.id.king_name);
//        textView.setText("");
//    }

    public void showPiast(View view) {

    }

}
