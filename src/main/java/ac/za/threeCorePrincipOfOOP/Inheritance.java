package ac.za.threeCorePrincipOfOOP;

public class Inheritance {
    String designation = "Teacher";
}

 class MathTeacher extends Inheritance{

    public static void main(String args[]){
        MathTeacher obj = new MathTeacher();
        System.out.println(obj.designation);

    }
}



