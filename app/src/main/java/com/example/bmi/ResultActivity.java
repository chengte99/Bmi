package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.bmi.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    private ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
//        setContentView(R.layout.activity_result);
        setContentView(binding.getRoot());

//        TextView result = findViewById(R.id.result);
        float bmi = getIntent().getFloatExtra("BMI", 0);
//        result.setText(getString(R.string.your_bmi_is) + bmi);
        binding.myres.setText(getString(R.string.your_bmi_is) + bmi);
    }
}
