public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    StringBuffer strb = new StringBuffer(reversed);

    reversed = strb.reverse().toString();


    //There should be a way to do it like this as well (couldn't apply .toString):
    //int rewind = reversed.length();
    //for (int i = rewind-1; i > 0; i--) {
    //  rewind = rewind + reversed.charAt(i);


    /*
    Create a function that can reverse a String, which is passed as the parameter
    Use it on this reversed string to check it!
    Try to solve this using charAt() first, and optionally anything else after.
    */

    System.out.println(reversed);
  }
}