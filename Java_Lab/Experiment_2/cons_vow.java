import java.util.*;

public class cons_vow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char charac = s.next().charAt(0);
        if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u')
		{
            System.out.println("vowel");
		}
		else if (charac == 'A' || charac == 'E' || charac == 'I' || charac == 'O' || charac == 'U')
		{
			System.out.println("vowel");
		}
        else
		{
            System.out.println("consonant");
		}

		s.close();
    }
}