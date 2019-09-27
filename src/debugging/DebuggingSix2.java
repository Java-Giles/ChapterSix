package debugging;

public class DebuggingSix2 {

    public static void main(String args[])
    {
        char letter;
        int a;
        final int MIN = 65;
        final int MAX = 122;
        final int STOPLINE1 = 84;
        final int STOPLINE2 = 104;
        final int STOPLINE3 = 122;
        for(a = MIN; a <= MAX; a++)
        {
            letter = (char)a;
            System.out.print("  " + letter);
            if(a == STOPLINE1 || a == STOPLINE2 || a == STOPLINE3)
                System.out.println();
        }
        System.out.println("\nEnd of application");

    }
}
