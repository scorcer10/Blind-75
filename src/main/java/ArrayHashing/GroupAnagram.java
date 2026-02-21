package ArrayHashing;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> hasAnagrams(String strs[]){
        Map<String,List<String>> anagram = new HashMap<>();
        for(String s:strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String sarr = new String(arr);
            anagram.putIfAbsent(sarr,new ArrayList<>());
            anagram.get(sarr).add(s);
        }
        return new ArrayList<>(anagram.values());
    };

    public static void main(String args[]){
        String [] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(hasAnagrams(strs));
    }
}
