package com.mmsquare.android.moneta.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.mmsquare.android.moneta.R;

public class StartupActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button shoppingListButton = (Button) findViewById(R.id_main.shopping_list_button);
        shoppingListButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(StartupActivity.this, ShoppingListActivity.class);
                startActivity(intent);
            }
        });
    }
}
