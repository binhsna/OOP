package Bai3;

public class Department {
    private String name;
    private Employee emps[];
    private int num;

    public Department() {
    }

    public Department(String name, Employee emps[], int num) {
        this.name = name;
        this.emps = emps;
        this.num = num;
    }

    public void Department(int N) {
        emps = new Employee[N];
        num = 0;
    }

    public void addEmployee(Employee e) {
        emps[num] = e;
        num++;
    }

    public void display() {
        for (int i = 0; i < num; i++) {
            emps[i].display();
        }
    }
}
