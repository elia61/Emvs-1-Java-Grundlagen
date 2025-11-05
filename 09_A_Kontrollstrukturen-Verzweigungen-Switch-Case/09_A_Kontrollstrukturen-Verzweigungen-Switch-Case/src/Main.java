import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number between 1 and 7: ");
                int day = scanner.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Not a weekday!");
                }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.

                System.out.print("Enter a month: ");
        scanner.nextLine();
                String month = scanner.nextLine();

                switch (month) {
                    case "December":
                    case "January":
                    case "February":
                        System.out.println("Winter");
                        break;

                    case "March":
                    case "April":
                    case "May":
                        System.out.println("Spring");
                        break;

                    case "June":
                    case "July":
                    case "August":
                        System.out.println("Summer");
                        break;

                    case "September":
                    case "October":
                    case "November":
                        System.out.println("Autumn");
                        break;

                    default:
                        System.out.println("Not a month!");
                }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
                System.out.print("Enter a month number (1-12): ");
                int month1 = scanner.nextInt();

                switch (month1) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        System.out.println("31 days");
                        break;
                    case 4: case 6: case 9: case 11:
                        System.out.println("30 days");
                        break;
                    case 2:
                        System.out.println("28 days");
                        break;
                    default:
                        System.out.println("Invalid month number!");
                }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"

                System.out.print("Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): ");
                int choice = scanner.nextInt();

                String character = switch (choice) {
                    case 1 -> "Warrior (Strength: 9, Agility: 5, Intelligence: 2)";
                    case 2 -> "Mage (Strength: 3, Agility: 4, Intelligence: 9)";
                    case 3 -> "Rogue (Strength: 5, Agility: 9, Intelligence: 4)";
                    case 4 -> "Cleric (Strength: 4, Agility: 3, Intelligence: 8)";
                    default -> "Invalid class selection!";
                };

                System.out.println(character);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi

                System.out.print("Which digit do you want to translate? (0–9): ");
                int digit = scanner.nextInt();

                System.out.print("In which language do you want to translate your digit? (1-German, 2-English, 3-Japanese): ");
                int language = scanner.nextInt();

                String translation = switch (language) {
                    case 1 -> switch (digit) {
                        case 0 -> "null";
                        case 1 -> "eins";
                        case 2 -> "zwei";
                        case 3 -> "drei";
                        case 4 -> "vier";
                        case 5 -> "fünf";
                        case 6 -> "sechs";
                        case 7 -> "sieben";
                        case 8 -> "acht";
                        case 9 -> "neun";
                        default -> "Ungültige Zahl!";
                    };
                    case 2 -> switch (digit) {
                        case 0 -> "zero";
                        case 1 -> "one";
                        case 2 -> "two";
                        case 3 -> "three";
                        case 4 -> "four";
                        case 5 -> "five";
                        case 6 -> "six";
                        case 7 -> "seven";
                        case 8 -> "eight";
                        case 9 -> "nine";
                        default -> "Invalid digit!";
                    };
                    case 3 -> switch (digit) {
                        case 0 -> "zero";
                        case 1 -> "ichi";
                        case 2 -> "ni";
                        case 3 -> "san";
                        case 4 -> "shi";
                        case 5 -> "go";
                        case 6 -> "roku";
                        case 7 -> "nana";
                        case 8 -> "hachi";
                        case 9 -> "kyuu";
                        default -> "Mukō na sūchi";
                    };
                    default -> "Invalid language selection!";
                };

                System.out.println("Translation: " + translation);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
                String operation = scanner.next().toLowerCase();

                String result = switch (operation) {
                    case "addition" -> "Result: " + (num1 + num2);
                    case "subtraction" -> "Result: " + (num1 - num2);
                    case "multiplication" -> "Result: " + (num1 * num2);
                    case "division" -> {
                        if (num2 == 0) {
                            yield "Warning: number two must not be 0!";
                        } else {
                            yield "Result: " + (num1 / num2);
                        }
                    }
                    default -> "Invalid operation!";
                };

                System.out.println(result);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.


                System.out.println("Welcome to the Optional Exercise!");

        System.out.print("Please enter your name: ");
        scanner.nextLine();

                String name = scanner.nextLine();
                System.out.print("Please enter your age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Hello, " + name + "!");

                if (age < 18) {
                    System.out.println("You're a minor. Enjoy your youth!");
                } else if (age < 65) {
                    System.out.println("You're an adult. Keep striving!");
                } else {
                    System.out.println("You're a senior. Wisdom comes with age!");
                }
            }
        }