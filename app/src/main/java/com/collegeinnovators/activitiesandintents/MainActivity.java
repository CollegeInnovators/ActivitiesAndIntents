package com.collegeinnovators.activitiesandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /*
    TODO always declare the View type before using it
     */
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TODO
        Link the above declared buttom with the one defined in XML layout using
        the below code.
         */
        submit = findViewById(R.id.button);

        /*
        TODO this code let us identify button clicks
        the functions to done when button is clicked should be within onCLick()
         */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                TODO use intent when you have to pass data between activities or to open Activity
                The intent takes to parameters
                1st parameter is the context i.e environment of the current activity
                2nd parameter is the class which is to be opened
                 */
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

}
