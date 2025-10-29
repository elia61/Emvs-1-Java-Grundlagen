import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!

                Scanner userInput = new Scanner(System.in);

                // Ask for first name
                System.out.print("What is your first name? ");
                String firstName = userInput.nextLine();

                // Ask for last name
                System.out.print("What is your last name? ");
                String lastName = userInput.nextLine();
        System.out.println("\nYour name is, " + firstName + " " + lastName + "!");

                // Ask for age
                System.out.print("How old are you? ");
                int age = userInput.nextInt();
        System.out.println("You are " + age + " years old.");

                // Ask for birthday day
                System.out.print("On which day were you born (1-31)? ");
                int birthDay = userInput.nextInt();

                // Ask for birthday month
                System.out.print("In which month were you born (1-12)? ");
                int birthMonth = userInput.nextInt();

                // Ask for birthday year
                System.out.print("In which year were you born? ");
                int birthYear = userInput.nextInt();
        System.out.println("You were born on " + birthDay + "." + birthMonth + "." + birthYear);

                // Ask if the user is a student
                System.out.print("Are you a student? (true/false) ");
                boolean isStudent = userInput.nextBoolean();
                userInput.nextLine(); // consume newline
        System.out.println("Are you a student? " + isStudent);

                // Extra question 1
                System.out.print("What is your favorite food? ");
                String favoriteFood = userInput.nextLine();
        System.out.println("Your favorite food is: " + favoriteFood);

                // Extra question 2
                System.out.print("What is your favorite hobby? ");
                String favoriteHobby = userInput.nextLine();
        System.out.println("Your favorite hobby is: " + favoriteHobby);

                // Extra question 3
                System.out.print("What country are you from? ");
                String country = userInput.nextLine();
        System.out.println("You are from: " + country);

                // Challenge: Calculate approximate days lived
        int daysInMonth = 30;
        int daysInYear = 365;

                 int daysLived = (age * daysInYear) + (11 * daysInMonth) + birthDay;
                System.out.println("And so far you have lived approximately ~" + daysLived + " days.");

        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication

                // Benutzer nach zwei Zahlen fragen
                System.out.print("Bitte gib die erste Zahl ein: ");
                double number1 = userInput.nextDouble();

                System.out.print("Bitte gib die zweite Zahl ein: ");
                double number2 = userInput.nextDouble();

                // Berechnungen
                double addition = number1 + number2;
                double subtraction = number1 - number2;
                double multiplication = number1 * number2;
                double division;

                if (number2 != 0) {
                    division = number1 / number2;
                } else {
                    division = Double.NaN; // "Not a Number" – Division durch 0 nicht erlaubt
                }

                // Ergebnisse ausgeben
                System.out.println("\nErgebnisse:");
                System.out.println("Addition: " + addition);
                System.out.println("Subtraktion: " + subtraction);
                System.out.println("Multiplikation: " + multiplication);
                System.out.println("Division: " + (number2 != 0 ? division : "Nicht möglich (Division durch 0)"));


        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2

                // Gewicht abfragen
                System.out.print("Bitte gib dein Gewicht in Kilogramm ein (z. B. 70.5): ");
                double weight = userInput.nextDouble();

                // Größe abfragen
                System.out.print("Bitte gib deine Größe in Metern ein (z. B. 1.75): ");
                double height = userInput.nextDouble();

                // BMI berechnen
                double bmi = weight / (height * height);

                // Ergebnis ausgeben
                System.out.printf("Dein BMI beträgt: %.2f\n", bmi);

                // Optionale Bewertung
                if (bmi < 18.5) {
                    System.out.println("Du hast Untergewicht.");
                } else if (bmi < 25) {
                    System.out.println("Du hast Normalgewicht.");
                } else if (bmi < 30) {
                    System.out.println("Du hast Übergewicht.");
                } else {
                    System.out.println("Du leidest an Adipositas (Fettleibigkeit).");
                }


        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min

                // Minuten abfragen
                System.out.print("Bitte gib eine Anzahl von Minuten ein: ");
                int totalMinutes = userInput.nextInt();

                // Umrechnung
                int hours = totalMinutes / 60;
                int minutes = totalMinutes % 60;

                // Ausgabe
                System.out.println(totalMinutes + " Minuten sind " + hours + " Stunden und " + minutes + " Minuten.");




        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).

                // Radius abfragen
                System.out.print("Bitte gib den Radius des Kreises ein: ");
                double radius = userInput.nextDouble();

                // Berechnungen
                double circumference = 2 * Math.PI * radius;
                double area = Math.PI * radius * radius;

                // Ausgabe (auf zwei Nachkommastellen gerundet)
                System.out.printf("Der Umfang des Kreises beträgt: %.2f\n", circumference);
                System.out.printf("Die Fläche des Kreises beträgt: %.2f\n", area);



        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-

                // Ask for bill amount
        Scanner scanner = new Scanner(System.in);
                System.out.print("Gebe den Betrag der Rechnung ein: ");
                double billAmount = scanner.nextDouble();

                // Ask for tip percentage
                System.out.print("Gebe den Trinkgeldprozentsatz ein: ");
                double tipPercentage = scanner.nextDouble();

                // Calculate the tip and total
                double tipAmount = billAmount * (tipPercentage / 100);
                double total = billAmount + tipAmount;

                // Display the result
                System.out.printf("Total: %.2f.-\n", total);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
                Scanner scanner2 = new Scanner(System.in);

                // Ask for hourly wage
                System.out.print("Was ist dein stündlicher Lohn? ");
                double hourlyWage = scanner2.nextDouble();

                // Ask for weekly working hours
                System.out.print("Wie viele Stunden arbeitest du pro Woche?");
                double weeklyHours = scanner.nextDouble();

                // Calculate monthly and yearly salary (excluding 13th salary)
                double weeklySalary = hourlyWage * weeklyHours;
                double monthlySalary = weeklySalary * 4;       // 4 weeks per month
                double yearlySalary = monthlySalary * 12;      // 12 months

                // Output the results
                System.out.printf("Dein monatlicher Lohn ist: %.2f%n", monthlySalary);
                System.out.printf("Dein jährlicher Lohn ist: %.2f (mit dem 13. Monat)%n", yearlySalary);



        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!
        byte score = 0;

        System.out.println("Hello and welcome to my quiz about me!");

        System.out.println("\nQ01: What is my favourite sport?");
        System.out.println("Answer: It's football. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ02: What is my favourite club?");
        System.out.println("Answer: It's the fc barcelona. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ03: Who is my favourite player of all time?");
        System.out.println("Answer: It's Neymar Jr. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ04: Where do I play?");
        System.out.println("Answer: Fc Saas-Almagell. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ05: Who is my favourite Singer?");
        System.out.println("Answer: Pashanim. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ06: Which is my favourite Song?");
        System.out.println("Answer: Doppel G or Ms. Jackson. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ07: Where do I live?");
        System.out.println("Answer: In Saas-Alagell. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ08: What is my favourite color?");
        System.out.println("Answer: red. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ09: Do I believe in God?");
        System.out.println("Answer: Yes I do. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nQ10: Which one is my favourite game?");
        System.out.println("Answer: Clash Royale. If you were correct, write 1, else 0.");
        score += scanner.nextByte();

        System.out.println("\nNow I'm calculating your points...");
        System.out.println("If you were honest, then you reached a total of " + score + " points! Congrats!");




        // Make sure you didn't forget to close the scanner :)
        scanner.close();
        scanner2.close();
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);