import java.util.Scanner;

public class Objective4Lab1 {
 public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

System.out.println("What is your first name?");
   String fname = scanner.nextLine();


System.out.println("What is your last name?");
   String lname = scanner.nextLine();

 System.out.println("What is your favorite animal?");
   String favoriteAnimal = scanner.nextLine();

System.out.println("What is your favorite food?");
   String favoriteFood = scanner.nextLine();

System.out.println("What is your favorite song?");
   String favoriteSong = scanner.nextLine();

   System.out.println(fname);

   System.out.println(lname);

   System.out.println(favoriteAnimal);

   System.out.println(favoriteFood);

   System.out.println(favoriteSong);
    scanner.close();

 }

}
