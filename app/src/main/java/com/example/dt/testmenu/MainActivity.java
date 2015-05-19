package com.example.dt.testmenu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.util.Log;
import android.widget.RadioButton;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=(Button)findViewById(R.id.button);
        radioButton1=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.setText("male!");
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.setText("female!");
            }
        });

    }

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    public static final int RED_MENU_ID = Menu.FIRST;
    public static final int GREEN_MENU_ID = Menu.FIRST+1;
    public static final int BLUE_MENU_ID = Menu.FIRST+2;

    private static final String TAG="TestMenu";
    private Button mButton;
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(0,RED_MENU_ID,7,"RED");
        menu.add(0,GREEN_MENU_ID,0,"GREEN");
        menu.add(0,BLUE_MENU_ID,1,"BLUE");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        switch (id){
            case RED_MENU_ID:
             //   mButton.setText("RED");
                mButton.setTextColor(Color.RED);
                return true;
            case GREEN_MENU_ID:
            //    mButton.setText("GREEN");
                mButton.setTextColor(Color.GREEN);
                return true;
            case BLUE_MENU_ID:
            //    mButton.setText("BLUE");
                mButton.setTextColor(Color.BLUE);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
