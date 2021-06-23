import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manger  manger = new Manger();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("------Menu------");
            System.out.println("1.add person");
            System.out.println("2.edit");
            System.out.println("3.remove");
            System.out.println("4.find by name");
            System.out.println("5.show");
            System.out.println("6.sort");
            System.out.println("7.show money");
            System.out.println("8.exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    manger.addPerson();
                    break;
                case 2:
                    manger.editPerson();
                    break;
                case 3:
                    manger.remove();
                    break;
                case 4:
                    manger.findByName();
                    break;
                case 5:
                    manger.show();
                    break;
                case 6:
                    manger.sort();
                    break;
                case 7:
                    manger.showMoney();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
