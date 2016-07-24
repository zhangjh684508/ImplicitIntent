package com.gary.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mDialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialButton=(Button)findViewById(R.id.activity_main_button);
        mDialButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*
                Uri number= Uri.parse("tel:1555555");
                Intent callIntent=new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
                */

                Uri webPage=Uri.parse("http://www.bing.com");
                Intent webIntent=new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(webIntent);

            }
        }
        );




    }
}
