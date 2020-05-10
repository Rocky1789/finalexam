package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button plus, minus;
    ImageView battery;
    int num = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        plus = findViewById(R.id.button2);
        minus = findViewById(R.id.button);
        battery = findViewById(R.id.imageView2);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);

        battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                if (num == 0) {
                    break;
                } else {
                    num--;
                    switch (num) {
                        case 0:
                            battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                            break;

                        case 1:
                            battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                            break;

                        case 2:
                            battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                            break;

                        case 3:
                            battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                            break;

                        case 4:
                            battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                            break;

                        case 5:
                            battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                            break;
                    }
                    break;
                }

            case R.id.button2:
                if (num == 6){
                    break;
                }
                else {
                    num++;
                    switch(num){
                        case 1:
                            battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                            break;

                        case 2:
                            battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                            break;

                        case 3:
                            battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                            break;

                        case 4:
                            battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                            break;

                        case 5:
                            battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                            break;

                        case 6:
                            battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                            break;
                    }
                    break;
                }
            default:
                break;
        }
    }
}
