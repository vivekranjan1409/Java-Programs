
class Vivek {
    int id;
    String name;
    int marks;

    Vivek(int id1, String name1, int marks1) { // Parameterized Constructor...
        this.id = id1;// keyword is a reference variable that refers to the current object of the
                      // class
        this.name = name1;
        this.marks = marks1;
    }

    void showDetails() { // Method....
        System.out.println("Your Id is " + id);
        System.out.println("Your name is " + name);
        System.out.println("Your marks is " + marks);
    }

    public static void main(String[] args) {
        // Console c = System.console();
        int id1 = 123;
        String name1 = "Vivek Ranjan";
        int marks1 = 99;
        Vivek ob = new Vivek(id1, name1, marks1);

        ob.showDetails();
    }
}
