import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 100;
    }

    public static void main(String[] args) {
    
    // Welcoming the player
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
    System.out.println("You have 9 skill points that you can allocate between your skills any way you like! ");
    System.out.println("Allow me to explain the functions of each stat. \n");
   
    
    System.out.println("Agility can assist you in all physical activities from Gym class to weaving through people in the halls! \n Freshmen get an Agility bonus.\n");
    System.out.println("Intelligence has a chance to help you if you answer wrong on any assignments and exams! \n Sophomores get an Intelligence bonus. \n");
    System.out.println("Aura encompasses your vibe, swagger, and overall nonchalantness. It can help you avoid embarassing moments and stay popular.\n Juniors get an Aura bonus.\n");
    System.out.println("Experience helps your overall performance and gives you the upper hand when dealing with teachers since they know you so well.\n Seniors get an Experience bonus.\n");

    
    int skillpoints = 9;
    System.out.println("How many points will you allocate to your Agility?");
    int agility = Integer.valueOf(scanner.nextLine());
    if ((skillpoints - agility) <= 0){
        System.out.println("You don't have enough skill points for that. You have " + String.valueOf(skillpoints) + "points left over. \nTry again!");
        agility = Integer.valueOf(scanner.nextLine());
    }else{
        skillpoints -= agility;
    }
    System.out.println("How many points will you allocate to your Intelligence?");
    int intelligence = Integer.valueOf(scanner.nextLine());
    if ((skillpoints - intelligence) <= 0){
        System.out.println("You don't have enough skill points for that. You have " + String.valueOf(skillpoints) + "points left over.");
        intelligence = Integer.valueOf(scanner.nextLine());
    }else{
        skillpoints -= intelligence;
    }
    System.out.println("How many points will you allocate to your Aura?");
    int aura = Integer.valueOf(scanner.nextLine());
    if ((skillpoints - aura) <= 0){
        System.out.println("You don't have enough skill points for that. You have " + String.valueOf(skillpoints) + "points left over.");
        aura = Integer.valueOf(scanner.nextLine());
    }else{
        skillpoints -= aura;
    }
    System.out.println("How many points will you allocate to your Experience?");
    int experience = Integer.valueOf(scanner.nextLine());
    if ((skillpoints - experience) <= 0){
        System.out.println("You don't have enough skill points for that. You have " + String.valueOf(skillpoints) + "points left over.");
        experience = Integer.valueOf(scanner.nextLine());
    }else{
        skillpoints -= experience;
    }

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

    System.out.println("Great! As a " + grade + ", you get +1 " + bonus + "!");

    System.out.println("You walk up the stairs towards your first period math class. You encounter an underclassman struggling really hard to unlock their locker.");
    System.out.println("Will you... \n A. Help them at the cost of being on time to class\n B. Ignore them and continue walking to class\n C. Laugh in their face and walk off");
    String choice1 = scanner.nextLine();
    if (choice1.equals("a") || choice1.equals("A")){
        System.out.println("By helping them, you gain an acquaintance and more respect! \n +1 Experience");
        System.out.println("You were late to class and missed some really crucial information.\n -1 Intelligence");
        intelligence += 1;
    } else if (choice1.equals("b") || choice1.equals("B")){
        System.out.println("You mind your business and hurry off to class.");
    } else if (choice1.equals("c") || choice1.equals("C")){
        System.out.println("Everyone sees you attemt to ridicule this girl and now they think you're a jerk. \n -2 Aura");
        aura -= 1;
    }  
    if (aura <= 0){
        System.out.println("You've lost all your Aura and failed to survive a day at St. Saviour. Game Over.");
    } else{
        System.out.println("During your math class, Mr. Sadushi calls on you to answer a question when you weren't paying attention.")
        System.out.println("Will you...\n A. Take a wild guess\n B. Say nothing\n C. Attempt to get out of this by cracking a joke")
        String choice2 = scanner.nextLine();
    if (choice2.equals("a") || choice2.equals("A")){
        int roll = Player.rollD6();
        if (intelligence >= 3){
            roll += 1;
            System.out.println("Your intelligence may give you a boost!");
        }
        if (roll > 3){
            System.out.println("You guessed correctly and avoided aura damage!\n +1 Experience");
            experience += 1;
        } else {
            System.out.println("You unfortunately guessed really wrong. Someone in the back of the class laughed. At least you tried!\n -1 Aura\n +1 Experience");
            aura -= 1;
        }
    } else if (choice2.equals("b") || choice2.equals("B")){
        System.out.println("After some awkward silence, Mr. Sadushi lets you off the hook and chooses someone else.\n -1 Aura\n -1 Experience");
    } else if (choice2.equals("c") || choice2.equals("C")){
        int roll = Player.rollD6();
        if (experience > 3){
            roll += 1;
            System.out.println("Your Experience may give you a boost!");
        }
        if (roll > 3){
            System.out.println("Everyone laughed it off and moved on. You avoided aura damage!");
        } else {
            System.out.println("Mr. Sadushi was not amused by your joke.\n -1 Aura");
    }
    
    //String answer = TimedInput.getUserInputWithTimeout(10);
    //System.out.println("You entered " + answer + " in time!");
    }
    
}

}
}    
