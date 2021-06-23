public class KHVN extends Preson implements thanhtien {
    public KHVN(String id, String name, String day, int soluongtieuthu, int dongia, int dinhmuc) {
        super(id, name, day, soluongtieuthu, dongia, dinhmuc);
    }

    @Override
    public int tinhtien() {
        int thanhtien = -1;
        int sodu = 0;
        if (this.getSoluongtieuthu() <= this.getDinhmuc()) {
            thanhtien = this.getSoluongtieuthu() * this.getDongia();
        } else {
            sodu = this.getSoluongtieuthu() - this.getDinhmuc();
            thanhtien = (int) (this.getSoluongtieuthu() * this.getDongia() * this.getDinhmuc() + sodu * getDongia() * 2.5);
        }
        return thanhtien;
    }

    @Override
    public String toString() {
        return "KHVN{" + super.toString() + "}";
    }
}
