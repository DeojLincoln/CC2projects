
package Course;
import java.util.Scanner;
public class Course {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("imput your course");
       String course = sc.next();
       
       
       if (course.equals("IT")){
           System.out.println("Major");
           String m =  sc.next();
           
         if(m.equalsIgnoreCase("Webtech")){
             System.out.println("Web Technology");

         }
         else if(m.equalsIgnoreCase("NetSec")){
             System.out.println("Network and Security");
             }
         else if(m.equalsIgnoreCase("ERP")){
           System.out.println("Enterprise");
       }else{
             System.out.println("Error");
         }
             
     
       }
       else if(course.equals("CS")){
           System.out.println("Major");
           String mm =  sc.next();
           
         if(mm.equalsIgnoreCase("Mole Dev")){
             System.out.println("Mole Dev");

         }
         else if(mm.equalsIgnoreCase("Digital arts and animation")){
             System.out.println("Digital arts and animation");
             }
       
       }else{
             System.out.println("Error");
         
            if(course.equals("BSDA")){
           System.out.println("BSDA");
       }
            else{
                System.out.println("Error");
            }
       }
    
    }
}
