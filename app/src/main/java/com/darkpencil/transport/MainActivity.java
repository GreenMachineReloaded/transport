package com.darkpencil.transport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//This import statement allows us to use all the Transport related code we are going to write
import com.darkpencil.transport.TransportPack.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Transport myTransport = new Transport(); //Here we create a new Transport object and put in the variable myTransport

        //And we order our transport to move in some different ways
        myTransport.turnLeft();
        myTransport.moveForward(82);
        myTransport.turnRight();
        myTransport.moveBackwards(5);

        //And here is the example flying saucer

        FlyingSaucer saucer = new FlyingSaucer();
        System.out.println("This is a " + saucer.typeOfTransportation());
        saucer.hover();
        saucer.turnLeft();
        saucer.moveForward(13);
        saucer.turnRight();
        saucer.moveForward(3);
        saucer.enterHyperspace("Polaris");

        //All your code should go between this

        //And this

    }
}
