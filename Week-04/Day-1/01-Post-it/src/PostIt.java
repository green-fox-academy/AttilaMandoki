public class PostIt {

  String backgroundColor;
  String textColor;
  String textContent;

  @Override
  public String toString() {
    return "Your post it says: " + textContent + ", with the background color of " + backgroundColor + " and the text color of " + textColor + ".";
  }

  public PostIt(String backgroundColor, String textColor, String textContent) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.textContent = textContent;


  }
}
