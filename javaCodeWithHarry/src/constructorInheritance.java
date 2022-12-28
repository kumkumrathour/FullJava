import javax.annotation.processing.SupportedSourceVersion;
import javax.sound.sampled.SourceDataLine;

class Base{
    public int x ;
    Base(){
      System.out.println(" the base class"+ x);
    }
    Base(int x){
        System.out.println(" the base 2 value" + x);
    }
}
class child extends Base{
    public int y ; 
    child(){
        System.out.println(" the child y");
    }
    child(int x , int y){
        super(x);
        System.out.println(" the parents value");
    }
}
class grandchild extends child{
    public int z ;
    grandchild(){
        System.out.println(" the grandchild is ");
    }
    grandchild(int x, int y, int z){
        super(x,y);
        System.out.println(" the grandchild is " + z);
    }
}

public class constructorInheritance {
    public static void main(String[] args){
        grandchild gc=new grandchild(23,34,3)  ;
      }
}
