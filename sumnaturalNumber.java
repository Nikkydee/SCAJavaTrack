public class sumnaturalNumber {

    public static class addNumber {

        public static void main(String[] args){
            int finalNum =10;
            int sum = 0;
            for( int i = 1; i <=finalNum; i++){

               sum= sum +i;

            }
            System.out.println(sum);
        }
        /*Infinite Loops
         * Infinite loops are loops that runs forever, excepte we kill the program, they are mostly
         * made by writing a condition which can never be met.
         * */
        //for example
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (int i=0; i > -4; i++ ){
//            System.out.println("Hy");
//        }
        /*So the expression above is going to print  "Hy" forever because the condition is going to be greater than minus 4 as long as we keep incrementing
         * */
        //another basic example of for loop
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (; ; ) {
//            System.out.println("Hello world");
//        }
        /*
         * Enhanced For loop
         * Enhanced for loop is useful when you want to iterate Array/Collections, it is easy to write and understand.
         * Let’s take the same example that we have written above and rewrite it using enhanced for loop.*/
        //comment the above codes to run this
        String scastudents[]={"Tilda","Nikki", "ChelseaQuin", "Love", "Mary"};
        for (String students : scastudents) {
            System.out.println(students);
        }

    }
}
