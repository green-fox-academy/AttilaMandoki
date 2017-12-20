public class NameFromEmail{

  public static void main(String[] args){
    // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
    //and returns a string that represents the user name in the following format: lastName firstName
    //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
    //accents does not matter
    System.out.println(nameFromEmail("elek.viz@exam.com"));

  }

  private static String nameFromEmail(String inputEmail) {
    String firstName = "";
    String surname = "";
    String wholeName = "";
    for (int i = 0; i < inputEmail.length(); i++) {
      if (inputEmail.charAt(i) == '@') {
        wholeName = inputEmail.substring(0, i);
        break;
      }
    }
    for (int i = 0; i < inputEmail.length(); i++) {
      if (inputEmail.charAt(i) == '.') {
        firstName = wholeName.substring(0, i);
        surname = wholeName.substring(i + 1, wholeName.length());
        break;
      }
    }
    wholeName = surname.substring(0, 1).toUpperCase() + surname.substring(1)
            + " " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    return wholeName;
  }
}