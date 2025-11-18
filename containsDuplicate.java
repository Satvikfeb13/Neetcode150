import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,4};
//        by using nested for loop
//        boolean ans=false;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    ans=true;
//                }
//            }
//        }
//        if(ans)
//            System.out.println("Duplicate number");
//        else{
//            System.out.println("Duplicate not found");
//        }
//        If we se this approach then time complexity is O(n^2)  for nested loop and
//        space complexity is O(1) we don't take any extra space
//        Method 2 Soring and iterate over the loop
//        check whether the array contain duplicate or not
//        Time complexity is O(n log n) sorting and iterating
//        space complexity is O(1)
//        Arrays.sort(arr);
//        boolean flag=false;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]==arr[i+1]){
//                flag=true;
//            }
//        }
//        if(flag){
//            System.out.println("Duplicate found");
//        }else{
//            System.out.println("Duplicate not found");
//        }
//        as soon as i get the word i use the data structure that HashSet it does not contain duplicate
//        time complexity is O(n)
//        space complexity is O(n) we use one data structure to  check whether the array contain duplicate or not
//        HashSet<Integer> hashset= new HashSet<>();
//        boolean flag= false;
//        for(int i=0;i<arr.length;i++){
//            if(hashset.contains(arr[i])){
//                flag=true;
//            }
//            hashset.add(arr[i]);
//        }
//        if(flag)
//            System.out.println("Contains duplicate");
//        else
//            System.out.println("Does not contain duplicate");
    }
}
