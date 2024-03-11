package LCS;

public class LongestCommonSubsequence {
    int lcs(String X, String Y, int m, int n)
    {
        if (m == 0 || n == 0)
            return 0;
        if (X.charAt(m - 1) == Y.charAt(n - 1))
            return 1 + lcs(X, Y, m - 1, n - 1);
        else
            return Math.max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
    }


    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();

        System.out.println("Length of LCS is" + " " + lcs.lcs(S1, S2, m, n));
    }
}
