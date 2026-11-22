package com.krishna.prep.leetcodes;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "aab";
        String t = "silent";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0) + 1 );
        }
        for (int i =0; i<t.length();i++){
            char c = t.charAt(i);
            count.put(c, count.getOrDefault(c,0)-1);
        }
        for (int value : count.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
