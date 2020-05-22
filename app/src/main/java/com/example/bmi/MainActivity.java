package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bmi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;
//    private EditText edWeight;
//    private EditText edHeight;
//    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.bmi_wiki)
                        .setMessage(R.string.bmi_info)
                        .setPositiveButton(R.string.ok, null)
                        .show();
            }
        });

        String hello = getString(R.string.hello);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.main_linear);
//        findViews();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    //    private void findViews() {
//        edWeight = findViewById(R.id.weight);
//        edHeight = findViewById(R.id.height);
//        result = findViewById(R.id.result);
//    }

    public void bmi(View view) {
        String w = binding.weight.getText().toString();
        String h = binding.height.getText().toString();
        Float weight = Float.parseFloat(w);
        Float height = Float.parseFloat(h);
        Float bmi = weight/(height*height);
        Log.d("MainActivity", "BMI: " + bmi);
        Toast.makeText(this, getString(R.string.your_bmi_is) + bmi, Toast.LENGTH_LONG).show();
        binding.result.setText(getString(R.string.your_bmi_is) + bmi);
//        new AlertDialog.Builder(this)
//                .setTitle("BMI")
//                .setMessage(getString(R.string.your_bmi_is) + bmi)
//                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        binding.weight.setText("");
//                        binding.height.setText("");
//                    }
//                })
//                .show();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI", bmi);
        startActivity(intent);
    }
}
