package com.example.paletteapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        TextView textView = findViewById(R.id.textColor);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton){
                    textView.setTextColor(Color.parseColor("#009212"));
                } else if(checkedId == R.id.radioButton2){
                    textView.setTextColor(Color.parseColor("#FF6F00"));
                }
            }
        });

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        Button changeColor = findViewById(R.id.changeColor);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked()){
                    changeColor.setBackgroundColor(Color.parseColor("#009212"));
                } else {
                    changeColor.setBackgroundColor(Color.parseColor("#FF6F00"));
                }
            }
        });

        Switch mySwitch = findViewById(R.id.switch1);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    mySwitch.setTextColor(Color.parseColor("#009212"));
                } else{
                    mySwitch.setTextColor(Color.parseColor("#FF6F00"));
                }
            }
        });

//        Button changeColor = findViewById(R.id.changeColor);
//
//        changeColor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                RadioGroup radioGroup = findViewById(R.id.radioGroup);
//                int checkedButtonIndex = radioGroup.getCheckedRadioButtonId();
//                Toast.makeText(MainActivity.this, String.valueOf(checkedButtonIndex), Toast.LENGTH_SHORT).show();
//                TextView textView = findViewById(R.id.textColor);
//
//                if(checkedButtonIndex == R.id.radioButton){
//                    textView.setTextColor(Color.parseColor("#009212"));
//                } else if (checkedButtonIndex == R.id.radioButton2) {
//                    textView.setTextColor(Color.parseColor("#FF6F00"));
//                }
//            }
//        });
    }
}