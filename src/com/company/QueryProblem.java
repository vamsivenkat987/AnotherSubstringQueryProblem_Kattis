package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class QueryProblem {
    private static Kattio io;
    private static void evaluateNext(String s) {
        String first = io.getWord();
        int second = io.getInt();
        if ((first.length()>0 && isLower(first)) && (second>=1 && second<= s.length())){
            //io.println(io.checkName(s,first,second));
            System.out.println(io.checkName(s,first,second));
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







class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int getInt() {
        return Integer.parseInt(nextToken());
    }

    public double getDouble() {
        return Double.parseDouble(nextToken());
    }

    public long getLong() {
        return Long.parseLong(nextToken());
    }

    public String getWord() {
        return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
    public int checkName(String name, String check,int num){
        String[] count = name.split("");
        int diff = (count.length) - (check.length());
        Map<Integer,StringBuilder> co = new HashMap<>();
        for (int i=0;i< count.length;i++){
            StringBuilder sb = new StringBuilder();
            if (i == diff+1){
                break;
            }
            co.put(i,sb);
            for (int j=0;j<check.length();j++){
                if (co.containsKey(i)){
                    co.get(i).append(count[i+j]);
                }
            }
        }
        int number =0;
        for (int i=0;i<co.size();i++){
            String st = co.get(i).toString();
            if (number==num){
                return i;
            }
            if (st.equals(check)){
                number++;
            }
        }
        if (number< num){
            return -1;
        }
        return 0;

    }
}


