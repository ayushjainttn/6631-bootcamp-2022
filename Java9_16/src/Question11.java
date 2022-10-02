import java.util.Objects;

record Students(String studentName,
                String studentId,
                int studentAge) {
    static  int  counter = 0;
    Students{
        Objects.requireNonNull(studentName);
        counter++;
    }

}
public class Question11 {
    public static void main(String[] args) {
        Students s1 = new Students("Ayush", "ST187", 22);
        Students s2 = new Students("Nikhil", "ST188", 21);
        Students s3 = new Students("Priyansh", "ST189", 23);
        Students s4 = new Students("Devang", "ST190", 22);
        Students s5 = new Students("Ayush", "ST187", 22);

        System.out.println( s1.toString()+"\n"+
                            s2.toString()+"\n"+
                            s3.toString()+"\n"+
                            s4.toString()+"\n"+
                            s5.toString());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s5.hashCode());

        System.out.println(Students.counter);
    }
}
