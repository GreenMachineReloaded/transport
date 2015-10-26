package com.darkpencil.transport.TransportPack;

/**
 * Created by Jeremy on 10/21/2015.
 */
public class Transport {

    public void moveForward(int numberOfMilesToMove) {
        System.out.println("I don't know how to move " + Integer.toString(numberOfMilesToMove) + " miles forward yet :(");
    }

    public void moveBackwards(int numberOfMilesToMove) {
        System.out.println("I don't know how to move " + Integer.toString(numberOfMilesToMove) + " miles backward yet :(");
    }

    public void turnLeft() {
        System.out.println("I don't know how to turn left");
    }

    public void turnRight() {
        System.out.println("I don't know how to turn right");
    }

    public void stop() {
        System.out.println("I can't stop. Oh boy. This is not good.");
    }

}
