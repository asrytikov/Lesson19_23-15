package p1;

public class Main {

    static int x1 = 10;
    static int x2 = 33;

    public static void main(String[] args) {
        Calc calc;
        calc = (x, y) -> x+y;

        Calc calc2 = (int x, int y) -> x-y;

        System.out.println(calc2.calc(20, 10));

        Calc calc1 = new Calc() {
            @Override
            public int calc(int x, int y) {
                int temp = x1 + x2;
                return x*y;
            }
        };

        int res = calc.calc(10, 10);
        System.out.println(res);

        int res1 = calc1.calc(10, 20);
        System.out.println(res1);

        SCalc sCalc = n -> System.out.println(n);
        sCalc.print("Hello");

        Calc calc3 = (x,y) -> 10+20;

        SCalc sCalc1 = n -> {
            int s = 10;
            System.out.println(n);
        };

        sCalc1.print("Gi");

        Calc calc4 = (int x, int y) -> {
          int z = 10;
          return x+y+z;
        };

        System.out.println(calc4.calc(10, 10));

        Calc2 calc21 = () -> {
           x1 = 50;
           return x1 + x2;
        };

        System.out.println(calc21.cals());

        int z1 = 40;
        int z2 = 50;

        Calc2 calc22 = () -> {
            System.out.println(z1);
            return z1 + z2;
        };


        SPCalc spCalc = new SPCalc() {
            @Override
            public int calc(int x, int y) {
                return 0;
            }

            @Override
            public void print(int z1, int z2) {

            }
        };

       Oper<Integer> integerOper = (x, y) -> x+y;
       System.out.println(integerOper.oper(10, 2));
       Oper<String> stringOper = (x, y) -> x+y;
       System.out.println(stringOper.oper("10", "20"));




    }
}