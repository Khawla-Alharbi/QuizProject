
package quiz;

import java.util.Scanner;


public class TrueFalseQ extends Question{
    
    public final Scanner s= new Scanner(System.in);
    String ansr; 

    public Boolean check(String str) { //دالة للتحقق من صحة المدخلات (A B C D)
       Boolean check = false;
       if(str.equalsIgnoreCase("true")||str.equalsIgnoreCase("false")){
           check = false;
       }else{
           check = true;
           System.out.println("Please enter true or false:");
       }
        return check;
    }
    
    public void saveQ(){  //دالة لأخذ السؤال والأجوبة من المستخدم وحفظها
        System.out.println("Enter true false question:");
        question = s.nextLine();
        
        Boolean b = true;
        String ansr1;
        
        do {
        System.out.println("Enter the right answer (true or false):"); 
        ansr1= s.nextLine();
        b= check(ansr1);
        }
        while (b);
        
        ansr = ansr1;
        
    }
    
    @Override
    public int display(){ // دالة لعرض السؤال وتصحيح الإجابة مع إرجاع قيمة الدرجة
        
        int result;
        System.out.println("Q:"+question);
        Boolean b = true;
        String useranswer;
        
        do {
            System.out.println("\nEnter the right answer (true or false):"); 
            useranswer= s.nextLine();
            b= check(useranswer);
        }
        while (b);
       
        if (ansr.equals(useranswer)){
            System.out.println("\ngreat!! correct answer"+"\t---------------------------------------\n");
            result= 1; 
        }
        else {
            System.out.println("\nwrong answer :("+"\t---------------------------------------\n");
            result = 0;
        }  
        return result;
    }
}
