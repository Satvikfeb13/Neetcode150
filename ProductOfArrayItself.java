import java.util.Arrays;

public class ProductOfArrayItself {
    public  static  int[] productOfArray(int[] arr){
        int[] prefix=  new int[arr.length];
        int[] suffix=  new int[arr.length];
//        Calculate the prefix sum
        prefix[0]=1;
        for(int i=1;i< arr.length;i++){
            prefix[i]=arr[i-1]*prefix[i-1];
        }
        suffix[arr.length-1]=1;
        for(int i= arr.length-2;i>=0;i--){
            suffix[i]=arr[i+1]*suffix[i+1];
        }
//        System.out.println(Arrays.toString(suffix));
//        System.out.println(Arrays.toString(prefix));
        int []ans= new int[arr.length];
        for(int i=0;i< arr.length;i++){
            ans[i]=prefix[i]*suffix[i];
        }
         return ans;
    }
    public  static  int[] productArray(int[] arr){
        int[] ans= new int[arr.length];
        ans[0]=1;
         int n=arr.length;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
         int suffix=1;
        for(int i=n-1;i>0;i--){
            ans[i]*=suffix;
            suffix*=ans[i];
        }
return  ans;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int[] ans= productOfArray(arr);
        int[] ans2= productOfArray(arr);
        System.out.println(Arrays.toString(ans2));
    }
}
