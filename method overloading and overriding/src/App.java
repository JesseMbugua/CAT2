public class App {
    public static void main(String[] args) throws Exception {


        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound(); 

        MathOperations math = new MathOperations();
        System.out.println(math.multiplies(2,3));
        System.out.println(math.multiplies(2,3,4));
        //System.out.println(math.multiplies(2,3,4,5)); Compiler only recognizes 2 or 3 numbers
        
    }
}
