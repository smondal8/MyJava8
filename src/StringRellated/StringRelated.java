package StringRellated;

import java.io.BufferedReader;
import java.util.HashSet;

public class StringRelated {
    public int lengthOfLongestSubstring(String s) {
        char[] substring = new char[s.length()];
        int start,end,size =0;
        HashSet<Character> hs = new HashSet<Character>();
        if(s.equals(" ")){
            return 0;
        }
        for (start = 0; start < s.length(); start++) {
            //end = start;
            for (end = start; end < s.length(); end++) {
                if (!hs.contains(s.charAt(end))) {
                    hs.add(s.charAt(end));
                } else {
                    break;
                }
            }
            hs.clear();
            size = (size < s.substring(start, end).length()) ? s.substring(start, end).length() : size;
        }
        return size;
    }

    public static void main(String[] args) {
        String line = "dbfgbacd";
        int ret = new StringRelated().lengthOfLongestSubstring(line);
        System.out.print(ret);
        }
    }
