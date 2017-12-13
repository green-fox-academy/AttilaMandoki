public class Mentor extends Person {

  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
}

  public Mentor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }
  public void getGoal() {
    System.out.println(goalMessage + "Educate brilliant junior software developers.");
  }
  public void introduce() {
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }
}

/*
Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
*/