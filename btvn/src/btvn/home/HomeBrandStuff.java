package btvn.home;

import btvn.tinhtien.Money;
import btvn.*;

public class HomeBrandStuff extends Home implements Money {

    public HomeBrandStuff(int id, String day, int unitPrice, String type, int acreage, String address) {
        super(id, day, unitPrice, type, acreage, address);
    }

    @Override
    public String toString() {
        return "HomeBrandStuff{" + "id='" + getId() + '\'' +
                ", day='" + getDay() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", type='" + getType() + '\'' +
                ", acreage=" + getAcreage()  + super.toString()  + "}";
    }

    @Override
    public int tinhTien() {
        return (int) (this.getAcreage() * this.getUnitPrice());
    }
}
