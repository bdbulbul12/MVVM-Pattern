package com.example.mvvpvproject.view;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvvpvproject.R;
import com.example.mvvpvproject.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;
    EditText editText1,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        editText1=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultText = mainActivityViewModel.additionFunction(editText1.getText().toString(),editText2.getText().toString());
                Toast.makeText(MainActivity.this, "Sum is "+resultText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
