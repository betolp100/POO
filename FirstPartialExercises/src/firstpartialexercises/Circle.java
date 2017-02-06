
package firstpartialexercises;

public class Circle{

private double radius;

public Circle(){
    radius = 1;
    //this (1.0, "red");
}
public Circle(double radius){
    this.radius = radius;
    //this(radius = radius);
}
public void setRadius (double radius)
{
this.radius = radius;
}
public double getArea () { //Now we can obatin the area.
    return this.radius*this.radius*Math.PI;
}
public double getCircunference(){ //Also the Circunference.
    return this.radius*2*Math.PI;    
}
@Override
public String toString(){
return "Circle [ radius = "+this.radius+" ].";
}
}