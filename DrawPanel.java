import Movable.Vehicle;

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
    List<BufferedImage> images;
    BufferedImage volvoImage;
    BufferedImage saabImage;
    BufferedImage scaniaImage;

    // TODO: To keep track of a singel cars position (list of points)
    List<Vehicle> cars;
    List<Point> points = Arrays.asList(new Point(),new Point(),new Point());
    Point volvoPoint = new Point();
    Point saabPoint = new Point();
    Point scaniaPoint = new Point();


    // TODO: Make this genereal for all cars
    void moveit(int x, int y, String car){
        if (Objects.equals(car, "Volvo240")) {
            volvoPoint.x = x;
            volvoPoint.y = y;
        } else if (Objects.equals(car, "Saab95")) {
            saabPoint.x = x;
            saabPoint.y = y;
        } else if (Objects.equals(car, "Scania")) {
            scaniaPoint.x = x;
            scaniaPoint.y = y;
        }
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, List<Vehicle> cars) {
        this.cars = cars;
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Movable.Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            images = new ArrayList<>();
            for (Vehicle car: cars) {
                images.add(ImageIO.read(DrawPanel.class.getResourceAsStream("pics/"+car.getModelName()+".jpg")));
            }

        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int n = 0;
        for (Vehicle car:cars) {
            int x = (int) Math.round(car.getPosition().getX());
            int y = (int) Math.round(car.getPosition().getY());
            g.drawImage(images.get(n),x,y,null);
            n++;
        }
        //g.drawImage(volvoImage, volvoPoint.x, volvoPoint.y, null); // see javadoc for more info on the parameters
        //g.drawImage(saabImage, saabPoint.x, saabPoint.y, null); // see javadoc for more info on the parameters
        //g.drawImage(scaniaImage, scaniaPoint.x, scaniaPoint.y, null); // see javadoc for more info on the parameters

    }
}
