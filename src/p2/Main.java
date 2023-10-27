package p2;

public class Main {

    public static void main(String[] args) {
        Worker worker = (n) -> n%3 == 0;
        int[] nums = {5, 11, 15, 18, 19, 20};
        System.out.println(sum(nums, worker));

        Operator operator = executionOp(1);
        int a = operator.exec(10, 20);
        System.out.println(a);

        int b = executionOp(2).exec(20, 10);
        System.out.println(b);
    }

    private static int sum(int[] nums, Worker worker){
        int res = 0;
        for (int i : nums){
            if (worker.eq(i)){
                res += i;
            }
        }
        return res;
    }

    private static Operator executionOp(int num){
        switch (num){
            case 1: return ((x, y) -> x+y);
            case 2: return ((x, y) -> x-y);
            default:
                return (x,y) -> 0;
        }

    }

}
