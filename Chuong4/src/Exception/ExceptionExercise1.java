package Exception;

public class ExceptionExercise1 {
    public static void main(String[] args) throws NegativeAgeException {
        Student s = new Student("Binh", 2001);
        System.out.println(s.getAge(2020));
        try {
            Student s1 = new Student("Binh", 2001);
            System.out.println(s1.getAge(1000));
        } catch (NegativeAgeException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

class NegativeAgeException extends Exception {
    public String getMessage() {
        return "Current year can not be less than birthyear";
    }
}

class Student {
    String name;
    int birthyear;//năm sinh

    public Student() {
    }

    public Student(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public int getAge(int year) throws NegativeAgeException {
        if (year < birthyear) {
            throw new NegativeAgeException();
        } else {
            return year - birthyear;
        }
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }
}
