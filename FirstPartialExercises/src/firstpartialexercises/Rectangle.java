
package firstpartialexercises;

public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle (){
    length = 1.0f;
    width = 1.0f;
}
public Rectangle (float width, float length){
    this.length=length;
    this.width=width;    
}
public float getLength(){
    return this.length;
}
public void setLength(float length){
    this.length=length;
}
public float getWidth(){
    return this.width;
}
public void setWidth(float width){
    this.width=width;
}
public double getArea(){
    return this.width*this.length; //We are getting the area
}
public double getPerimeter(){
    return this.width*2+this.length*2; //We are getting the perimeter
}
@Override
public String toString(){
    return "Rectangle [length = "+ this.length + ", width = "+this.width+"].";
}
}