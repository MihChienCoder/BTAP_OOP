package employee;

public class Test {
    public static void main(String[] args) {
        PartTimeEmployee pte = new PartTimeEmployee();
        System.out.println("nhap thong tin");
        pte.nhap();
        pte.setName("AAA");
        System.out.println("ten la: " + pte.getName());
        pte.setAge(19);
        System.out.println("tuoi la: "+ pte.getAge());
        
        System.out.println("thong tin la: " + pte.toString());
    }
}
