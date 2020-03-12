package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class ProfileActivity extends AppCompatActivity {

    EditText nameEt, lastNameTv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameEt = findViewById(R.id.firstName);
        lastNameTv = findViewById(R.id.lastName);
        btn = findViewById(R.id.finished_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profile profile = new Profile(nameEt.getText().toString(),lastNameTv.getText().toString());
                JSONObject object = new JSONObject();
                try{
                    object.put("name", profile.name);
                    object.put("lastName",lastNameTv.getText().toString());
                }catch (JSONException e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent();
                intent.putExtra()
            }
        });
    }
}
