import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            subject.setState(scan.nextInt());
        }
    }
}
