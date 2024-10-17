public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("task 3");
        for (int i = 0; i < 18; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("task 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("task 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + "год является високосным");
        }
        System.out.println();

        System.out.println("task 6");
        for (int i = 7; i <= 98;) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();

        System.out.println("task 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task 8");
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println();

        System.out.println("task 9");
        double total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 += total2 * 0.01;
            total2 += 29000.0;
            System.out.println("Месяц " + i + " сумма накоплений равна " + (int)total2);
        }
        System.out.println();

        System.out.println("task 9");
        for (int i = 1; i <= 10; i++) {
            int res = 2 * i;
            System.out.println("2*" + i + "=" + res);
        }
        System.out.println();



    }
}