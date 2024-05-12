package Exception;

public class ExceptionExercise2 {
    public static void main(String[] args) {
        try {
            Account a = new Account();
            a.balance = 1000;
            a.withdraw(2000);

            float x = 12 / 0;
            //NotEnoughMoneyWithdraw a1 = new NotEnoughMoneyWithdraw(120);
            System.out.println("Cuoi menh de try");
        } catch (NOtEnoughMoney e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { // Bắt lỗi vạn năng
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cuoi chuong trinh");
        }

    }

}

class NotEnoughMoneyWithdraw extends NOtEnoughMoney {
    int lack_money; // Tiền thiếu

    public NotEnoughMoneyWithdraw(int m) {
        lack_money = m;
    }

    @Override
    public String getMessage() {
        return "Not enough " + lack_money + " money";
    }
}

class NOtEnoughMoney extends Exception {
    @Override
    public String getMessage() {
        return "Not enough money";
    }
}

class Account {
    int balance;

    public void withdraw(int x) throws NOtEnoughMoney {
        if (x > balance) {
            // Phat sinh ngoai le: khong rut duoc
            throw new NOtEnoughMoney();
        } else {
            balance -= x;
        }
    }
}