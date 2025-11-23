import java.util.HashSet;

public class ValidSudoku {
    public static  boolean validsudoku(char board[][]){
         int n=9;
//         Create the array of hashSet with size n
        HashSet<Character>[] rows= new HashSet[n];
        HashSet<Character>[] col= new HashSet[n];
        HashSet<Character>[] boxes= new HashSet[n];

        for(int r=0;r<n;r++){
            rows[r]= new HashSet<>();
            col[r]= new HashSet<>();
            boxes[r]= new HashSet<>();
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                char val=board[r][c];
//                We dont have do check when it is .
                if(val=='.'){
                    continue;
                }
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);
                if(col[r].contains(val)){
                    return false;
                }
                col[r].add(val);
//                Check for boxes
                int index=(r/3) * 3 + c/3;
                if(boxes[r].contains(val)){
                    return false;
                }
            }
        }
        return  true;
    }

    public static void main(String[] args) {
         int n=9;
        char board[][] = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(validsudoku(board));


    }
}
