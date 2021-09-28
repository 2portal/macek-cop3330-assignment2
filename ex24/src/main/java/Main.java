import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 cody macek
 */
public class Main {
    public static void main(String[] args) {

    }

    static boolean isAnagram(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        byte[] arr1 = str1.getBytes(StandardCharsets.UTF_8);
        byte[] arr2 = str2.getBytes(StandardCharsets.UTF_8);

        if(l1!=l2)
        {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<l1; i++)
        {
            if(arr1[i]!=arr2[i])
                return false;
        }

        return true;
    }

}
