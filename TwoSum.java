import java.util.HashMap;

public class TwoSum {
    public  static  int[] twoSum(int[] arr, int target){
//        int [] ans= new int[2];
//        for(int i=0;i< arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    return  new int[]{i,j};
//                }
//            }
//        }
        return new int[]{-1,-1};
    }
    public  static  int[] twoSum2(int[] arr, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int expec=target-arr[i];
            if(map.containsKey(expec)){
                return  new int[]{map.get(expec),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
        public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
//        Brute force solution
//        It will check all possible pair and check their sum is this equal or not
//        time complexity is O(n^2)
//        space complexity O(1)
//        Optimize approach of this question is use hashMap
//        target-arr[i]= ans is that ans is present the hashmap or not
//        if present thrn return it otherwise add that element and index to hashmap

//        int[] ans=twoSum(arr,target);
//        for(int i: ans){
//            System.out.println(i);
//        }

//
        int[] ans=twoSum2(arr,target);
        for(int i: ans){
            System.out.println(i);
        }

    }
}
