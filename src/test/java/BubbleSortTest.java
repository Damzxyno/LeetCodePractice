import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSortTest {

    private BubbleSortSolution sut;

    public BubbleSortTest(){
        sut = new BubbleSortSolution();
    }

    @Test
    public void testShouldReturnNullForNullArray(){
        int [] arr = null;
        sut.sort(arr);
        Assert.assertNull(arr);
    }

    @Test
    public void testShouldReturnSingleValueForArrayWithSingleItem(){
        int [] arr = new int [] {9};
        Set<Integer> expected = new HashSet<>(List.of(9));
        sut.sort(arr);
        Set<Integer> resp = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toSet());

        Assert.assertEquals(expected, resp);
    }

    @Test
    public void testShouldReturnSortedValueForArrayWithUnsortedItems(){
        int [] arr = new int [] {9, 6, 3, 5, 1};
        Set<Integer> expected = new HashSet<>(List.of(1, 3, 5, 6, 9));
        sut.sort(arr);
        Set<Integer> resp = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toSet());

        Assert.assertEquals(expected, resp);
    }

    @Test
    public void testShouldReturnSortedValueForArrayWithSortedItems(){
        int [] arr = new int [] {1, 4, 5, 8, 9};
        Set<Integer> expected = new HashSet<>(List.of(1, 4, 5, 8, 9));
        sut.sort(arr);
        Set<Integer> resp = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toSet());

        Assert.assertEquals(expected, resp);
    }
}
