package stringMatching;

import java.util.Scanner;

public class Rabinkarp {

    public final static int d = 256;        //total asci character

    static void search(String pat, String txt, int q)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

                                        // h =  "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }


        for (i = 0; i <= N - M; i++) {
            if (p == t) {
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String txt = sc.nextLine();
        System.out.print("Input pattern: ");
        String pat = sc.nextLine();

        int q = 101;

        search(pat, txt, q);
    }
}
