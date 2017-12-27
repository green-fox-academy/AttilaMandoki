public class Main {

  public static void main(String[] args) {

    Teacher teacher = new Teacher();
    Student student = new Student();

    teacher.teach(student);
    student.question(teacher);

    System.out.println(student);
    System.out.println(teacher);

  }
}
