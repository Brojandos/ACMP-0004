import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        byte number = new Scanner(System.in).nextByte();
        System.out.printf("%d9%d", number, 9 - number);
    }
}
