package com.koreait;

import java.util.Scanner;

//양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다. 피라미드는 n 레벨을 가져야 하며,
//최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소해야 합니다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력한 정수 높이의 피라미드를 만들거예요");

        System.out.print("입력할 정수 : ");
        int x = sc.nextInt();

        System.out.println();


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = x - i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}