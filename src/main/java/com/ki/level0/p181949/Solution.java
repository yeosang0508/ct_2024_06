package com.ki.level0.p181949;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String result = "";
        for(char x : a.toCharArray()){
            if(x >= 97 && x <= 122){
                result += (char)(x-32);
            }else if(x >= 65 && x <= 90){
                result += (char)(x+32);
            }
        }

        System.out.println(result);
    }
}