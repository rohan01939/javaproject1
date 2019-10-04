package HomeWork3;

public class Homework3 {

    public static void main(String[] args) {
        //void
        addition(100, 150, 50);
        //return
        int R1 = getaddition(10, 35, 45);
        System.out.println(R1);
        //void
        substract(100, 34, 12);
        //return
        int S1 = getsubstract(10, 2, 4);
        System.out.println(S1);
        //void
        multiply(30, 33, 34);
        //return
        int P1 = getmultiply(22, 21, 24);
        System.out.println(P1);
        //void
        devide(5, 3, 1);
        //return
        double A1 = getdevide(3, 4, 5);
        System.out.println(A1);
    }

    // TODO Auto-generated method stub
    public static void addition(int aa, int bb, int cc) {
        int zz = aa + bb + cc;
        System.out.println(zz);
    }

    public static int getaddition(int aa, int bb, int cc) {
        int zz = aa + bb + cc;
        return zz;
    }

    public static void substract(int a, int b, int c) {
        int d = a - b - c;
        System.out.println(d);
    }

    public static int getsubstract(int x, int y, int z) {
        int q = x - y - z;
        return q;
    }

    public static void multiply(int p, int o, int i) {
        int u = p * o * i;
        System.out.println(u);
    }

    public static int getmultiply(int g, int h, int k) {

        return g * h * k;
    }

    public static void devide(int a, int b, int c) {
        int d = a / b / c;
        System.out.println(d);
    }

    public static double getdevide(double f, double g, double h) {
        double i = f / g / h;
        return i;
    }


}


