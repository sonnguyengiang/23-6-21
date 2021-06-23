package btvn.type;

import btvn.FormType;
import btvn.tinhtien.Money;

public class TypeB_C extends FormType implements Money {
    public TypeB_C() {
    }

    public TypeB_C(int id, String day, int unitPrice, String type, int acreage) {
        super(id, day, unitPrice, type, acreage);
    }

    @Override
    public String toString() {
        return "TypeB/C{" + super.toString() + "}";
    }


    @Override
    public int tinhTien() {
        return this.getAcreage() * this.getUnitPrice();
    }
}
