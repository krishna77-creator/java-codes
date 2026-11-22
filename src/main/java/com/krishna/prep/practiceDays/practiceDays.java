package com.krishna.prep.practiceDays;

public class practiceDays {
    public static int countLetter(String word, char target){
        int count = 0;
        for (int i =0; i< word.length();i++){
            if (word.charAt(i)==target){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String word = "banana";
        char target = 'a';
        System.out.println(countLetter(word, target));

    }
}
