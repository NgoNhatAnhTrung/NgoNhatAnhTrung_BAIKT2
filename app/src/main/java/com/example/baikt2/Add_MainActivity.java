package com.example.baikt2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Add_MainActivity extends AppCompatActivity {
    Button btn_back,btn_save;
    EditText edt_linkanh, edt_dactinh, edt_tenthuonggoi, edt_tenkhoahoc;
    public static boolean status = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_main);
        //anh xa view
        edt_tenkhoahoc = findViewById(R.id.edt_tenkhoahoc);
        edt_linkanh = findViewById(R.id.edt_linkanh);
        edt_tenthuonggoi = findViewById(R.id.edt_tenthuonggoi);
        edt_tenkhoahoc = findViewById(R.id.edt_tenkhoahoc);

        btn_back = findViewById(R.id.btn_back);
        btn_save = findViewById(R.id.btn_save);

        // luu
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inserData();
                clearAll();
            }
        });

        //thoat
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Add_MainActivity.this,MainActivity.class);
                status = true;
                startActivity(intent);

            }
        });
    }

    private void inserData(){

        Map<String,Object> map = new HashMap<>();
        map.put("name",edt_tenkhoahoc.getText().toString());
        map.put("name2",edt_tenthuonggoi.getText().toString());
        map.put("dactinh",edt_dactinh.getText().toString());
        map.put("maula",edt_maula.getText().toString());
        map.put("img",edt_linkanh.getText().toString());

        FirebaseDatabase.getInstance().getReference().child("OrderFood").push()
                .setValue(map).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(Add_MainActivity.this,"Thêm móm ăn thành công!",Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Add_MainActivity.this,"Thêm món ăn thất bại!",Toast.LENGTH_SHORT).show();

                    }
                });
    }

    private  void clearAll(){
        edt_tenthuonggoi.setText("");
        edt_tenkhoahoc.setText("");
        edt_dactinh.setText("");
        edt_linkanh.setText("");
    }
}