

import javax.sound.sampled.SourceDataLine;

class student{
   private int id ;
     private String name;

public void setName( String n){
    name = n ;
}
public void setId( int i){
    id =  i ;
}
public String getName(){
    return name ;
}
public int getId(){
 return id;
}
}
public class getter_setter {
    public static void main(String[] args){
     student std1 = new student();
    //  std1.id = 23;
    //  std1.name = " kumkum ";
     std1.setName("manju");
       System.out.println(std1.getName());
    }
}

