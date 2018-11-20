import java.util.Scanner;
   
        
        public class Guessinggame {
    
        public static void main(String[] args){

        
        Scanner input = new Scanner (System.in);
                System.out.println("Enter your number: ");
                int num = input.nextInt();
                
                //default value
                int guess = 0;
              
              //this is where the loop starts
              // until the number is not guessed, it will continue to execute the loop
              while(guess != num){
                System.out.println("\nEnter your guess: ");
                guess = input.nextInt();
                  // this is the formula for determining if the number is odd or even
                  if (num % 2 == 0) {
                      System.out.println("The number is even");
                  } else {
                      System.out.println("The number is odd");
                  }
                 
              if (guess == num){
                 System.out.println("Yes, the number is " + num);
              }else if (guess > num ){
                 System.out.println("your guess is too high");
              }else
                 System.out.println("your guess is too low");
            
            }
        }
        }     
            




       
                
    


