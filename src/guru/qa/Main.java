package guru.qa;

public class Main {

    public static void main(String[] args) {
        int year = 2021;
        double pi = 3.1415;
        String title = "Java";
        long b = 922335452;
        short c = -32768;
        int x=5; int y=10;
        int w=0;
        boolean flag = x+y<b;
        boolean flag2 = pi>b;
        boolean flag3=(x+y)==(pi+year);
        boolean flag4=(x+y)!=(pi+year);

        System.out.println("a="+(year-pi));
        System.out.println(title+pi);
        System.out.println(pi*x);
        System.out.println(pi/y);
        System.out.println(b*b);
        System.out.println(++x);
        System.out.println(--y);
        System.out.println(b/b);
        System.out.println(year%x);
        System.out.println(c-c);
        System.out.println(flag);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);

        if (pi+year>x+y) {
            System.out.println("Это хороший пример");
        }
        else {
            System.out.println("Ошибка");
        }
    }
}

