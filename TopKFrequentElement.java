import java.util.*;


public class TopKFrequentElement {
    public  static int[] topkfrequent(int[] nums,int k){
//        edge  case if the size of nums is zero thrn return  that array itself
        if(nums.length==0){
            return  nums;
        }
//        USe hashmap to cunt the frequencies
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Queue<Integer>heap= new PriorityQueue<>(
                (a,b)->map.get(a)-map.get(b)
        );
        for(int n:map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=heap.poll();
        }
        return  ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,3};
        int k=2;
//        This is going to be take O(n log n)
//        first we use map to  count the frequencies and then
//        put it inside the lus t and sort it in desc  manner and do it
//
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>list= new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
//        System.out.println(Arrays.toString(ans));
        int[] an= topkfrequent(arr,k);
        System.out.println(Arrays.toString(an));

    }
}
