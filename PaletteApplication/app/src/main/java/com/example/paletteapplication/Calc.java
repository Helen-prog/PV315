package com.example.paletteapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class Calc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText costService = findViewById(R.id.costOfService);
                String keyword = costService.getText().toString();
                int cost = Integer.parseInt(keyword);
                double tip = 0;

                RadioGroup tipOptions = findViewById(R.id.tipOptions);
                int selectedId = tipOptions.getCheckedRadioButtonId();
                if(selectedId == R.id.options_ten_percent){
                    tip = cost * 0.1;
                } else if (selectedId == R.id.options_seven_percent) {
                    tip = cost * 0.07;
                } else if (selectedId == R.id.options_five_percent) {
                    tip = cost * 0.05;
                }

                SwitchMaterial roundSwitch = findViewById(R.id.roundSwitch);
                boolean round = roundSwitch.isChecked();

                if(round){
                    tip = Math.ceil(tip);
                }

                TextView tipResult = findViewById(R.id.tipResult);
                String result = String.valueOf(tip);
                tipResult.setText(result);
            }
        });
    }
}