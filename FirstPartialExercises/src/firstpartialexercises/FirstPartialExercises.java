
package firstpartialexercises;

public class FirstPartialExercises {
public static void main(String[] args) {
        MyRectangle testDriver = new MyRectangle(2,0,0,2);
        System.out.println(testDriver);
        System.out.println(testDriver.getArea());
        MyPoint a = new MyPoint(3,0);
        MyPoint b = new MyPoint(0,3);
        MyRectangle testDriver2 = new MyRectangle(a,b);
        System.out.println(testDriver2);
        System.out.println(testDriver2.getArea());
    }
}
