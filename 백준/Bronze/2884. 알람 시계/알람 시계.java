import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if (m < 45) {
            h--;
            if (h == -1) {
                h = 23;
            }
            m = 60+m-45;
        } else {
            m -= 45;
        }
        
        System.out.print(h + " " + m);
        sc.close();
    }
}