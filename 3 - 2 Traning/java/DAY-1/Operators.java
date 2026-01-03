public class Operators {
     public static void main(String[] args) {

        int a = 10;
        int b = 5;

       //Arithmetic operators
        System.out.println(a + b); 
        System.out.println(a - b); 
        System.out.println(a * b); 
        System.out.println(a / b); 

        //Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

       // Assignment Operatore
        a += 5;
        a -= 6;
        a *= 2;
        a /= 9;
        a %= 2;
        System.out.println(a);

        //Logical OOperators
       boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        //Unary Operators
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
    }
}