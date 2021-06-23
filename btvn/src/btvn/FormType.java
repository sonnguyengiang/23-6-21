package btvn;

import java.util.Comparator;

public class FormType {
    private int id;
    private String day;
    private int unitPrice;
    private String type;
    private int acreage;

    public FormType(){}

    public FormType(int id, String day, int unitPrice, String type, int acreage) {
        this.id = id;
        this.day = day;
        this.unitPrice = unitPrice;
        this.type = type;
        this.acreage = acreage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", day='" + day + '\'' +
                ", unitPrice=" + unitPrice +
                ", type='" + type + '\'' +
                ", acreage=" + acreage;
    }

//    @Override
//    public int compare(Form o1, Form o2) {
//        if(o1.getId() > o2.getId()){
//            return 1;
//        }else if(o1.getId() == o2.getId()){
//            return 0;
//        }else{
//            return -1;
//        }
//    }
//
}
