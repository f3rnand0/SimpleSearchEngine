import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double a, b, c, r, s;
        switch (shape) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                s = (a + b + c) / 2;
                System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a*b);
                break;
            case "circle":
                r = scanner.nextInt();
//                s = Math.round(3.14 * r * r * 10d) / 10d;
//                System.out.println(s);
                s = 3.14 * r * r;
                System.out.println(s);
                break;

        }
    }
}