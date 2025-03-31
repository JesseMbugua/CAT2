public class Student {
  private String name;
  private int grade;

  public Student(String name, int grade) {
    this.name = name;
    setGrade(grade);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setGrade(int grade){
    if (grade< 0 || grade > 100){
      this.grade = 0;
    } else {
      this.grade = grade;
    }
  }

  public int getGrade() {
    return grade;
  }
}
