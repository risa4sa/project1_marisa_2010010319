package com.marisa.uangkas.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SqliteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "uangkas";
    private static final Integer DATABASE_VESION = 1;

    public SqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VESION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE transaksi (" +
                "transaksi_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "status TEXT," +
                "jumlah DOUBLE," +
                "keterangan TEXT," +
                "tanggal DATE DEFAULT CURRENT_DATE);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTs transaksi");
    }
}
