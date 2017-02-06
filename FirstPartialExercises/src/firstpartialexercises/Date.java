
package firstpartialexercises;

public class Date {
public int day;
public int month;
public int year;

public Date (int day, int month, int year){
    this.day=day;
    this.month=month;
    this.year=year;
}
public int getDat(){
    return this.day;
}
public int getMonth(){
    return this.month;
}
public int getYear(){
    return this.year;
}
public void setDay(){
    this.day=day;
}
public void setMonth(){
    this.month=month;
}
public void setYear(){
    this.year=year;
}
public void setDate (int day, int month, int year){
    this.day=day;
    this.month=month;
    this.year=year;
}
@Override
public String toString() { //With this format we can play the date as dd/mm/yyyy
    return String.format("%02",this.day+"/" + String.format("%02",this.month)+ "/"+String.format("%04",this.year));
}
}
