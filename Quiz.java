
package quiz;

import java.util.Scanner;


public class Quiz {
    
  public static Boolean check(String str) {
       Boolean check = false;
       if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n")){
           check = false;
       }else{
           check = true;
           System.out.println("Please enter y or n :");
       }
        return check;
    }
    
    public static void main(String[] args) throws QException {
        
        String choice; // y or n
        
        Scanner s=new Scanner (System.in);
        WelcomeQuiz welcome = new WelcomeQuiz();
        Result result= new Result();
        EndQuiz end = new EndQuiz();
        
        MultipleChoiceQ q1 = new MultipleChoiceQ();
        System.out.printf("1)");
        q1.saveQ();
        MultipleChoiceQ q2 = new MultipleChoiceQ();
        System.out.printf("2)");
        q2.saveQ();
        MultipleChoiceQ q3 = new MultipleChoiceQ();
        System.out.printf("3)");
        q3.saveQ();
        MultipleChoiceQ q4 = new MultipleChoiceQ();
        System.out.printf("4)");
        q4.saveQ();
        TrueFalseQ q5 = new TrueFalseQ();
        System.out.printf("5)");
        q5.saveQ();
        TrueFalseQ q6 = new TrueFalseQ();
        System.out.printf("6)");
        q6.saveQ();
     
        
        
            
        Boolean b = true;
        String c;
        
        do {
            System.out.printf("Do you want to take quiz?(y/n): ");
            c = s.next();
            b= check(c);
        }
        while (b);
        choice = c;
        if(choice.equals("y"))
        { 
            welcome.name();
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1)");
            result.add(q1.display1());
            System.out.printf("2)");
            result.add(q2.display1());
            System.out.printf("3)");
            result.add(q3.display1());
            System.out.printf("4)");
            result.add(q4.display1());
            System.out.printf("5)");
            result.add(q5.display());
            System.out.printf("6)");
            result.add(q6.display());
            
            System.out.println("\nYour degree is "+result.getDegree()+"/6");
            end.end();
        }
         else if(choice.equals("n"))
         {
           end.end();
         }
         

    }
   
}
