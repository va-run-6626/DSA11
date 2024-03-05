package Code365.D_7.POTD;

import java.util.Arrays;

public class LC_BagOfTokens {
    public static void main(String[] args) {
        int[] tokens = {100,200,300,400};
        int power = 200;
        int score = findScore(tokens,power);
        System.out.println(score);
    }

    private static int findScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
        int score = 0;
        while(left <= right){
            if(tokens[left] <= power){
                power -= tokens[left];
                score++;
                left++;
            }else if(score >= 1){
                score--;
                power += tokens[right];
                right--;
            }else{
                break;
            }
        }
        return score;
    }

}
