package javaCourse;
class student{
    String name ;
    int id;
    public void outputvalue(){
        System.out.println("the name is "+ name);
        System.out.println("the id is "+ id);
    }
}
public class ownClass {
    public static void main(String[] args){
        System.out.println(" enter the details of consumer");
        student stud1= new student();
        student stud2 = new student();
        stud1.name = "kumkum rathour";
        stud1.id = 364;
        stud2.name = "neha rathour";
        stud2.id = 834;
        stud2.outputvalue();
        stud1.outputvalue();

    }
}
