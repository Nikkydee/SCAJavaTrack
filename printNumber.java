public class printNumber {

    public static void main(String[] args){
        /*Loops are used to create programs that should keep executing till a condition is met.
         * There are three(3) types of loops in Java
         * 1. for loops
         * 2. do while
         * 3. while
         *
         * for loops:
         * for(initialization; condition; increment/decrement){
         * statement(s)
         * }
         *
         * when a for loop program is written, the compiler goes into the condition, and keeps executing the program till the condition is met
         *
         * */
        int num = 100;
       for( int i = 1; i <=num; i++){
           System.out.println(i);

        }
    }


}


/*Solution



1. Instance variable is a variable declared inside the class of the variable but outsidy the body of a method
For example:
public class instance{
float = 0.5f //instance variable
static  int n = 3// static variable

public static void main(String[]args){
double k = 5// local variable

}

}
 Another name for Instance variable is non-static field

2. Static field is a variable that is held in common for all instance of a class . It also called called class variable
3. The primitive data type supported by Java are
	boolean, char, byte, short, int, long, float and double.*/

//score: 10