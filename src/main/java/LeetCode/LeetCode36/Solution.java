package LeetCode.LeetCode36;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i =0; i < board.length; i++){
            if (!isValidRow(board[i])){
                return false;
            }
        }
        for (int i =0; i < board[0].length; i++){
            if (!isValidColumn(board, i)){
                return false;
            }
        }

        for (int i =0; i < board.length; i+= 3){
            for (int j =0; j < board[0].length; j+= 3){
                if (!isValidBox(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidRow (char [] arr){
        Set<Character> seen = new HashSet<Character>();
        for (char character : arr){
            if (character == '.'){
                continue;
            }
            if (seen.contains(character)){
                return false;
            }
            seen.add(character);
        }
        return true;
    }
    public boolean isValidColumn (char [][] arr, int column){
        Set<Character> seen = new HashSet<Character>();
        for (int i = 0;  i < arr.length; i++){
            if (arr[i][column] == '.'){
                continue;
            }
            if (seen.contains(arr[i][column])){
                return false;
            }
            seen.add(arr[i][column]);
        }
        return true;
    }
    public boolean isValidBox (char [][] arr, int startRow, int startColumn){
        Set<Character> seen = new HashSet<Character>();
        for (int i = startRow;  i < startRow + 3; i++){
            for (int j = startColumn; j < startColumn +3; j++){
                if (arr[i][j] == '.'){
                    continue;
                }
                if (seen.contains(arr[i][j])){
                    return false;
                }
                seen.add(arr[i][j]);
            }
        }
        return true;
    }
}