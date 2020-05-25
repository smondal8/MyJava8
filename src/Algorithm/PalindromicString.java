package Algorithm;

//https://www.interviewbit.com/problems/palindrome-string/
public class PalindromicString {
    public static int isPalindrome(String A) {
        String filtered = A.replaceAll("\\W","");
        boolean result = isPalindrom(filtered.toLowerCase());
        return (result)?1:0;
    }
    public static boolean isPalindrom(String str){
        boolean result = true;
        for(int i=0, j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("H?:EH"));
    }
}
