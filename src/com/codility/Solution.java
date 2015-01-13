package com.codility;

/**
 * Created by Shishkov A.V. on 08.04.2014.
 */
// you can also use imports, for example:
// import java.math.*;
public class Solution {
    public int solution(int[] A) {

        int distinguish = 0;
        final int N = A.length;

        for (int p = 0; p < N; p++) {
            for (int q = p; q < N; q++) {
                if (A[p] <= A[q]) {
                    if (distinguish < q - p) {
                        distinguish = q - p;
                    }
                }
            }
        }

        return distinguish;
    }

    public static void main(String[] args) {
        int result = new Solution().solution(new int[]{5, 3, 6, 3, 4, 2});

        System.out.println("The biggest is " + result);
    }
}