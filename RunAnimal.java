import java.util.Scanner;
public class RunAnimal {

    public static void main(String[] args) {
    	try (Scanner scan = new Scanner(System.in)) {
            Bird bird = new Bird();
            Cat cat = new Cat();
            Dog dog = new Dog();
            Animal Type;
            System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
            String ans = scan.nextLine();
            if (ans.equalsIgnoreCase("B")) {
                Type = bird;
                Type.eat();
                Type.sleep();
                Type.makeSound();
            }else if(ans.equalsIgnoreCase("C")) {
                Type = cat;
                Type.eat();
                Type.sleep();
                Type.makeSound();
            }else if(ans.equalsIgnoreCase("D")) {
                Type = dog;
                Type.eat();
                Type.sleep();
                Type.makeSound();
            }
            scan.close();
        }
    }
}
   