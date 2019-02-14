package com.example.minhduc.dialoganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_show_idi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimationDialog dialog = new AnimationDialog();
                dialog.show(getSupportFragmentManager(),"MyDILG");
            }
        });
    }
}
