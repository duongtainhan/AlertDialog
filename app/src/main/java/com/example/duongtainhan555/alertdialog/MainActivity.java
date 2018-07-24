package com.example.duongtainhan555.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa
        btnAlertDialog = findViewById(R.id.btnAlertDialog);

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Ban co muon tat hop thoai hay k?");
                alertDialog.setMessage("Hay xac nhan ben duoi");
                alertDialog.setIcon(R.mipmap.ic_launcher);
                alertDialog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Ban da chon co",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });
    }
}
