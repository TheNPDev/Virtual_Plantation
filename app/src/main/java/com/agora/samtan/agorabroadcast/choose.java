package com.agora.samtan.agorabroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import io.agora.rtc.Constants;

public class choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        Button cont = findViewById(R.id.cont);
        switch (view.getId()) {
            case R.id.donator:
                if (checked) {
                    RadioButton gardener = findViewById(R.id.gardener);
                    gardener.setChecked(false);
                    cont.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(choose.this , FirstActivity.class);
                            startActivity(intent);

                        }
                    });
                }
                break;
            case R.id.gardener:
                if (checked) {
                    RadioButton donator = findViewById(R.id.donator);
                    donator.setChecked(false);
                    cont.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(choose.this , Gardener.class);
                            startActivity(intent);

                        }
                    });
                }
                break;
        }
    }

}