package com.darkpencil.transport.TransportPack;

/**
 * Created by Jeremy on 10/21/2015.
 */
public class FlyingSaucer extends Transport {

    @Override
    public void moveForward(int numberOfMilesToMove) {
        System.out.println("Flying " + Integer.toString(numberOfMilesToMove) + " miles forward");
    }

    @Override
    public void moveBackwards(int numberOfMilesToMove) {
        System.out.println("Flying " + Integer.toString(numberOfMilesToMove) + " miles backwards");
    }

    @Override
    public void turnLeft() {
        System.out.println("Rotating left");
    }

    @Override
    public void turnRight() {
        System.out.println("Rotating right");
    }

    public String typeOfTransportation() {
        return "Flying Saucer";
    }

    public void hover() {
        System.out.println("Hovering");
    }

    public void enterHyperspace(String destination) {
        System.out.println("Entering hyperspace. Destination: " + destination);
    }

}
