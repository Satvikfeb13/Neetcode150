import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="rat";
        String t="tark";
//        Convert it into char array sort it and sort and check it
//        char[] str1=s.toCharArray();
//        char[] str2=t.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        System.out.println(Arrays.equals(str1,str2));
//        time complexity is O(n log n) 2*
//        space complexity is O(n)
//        use array to store the string
//        If lenght is unequal then it is not a anagram
        if(s.length()!=t.length()){
            System.out.println(false);
        }
        int []count= new int[26];
//        To store the count character frequencies
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i!=0){
                System.out.println("false");
            }
        }
    }
}
