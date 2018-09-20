package com.example.android.datafrominternet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.view.View;

public class ContactActivity extends Activity implements View.OnClickListener {

    Button mBackButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        mBackButton=(Button) findViewById(R.id.action_back);
        mBackButton.setOnClickListener(ContactActivity.this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,MainActivity.class);
        this.startActivity(i);
    }
}
