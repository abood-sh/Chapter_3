package chapter3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondQuestion {

    public static void main(String[] args) throws IOException {
        File file = new File("SmallText.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        
        Scanner input = new Scanner(file);
        ArrayList<String> arrayList = new ArrayList<>();

        
        while (input.hasNextLine()) {
            
            String[] smallSizeTextArray = input.nextLine().split(" ");
            arrayList.addAll(Arrays.asList(smallSizeTextArray));
        }

        StringBuffer b = new StringBuffer();
        for (int i = 0; i < arrayList.size(); i++) {
            b.append(arrayList.get(i) + " ");
        }

        String append = b.toString();

        System.out.println("Text found in File : \n" + append);
        System.out.println("\nRepetition Character found in File \n");
        chara(append);
        System.out.println("\nRepetition Words found in File \n");
        word(append);
    }

    private static void chara(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char d : c) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void word(String s) {
        String[] c = s.split(" ");
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        for (String d : c) {
            if (hash_map.containsKey(d)) {
                hash_map.put(d, hash_map.get(d) + 1);
            } else {
                hash_map.put(d, 1);
            }
        }
        for (Map.Entry entry : hash_map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
