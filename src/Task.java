import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class Task {
    public static void main(String[] args) {

//        boolean result = palindromeChecker(300);
//        System.out.println(result);


//        boolean result = isAnagram("rat", "car");
//        System.out.println(result);

//        boolean result = same(new int[]{1, 2, 3}, new int[]{4, 1, 9});
//        System.out.println(result);

//        String result = reverse("I am a boy");
//        System.out.println(result);


        mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30});
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapOne = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapTwo = new HashMap<Character, Integer>();

//
//        System.out.println("s "+ s);
//
//        String[] singleLetters = s.split("");
//
//        System.out.println(Arrays.toString(singleLetters));


        char[] letters = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

//            String characters = Arrays.toString(letters);

            System.out.println("letters " + letters);

            if (mapOne.containsKey(letters[i])) {
                mapOne.computeIfPresent(letters[i], (key, oldVal) -> oldVal + 1);
            } else {
                mapOne.put(letters[i], 1);
            }
        }

        char[] lettersTwo = t.toCharArray();

        for (int i = 0; i < t.length(); i++) {
            if (mapTwo.containsKey(lettersTwo[i])) {
                mapTwo.computeIfPresent(lettersTwo[i], (key, oldVal) -> oldVal + 1);
            } else {
                mapTwo.put(lettersTwo[i], 1);
            }
        }

        System.out.println(mapOne);
        System.out.println(mapTwo);


        System.out.println(mapOne.equals(mapTwo));

        return mapOne.equals(mapTwo);

    }

    public static boolean palindromeChecker(int value) {
        String str = Integer.toString(value);

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("reversed " + reversed);

        int num = parseInt(reversed);

        if (num == value) {
            return true;
        }

        return false;
    }


    public static boolean same(int[] arr1, int[] arr2) {


        return true;
    }


    public static String reverse(String str) {

        if (str == null || str.length() < 2) {
            return "That's not quite right";
        }

        ArrayList<Character> backwards = new ArrayList<>();
        int totalItems = backwards.toArray().length - 1;

        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.println("str " + str.charAt(i));
            backwards.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        for (char c : backwards) {
            result.append(c);

        }

        System.out.println("result " + result);

//        System.out.println("backwards " + backwards);
//
//        char[] backwards = {};
//        backwards.

//        return new StringBuilder(str).reverse().toString();

        return result.toString();
    }


    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            merged[j] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(merged));

//      int[] merged=  new int[arr1.length + arr2.length];
//      System.out.println(Arrays.toString(arr1));
//
//        System.out.println("merged " + Arrays.toString(merged));

    }

}
