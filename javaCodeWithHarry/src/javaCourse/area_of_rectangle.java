package javaCourse;
class rectangle{
int side;
public int area(){
 return side*side;
}
public int perameter(){
    return 4*side;
}
}
public class area_of_rectangle {
    public static void main(String[] args){
      rectangle sideval = new rectangle();
      sideval.side = 25 ;
      System.out.println(" the area is " + sideval.area());
      System.out.println(" the parameter is square is "+ sideval.perameter());
    }
}
