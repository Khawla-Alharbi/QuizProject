
package quiz;

import java.util.Scanner;


public class WelcomeQuiz {
    
    public  WelcomeQuiz(){
   System.out.println("\t  \"Wlocome to Quiz express\"\n"
           +"\t---------------------------------------");
    }
   public void name()
          
  {  
      Scanner x=new Scanner(System.in);
      String []array=new String[3];
      System.out.print("Enter your name:");
      array[0]=x.nextLine();
      System.out.print("Enter your ID:");
      array[1]=x.next();
      System.out.print("Enter your group:");
      array[2]=x.next();
      
  }   
}
