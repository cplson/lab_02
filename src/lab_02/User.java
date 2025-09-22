package lab_02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	private String name;
	private int age;
	private String hobby;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void DisplayInfo() {
		System.out.println("Users name: " + this.name);
		System.out.println("Users age: " + this.age);
		System.out.println("\n");
	}
	
	public void DisplayInfo(String hobby) {
		this.hobby = hobby;
		System.out.println("Users name: " + this.name);
		System.out.println("Users age: " + this.age);
		System.out.println("Users hobby: " + this.hobby);
		System.out.println("\n");
	}
	
	public void DisplayInfo(int years_to_retire) {
		System.out.println("Users name: " + this.name);
		System.out.println("Users age: " + this.age);
		System.out.println(this.name + " will retire in " + years_to_retire + " years.");
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		final int RETIREMENT_AGE = 65;
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = -1;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            try {
                age = scanner.nextInt();
                if (age < 0) {
                    System.out.println("Age cannot be negative. Try again.");
                } else {
                    validAge = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number for age.");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();
        System.out.println();
        
        scanner.close();
        
        User james = new User(name, age);
		
		james.DisplayInfo();
		james.DisplayInfo(hobby);
		james.DisplayInfo(RETIREMENT_AGE - james.age);

	}

}
