package edu.cse470.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initGreetButton();
        initResetButton();
    }

    private void initGreetButton() {
        Button displayButton = findViewById(R.id.button);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFirstName = findViewById(R.id.editTextText);
                EditText editLastName = findViewById(R.id.editTextText2);
                TextView textDisplay = findViewById(R.id.greetingDisplay);
                String firstnameToDisplay = editFirstName.getText().toString();
                String lastnameToDisplay = editLastName.getText().toString();
                textDisplay.setText("Nice to meet you " + firstnameToDisplay + " " + lastnameToDisplay + "!");
            }
        });
    }

    private void initResetButton() {
        Button displayButton = findViewById(R.id.button2);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textDisplay = findViewById(R.id.greetingDisplay);
                EditText editFirstName = findViewById(R.id.editTextText);
                EditText editLastName = findViewById(R.id.editTextText2);
                editFirstName.setText("Name");
                editLastName.setText("Name");
                textDisplay.setText("Please Enter Appropriate Value for Names");
            }
        });
    }
}