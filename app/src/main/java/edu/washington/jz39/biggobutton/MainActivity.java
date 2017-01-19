package edu.washington.jz39.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;

import java.util.Date;

public class MainActivity extends Activity {

    Button button;
    int clickCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.pushButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("MainActivity", "instance initializer: ");
                button.setText("You have Pushed me " + (++clickCount) + " times!");
            }
        });
    }


}
