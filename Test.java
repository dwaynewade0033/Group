public class Test {
    public static void main(String[] args){

        Student student = new Student();
String s1 = student.studentMethod(5);



        student = new Group();
        String s2 = student.studentMethod(4);



        student = new Teacher();
        String s3 = student.studentMethod(5);


        System.out.println(s1 + " " +s2 + " " + s3);

    }
}
