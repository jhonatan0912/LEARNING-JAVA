public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from java");

        // When use a println the string is showed in complete line
        System.out.println("This is a line with println");
        System.out.println("This is another line  with println");

        // When we use a print the string is showed in line, can be multiple lines
        System.out.print("This is a line just with print");
        System.out.print("This is another line with print");

        // println with numbers
        System.out.println(3);
        System.out.println(358);
        System.out.println(5000);

        // Summary operation with println
        System.out.println(2 + 2);

        // Multiplication operation with println
        System.out.println(2 * 2);

        /**
         * Multiple line comment in Java
         */

        /**
         * Variables types in JAVA
         * String = cadena
         * int = enteros
         * float = decimales
         * char = "a"
         * boolean = true/false
         */

        // Variable and assign JAVA
        String name = "Jhonatan";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int secondNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Multiple variable assing
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // IF condition
        int firstNumIf = 22;
        int secondNumIf = 44;
        if (firstNumIf > secondNumIf) {
            System.out.println("First number is greater than second");
        }
    }
}