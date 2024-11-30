import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSolution {



    public List<String> permutate (String req){
        List<String> sol = new ArrayList<>();
        if (req != null){
            var chrArr = req.toCharArray();
            permutate (chrArr, sol, 0);
        }
        return sol;
    }

    private void permutate(char [] arr, List<String> sol, int curr){
        if (curr == arr.length){
            sol.add(new String (arr));
            return;
        }
        for (var i = curr; i < arr.length; i++){
            swap(arr, curr, i);
            permutate(arr, sol, curr + 1);
            swap(arr, curr, i);
        }

    }

    public void swap (char [] arr, int x, int y){
        char tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}


/*
    A   B   C   D
 ABC
 ACB
 BAC
 BCA
 CBA
 CAB
 ...


 */
