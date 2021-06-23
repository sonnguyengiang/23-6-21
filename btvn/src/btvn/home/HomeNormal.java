package btvn.home;

import btvn.tinhtien.Money;

public class HomeNormal extends Home implements Money {

    public HomeNormal(int id, String day, int unitPrice, String type, int acreage, String address) {
        super(id, day, unitPrice, type, acreage, address);
    }

    @Override
    public String toString() {
        return "HomeNormal{" + "id='" + getId() + '\'' +
                ", day='" + getDay() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", type='" + getType() + '\'' +
                ", acreage=" + getAcreage()  + super.toString()  + "}";
    }


    @Override
    public int tinhTien() {
        return (int) (this.getAcreage() * this.getUnitPrice() * 0.9);
    }
}
