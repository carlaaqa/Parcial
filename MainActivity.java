package com.example.carla.parcial;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        String colorHex = "Alpha %";
        SeekBar Colores;
        TextView RedText, TextViewHex;
        View CuadroColor;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            View colorSample = findViewById(R.id.view);
            colorSample.setBackgroundColor(Color.parseColor(colorHex));

            Colores = findViewById(R.id.seekbar1);
            CuadroColor = findViewById(R.id.view);
            TextViewHex = findViewById(R.id.TextViewHex);

            Colores.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    String hex = "#" + ColorUtils.decimalTohex(Colores.getProgress());
                    RedText.setText("R: " + progress);
                    TextViewHex.setText(hex);
                    CuadroColor.setBackgroundColor(Color.parseColor(hex));

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }


    }

