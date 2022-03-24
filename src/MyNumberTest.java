public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = (x, y) -> x > y ? x : y; // 람다식 구현

        System.out.println(myNumber.getMax(20, 10)); // 람다식 호출

        // 결과
        // 20
    }
}
