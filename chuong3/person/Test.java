package person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.nhap();
        person.setName("HIEU");
        System.out.println("thong tin cua nguoi: " + person.toString());
    }
}
