package com.Soding.CRUDmahasiswa;

/**
 * Created by Philipus on 08/19/2017.
 */



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "daftarmahasaiswa.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table CRUDmahasiswa(id INTEGER PRIMARY KEY AUTOINCREMENT, nama text null, tgl text null, jk text null, jurusan text null, " +
                "created_at DATETIME DEFAULT CURRENT_TIMESTAMP, update_at DATETIME DEFAULT CURRENT_TIMESTAMP);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO CRUDmahasiswa (id, nama, tgl, jk, jurusan) VALUES ('1', 'Soding', '1994-13-11', 'Laki-laki','teknik sipil');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}