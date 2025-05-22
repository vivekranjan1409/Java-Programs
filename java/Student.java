
public class Student {
    String name;
    int rno;
    double percent;

    final String schoolName = "Gniot";

    private static int numberOfStudents;


    // Static :- it is used if we want to access a function in the class through just classname.function


    // public Student(){ // default constructor
    //     System.out.println("this is default constructor.");
    // }

    public Student(String name,int rno,double percent){   // creating parameterized constructor
        this.name = name;
        this.rno = rno;
        this.percent = percent;


        numberOfStudents++;
       


        // Constructor :- constructor has same name as well as class name.

    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public int getRno(){   // getter
        return rno;
    }

    public void setRno(int roll){   //setter
        rno = roll;
    }
    
}

