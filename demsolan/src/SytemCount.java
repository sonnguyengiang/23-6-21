import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SytemCount {
    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> map = new HashMap<>();
    String[] ab;

    public void addText() {
        String c = ("C");
        String g = ("G");
        String a = ("Code Gymm");
        ab = a.split("");
        for (int i = 0; i < ab.length; i++) {
            arrayList.add(i, ab[i]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("C")) {
                arrayList.set(i, "c");
            }
            if (arrayList.get(i).equals(g)) {
                arrayList.set(i, "g");
            }
        }

    }

    public void showCount() {
        int sum = 0;
        int summ = 1;
        int summm = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("m")) {
                sum++;
            }
            if (arrayList.get(i).equals(" ")) {
                summm++;
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("m")) {
                continue;
            }
            if (arrayList.get(i).equals(" ")) {
                continue;
            }
            map.put(arrayList.get(i), summ);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("m")) {
                map.put(arrayList.get(i), sum);
            }
        }

        System.out.println(map + "\n");
    }

    public void showCount1() {
        for (int x = 0; x < arrayList.size(); x++) {
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;
            int count6 = 0;
            if (arrayList.get(x).equals("c")) {
                count++;
                map.put(arrayList.get(x), count);
            }
            if (arrayList.get(x).equals("o")) {
                count1++;
                map.put(arrayList.get(x), count1);
            }
            if (arrayList.get(x).equals("d")) {
                count2++;
                map.put(arrayList.get(x), count2);
            }
            if (arrayList.get(x).equals("e")) {
                count3++;
                map.put(arrayList.get(x), count3);
            }
            if (arrayList.get(x).equals("g")) {
                count4++;
                map.put(arrayList.get(x), count4);
            }
            if (arrayList.get(x).equals("y")) {
                count5++;
                map.put(arrayList.get(x), count5);
            }
            if (arrayList.get(x).equals("m")) {
                for (int y = 0; y < arrayList.size(); y++) {
                    if (arrayList.get(y).equals("m")){
                        count6++;
                    }
                }
                map.put(arrayList.get(x), count6);
            }
        }
        System.out.println(map + "\n");
    }

    public void show() {
        for (String abc : arrayList) {
            System.out.print(abc + " ");
        }
    }
}
