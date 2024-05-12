package Bai1;

public class Bai1 {
    public static void main(String[] args) {
        // Liên kết tĩnh
        Citizen c = new Citizen("Binh", "2001", "Ha Noi", "803280");
        c.display();
        Officer o = new Officer("Yen", "2001", "HCM", "7879899", "IT", "Manager");
        o.display();

        // Liên kết động
        Citizen c1 = new Citizen("Nam", "2001", "Nam Dinh", "8980");
        c1.display();
        c1 = new Officer("IT", "Designer");
        c1.display();
    }
}

// Định nghĩa lớp Citizen (công dân)
class Citizen {
    private String name;
    private String birthday;
    private String address;
    private String idCardNum;

    public Citizen() {
    }

    public Citizen(String name, String birthday, String address, String idCardNum) {
        this();
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.idCardNum = idCardNum;
    }

    public void display() {
        System.out.println(this.name + " "
                + this.birthday + " "
                + this.address + " "
                + this.idCardNum);

    }
}

class Officer extends Citizen {

    private String department; // phòng ban
    private String Position; // Chức vụ

    public Officer() {
    }

    public Officer(String department, String Position) {
        this.department = department;
        this.Position = Position;
    }

    public Officer(String name, String birthday, String address,
                   String idCardNum, String department, String position) {
        super(name, birthday, address, idCardNum);
        this.department = department;
        this.Position = position;

    }

    @Override
    public void display() {
        super.display();
        System.out.println(this.department + " " + this.Position);
    }
}
