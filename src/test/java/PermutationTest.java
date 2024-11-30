import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationTest {
    private PermutationSolution sut;

    public PermutationTest(){
        sut = new PermutationSolution();
    }

    @Test
    public void methodShouldWorkWithANullRequest(){
        var res = sut.permutate(null);
        var resSet = new HashSet<>(res);
        Assert.assertTrue(resSet.size() == 0);
        Assert.assertNotNull(res);
    }


    @Test
    public void responseShouldReturnCorrectValue(){
        var req = "ABD";
        var res = sut.permutate(req);
        var expected = new HashSet<>(List.of("ADB", "BDA", "DAB", "ABD", "DBA", "BAD"));
        var resSet = new HashSet<>(res);
        Assert.assertEquals(expected, resSet);
    }

    @Test
    public void responseShouldReturnNotContainStrangeValue(){
        var req = "ABD";
        var res = sut.permutate(req);
        var resSet = res.stream().collect(Collectors.toSet());
        Assert.assertTrue(resSet.size() == 6);
        Assert.assertFalse(resSet.contains("ABC"));
    }
}
