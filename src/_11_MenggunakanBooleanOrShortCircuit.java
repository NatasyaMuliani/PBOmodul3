public class _11_MenggunakanBooleanOrShortCircuit {
    public static void main(String[] args) {
        int a = 5, b = 7;
        if ((a>2)||(b++< 10)){
            b+=2;

        }
        System.out.println(b);

    }
}
