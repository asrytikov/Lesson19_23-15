package p3;

public class Main {

    public static void main(String[] args) {
        int[] nums = {5, 11, 15, 18, 19, 20};
        System.out.println(sum(nums, ExprWorker::is5));

        ExprWorker worker = new ExprWorker();
        Expr expr = worker::isPos;
        System.out.println(sum(nums, expr));
    }

    private static int sum(int[] nums,  Expr expr){
        int res = 0;
        for (int i : nums){
            if (expr.eq(i)){
                res += i;
            }
        }
        return res;
    }

}
