package com.android.msf.kingsofpoland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goHome(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.main_img);
        imageView.setImageResource(R.drawable.kingsofpoland);

        TextView textView = (TextView) findViewById(R.id.king_name);
        textView.setText("");
    }

    public void showPiast(View view) {

    }

}
