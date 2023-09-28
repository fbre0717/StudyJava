package ch2;

public class Ex2_2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);

//        +를 이용하여 문자열을 합칠 수 있다.
    }
}
