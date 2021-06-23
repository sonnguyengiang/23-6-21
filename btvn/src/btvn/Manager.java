package btvn;

import btvn.home.HomeBrandStuff;
import btvn.home.HomeNormal;
import btvn.type.TypeA;
import btvn.type.TypeB_C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Manager {
    ArrayList<FormType> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addListDrit() {
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("        ---Menu---");
            System.out.println("        1.Add new typeA");
            System.out.println("        2.Add new typeB-C");
            System.out.println("        3.Back");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    addDirtTypeA();
                    break;
                case 2:
                    addDirtTypeB_C();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }

    public void addListHome() {
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("        ---Menu---");
            System.out.println("        1.Add new HomeNormal");
            System.out.println("        2.Add new HomeBrandStuff");
            System.out.println("        3.Back");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    addHomeNormal();
                    break;
                case 2:
                    addHomeBrandStuff();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }

    public void addList() {
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("    ---Menu---");
            System.out.println("    1.Add new Dirt");
            System.out.println("    2.Add new Home");
            System.out.println("    3.Back");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    addListDrit();
                    break;
                case 2:
                    addListHome();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }

    public void addDirtTypeA() {
        String type = ("Type A");
        System.out.println("  ---Enter new information---");
        System.out.print("    Enter a id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a day/moth/year: ");
        String day = input.nextLine();
        System.out.print("    Enter a unitPrice: ");
        int unitPrice = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a acreage: ");
        int acreage = Integer.parseInt(input.nextLine());
        list.add(new TypeA(id, day, unitPrice, type, acreage));
    }

    public void addDirtTypeB_C() {
        String type = ("Type B-C");
        System.out.println("  ---Enter new information---");
        System.out.print("    Enter a id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a day/moth/year: ");
        String day = input.nextLine();
        System.out.print("    Enter a unitPrice: ");
        int unitPrice = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a acreage: ");
        int acreage = Integer.parseInt(input.nextLine());
        list.add(new TypeB_C(id, day, unitPrice, type, acreage));
    }

    public void addHomeBrandStuff() {
        String type = ("Home Brand Stuff");
        System.out.println("  ---Enter new information---");
        System.out.print("    Enter a id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a day/moth/year: ");
        String day = input.nextLine();
        System.out.print("    Enter a unitPrice: ");
        int unitPrice = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a acreage: ");
        int acreage = Integer.parseInt(input.nextLine());
        System.out.print("  Enter a address: ");
        String address = input.nextLine();
        list.add(new HomeBrandStuff(id, day, unitPrice, type, acreage, address));
    }

    public void addHomeNormal() {
        String type = ("Home Normal");
        System.out.println("  ---Enter new information---");
        System.out.print("    Enter a id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a day/moth/year: ");
        String day = input.nextLine();
        System.out.print("    Enter a unitPrice: ");
        int unitPrice = Integer.parseInt(input.nextLine());
        System.out.print("    Enter a acreage: ");
        int acreage = Integer.parseInt(input.nextLine());
        System.out.print("  Enter a address: ");
        String address = input.nextLine();
        list.add(new HomeNormal(id, day, unitPrice, type, acreage, address));
    }

    public int totalDirt() {
        int sum = 0;
        for (FormType s : list) {
            if (s instanceof TypeA) {
                sum++;
            }
            if (s instanceof TypeB_C) {
                sum++;
            }
        }
        return sum;
    }

    public int totalHome() {
        int sum = 0;
        for (FormType s : list) {
            if (s instanceof HomeBrandStuff) {
                sum++;
            }
            if (s instanceof HomeNormal) {
                sum++;
            }
        }
        return sum;
    }

    public void addTotalList(){
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("    ---Menu---");
            System.out.println("    1.Total Dirt");
            System.out.println("    2.Total Home");
            System.out.println("    3.Back");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    totalDirt();
                    break;
                case 2:
                    totalHome();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }
    public void choiceId() {
        System.out.print("Enter a day: ");
        String day = input.nextLine();
        for (FormType s : list) {
            if (s.getDay().equals(day)) {
                System.out.println(s);
            }
        }
        removeById();
    }

    public void removeById() {
        System.out.print("Enter a id that you want remove: ");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                list.remove(i);
            }
        }
    }

    public void sort() {
        SortId sortId = new SortId();
        Collections.sort(list, sortId);
    }

    public void tinhTienTheoNgayByHome() {
        System.out.print("Enter a day/moth/year: ");
        String day = input.nextLine();
        for (FormType s : list) {
            if (s instanceof HomeBrandStuff) {
                if (((HomeBrandStuff) s).getDay().equals(day)) {
                    System.out.println(s);
                    int tien1 = ((HomeBrandStuff) s).tinhTien();
                    System.out.println(tien1);
                }
            }
            if (s instanceof HomeNormal) {
                if (((HomeNormal) s).getDay().equals(day)) {
                    System.out.println(s);
                    int tien = ((HomeNormal) s).tinhTien();
                    System.out.println(tien);
                }
            }
        }
    }

    public void tinhTienTheoNgayByDirt() {
        System.out.print("Enter a day/moth/year: ");
        String day = input.nextLine();
        for (FormType s : list) {
            if (s instanceof TypeA) {
                if (((TypeA) s).getDay().equals(day)) {
                    System.out.println(s);
                    int tien1 = ((TypeA) s).tinhTien();
                    System.out.println(tien1);
                }
            }
            if (s instanceof TypeB_C) {
                if (((TypeB_C) s).getDay().equals(day)) {
                    System.out.println(s);
                    int tien = ((TypeB_C) s).tinhTien();
                    System.out.println(tien);
                }
            }
        }
    }

    public void addBillList(){
        int checklist = 0;
        while (checklist == 0) {
            System.out.println("    ---Menu---");
            System.out.println("    1.transaction money by Dirt");
            System.out.println("    2.transaction money by Home");
            System.out.println("    3.Back");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    tinhTienTheoNgayByDirt();
                    break;
                case 2:
                    tinhTienTheoNgayByHome();
                    break;
                case 3:
                    checklist = -1;
                    break;
            }
        }
    }

    public void show() {
        for (FormType a : list) {
            System.out.println(a);
        }
    }

//    public void timKiem() {
//        sort();
//        System.out.print("Enter a number that you want find: ");
//        int index = Integer.parseInt(input.nextLine());
//        int head = 0;
//        int tail = list.size() - 1;
//        int mid;
//        while (head <= tail) {
//            mid = (tail - head) / 2;
//            if (tail < head) {
//                return;
//            }
//            if (list.get(mid).getId() == index) {
//                System.out.println(list.get(mid));
//                return;
//            } else if (index > list.get(mid).getId()) {
//                head = mid + 1;
//            } else {
//                tail = mid - 1;
//            }
//        }
//    }
    public int timKiemNhiPhan(ArrayList<FormType> list, int dau, int cuoi, int id) {
        sort();
        int giua = (dau + cuoi) / 2;
        if (id > list.get(cuoi).getId() || id < list.get(dau).getId()) {
            return -1;
        } else if (cuoi < dau) {
            return -1;
        } else if (id == list.get(giua).getId()) {
            return giua;
        } else if (id > list.get(giua).getId()) {
            return timKiemNhiPhan(list, giua + 1, cuoi, id);
        } else return timKiemNhiPhan(list, dau, giua - 1, id);
    }
    public void nhapId(){
        int head = 0;
        int tail =list.size() -1;
        System.out.print("enter a number that you want find: ");
        int index = Integer.parseInt(input.nextLine());
        int temp = timKiemNhiPhan(list, head,tail,index);
        System.out.println(list.get(temp));
    }
}
