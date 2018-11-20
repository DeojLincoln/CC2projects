
package fibonacci;

public class fibonacci {

    public static void main(String[] args) {
//        display();
        nested();
    
    }static int factorial(int n){
       if(n<=1) return 1;
        else return n * factorial(n-1);
     
       } 
    static void display(){
        for(int i = 1; i <=5; i++){
            System.out.println(factorial(i));
        }  
    }
    static void nested(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
            
                System.out.print(factorial(j)+ " ");
            }
            System.out.println("");
        
        }
    }
}
    /*
    f(1) -> f(5)
    
    1           1
    2*1 =       2
    3*2*1=      6
    4*3*2*1=    24
    5*4*3*2*1   120
    */
    /*
    for(){ -> rows
        for(){ -> columns
            0 if n = 0
    f(n){   1 if n = 1
            f(-1)+f(-2)
        }
    
    }
    
    */
    

    
    

