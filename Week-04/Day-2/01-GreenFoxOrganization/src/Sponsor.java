public class Sponsor extends Person {

  String companyName;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String companyName) {
    super(name, age, gender);
    this.companyName = companyName;
    this.hiredStudents = hiredStudents;

  }

  public Sponsor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.companyName = "Google";
    this.hiredStudents = 0;

  }

  public int hiredStudents() {
    hiredStudents = ++hiredStudents;

    return hiredStudents;
  }

  public void getGoal() {
    System.out.println(goalMessage + "Hire brilliant junior software developers.");
  }
  public void introduce() {
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + companyName + " and hired " + hiredStudents + " students so far.");

  }
}
 /*
  Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
  Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
  */