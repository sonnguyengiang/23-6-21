public class KHNN extends Preson implements thanhtien{
    private String nationality;

    public KHNN(String nationality, String id, String name, String day, int soluongtieuthu, int dongia, int dinhmuc) {
        super(id, name, day, soluongtieuthu, dongia, dinhmuc);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "KHNN{" +
                "nationality='" + nationality + '\'' + super.toString() +
                '}';
    }

    @Override
    public int tinhtien() {
        int thanhtien = -1;
        int sodu = 0;
        if (this.getSoluongtieuthu() <= this.getDinhmuc()){
            thanhtien = this.getSoluongtieuthu() * this.getDongia();
        } else {
            sodu = this.getSoluongtieuthu() - this.getDinhmuc();
            thanhtien = (int) (this.getSoluongtieuthu() * this.getDongia() * this.getDinhmuc() + sodu * getDongia() * 2.5);
        }
        return thanhtien;
    }
}
