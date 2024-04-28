package stringMatching;

import java.util.Scanner;

public class  PatternSearch {

    public static void search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= N - M; i++) {
            int j;

            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == M) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String txt = sc.nextLine();
        System.out.print("Input pattern: ");
        String pat = sc.nextLine();

        search(pat, txt);
    }
}
