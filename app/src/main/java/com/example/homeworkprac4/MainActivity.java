package com.example.homeworkprac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxOne;
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void onToastButtonClicked(View view) {
        checkBoxOne = findViewById(R.id.chocolate_box);
        if (checkBoxOne.isChecked()) {
            Toast.makeText(this, "Chocolate topping added" , Toast.LENGTH_SHORT).show();
        }
        checkBoxOne = findViewById(R.id.sprinkles_box);
        if (checkBoxOne.isChecked()) {
            Toast.makeText(this, "Sprinkless topping added", Toast.LENGTH_SHORT).show();
        }
        checkBoxOne = findViewById(R.id.nut_box);
        if (checkBoxOne.isChecked()) {
            Toast.makeText(this, "Nut topping added", Toast.LENGTH_SHORT).show();
        }
        checkBoxOne = findViewById(R.id.cherry_box);
        if (checkBoxOne.isChecked()) {
            Toast.makeText(this, "Cherry topping added", Toast.LENGTH_SHORT).show();
        }
        checkBoxOne = findViewById(R.id.oreo_box);
        if (checkBoxOne.isChecked()) {
            Toast.makeText(this, "Oreo topping added", Toast.LENGTH_SHORT).show();
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onCheckedButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.chocolate_box:
                if (checked)
                    // Same day service
                    displayToast(getString(R.string.choco_box));

                break;
            case R.id.sprinkles_box:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.sprinkles_check));

                break;
            case R.id.oreo_box:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.oreo_check));
                break;
            case R.id.nut_box:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.nut_check));
                break;
            case R.id.cherry_box:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.cherry_check));
                break;

            default:
                // Do nothing.
                break;
        }
    }
}

