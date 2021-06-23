package btvn.home;

import btvn.FormType;

public class Home extends FormType {
    private String address;

    public Home(String address) {
        this.address = address;
    }

    public Home(int id, String day, int unitPrice, String type, int acreage, String address) {
        super(id, day, unitPrice, type, acreage);
        this.address = address;
    }

    public String getAddress() {
        return super.toString() + address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "address='" + address + '\'';
    }
}
