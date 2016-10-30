/**
 * Created by Dmytro Zamosenchuk on 30/10/2016.
 * Task2 Написати програму, яка знаходить суму, різницю, добуток,
 * частку та остаток від ділення двох довільних цілих чисел та вивести результати.
 */

public class Task2 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        double Result=0;
        System.out.println("This is calculator for random inegers");
        a=(int)(Math.random()*100);
        b=(int)(Math.random()*100);
        System.out.println("First integer is "+ a);
        System.out.println("Second integer is "+ b);
        System.out.println("Sum is "+ (a+b));
        System.out.println("Sum is "+ (a-b));
        System.out.println("Sum is "+ (a*b));
        System.out.println("Sum is "+ (a/b));
        System.out.println("Sum is "+ (a%b));

    }
}
