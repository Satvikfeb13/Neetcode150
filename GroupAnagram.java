import java.util.*;

public class GroupAnagram {

        public static List<List<String>> groupAnagrams(String[] strs) {
//            Handling the edge case
            if(strs.length == 0){
                return new ArrayList();
            }
//    Create a map String and list of all string
            Map<String, List> ansMap = new HashMap<>();
//26 character
            int[] count = new int[26];

            for(String s:strs){
                // fill all the element is zero
                Arrays.fill(count, 0);
//                if a then  that value is 1 from  0
                for(char c:s.toCharArray()){
                    count[c-'a']++;
                }
//                Convert string to string builder
                StringBuilder sb = new StringBuilder("");
//appeding at the end of loop
                for(int i=0; i<26; i++){
                    sb.append("#");
                    sb.append(count[i]);
                }
//                Convert this key is not present then convert it
                String key = sb.toString();
                if(!ansMap.containsKey(key)){
                    ansMap.put(key,new ArrayList());

                }
                ansMap.get(key).add(s);

            }
            return new ArrayList(ansMap.values());

        }
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
       List<List<String> > ans=groupAnagrams(strs);
        System.out.println(ans);
//       for(int i=0;i< ans.size();i++){
//           for(int j = 0; j< ans.get(i).size(); j++){
//               System.out.println(ans.get(i).get(j));
//           }
//       }
        }
}
