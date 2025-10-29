     public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        // Your code here
        byte myByte = 127;
        short myShort = myByte;
        int myInt = myByte;
        long myLong = myByte;
        float myFloat = myByte;
        double myDouble = myByte;
        //boolean myBoolean = myByte -> isnt possible
        char myChar = (char) myByte;
        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        long yourLong = 1234567890L;
        int yourInt = (int) yourLong;



        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        // I guess it adds up 10 to 33
        // System.out.println(myNumber);
        System.out.println(myNumber);
        // eines der beiden ist ein text, deshalb wird 3310 geschrieben.

        // Can you explain what is happening?


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Write down here
        // if you type in some text, the system will crash.

    }
}