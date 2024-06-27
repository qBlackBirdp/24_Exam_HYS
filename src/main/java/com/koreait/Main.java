package com.koreait;

import java.util.Scanner;

//3. 프로그램은 정수 10개의 피보나치 수열 숫자를 출력합니다. 수열을 생성하기 위해 루프를 사용합니다. (40점)

public class Main {
    public static void main(String[] args) {
        int x = 10;

        for (int i = 0; i < x; i++) {

            System.out.print(Fibonacci(i) + " ");
        }
    }
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

