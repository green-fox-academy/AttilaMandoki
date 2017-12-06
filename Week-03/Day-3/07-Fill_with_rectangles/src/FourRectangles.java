import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    graphics.setColor(Color.RED);
    graphics.fillRect(100, 100, 50, 100);

    graphics.setColor(Color.GREEN);
    graphics.fillRect(150, 200, 50, 80);

    graphics.setColor(Color.BLUE);
    graphics.fillRect(80, 200, 70, 40);

    graphics.setColor(Color.YELLOW);
    graphics.fillRect(150, 125, 120, 75);

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