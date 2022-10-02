import java.util.Scanner;

public class SimpleJava {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("enter a positive number");
if (userInput.hasNextInt()) {
  int n = userInput.nextInt();
  if(n > 0){
    for (int i = 1;i<n ;i++ ) {
      if(i%2 == 0){System.out.println(i); };
    }
  } else {System.out.println("wrong entry");}
}else{System.out.println("wrong entry");}

  }

}
