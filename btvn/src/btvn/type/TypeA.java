package btvn.type;

import btvn.FormType;
import btvn.tinhtien.Money;

public class TypeA extends FormType implements Money {

    public TypeA() {
    }

    public TypeA(int id, String day, int unitPrice, String type, int acreage) {
        super(id, day, unitPrice, type, acreage);
    }

    @Override
    public String toString() {
        return "TypeA {" + super.toString() + "}";
    }

    @Override
    public int tinhTien() {
        return (int) (this.getAcreage() * this.getUnitPrice() * 1.5);
    }
}
