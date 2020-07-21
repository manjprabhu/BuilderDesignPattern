package com.btk.builderdesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User.builder()
                .userId("100")
                .name("username")
                .address("User Address")
                .age(30)
                .build();

        Log.v("===","Name:"+user.getName());
        Log.v("===","Address:"+user.getAddress());
        Log.v("===","Age:"+user.getAge());
        Log.v("===","UserId:"+user.getUserId());
    }
}
