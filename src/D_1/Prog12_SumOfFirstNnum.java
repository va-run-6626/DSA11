package D_1;

public class Prog12_SumOfFirstNnum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n == 0) return 0;
        return n + sum(n-1);
    }
}
