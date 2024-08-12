 package com.example.bhbusmetrop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bhbusmetrop.model.BusModel
import com.example.bhbusmetrop.repository.AppDatabasse

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         val appDatabasse = AppDatabasse.getDataBase(this).BusDAO()

         val retornoInsertMultiplo = appDatabasse.InsertBus(BusModel().apply {
             this.nome = "Grajaú"
             this.numero = 2101
             this.cor = "azul"
             this.tipo = "onibus"
             this.peso = "16t"
         })

         val retornoSelectMultiplo = appDatabasse.getAll()

         for (item in retornoSelectMultiplo) {
             Log.d(
                 "Retorno",
                 "id_onibus: ${item.id_onibus}, nome:${item.nome}, numero: ${item.numero}, cor: ${item.cor}, tipo: ${item.tipo}, peso: ${item.peso}"
             )
         }
     }
 }