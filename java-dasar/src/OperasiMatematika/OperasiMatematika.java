package OperasiMatematika;

public class OperasiMatematika {
    public static void main(String[] args) {
        //operasiMatematika
        int a = 20;
        int b = 2;
        int c = 3;
        int d = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //(sebab 3=5.(0)+3)
        System.out.println(c%d);

        //augmentedAssigments
        int e = 100;

        e += 100;
        //e = e + 100
        System.out.println(e);

        e -= 10;
        System.out.println(e);

        //unaryOperator
        int f = 100;

        f++;
        f+=2;
        System.out.println(f);
        System.out.println(!true);
    }
}
