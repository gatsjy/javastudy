package ch5;

import java.util.Scanner;

/**
 * @author Gatsjy
 * @since 2021-03-23
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] score = {79,88,91,33,100,55,95};

        int max = score[0];
        int min = score[0];

        for (int i = 1 ; i < score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
            if(min > score[i]){
                min = score[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
