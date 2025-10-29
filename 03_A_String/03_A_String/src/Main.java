public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Print "I am learning Java output and getting to know Strings better" to the console.

        // Your code here
        System.out.println("I am learning Java output and getting to know Strings better");

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now print "String concatenation works!" to the console, but not in one piece.
        //    You need to use the "+" operator, which you can also use in the output itself.

        // Your code here
        String part1 = "String";
        String part2 = " concatenation works!";

        String result = part1 + part2;
        System.out.println(result);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Create a variable "firstName" with the appropriate data type and assign your first name to the variable.
        //    Then print this variable to the console.

        // Your code here
        String firstName = "Elia";
        String lastName = "Anthamatten";

        //--------------------------------------------------------------------------------------------------------------
        // 4. Now create another variable.
        //    Name of the variable: lastName.
        //    Value of the variable: Your last name.
        //    Study the code below and complete it so, that the following  output is displayed on the console:
        //
        //    My first name is ...
        //    And my last name is ...
        //    (Obviously replace "..." with your first/last name).

        // Your code here

        System.out.println("My first name is " + firstName);
        System.out.println("And my last name is " + lastName);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Complete the code below so, that it prints the following output:
        //   Berufsfachschule Oberwallis


        String school= "Berufsfachschule";      // Complete this line
        String location = "Oberwallis";           // Complete this line

        // Do not change the following lines
        String resultTAsk5 = school + " " + location;
        System.out.println(resultTAsk5);

        // What is the purpose of " " ?

        // Your answer here
        //it is like a distance between school and location.

        //--------------------------------------------------------------------------------------------------------------
        // 6. Declare a variable language with the value "Java" and print "I am learning Java!" using the variable.

        // Your code here
        String Java = "I am learning Java!";
        System.out.println(Java);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Print the following lines including
        // one single double quotation marks ("...")
        // and newlines using a single System.out.println:
		
        // I am learning about
        // escape characters.
        // I need to look up
        // "escape characters"
        // to solve this task.

        // Your code here
        System.out.println("I am learning about \n escape characters. \n I need to look up \"escape characters\" to solve the task.");

    }
}