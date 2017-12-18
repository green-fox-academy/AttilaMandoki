public class Teacher {

  public Teacher() {
  }

  public void answer() {
  }

  public void teach(Student student) {
    student.learn();
  }
}

/*
Teacher
teach(student) -> calls the students learn method
answer()
*/