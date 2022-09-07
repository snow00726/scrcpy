public class Test {
    public static void main(String[] args) {
        int[] num = [0, 7, 52, 3, 4, 15, 6, 27, 8, 99];
        System.out.println(num[2]);

        String str = "null";
        int len = str.length();
        System.out.println(len);

        int a = 4;
        for (int i = 0; i < num.length; i++) {
            int b = num[i];
            int c = a / b;
            print(c);
        }
    }
}