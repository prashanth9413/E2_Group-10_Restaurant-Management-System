package com.sies.rms;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.atifsoftwares.circularimageview.CircularImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecordDetailActivity extends AppCompatActivity {

    private CircularImageView homei;
    private TextView name,mobile,address,price;
    private FloatingActionButton save;
    private ActionBar actionBar;
    private String recordID;
    MyDbHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_detail);

        actionBar=getSupportActionBar();
        actionBar.setTitle("Record Details");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent=getIntent();
        recordID=intent.getStringExtra("RECORD_ID");

        dbHelper=new MyDbHelper(this);





        homei=findViewById(R.id.homei);
        name=findViewById(R.id.name);
        mobile=findViewById(R.id.mobile);
        address=findViewById(R.id.address);
        price=findViewById(R.id.price);
        save=findViewById(R.id.save);


        showRecordDetails();

    }

    private void showRecordDetails() {
        String selectquery=" SELECT * FROM " + Constants.TABLE_NAME + " WHERE " + Constants.C_ID + "=\"" + recordID + "\"";
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        Cursor cursor=db.rawQuery(selectquery,null);
        if (cursor.moveToFirst()){
            do{
                String Id=""+cursor.getInt(cursor.getColumnIndex(Constants.C_ID));
                String image=""+cursor.getString(cursor.getColumnIndex(Constants.C_IMAGE));
                String Name=""+cursor.getString(cursor.getColumnIndex(Constants.C_NAME));
                String Mobile=""+cursor.getString(cursor.getColumnIndex(Constants.C_MOBILE));
                String Address=""+cursor.getString(cursor.getColumnIndex(Constants.C_ADDRESS));
                String Price=""+cursor.getString(cursor.getColumnIndex(Constants.C_PRICE));


                name.setText(Name);
                mobile.setText(Mobile);
                address.setText(Address);
                price.setText(Price);
                homei.setImageURI(Uri.parse(image));


                if(image.equals("null")){
                    homei.setImageResource(R.drawable.ic_person_black);

                }
                else {
                    homei.setImageURI(Uri.parse(image));

                }





            }while (cursor.moveToNext());
        }
        db.close();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
