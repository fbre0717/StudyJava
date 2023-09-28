package ch2;

public class Ex2_3 {
    public static  void main(String[] args){
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
        System.out.println();
        System.out.println("7" + 7 + "");
        System.out.println(7 + "7" + "");
//        덧 셈 연산자는 피 연산자가 모두 숫자일 때는 두 수를 더하지만, 피연산자 중 어느 한 쪽이 String이면 나머지 한 쪽을 먼저 String으로 변한환 다음 두 String을 결합한다.
    }
}
