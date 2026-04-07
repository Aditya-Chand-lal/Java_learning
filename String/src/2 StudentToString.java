class StudentToString {
    String studentName;
    int rollNo;
    int age;

    public StudentToString(String studentName, int rollNo, int age) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nStudent Details : \n{ \nStudent Name : " + studentName +
                " \nStudent Roll number : "+ rollNo +" " +
                "\nStudent age : "+ age +"\n}";
    }

    public static void main(String[] args) {
        StudentToString std = new StudentToString("Aditya",11,23);
        System.out.println(std);
        StudentToString std2 = new StudentToString("Prerna",12,23);
        System.out.println(std2);

    }
}
