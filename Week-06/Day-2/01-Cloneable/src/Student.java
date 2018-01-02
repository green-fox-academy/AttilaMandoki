public class Student extends Person implements Cloneable {

  String previousOrganization;
  int skippedDays;

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

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}