package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton btnAllType, btnLost, btnFound;
    MaterialButton btnAllCategory, btnGadgets, btnPersonal, btnBags, btnAccessories, btnClothing, btnSchoolSupplies, btnDrinkware, btnOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAllType = findViewById(R.id.btnAllType);
        btnLost = findViewById(R.id.btnLost);
        btnFound = findViewById(R.id.btnFound);

        btnAllCategory = findViewById(R.id.btnAllCategory);
        btnGadgets = findViewById(R.id.btnGadgets);
        btnPersonal = findViewById(R.id.btnPersonal);
        btnBags = findViewById(R.id.btnBags);
        btnAccessories = findViewById(R.id.btnAccessories);
        btnClothing = findViewById(R.id.btnClothing);
        btnSchoolSupplies = findViewById(R.id.btnSupplies);
        btnDrinkware = findViewById(R.id.btnDrinkware);
        btnOthers = findViewById(R.id.btnOthers);

        setupToggleBehavior(btnAllType, btnLost, btnFound);
        setupToggleBehavior(btnAllCategory, btnGadgets, btnPersonal, btnBags, btnAccessories, btnClothing, btnSchoolSupplies, btnDrinkware, btnOthers);
    }

    private void setupToggleBehavior(MaterialButton... buttons) {
        for (MaterialButton button : buttons) {
            button.setOnClickListener(v -> {
                for (MaterialButton b : buttons) {
                    b.setBackgroundColor(Color.TRANSPARENT);
                    b.setStrokeColorResource(R.color.blue);
                    b.setTextColor(ContextCompat.getColor(this, R.color.blue));
                }
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
                button.setTextColor(Color.WHITE);
            });
        }
    }
}
