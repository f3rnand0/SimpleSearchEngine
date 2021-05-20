class Problem {
    public static void main(String[] args) {
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0)
                if ("mode".equals(args[i])) {
                    index = i;
                    break;
                } else
                    index = -1;
        }
        if (index >= 0)
            System.out.println(args[index + 1]);
        else
            System.out.println("default");
    }
}