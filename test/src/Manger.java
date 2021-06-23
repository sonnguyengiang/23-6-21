import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Manger {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Preson> list = new ArrayList<>();

    public Preson addKHVN() {
        System.out.println("---Enter information---");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ngay/thang/nam: ");
        String day = scanner.nextLine();
        System.out.print("Enter soluongtieuthu: ");
        int soluongtieuthu = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter dongia: ");
        int dongia = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter dinhmuc: ");
        int dinhmuc = Integer.parseInt(scanner.nextLine());
        list.add(new KHVN(id, name, day, soluongtieuthu, dongia, dinhmuc));
        return null;
    }

    public Preson addKHNN() {
        System.out.println("---Enter information---");
        System.out.print("Enter nationality: ");
        String nationality = scanner.nextLine();
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ngay/thang/nam: ");
        String day = scanner.nextLine();
        System.out.print("Enter soluongtieuthu: ");
        int soluongtieuthu = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter dongia: ");
        int dongia = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter dinhmuc: ");
        int dinhmuc = Integer.parseInt(scanner.nextLine());
        list.add(new KHNN(nationality, id, name, day, soluongtieuthu, dongia, dinhmuc));
        return null;
    }

    public void addPerson() {
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("---add---");
            System.out.println("    1.them khach hang Viet Nam");
            System.out.println("    2.add foreigner");
            System.out.println("    3.back");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addKHVN();
                    break;
                case 2:
                    addKHNN();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }

    public void editPerson() {
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("you are...");
            System.out.println("   1.Vietnamese");
            System.out.println("   2.foreigner");
            System.out.println("   3.back");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    editKHVN();
                    break;
                case 2:
                    editKHNN();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }

    public void editKHNN() {
        System.out.print("Enter your id: ");
        String temp = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(temp)) {
                list.set(i, addKHNN());
            }
        }
    }

    public void editKHVN() {
        System.out.print("Enter your id: ");
        String temp = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(temp)) {
                list.set(i, addKHVN());
            }
        }
    }

    public void remove() {
        System.out.print("Enter your id that you want delete: ");
        String temp = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(temp)) {
                list.remove(i);
            }
        }
    }

    public void show() {
        for (Preson x : list) {
            System.out.println(x);
        }
    }

    public void findByName() {
        System.out.print("Enter a name that you want find: ");
        String name = scanner.nextLine();
        int x = -1;
        ArrayList<Preson> arrayList = new ArrayList<>();
        for (Preson preson : list) {
            if (preson instanceof KHNN) {
                if (((KHNN) preson).getName().equals(name)) {
                    arrayList.add(preson);
                    x = 1;
                }
            }
            if (preson instanceof KHVN) {
                if (((KHVN) preson).getName().equals(name)) {
                    arrayList.add(preson);
                    x = 1;
                }
            }
        }
        if (x > 0) {
            System.out.println("not found " + name);

        } else {
            for (Preson a : arrayList) {
                System.out.println(a);
            }
        }
    }

    public void sort() {
        sortname s = new sortname();
        Collections.sort(list, s);
    }
}


//for (CanBo element: arrayList) {
//        if (element instanceof CongNhan) {
//        if (((CongNhan) element).getCareer().equals(findname)) {
//        canBos.add(element);
//        }