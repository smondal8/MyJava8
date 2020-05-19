package J8;

public class NagramByStream {
    public static boolean AssessAnagram(String s,String t){
        int result = 0;
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            result ^= s.charAt(i) ^ t.charAt(i);
        }
        return (result == 0)?true:false;
    }

    public static void main(String[] args) {
        if(AssessAnagram("soumya","ayuoms")){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("Not ANAGRAM");
        }
    }
}
