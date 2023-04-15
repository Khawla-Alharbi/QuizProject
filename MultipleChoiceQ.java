
package quiz;

import java.util.Scanner;


public class MultipleChoiceQ extends Question {
  
    public final Scanner s= new Scanner(System.in);
    
    public String q;
    public String C1;
    public String C2;
    public String C3;
    public String C4;
    public char right;
    public char answer;
       
    
    public void saveQ() throws QException {     //دالة لأخذ السؤال والأجوبة من المستخدم وحفظها
        
        System.out.println("Enter multiple choice question:");
        q= s.nextLine();
        System.out.print("Enter first choice A:");
        C1= s.nextLine();
        System.out.print("Enter second choice B:");
        C2= s.nextLine();
        System.out.print("Enter Third choice C:");
        C3= s.nextLine();
        System.out.print("Enter Fourth choice D:");
        C4= s.nextLine();
        
        Boolean b = true;
        char right1;
        
        do {
            System.out.println("Enter the right choice: (A, B, C or D )");
            right1 = s.next().charAt(0);
            try {
                b = check(right1);
            }
            catch( QException e ) {
                System.out.println( e.getMessage() );
            }
        }
        while (b);
        
        right = right1;
        
    }
    
    
    public Boolean check(char c) throws QException{ //دالة للتحقق من صحة المدخلات (A B C D)
        Boolean check = false;
       switch (c){
       case 'A':
       case 'a':
       case 'B':
       case 'b':
       case 'C':
       case 'c':
       case 'D':
       case 'd':
       break;
       default:
           check = true;
           throw new QException("please enter one of letters A, B, C or D");   
    }
        return check;
    }
    
    
    public int display1() throws QException { // دالة لعرض السؤال وتصحيح الإجابة مع إرجاع قيمة الدرجة
        
        int r1 = 0;
        
        System.out.println("Q:"+q +"\n" + "A:" + C1 + "\t"+ "B:" + C2 +
            "\t"+ "C:" + C3 + "\t"+ "D:" + C4+ "\n" );
        
        Boolean b = true;
        
        do {
        System.out.println("Enter your answer:");
        answer = s.next().charAt(0);
            try {
                b = check(answer);
            }
            catch( QException e ) {
                System.out.println( e.getMessage() );
            }
        }
        while (b);
        
        
            
        if (right == answer){
                System.out.println("\n great!! correct answer"+"\t---------------------------------------\n");
               return 1; 
        }         
        else 
                System.out.println("\nwrong answer :("+"\t---------------------------------------\n");
                return 0; 
            
    }  
    
    
}
