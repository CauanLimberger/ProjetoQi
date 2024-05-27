package com.cauanlimberger.projetol.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.lifecycle.viewmodel.viewModelFactory

class ProdutoDAO(context: Context?) :
    SQLiteOpenHelper(context, db_name,null,version ){

    companion object {

        private val db_name = "produto.db"
        private val version = 1
        private val table_name = "produtos"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS $table_name (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, descricao TEXT, preco TEXT )")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (newVersion > oldVersion){
            db.execSQL("DROP TABLE IF EXISTS produtos")
            onCreate(db)

        }
    }
}
