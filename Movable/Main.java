package Movable;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * @author A13
 */
public class Main extends Application {
    private static double dTime;
    private static long lastTime;
    private static int GAME_WITH = 800;
    private static int GAME_HEIGHT = 450;


    private GraphicsContext gc;
    Vehicle car;
    @Override
    public void init() throws Exception {
        car = new Volvo240(0,0);
        //car = new Movable.Saab95();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group);
        Canvas canvas = new Canvas(GAME_WITH,GAME_HEIGHT);
        group.getChildren().add(canvas);
        stage.setScene(scene);
        stage.show();
        gc = canvas.getGraphicsContext2D();

        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                updateDeltaTime(l);
                //update(dTime);
                render();
            }
        };
        scene.setOnKeyPressed(this::keyHandlerPressed);
        //scene.setOnKeyReleased(this::keyHandlerReleased);


        animationTimer.start();
    }



    public static void main(String[] args){
    launch(args);
    }

    public void render(){
        gc.clearRect(0,0,GAME_WITH,GAME_HEIGHT);
        gc.setFill(Color.RED);
        gc.fillOval(car.getPosition().getX(),car.getPosition().getY(),30,30);
        car.move(GAME_WITH - 30,GAME_HEIGHT-30,0,0);

        gc.fillText("current speed:" + car.getCurrentSpeed(),10,20);
        gc.setFill(Color.BLACK);
        gc.fillText("Current position: x:"+ car.getPosition().getX() + " y: " +car.getPosition().getY(),20,50);
    }
    private void keyHandlerPressed(KeyEvent keyEvent){
        KeyCode key = keyEvent.getCode();
        switch (key){
            case W -> car.gas(1);
            case S -> car.brake(1);
            case A -> car.turnRight();
            case D -> car.turnLeft();

        }
    }
    private void keyHandlerReleased(KeyEvent keyEvent){
        KeyCode key = keyEvent.getCode();
        switch (key) {
            case A -> car.turnLeft();
            case D -> car.turnRight();
        }
    }
    public static void updateDeltaTime(long now){
        dTime = (now - lastTime) / 1000000000.0;
        lastTime = now;
    }

}
