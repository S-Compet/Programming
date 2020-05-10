package interview.paypal;

public class Zigzag_String_PayPal {
    public static void main(String[] args) {
        System.out.println(new Zigzag_String_PayPal().convert("PAY", 2));
    }

    public String convert(String A, int B) {
        if (B == 1) return A;

        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < B; i++) {
            int diff;
            if (i == B - 1 || i == 0) {
                diff = B - 1 ;
            } else {
                diff = B - 1 - i;
            }

            for (int j = i; j < A.length();) {
                returnValue.append(A.charAt(j));

                j += (2 * (diff - 1)) + 2;
                if (i != B - 1 && i != 0) {
                    diff = B - 1 - diff;
                }
            }
        }
        return returnValue.toString();
    }
}
