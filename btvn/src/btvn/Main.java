package btvn;

import java.util.Scanner;
import btvn.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("------Menu------");
            System.out.println("1.Add new");
            System.out.println("2.total");
            System.out.println("3.remove by day");
            System.out.println("4.bill by day");
            System.out.println("5.show");
            System.out.println("6.FindBS by id");
            System.out.println("7.sort");
            System.out.println("8.exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.addList();
                    break;
                case 2:
                    manager.addTotalList();
                    break;
                case 3:
                    manager.choiceId();
                    break;
                case 4:
                    manager.addBillList();
                    break;
                case 5:
                    manager.show();
                    break;
                case 6:
                    manager.nhapId();
                    break;
                case 7:
                    manager.sort();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
