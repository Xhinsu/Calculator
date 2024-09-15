package com.example.frontendjava;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private EditText firstNum;
    private EditText secondNum;
    private TextView result;
    private Button buttonAdd;
    private Button buttonReset;



    public int getAddition(){
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 =  + Integer.parseInt(secondNum.getText().toString());
        return num2 +num1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.i(this.getLocalClassName(),"I m mega cool");
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonReset = findViewById(R.id.buttonReset);
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        result = findViewById(R.id.result);






        buttonAdd.setOnClickListener(view -> result.setText(String.format("%d" ,getAddition())));
        buttonReset.setOnClickListener(view -> result.setText(String.format("")));
    }

}