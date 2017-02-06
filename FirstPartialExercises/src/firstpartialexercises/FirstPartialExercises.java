
package firstpartialexercises;

public class FirstPartialExercises {
public static void main(String[] args) {
        MyRectangle test = new MyRectangle(2,0,0,2);
        System.out.println(test);
        System.out.println(test.getArea());
        MyPoint a = new MyPoint(3,0);
        MyPoint b = new MyPoint(0,3);
        MyRectangle test2 = new MyRectangle(a,b);
        System.out.println(test2);
        System.out.println(test2.getArea());
    }
}