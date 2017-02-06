
package firstpartialexercises;

public class Time {
private int hour;
private int minute;
private int second;

public Time (int hour, int minute, int second){
    this.second=second;
    this.minute=minute;
    this.hour=hour;
}
public int getHour(){
    return this.hour;
}
public int getMinute(){
    return this.hour;
}
public int getSecond(){
    return this.second;
}
public void setHour(int hour){
    this.hour=hour;
}
public void setMinute (int minute){
    this.minute=minute;
}
public void  setSecond(int second){
    this.second=second;
}
public void setTime(int hour, int minute, int second){
    this.hour=hour;
    this.minute=minute;
    this.second=second;
}
@Override
public String toString(){
     return String.format("%02d", this.hour)+":"+String.format("%02d", this.minute)+":"+String.format("%02d", this.second);
    }


public Time nextSecond(){
        Time tiempo = new Time(this.hour, this.minute, this.second);  //We are making a new object time so at the end we can retake the original.
        if(tiempo.second+1==60){
            tiempo.second=0;
            
            if(tiempo.minute+1==60){
                tiempo.minute=0;
               
                if(tiempo.hour+1==24){
                    tiempo.hour=0;
                
                }else ++tiempo.hour;
            
            } else ++tiempo.minute;
        
        } else ++tiempo.second;
        return tiempo; //Return time.
    }

    public Time previousSecond(){
        Time tiempo = new Time(this.hour, this.minute, this.second); //We are making a new object time so at the end we can retake the original.
        if(tiempo.second-1<00){
            tiempo.second=59;
            
            if(tiempo.minute-1<00){
                tiempo.minute=59;
               
                if(tiempo.hour-1<00){
                    tiempo.hour=23;
                
                }else --tiempo.hour;
            
            } else --tiempo.minute;
        
        } else --tiempo.second;
        return tiempo; //Return time
        
    } 
}