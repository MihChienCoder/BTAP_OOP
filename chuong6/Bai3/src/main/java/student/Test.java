package student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("No.1", "NNH", "2/10/2005", "Nam");
        Student student2 = new Student("No.2", "HHH", "1/1/1999", "Nu");
        try {
            FileOutputStream f0 = new FileOutputStream("student.dat");
            ObjectOutputStream out = new ObjectOutputStream(f0) ;
            out.writeObject(student1.toString() + "\n");
            out.writeObject(student2.toString() + "\n");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fi = new FileInputStream("student.dat");
            ObjectInputStream in = new ObjectInputStream(fi);
            Student s1 = (Student)in.readObject();
            System.out.println(s1);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
