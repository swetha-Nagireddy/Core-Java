package com.kmp;

public class KMLAlgorithm {

    // Function to build the longest prefix suffix (LPS) array
    public static int[] buildLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int j = 0; // Length of the previous longest prefix suffix
        int i = 1;

        // Loop through the pattern to calculate lps values
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Function to perform KMP pattern matching
    public static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Build the LPS array for the given pattern
        int[] lps = buildLPSArray(pattern);

        int i = 0; // index for text
        int j = 0; // index for pattern
        boolean found=false;
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
                found=true;
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
            
        }
        if(!found) {
        System.out.println("pattern not found");
    }
    }
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABABAB";

        KMPSearch(text, pattern);
    }
}