import java.util.Scanner;
/**
 *This program will find the maximum interger from 3 intergers
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //create a scanner for user imput
  Scanner input = new Scanner(System.in);

  //ask for the intergers
  System.out.println("Please enter three integers on separate lines");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();

  //determine the maximum interger
  if(num1 >= num2 && num1 >= num3){
    System.out.println("Maximum: " + num1);

    } else if(num2 >= num1 && num2 >= num3){
    System.out.println("Maximum: " + num2);
    } else if(num3 >= num1 && num3 >= num2){
    System.out.println("Maximum: " + num3);
    }
  
  }
}
