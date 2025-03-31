public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Jesse", 100);
        System.out.println("1: name: " + student1.getName() + ", Grade: " + student1.getGrade());
        Student student2 = new Student("Ian", 1000);
        System.out.println("2: name: " + student2.getName() + ", Grade: " + student2.getGrade());
        
    }
}
