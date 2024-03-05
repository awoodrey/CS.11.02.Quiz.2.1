public class Main {

    public static void main(String[] args) {

        // call the first add method and store the result into a variable called resultOne.
        int numOne = 2;
        int numTwo = 3;
        int resultOne = add(numOne, numTwo);
        // print resultOne.
        System.out.println(resultOne);

        // call the greeting method and store the result into a variable called resultTwo.
        String name = "Alice";
        String resultTwo = greeting(name);
        // print resultTwo.
        System.out.println(resultTwo);

        // call the second add method and store the result into a variable called resultThree.
        int numThree = 4;
        int numFour = 5;

        int resultThree = add(numOne, numTwo, numThree, numFour);
        // print resultThree.
        System.out.println(resultThree);
        // call the printCapitalised method.
        String penguinThing = "Hi, I'm an penguin";
        printCapitalised(penguinThing);
    }
    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */
    public static int add(int numOne, int numTwo) {
        int result = numOne + numTwo;
        return result;
    }

    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */
    public static String greeting(String name) {
        String message = "Bonjour, " + name + "!";
        return message;
    }
    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
            int sumOne = add(numOne, numTwo);
            int sumTwo = add(sumOne, numThree);
            int sumThree = add(sumTwo, numFour);
            return sumThree; }

    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */
    public static void printCapitalised(String toBePrinted) {
        String capitalizedText = toBePrinted.toUpperCase();
        System.out.println(capitalizedText);
    }




}

