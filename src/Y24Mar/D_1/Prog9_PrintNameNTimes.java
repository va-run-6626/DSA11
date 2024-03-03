package Y24Mar.D_1;

public class Prog9_PrintNameNTimes {
    public static void main(String[] args) {
        String s = "vans";
        int n = 5;
        fun(s,n);
    }

    private static void fun(String s, int n) {
        if(n == 0) return;
        System.out.println(s);
        fun(s,--n);
    }
}
