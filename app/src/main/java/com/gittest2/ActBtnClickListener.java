package com.gittest2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActBtnClickListener extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btnclicklistener);
        ((Button) findViewById(R.id.natehome)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.call)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.gallery)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.fin)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActBtnClickListener.this.finish();
            }
        });


    }
}
