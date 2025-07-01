package ex_001_Java_Basic;

import java.util.Scanner;

public class Lab009_StringChallenge3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter iterations");
        int ITERATIONS=sc.nextInt();
        System.out.println("Performance Comparison for " + ITERATIONS + " iterations:\n");

        long startTime, endTime;

        // 1. String concatenation using '+'
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += "abc";
        }
        endTime = System.nanoTime();
        System.out.println("String (+) Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 2. StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append("abc");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 3. StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append("abc");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}

