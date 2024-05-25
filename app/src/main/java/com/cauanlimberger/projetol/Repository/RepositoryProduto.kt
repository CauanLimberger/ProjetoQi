package com.cauanlimberger.projetol.Repository

import android.content.ContentValues
import android.content.Context
import android.content.LocusId
import com.cauanlimberger.projetol.model.Produto

import com.cauanlimberger.projetol.model.ProdutoDAO

class RepositoryProduto (private val context: Context) {
private val db = ProdutoDAO(context).writableDatabase

companion object{
private val TABLE = "Produtos"
 }
 fun inserirRegistro(produto: Produto): Long{

  val contentValues = ContentValues().apply {


   put("nome", produto.nome)
   put("descricao", produto.descricao)
   put("preco", produto.preco)

  }
  return db.insert(TABLE,"null", contentValues)
 }

 fun buscarRegistros(id:Int): Produto? {
  var Produto: Produto? = null
  var cursor = db.query(TABLE, arrayOf("id", "nome", "descricao", "preco"), "id=?", arrayOf(id.toString()){

   val id= cursor.getInt(0)
   val nome = cursor.getString(1)
   val descricao = cursor.getString(2)
   val preco = cursor.getString(3)
   produto = Produto(id, nome, descricao, preco)


  }
  cursor.close()
   return usuario



  )




 }

 fun removerProduto (id: Int): Int{

  return db.delete(TABLE, "id = ?", arrayOf(id.toString()))
 }

 }










