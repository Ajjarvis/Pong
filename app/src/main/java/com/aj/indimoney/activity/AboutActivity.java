package com.aj.indimoney.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.aj.indimoney.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle("Data Developer");
    }

    @Override
    public void onBackPressed() {
        this.finish();
    }
}
