package com.example.ldhproject.ifexample;

import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rank = scanner.nextInt();  //next() : 하나의 문자열을 입력 받는 것 / nextLine() : 문자 단위로 하나의 문자열을 입력 받는 것.
        char medalColor;

        switch (rank) {
            case 1:
                medalColor = 'G';
                System.out.println("Gold medal");
                break;
            case 2:
                medalColor = 'S';
                System.out.println("Siver medal");
                break;
            case 3:
                medalColor = 'B';
                System.out.println("Bronze medal");
                break;
            default:
                medalColor = 'A';
        }

        System.out.println(rank + "등은" + medalColor +"메달 입니다.");
    }
}
