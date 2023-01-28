package com.agora.samtan.agorabroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Spinner spinner = findViewById(R.id.trees);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Trees, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View view, int i, long l) {
                String selected_tree = spinner.getSelectedItem().toString();

                TextView price = findViewById(R.id.price);

                if(selected_tree.equals("Neem Tree"))
                {
                    price.setText("Rs. 50");
                }
                else if(selected_tree.equals("Banyan Tree"))
                {
                    price.setText("Rs. 60");
                }
                else if(selected_tree.equals("Peepal Tree"))
                {
                    price.setText("Rs. 65");
                }
                else if(selected_tree.equals("Mahogany Tree"))
                {
                    price.setText("Rs. 45");
                }
                else if(selected_tree.equals("Apple Tree"))
                {
                    price.setText("Rs. 80");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}