
class myEmployes{
   private int roll;
   private String name ; 


//   construtor 
   public myEmployes(String myname , int id){
      roll =id;
      name = myname;
   }

   public void setName(String n){name = n ;}
   public void setRoll(int n){ roll = n ;}
   public String getName(){ return name ;}
   public int getRoll(){ return roll ;}
}

public class constructors {
    public static void main(String[] args){
     myEmployes std1 = new myEmployes("kumkum" , 45);
    //  std1.setName("priya rathour");
    //  std1.setRoll(323);
     System.out.println(std1.getName());
     System.out.println(std1.getRoll());
    }

}
