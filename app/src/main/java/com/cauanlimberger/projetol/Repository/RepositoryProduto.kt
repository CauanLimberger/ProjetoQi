package com.cauanlimberger.projetol.Repository

import android.content.ContentValues
import android.content.Context
import android.content.LocusId
import com.cauanlimberger.projetol.model.Produto

import com.cauanlimberger.projetol.model.ProdutoDAO

class RepositoryProduto (produto: Produto) {
 private val db = ProdutoDAO(context).writableDatabase

 companion object{
  private val TABLE = "Produtos"
 }
 fun insert(produto: Produto): Long{

  val contentValues = ContentValues().apply {

   put("nome", produto.nome)
   put("descricao", produto.descricao)
   put("preco", produto.preco)

  }
  return db.insert(TABLE,"", contentValues)
 }

 fun buscar(id:Int): Produto
 {
  var produto: Produto? = null
  var cursor = db.query(TABLE, arrayOf("id", "nome", "descricao", "preco"), "id=?", arrayOf(id.toString()), null, null, null)

  val id = cursor.getInt(0)
  val nome = cursor.getString(1)
  val descricao = cursor.getString(2)
  val preco = cursor.getString(3)
  produto = Produto(id, nome, descricao, preco)

  cursor.close()
  return usuario

 }

 fun removerProduto (id: Int): Int{

  return db.delete(TABLE, "id = ?", arrayOf(id.toString()))
 }

}










