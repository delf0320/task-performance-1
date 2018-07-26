package edu.sti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {
    public void BlogPost(View view) {
        EditText text = findViewById(R.id.string_title);
        String a = text.getText().toString();
        EditText text1 = findViewById(R.id.blog);
        String b = text1.getText().toString();

        Log.d("MyActivity", "Title: " + a);
        Log.d("MyActivity", "Blog: " + b);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

}
