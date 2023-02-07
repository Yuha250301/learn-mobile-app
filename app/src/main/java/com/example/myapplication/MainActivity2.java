package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button submit = findViewById(R.id.buttonSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, price, des;
                EditText value = findViewById(R.id.editName);
                name = value.getText().toString();
                value = findViewById(R.id.editPrice);
                price = value.getText().toString();
                value = findViewById(R.id.editDes);
                des = value.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name", name);
                intent.putExtra("price", price);
                intent.putExtra("des", des);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}