package Bai3;

public class Bai3 {
    public static void main(String[] args) {
        Department a = new Department();
        a.Department(3);

        Employee e1 = new Employee("Bình", 971912776, "Hà Nội");
        Employee e2 = new Employee("Hải", 816712776, "Bắc Ninh");
        Employee e3 = new Employee("Hiếu", 356716876, "HCM");
        a.addEmployee(e1);
        a.addEmployee(e2);
        a.addEmployee(e3);
        a.display();
    }
}
