package com.example.myapplication.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.myapplication.Database.CreateDatabase;

public class BanAnDAO {
    SQLiteDatabase database;
    public BanAnDAO(Context context){
        CreateDatabase createDatabase = new CreateDatabase(context);
        database = createDatabase.open();
    }
}
