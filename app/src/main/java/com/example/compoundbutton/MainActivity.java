package com.example.compoundbutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.compoundbutton.R;

public class MainActivity extends AppCompatActivity {

    CheckBox check;
    ToggleButton toggleButton;
    RadioGroup Bbutton;
    SeekBar bar;
    TextView txt;
    SeekBar seekBar;
    RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = (CheckBox)findViewById(R.id.check);
        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        Bbutton = (RadioGroup) findViewById (R.id.group);
        seekBar = (SeekBar) findViewById(R.id.seek);
        male = (RadioButton) findViewById(R.id.Rmale);
        female = (RadioButton) findViewById(R.id.Rfemale);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (check.isChecked()){
                    Toast.makeText(MainActivity.this, "check",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Unchecked",Toast.LENGTH_SHORT).show();
                }

            }
        });
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txt.setText("progress"+progress+"%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(context:MainActivity.this,text:"start",
                Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(context:MainActivity.this,text:"start",
                        Toast.LENGTH_SHORT).show();

            }
        });
             }
         }

