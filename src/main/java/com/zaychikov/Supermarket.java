package main.java.com.zaychikov;

public class Supermarket {

    public static void main(String[] args) {

        Chief chief = new Chief("John");
        Bank bank = new Bank();
        bank.setMoney(70000);

        Workers[] worker = new Workers[3];
        worker[0] = new Workers("Bob", 10000);
        worker[1] = new Workers("Mike", 25000);
        worker[2] = new Workers("Jenifer", 35000);

        //Будет ли прибавка для каждого из работников +
        for (int i = 0; i < 3; i++) {
            if (chief.getMood() <= 3) {
                System.out.println("\u001B[34m" + "main.java.com.zaychikov.Chief say: Not today, please, " + worker[i].getName());
            } else if (chief.getMood() > 3 & worker[i].getSalary() < 30000) {
                System.out.println("\u001B[32m" + "main.java.com.zaychikov.Chief say: Let's do this! Your new salary: " + (worker[i].getSalary() + 3000) + ", " + worker[i].getName());
            } else {
                System.out.println("\u001B[31m" + "main.java.com.zaychikov.Chief say: Sorry, i don't have more money, " + worker[i].getName());
            }
            System.out.println("\u001B[33m" + "Worker say: Okay, " + chief.getName());
            System.out.println();
        }
    }
}