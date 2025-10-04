public class Student {
    String name;
    int rollNo;
    boolean isPresent;
    String[] subjects;

    // Class is a named group of property and method (Logical)
    // Object is an instance of class (Physical Reality)

    public Student() {}

    // Constructor 
    public Student(String name,int rollNo,boolean isPresent) {
        this.name = name;
        this.rollNo = rollNo;
        this.isPresent = isPresent;
    }

    public Student(String name,int rollNo,boolean isPresent, String[] subjects) {
        this(name,rollNo,isPresent);
        this.subjects = subjects;
    }

    public Student(Student st) {
        this(st.name, st.rollNo, st.isPresent);
    }

    void printInfo() {
        System.out.println("Student Name is "+ name + " Student Roll No is " + rollNo);
    }

}
