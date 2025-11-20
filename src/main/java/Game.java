import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 40;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
    // Welcoming the player
    printDramaticText("⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣾⣿⣦⣀⣴⣿⣷\n" + //
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
            printDramaticText("Please accurately type in the number of your high school grade level.");
             gradenumber = scanner.nextLine();
        }
    

    printDramaticText("\nIt's time for you to to set up your stats! \nThere are four stats: Agility, Intelligence, Aura, and Experience.");
    printDramaticText("You have 9 skill points that you can allocate between your skills any way you like! ");
    printDramaticText("Allow me to explain the functions of each stat. \n");
   
    
    printDramaticText("Agility can assist you in all physical activities from Gym class to weaving through people in the halls! \n Freshmen get an Agility bonus.\n");
    printDramaticText("Intelligence has a chance to help you if you answer wrong on any assignments and exams! \n Sophomores get an Intelligence bonus. \n");
    printDramaticText("Aura encompasses your vibe, swagger, and overall nonchalantness. It can help you avoid embarassing moments and stay popular.\n Juniors get an Aura bonus.\n");
    printDramaticText("Experience helps your overall performance and gives you the upper hand when dealing with teachers since they know you so well.\n Seniors get an Experience bonus.\n");

    
    int skillpoints = 9;
    printDramaticText("How many points will you allocate to your Agility?");
    int agility = Integer.valueOf(scanner.nextLine());
    skillpoints -= agility;
    printDramaticText("How many points will you allocate to your Intelligence? You have " + skillpoints + " points left.");
    int intelligence = Integer.valueOf(scanner.nextLine());
        skillpoints -= intelligence;
    printDramaticText("How many points will you allocate to your Aura? You have " + skillpoints + " points left.");
    int aura = Integer.valueOf(scanner.nextLine());
        skillpoints -= aura;
    printDramaticText("How many points will you allocate to your Experience?You have " + skillpoints + " points left.");
    int experience = Integer.valueOf(scanner.nextLine());
    skillpoints -= experience;


    String grade = null;
    String bonus = null;
    if (gradenumber == "9"){
        grade.equals("freshman");
        bonus.equals("Agility");
        agility += 1;
    } else if (gradenumber == "10"){
        grade.equals("sophomore");
        bonus.equals("Intelligence");
        intelligence += 1;
    } else if (gradenumber == "11"){
        grade.equals("junior");
        bonus = "Aura";
        aura += 1;
    } else if (gradenumber == "10"){
        grade.equals("senior");
        bonus.equals("Experience");
        experience += 1;
    }

    printDramaticText("Great! As a " + grade + ", you get +1 " + bonus + "!\n");

    printDramaticText("Here are your stats. \n Agility: " + agility + "\n Intelligence: " + intelligence + "\n Aura: " + aura + "\n Experience: " + experience);

    printDramaticText("\n Let's begin! \n\nYou walk up the stairs towards your first period math class. You encounter an underclassman struggling really hard to unlock their locker.");
    printDramaticText("Will you... \n A. Help them at the cost of being on time to class\n B. Ignore them and continue walking to class\n C. Laugh in their face and walk off");
    String choice1 = scanner.nextLine();
    if (choice1.equals("a") || choice1.equals("A")){
        printDramaticText("By helping them, you gain an acquaintance and more respect! \n +1 Experience");
        printDramaticText("You were late to class and missed some really crucial information.\n -1 Intelligence");
        intelligence += 1;
    } else if (choice1.equals("b") || choice1.equals("B")){
        printDramaticText("You mind your business and hurry off to class.");
    } else if (choice1.equals("c") || choice1.equals("C")){
        printDramaticText("Everyone sees you attempt to ridicule this girl and now they think you're a jerk. \n -2 Aura");
        aura -= 2;
    }  
    if (aura <= 0){
        printDramaticText("You've taken too much damage and failed to survive a day at St. Saviour. Game over.");
    } else{
        printDramaticText("During your math class, Mr. Sadushi calls on you to answer a question when you weren't paying attention.");
        printDramaticText("Will you...\n A. Take a wild guess\n B. Say nothing\n C. Attempt to get out of this by cracking a joke");
        String choice2 = scanner.nextLine();
        if (choice2.equals("a") || choice2.equals("A")){
            int roll = Player.rollD6();
            if (intelligence > 3){
                roll += 1;
                printDramaticText("Your intelligence may give you a boost!");
            }
            if (roll > 3){
                printDramaticText("You guessed correctly and avoided aura damage!\n +1 Experience");
                experience += 1;
            } else {
                printDramaticText("You unfortunately guessed really wrong. Someone in the back of the class laughed. At least you tried!\n -1 Aura\n +1 Experience");
                experience += 1;
                aura -= 1;
            }
    }   else if (choice2.equals("b") || choice2.equals("B")){
            printDramaticText("After some awkward silence, Mr. Sadushi lets you off the hook and chooses someone else.\n -1 Aura\n -1 Experience");
            experience -= 1;
            aura -= 1;
    }   else if (choice2.equals("c") || choice2.equals("C")){
            int roll = Player.rollD6();
            if (experience > 3){
                roll += 1;
                printDramaticText("Your Experience may give you a boost!");
            }
            if (roll > 3){
                printDramaticText("Everyone laughed it off and moved on. You avoided aura damage!");
            } else {
                printDramaticText("Mr. Sadushi was not amused by your joke.\n -1 Aura");
                aura -= 1;
        if((aura <= 0) || (experience <= 0)){
            printDramaticText("You've taken too much damage and failed to survive a day at St. Saviour. Game over.");
        } else {
           printDramaticText("Your next class is Gym, so you make your way downstairs.");
           printDramaticText("!!!QUICK TIME EVENT!!!\n You feel yourself lose your footing for a moment on the stairs! \n Type the word 'save' within 5 sec to save yourself from falling!");
           String qt1 = TimedInput.getUserInputWithTimeout(10);
           if (qt1.equals("save")){
            printDramaticText("Phew! that was close!");
           }else{
            printDramaticText("You fell down the stairs pretty badly and like 5 people saw. You twisted your ankle and embarrassed yourself. \n -1 Aura \n -1 Agility");
            agility -= 1;
            aura -= 1;
           }
           if((aura <= 0) || (agility <= 0)){
            printDramaticText("You've taken too much damage and failed to survive a day at St. Saviour. Game over.");
           }else{
            printDramaticText("\nDuring a game of kickball at Gym class, you're standing at first base and you see an opportunity to run all the way back to home base without being intercepted.\nYou also notice at the last minute that your shoelace is untied and you have no time to sort that out.");
            printDramaticText("Will you...\n A. Run all the way to home base at the risk of tripping on your shoelace\n B. Play it safe and just run to second base.");
            String choice3 = scanner.nextLine();
            if (choice3.equals("a") || choice3.equals("A")){
                int roll2 = Player.rollD6();
                if (agility > 3){
                    roll2 += 1;
                    printDramaticText("Your Agility may give you a boost!");
                }
                if (roll2 > 3){
                    printDramaticText("You made it to home base without tripping and just earned your team the winning point!\n +1 Experience");
                    experience += 1;
                } else {
                    printDramaticText("You tripped on your shoelace and fell flat on your face. You managed to walk it off with no aura damage whilst hiding the fact that you nose is killing you. \n -1 Agility");
                    agility -= 1;
                } 
            } else if (choice3.equals("b") || choice3.equals("B")){
                    printDramaticText("You decided not to try your luck and take things one base at a time.");
                }     
            if ((experience <= 0) || (agility <= 0)){
                printDramaticText("You've taken too much damage and failed to survive a day at St. Saviour. Game over.");
            } else {
                printDramaticText("\nDuring your lunch period, a classmate asks you to study with them in the library in case Ms. Cush gives a pop quiz later that day.");
                printDramaticText("Will you...\n A. Go study but stay hungry and sacrifice some strength\n B. Eat lunch and hope there's no quiz later");
                String choice4 = scanner.nextLine();
                if (choice4.equals("a") || choice4.equals("A")){
                    printDramaticText("You skip lunch for a day to do some extra studying. Your stomach clearly disagrees with this decision.\n +1 Intelligence \n -1 Agility");
                    agility -= 1;
                    intelligence += 1;
                } else if (choice3.equals("b") || choice3.equals("B")){
                    printDramaticText("You decide to sit down and enjoy your lunch instead of studying.\n -1 Intelligence");
                    intelligence -=1;
                }
                if ((intelligence <= 0) || (agility <= 0)){
                    printDramaticText("You've taken too much damage and failed to survive a day at St. Saviour. Game over.");
                } else{
                    printDramaticText("You make your way to your last class of the day, Biology.");
                    printDramaticText("!!!QUICK TIME EVENT!!!");
                    printDramaticText("It turns out Ms. Cush did have a POP QUIZ planned afterall!");
                    printDramaticText("What is the powerhouse of the cell? Type the answer within 5 seconds to pass the quiz");

                }
            }
            }
    
    }
    //String answer = TimedInput.getUserInputWithTimeout(10);
    //printDramaticText("You entered " + answer + " in time!");
}
    
}
}
}    
}

