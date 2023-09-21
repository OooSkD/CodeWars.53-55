package task53;
/*
DESCRIPTION:
    In this kata, your task is to create all permutations of a non-empty input string
    and remove duplicates, if present.
    Create as many "shufflings" as you can!
    Examples:
        With input 'a':
        Your function should return: ['a']

        With input 'ab':
        Your function should return ['ab', 'ba']

        With input 'abc':
        Your function should return ['abc','acb','bac','bca','cab','cba']

        With input 'aabb':
        Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
    Note: The order of the permutations doesn't matter.

    Good luck!
*/
import java.util.*;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        // Your code here!
        List<String> result = new ArrayList<>();
        permutation(result, "", s);
        Set<String> set = new HashSet<>(result);
        return new ArrayList<>(set);
    }

    private static void permutation(List<String> result, String current, String s) {
        int n = s.length();
        if (n == 0) result.add(current);
        else {
            for (int i = 0; i < n; i++)
                permutation(result, current + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
        }
    }
}
