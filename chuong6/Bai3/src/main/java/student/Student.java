package student;

public class Student {
    private String code;
    private String name;
    private String dob;
    private String gender;

    public Student() {
    }

    public Student(String code, String name, String dob, String gender) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", dob=" + dob + ", gender=" + gender + '}';
    }
    
}
