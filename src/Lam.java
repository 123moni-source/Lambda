@FunctionalInterface  //It is optional
interface A{
    public void show();
}

public class Lam{
    public static void main(String[] args) {
        int width=10;

        //with lambda
        A a2=()->{
            System.out.println("A"+width);
        };
        a2.show();
    }
}