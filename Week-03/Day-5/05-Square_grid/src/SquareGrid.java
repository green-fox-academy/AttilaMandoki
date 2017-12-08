import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  //    Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 824;

  public static void mainDraw(Graphics graphics) {
    int canvasCenterX = WIDTH / 2;
    int canvasCenterY = HEIGHT / 2;
    int squareSide = 300;

    rectPlacer(graphics, canvasCenterX - squareSide / 2, canvasCenterY - squareSide / 2, squareSide, 4);
  }

  public static void rectPlacer(Graphics graphics, float x, float y, int side, int level) {
    if (level > 0) {
      graphics.drawRect((int) x, (int) y, side, side);
      rectPlacer(graphics, (x - side / 2) + (side / 4), (y - side / 2) + (side / 4), side / 2, level - 1);
      rectPlacer(graphics, (x + side / 2) + (side / 4), (y + side / 2) + (side / 4), side / 2, level - 1);
      rectPlacer(graphics, (x + side / 2) + (side / 4), (y - side / 2) + (side / 4), side / 2, level - 1);
      rectPlacer(graphics, (x - side / 2) + (side / 4), (y + side / 2) + (side / 4), side / 2, level - 1);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}