package com.greenfoxacademy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result

    System.out.println(letterCounter(fileToString()));
  }

  public static String fileToString() {

    StringBuilder fileConverter = new StringBuilder();

    try {
      Path filePath = Paths.get("afile.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(0));

      for (String output : lines) {
        fileConverter.append(lines);

        return output;
      }
    } catch (Exception e) {
      System.out.println("It sucks to be you! ;-)");
    }
    return fileToString();
  }

  public static int letterCounter(String fileContent) {
    int counter = 0;
    for (int i = 0; i < fileContent.length(); i++) {
      if (fileContent.charAt(i) == 'a' || fileContent.charAt(i) == 'A') {
        counter++;
      }
    }
    return counter;
  }
}
