package com.sies.rms;

public class Constants {
    public static final String DB_NAME="MY_RECORD_DB";
    public static final int DB_VERSION=1;
    public static final String TABLE_NAME="MY_RECORD_TABLE";
    public static final String C_ID="ID";
    public static final String C_IMAGE="IMAGE";
    public static final String C_NAME="NAME";
    public static final String C_MOBILE="MOBILE";
    public static final String C_ADDRESS="ADDRESS";
    public static final String C_PRICE="PRICE";
    public static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("
            + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + C_IMAGE +" TEXT,"
            + C_NAME +" TEXT,"
            + C_MOBILE +" TEXT,"
            + C_ADDRESS +" TEXT,"
            + C_PRICE +" TEXT"
            +")";


}
