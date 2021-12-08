import MovablePackage.Vehicle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import java.util.List;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    // Just a single image, TODO: Generalize
    BufferedImage currentImage;
    CarModel model;

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
    }

    public void paintCars(CarModel carModel){
        model = carModel;
        repaint();
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            for (Vehicle car : model.getVehicles()) {
                getImage(car);
                int x = (int) Math.round(car.getPosition().getX());
                int y = (int) Math.round(car.getPosition().getY());
                g.drawImage(currentImage, x, y, null);
            }
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
    private void getImage(Vehicle car){
        try{
            currentImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/"+car.getModelName()+".jpg"));
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
