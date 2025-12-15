package Codechef_Starter107Nov;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int c1 = 0;
            int c2 = 0;

            for (int i = 0; i < n; i++) {
                if ((a.charAt(i) == 'R' && b.charAt(i) == 'S') ||
                        (a.charAt(i) == 'S' && b.charAt(i) == 'P') ||
                        (a.charAt(i) == 'P' && b.charAt(i) == 'R')) {
                    c1 += 1;
                } else if ((a.charAt(i) == 'S' && b.charAt(i) == 'R') ||
                        (a.charAt(i) == 'P' && b.charAt(i) == 'S') ||
                        (a.charAt(i) == 'R' && b.charAt(i) == 'P')) {
                    c2 += 1;
                }
            }

            int p = 0;
            if (c2 >= c1) {
                p = (c1 + c2) / 2;
                p += 1;
                System.out.println(p - c1);
            } else {
                System.out.println("0");
            }
            t--;
        }
    }

}
