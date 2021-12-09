import MovablePackage.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    CarModel model;

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();
        cc.model = new CarModel();

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : model.getVehicles()) {
                car.move(frame.getWidth(),frame.getHeight()-250,0,0);
                frame.drawPanel.paintCars(model);
            }
        }
    }


    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : model.getVehicles()
                ) {
            car.gas(gas);
            //System.out.println(car.getModelName() + " gased with " + amount);
        }
    }
    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle car : model.getVehicles()
        ) {
            car.brake(brake);
        }
    }
    void start(){
        for (Vehicle car : model.getVehicles()
        ) {
            car.startEngine();
        }
    }
    void stop(){
        for (Vehicle car : model.getVehicles()
        ) {
            car.stopEngine();
        }
    }
    void turboOn(){
        for (Vehicle car : model.getVehicles()
        ) {
            if (car instanceof Saab95){
                ((Saab95) car).setTurboOn();
            }
        }
    }
    void turboOff(){
        for (Vehicle car : model.getVehicles()
        ) {
            if (car instanceof Saab95){
                ((Saab95) car).setTurboOff();
            }
        }
    }
    void raiseFlatbed(){
        for (Vehicle car : model.getVehicles()
        ) {
            if (car instanceof Scania){
                ((Scania) car).raisePlatform();
                System.out.println("Scania platform is: " + ((Scania) car).getPlatform().isRaised() + " with angle: "+ ((Scania) car).getPlatform().getAngle());
            }
        }
    }
    void lowerFlatbed(){
        for (Vehicle car : model.getVehicles()
        ) {
            if (car instanceof Scania){
                ((Scania) car).lowerPlatform();
                System.out.println("Scania platform is: " + ((Scania) car).getPlatform().isRaised() + " with angle: "+ ((Scania) car).getPlatform().getAngle());
            }
        }
    }
}
