
package quiz;

import java.util.Scanner;


public class Question { //الكلاس الأساسي للأسئلة
   
   public final Scanner s= new Scanner(System.in);
    
   public String question;
   public String rAnswer;
   public String answer;
  
   public void save() {
        
        System.out.println("Enter your question:");
        question= s.nextLine();
        System.out.print("Enter the Answer:");
        rAnswer= s.nextLine();
        
        
    }
  public int display()
  {
    System.out.println("Q:"+question +"\n");
    System.out.println("Enter your answer:");
    String ch = s.nextLine();
    if (rAnswer == answer){
        System.out.println("great!! correct answer");
        return 1; 
    }
    else 
        System.out.println("wrong answer :(");
        return 0; 
  
  }  
  
}
