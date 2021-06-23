package btvn;

import java.util.Scanner;
import btvn.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("------Menu------");
            System.out.println("1.Thêm mới danh sách");
            System.out.println("2.Tổng hóa đơn");
            System.out.println("3.Xóa hóa đơn theo ngày");
            System.out.println("4.Thành tiền");
            System.out.println("5.Hiện thị");
            System.out.println("6.Tìm kiếm");
            System.out.println("7.Sắp xếp");
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
