package com.example.lol;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b,tb;
    TextView tv;
    String s,se;
    EditText ed,edp;
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b =findViewById(R.id.button4);
        tv=findViewById(R.id.textView);
        ed=findViewById(R.id.editTextTextPersonName2);
        edp=findViewById(R.id.editTextTextPassword2);
        tb=findViewById(R.id.button3);
        cb=findViewById(R.id.checkBox2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.isChecked()) {
                    s = ed.getText().toString();
                    se = edp.getText().toString();
                    String con = se + s;
                    tv.setText(con);
                    AlertDialog.Builder ob = new AlertDialog.Builder(MainActivity.this);
                    ob.setTitle("whattisDis");
                    ob.setMessage("YOOOooooo!");
                    ob.setPositiveButton("Okay", null);
                    ob.show();
                }

//                Toast.makeText(MainActivity.this, con,Toast.LENGTH_LONG).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meanu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void takeME(MenuItem item) {
        Toast.makeText(MainActivity.this,"Profile Clicked",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);

    }
}