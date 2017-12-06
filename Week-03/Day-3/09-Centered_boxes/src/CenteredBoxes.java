import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.

    int canvasCenterX = WIDTH / 2;
    int canvasCenterY = HEIGHT / 2;
    int sizeX = defSize();
    squareCreator(sizeX);
/*
    for (int i = 0; i < 2; i++) {

    }
*/
    graphics.drawRect(canvasCenterX - sizeX / 2, canvasCenterY - sizeX / 2, sizeX, sizeX);
  }

  public static int defSize() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the size of the square:");
    int userInput = scanner.nextInt();

    return userInput;
  }

  public static int squareCreator(int squareSide) {
    int squareSize =  squareSide * squareSide;

    return squareSize;
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}