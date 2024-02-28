package com.example.snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowSnackbar = findViewById(R.id.btnShowSnackbar);
        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar(view);
            }
        });
    }

    public void showSnackbar(View view) {
        Snackbar.make(view, "This is a demo Snackbar!", Snackbar.LENGTH_SHORT).show();
    }
}
