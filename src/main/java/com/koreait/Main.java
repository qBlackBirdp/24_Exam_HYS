package com.koreait;

import java.util.Scanner;

//1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현합니다(30점)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 가로 길이를 입력해주세요. \n가로길이: ");
        int x = sc.nextInt();
        System.out.println("별의 가로길이 : " + x);

        System.out.print("별의 세로 길이를 입력해주세요. \n세로길이: ");
        int y = sc.nextInt();
        System.out.println("별의 세로길이 : " + y);

        System.out.println();

        System.out.println("가로길이 " + x + ", 세로길이 " + y + "의 사각형");

        System.out.println();

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}