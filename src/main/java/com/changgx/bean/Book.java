package com.changgx.bean;

/**
 * Created by Administrator on 2016/7/22.
 */
public class Book {
    private int ISDN;
    private String bookName;
    private String price;
    private int num;

    @Override
    public String toString() {
        return "Book{" +
                "ISDN=" + ISDN +
                ", bookName='" + bookName + '\'' +
                ", price='" + price + '\'' +
                ", num=" + num +
                '}';
    }

    public int getISDN() {
        return ISDN;
    }

    public void setISDN(int ISDN) {
        this.ISDN = ISDN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
