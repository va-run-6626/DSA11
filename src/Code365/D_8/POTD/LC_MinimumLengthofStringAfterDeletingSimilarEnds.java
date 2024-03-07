package Code365.D_8.POTD;

public class LC_MinimumLengthofStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        System.out.println(minimumLength(s));
        System.out.println(minimumLength2(s));
    }

    private static int minimumLength(String s) {
        int n = s.length();
        int minLen = n;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                while(i < j && s.charAt(i) == s.charAt(i+1)) i++;
                while(j > i && s.charAt(j) == s.charAt(j-1)) j--;
                minLen = Math.min(minLen,j-i-1);
                i++;
                j--;
            }else {
                return minLen;
            }
        }
        return i == j ? 1 : 0;
    }
    public static int minimumLength2(String s) {
        int i = 0;
        int j = s.length()-1;
        while(j > i){
            if(s.charAt(i) != s.charAt(j)) break;
            char ch = s.charAt(i);
            while(j >= i && s.charAt(i) == ch)i++;
            while(j >= i && s.charAt(j) == ch)j--;
        }
        return j - i +1;
    }
}
