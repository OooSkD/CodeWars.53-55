import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task53.Permutations;
import task54.Persist;
import task55.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class tasks_tests {

    @Test
    public void Permutations_test1() {
        assertEquals(new ArrayList<String>(Arrays.asList("a")),
                Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void Permutations_test2() {
        assertEquals(new ArrayList<String>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void Permutations_test3() {
        assertEquals(new ArrayList<String>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void Persist_tests() {
        assertEquals(3, Persist.persistence( 39), "Incorrect answer for n=39" );
        assertEquals(0, Persist.persistence(  4), "Incorrect answer for n=4"  );
        assertEquals(2, Persist.persistence( 25), "Incorrect answer for n=25" );
        assertEquals(4, Persist.persistence(999), "Incorrect answer for n=999");
    }

    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution.whoLikesIt());
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}

