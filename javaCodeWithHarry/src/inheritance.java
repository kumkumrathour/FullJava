class Base{
    int x;
    public void setV(int x){
    System.out.println(" i am in base and having x" + x);
    }
    public int getV(){
        return x;
    }
}
class drived extends Base{
    int y ;
    public void setValue(int y){
        System.out.println(" i am in drived class valing value y" + y);
    }
    public int getValue(){
        return y;
    }
}
public class inheritance {
    public static void main(String[] args){
        System.out.println("enter the number ");
        Base a = new Base();
        a.setV(3527);
        System.out.println(a.getV());
        drived b = new drived();
        b.setValue(43874);
        System.out.println(b.getValue());
        drived d = new drived();
        d.setV(34);
        System.out.println(d.getV());
    }
}
