//swapping two numbers without using 3rd variable
public class sorting1 {
    public static void main(String[] args) {
        int a,b;
        a=20;
        b=10;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+"=value of a"   +b+"=value of b");
    }
}
