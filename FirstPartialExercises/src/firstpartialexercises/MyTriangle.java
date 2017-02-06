
package firstpartialexercises;

public class MyTriangle
{
private MyPoint v1,v2,v3;
    
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        MyPoint v1 = new MyPoint(x1, y1);
        MyPoint v2 = new MyPoint(x2, y2);
        MyPoint v3 = new MyPoint(x3, y3);
        
        
        this.v1=v1;
        this.v2=v2;
        this.v2=v3;
    }
    public MyTriangle(MyPoint v1,MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3; 
    }
    @Override
    public String toString(){
        return "MyTriangle [ v1 = "+this.v1+", v2 = "+this.v2+", v3 ="+this.v3+" ].";
    }
    public double getPerimeter(){
        return this.v1.distance(v2)+this.v1.distance(v3)+this.v2.distance(v3); //We are getting the Perimete
    }
    public String getType(){ //In here we are getting the form of the triangle
        double a,b,c;
        a=this.v1.distance(v2);
        b=this.v1.distance(v3);
        c=this.v2.distance(v3);
        
        
        if      (a==b||b==c||c==a){
            return "Isosceles";
        }
        else if (a==b&&b==c&&a==c){
            return "Equilateral";
        }
        else return "Scalene";
    }    
}

