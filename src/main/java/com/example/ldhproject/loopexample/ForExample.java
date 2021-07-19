package com.example.ldhproject.loopexample;

public class ForExample {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        for(int i = 0; i <=10; count++) {  //10번
            sum += count;
        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while (num <= 10) {
            total += num;
            num++;
        }
        System.out.println(total);
    }
}
