import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new HanoiGUI();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of disks n = ");
        int n = Integer.parseInt(in.nextLine());
        Hanoi h = new Hanoi(n);
        String result = h.solve();
        System.out.println(result);
    }
}
