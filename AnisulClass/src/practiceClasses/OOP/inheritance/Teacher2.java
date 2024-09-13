package practiceClasses.OOP.inheritance;

public class Teacher2 extends Person2{
    private String qualification ;

    public void setQualification(String qualification){
        this.qualification = qualification ;
    }
    public String getQualification(){
        return qualification ;
    }

    void displayInfo1(){
        System.out.println( getName() );
        System.out.println( getAge() );
        System.out.println( getQualification() );

    }
}
