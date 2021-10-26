package com.sies.rms;

public class ModelRecord {
    String id,image,name,mobile,address,price;

    public ModelRecord(String id, String image, String name, String mobile, String address, String price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
