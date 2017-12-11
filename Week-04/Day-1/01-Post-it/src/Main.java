import org.omg.PortableServer.POA;

public class Main {

  public static void main(String[] args) {
    PostIt idea1 = new PostIt("orange", "blue", "Idea 1");
    PostIt awesome = new PostIt("pink", "black", "Awesome");
    PostIt superb = new PostIt("yellow", "green", "Superb!");
    System.out.println(idea1);
    System.out.println(awesome);
    System.out.println(superb);
  }
}
/*
Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"
*/