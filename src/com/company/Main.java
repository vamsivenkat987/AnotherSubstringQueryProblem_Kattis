package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static Kattio io;
    private static void evaluateNext(String s) {
        String first = io.getWord();
        int second = io.getInt();
        if ((first.length()>0 && isLower(first)) && (second>=1 && second<= s.length())){
            io.println(io.checkName(s,first,second));
        }
    }
    private static boolean isLower(String str){
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isLetter(c)) {
                if (!Character.isLowerCase(c))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        io = new Kattio(System.in, System.out);
        String s = io.getWord();
        int k = io.getInt();
        if ((s.length()>=1) && (s.length()<=(20^5) && isLower(s)) ){
            if (k>=1 && k<=(20^5)){
                for (int i=0;i<k;i++){
                    evaluateNext(s);
                }
            }
        }
        io.close();
    }
}
