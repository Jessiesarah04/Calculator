

public class ArithmeticOperations{
    public static void main(String[] args) {
     

        System.out.println(square(2));
        System.out.println(cube(3));
        System.out.println(modulus(10,2));
        System.out.println(power(3,2));
    }

    static double square(double num) {
        return num*num;
    }

    static double cube(double num) {
        return num*num*num;
    }

    static double modulus(double num, double modulusNum) {
        return num % modulusNum;
    }

    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
