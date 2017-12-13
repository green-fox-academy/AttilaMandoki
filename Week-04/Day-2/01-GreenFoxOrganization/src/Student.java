public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  /*
  Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
  Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
  */

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void getGoal() {
    System.out.println(goalMessage + "Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization
            + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;

    return numberOfDays;
  }
}