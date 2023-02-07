package com.example.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout scrollView;

    LinearLayout.LayoutParams paramsLinear;

    LinearLayout.LayoutParams params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scroll);

        paramsLinear = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);

        for (int i = 0; i < ListDog.list.size(); i++) {
            importList(ListDog.list.get(i).getName(),
                    ListDog.list.get(i).getPrice(),
                    ListDog.list.get(i).getDes());
        }

        Button add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent messageIntent = new Intent(MainActivity.this, MainActivity2.class);
                someActivityResultLauncher.launch(messageIntent);
            }
        });

    }

    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK) {
                        // There are no request codes
                        Intent data = result.getData();
                        importList(data.getStringExtra("name"),
                                data.getStringExtra("price"),
                                data.getStringExtra("des"));
                    }
                }
            });

    private void importList(String name, String price, String des) {
        TextView textView1 = new TextView(this);
        textView1.setText(name);
        textView1.setLayoutParams(params);
        textView1.setGravity(Gravity.CENTER);
        TextView textView2 = new TextView(this);
        textView2.setText(price);
        textView2.setLayoutParams(params);
        textView2.setGravity(Gravity.CENTER);
        TextView textView3 = new TextView(this);
        textView3.setText(des);
        textView3.setLayoutParams(params);
        textView3.setGravity(Gravity.CENTER);

        LinearLayout wrapper = new LinearLayout(this);
        wrapper.setOrientation(LinearLayout.HORIZONTAL);
        wrapper.setGravity(Gravity.CENTER);
        wrapper.setLayoutParams(paramsLinear);
        wrapper.addView(textView1);
        wrapper.addView(textView2);
        wrapper.addView(textView3);

        scrollView.addView(wrapper);
    }
}