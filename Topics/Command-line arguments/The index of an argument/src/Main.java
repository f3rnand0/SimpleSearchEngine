import java.util.Arrays;

class Problem {
    public static void main(String[] args) {
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i]))
                index = i;
        }
        if (index > 0)
            System.out.println(index);
        else
            System.out.println(-1);
    }
}