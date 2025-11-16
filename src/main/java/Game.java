import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void main(String[] args) {

    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣾⣿⣦⣀⣴⣿⣷\n" + //
                "⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠛⣻⣿⠛⣿⣟⠛                  Welcome to your first day of a new school\n" + //
                "⠀⠀⠀⠀⠀⠀⠀⠀ ⢠⣾⣿⡏ ⠀⢹⣿⣷⡄                           year at St. Saviour!\n" + //
                "⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⡟ ⠀⠀⠀⢻⡀\n" + //
                "");

    // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        // Collect character name from user.
        System.out.print("What's your name? \n");
        String name = scanner.nextLine();

        // Collect grade from user.
        System.out.print("Which grade are you in? \n");
        String gradenumber = scanner.nextLine();
        while ((Integer.valueOf(gradenumber)< 9) || (Integer.valueOf(gradenumber) > 12)){
            System.out.println("Please accurately type in the number of your high school grade level.");
             gradenumber = scanner.nextLine();
        }
    

    System.out.println("\nIt's time for you to to set up your stats! \nThere are four stats: Agility, Intelligence, Aura, and Experience.");
    System.out.println("You have 9 skill points that you can allocate between your skills any way you like!");
    System.out.println("Allow me to explain the functions of each stat. \n");
   
    System.out.println("Agility can assist you in all physical activities from Gym class to weaving through people in the halls! \nFreshmen get an Agility bonus.\n");
    System.out.println("Intelligence has a chance to help you if you answer wrong on any assignments and exams! \nSophomores get an Intelligence bonus. \n");
    System.out.println("Aura encompasses your vibe, swagger, and overall nonchalantness. It can help you avoid embarassing moments and stay popular.\n uniors get an Aura bonus.\n");
    System.out.println("Experience helps your overall performance and gives you the upper hand when dealing with teachers since they know you so well.\nSeniors get an Experience bonus.\n");
    
    

    
    if (gradenumber == "9"){
        String grade = "freshman";
        String bonus = "Agility";
    } else if (gradenumber == "10"){
        String grade = "sophomore";
        String bonus = "Intelligence";
    } else if (gradenumber == "11"){
        String grade = "junior";
        String bonus = "Aura";
    } else if (gradenumber == "10"){
        String grade = "senior";
        String bonus = "Experience";
    }

    //System.out.println("Great! Lets get started on your stats. As a " + grade + ", you get +1 " + bonus + "!");
    //String answer = TimedInput.getUserInputWithTimeout(10);
    //System.out.println("You entered " + answer + " in time!");
}
}

