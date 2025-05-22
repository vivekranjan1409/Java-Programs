public class StudentClass {
    
    public static void fun(Student x) {
        System.out.println(x.name);
        return;
    }   

    public static void change(Student s){
        s.name = "Ramdeep";
    }

    // objects are real life entities and objects are instance of class.
    // classes are the blueprints.
    public static void main(String[] args) {


        // Student.numberOfStudents = 100;
        // System.out.println(Student.numberOfStudents);
        Student s1 = new Student("Vivek",196,78.8);
       
        // s1.name = "Vivek";
        // s1.rno = 196;
        // s1.percent = 78.8;

        // s1.schoolName = "iimt";  we can't assign a value to final varaiable schoolName.


        // System.out.println(s1.schoolName);
        // System.out.println(s1.name);
        // System.out.println(s1.rno);
        // System.out.println(s1.percent);


        Student s2 = new Student("Ramdeep",132,96.6);
        System.out.println(s1.getNumberOfStudents());

        System.out.println(s2.getNumberOfStudents());

        // System.out.println(s2.name);
        // System.out.println(s2.rno);
        // System.out.println(s2.percent);

        // Student x = new Student(); // Declaration
        // x.name = "Vivek";
        // // x.rno = 196;
        // x.percent = 78.8;

        // x.setRno(196);


        // System.out.println(x.getRno());
        // // fun(x);
        // System.out.println(x.name);
        // change(x);  // passing the class object through pass by refernce
        // System.out.println(x.name);

        // System.out.println("Name:"+x.name+"\nRoll No: "+x.rno+"\nPercentage:
        // "+x.percent);
    }
}

// Passing class to functions :- we have to declare the class outside the main
// function.and if we can create user defined class the we can pass the object
// through the pass by reference.


// Access modifiers
// public- all packages
// private - same class
// default - same package
