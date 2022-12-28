package javaCourse;
 class employee{
    int salary ;
    String name;
    public void outputValue(){
       System.out.println(" the name of employee is "+  name);
       System.out.println(" the salary is " + salary);
    }
 }
public class empolyClass {
    public static void main(String[] args){
       employee emp1 = new employee();
       employee emp2 = new employee();
       emp1.salary = 42374;
       emp1.name ="kumkum";
    emp2.name =" neha";
    emp2.salary = 67324;
    emp1.outputValue();
    emp2.outputValue();
    }
}
