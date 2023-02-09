package com.pakachu.benfit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DisplayDB extends SQLiteOpenHelper {

    public static final String TABLE = "measurements";
    public static final String TABLE_COL1 = "id";
    public static final String TABLE_COL2 = "name";
    private static final String TABLE_COL3 = "gender";
    private static final String TABLE_COL4 = "age";
    private static final String TABLE_COL5 = "weight";
    private static final String TABLE_COL6 = "height";
    private static final String TABLE_COL7 = "arm";
    private static final String TABLE_COL8 = "shoulder";
    private static final String TABLE_COL9 = "chest";
    private static final String TABLE_COL10 = "waist";
    private static final String TABLE_COL11 = "hips";
    private static final String TABLE_COL12 = "legs";
    private static final String TABLE_COL13 = "calf";
    private static final String TABLE_COL14 = "date";

    public DisplayDB(Context context) {
        super(context, TABLE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable1 = "CREATE TABLE " + TABLE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_COL2 + " TEXT," +
                TABLE_COL3 + " BOOLEAN," +
                TABLE_COL4 + " INTEGER," +
                TABLE_COL5 + " REAL," +
                TABLE_COL6 + " INTEGER," +
                TABLE_COL7 + " REAL," +
                TABLE_COL8 + " REAL," +
                TABLE_COL9 + " REAL," +
                TABLE_COL10 + " REAL," +
                TABLE_COL11 + " REAL," +
                TABLE_COL12 + " REAL," +
                TABLE_COL13 + " REAL," +
                TABLE_COL14 + " DATE)";
        db.execSQL(createTable1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }

    public void add(String name, boolean gender,int age,float weight,int height,float arm,
                               float shoulder,float chest,float waist, float hips,float legs,float calf,String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_COL2, name);
        contentValues.put(TABLE_COL3, gender);
        contentValues.put(TABLE_COL4, age);
        contentValues.put(TABLE_COL5, weight);
        contentValues.put(TABLE_COL6, height);
        contentValues.put(TABLE_COL7, arm);
        contentValues.put(TABLE_COL8, shoulder);
        contentValues.put(TABLE_COL9, chest);
        contentValues.put(TABLE_COL10, waist);
        contentValues.put(TABLE_COL11, hips);
        contentValues.put(TABLE_COL12, legs);
        contentValues.put(TABLE_COL13, calf);
        contentValues.put(TABLE_COL14, date);
        db.insert(TABLE, null, contentValues);
    }

    public Cursor get() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    public Cursor getsql(String sql) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery(sql, null);
        return data;
    }

    public void clear() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE);
        db.close();
    }











    public boolean CheckData(String hareketAdi) {
        Cursor cursor = getData("SELECT hareket FROM hareketler WHERE hareket ='" + hareketAdi + "'");
        if (cursor.moveToFirst()) {
            return false;
        } else {
            return true;
        }
    }

//
//    public void addDetay(String detayAdi) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(TABLE3_COL2, detayAdi);
//        db.insert(TABLE3, null, contentValues);
//    }


    //
//    public int getClearenceLevel() {
//        SQLiteDatabase db = this.getWritableDatabase();
//        String query = "SELECT * FROM " + TABLENAME;
//        Cursor data = db.rawQuery(query, null);
//        data.moveToFirst();
//        return data.getInt(5);
//    }
//
    public Cursor getData(String sql) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery(sql, null);
        return data;
    }

    //
    public void executeSQL(String sql) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
        db.close();
    }

}
