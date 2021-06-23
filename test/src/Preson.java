import java.util.Comparator;

public class Preson{
    private String name;
    private String id;
    private String day;
    private int soluongtieuthu;
    private int dongia;
    private int dinhmuc;

    public Preson() {
    }

    public Preson(String id, String name, String day, int soluongtieuthu, int dongia, int dinhmuc) {
        this.name = name;
        this.id = id;
        this.day = day;
        this.soluongtieuthu = soluongtieuthu;
        this.dongia = dongia;
        this.dinhmuc = dinhmuc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getSoluongtieuthu() {
        return soluongtieuthu;
    }

    public void setSoluongtieuthu(int soluongtieuthu) {
        this.soluongtieuthu = soluongtieuthu;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id='" + id + '\'' +
                        ", day='" + day + '\'' +
                        ", soluongtieuthu=" + soluongtieuthu +
                        ", dongia=" + dongia +
                        ", dinhmuc=" + dinhmuc
                ;
    }

}
