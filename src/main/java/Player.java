public class Player{

    public String name;
    public String gradenumber;

    public int intelligence; 
    public int aura;
    public int experience;
    public int agility;

    public static int rollD6() {
        int r = (int)(Math.random() * 6) + 1;
        return r;
    }

}