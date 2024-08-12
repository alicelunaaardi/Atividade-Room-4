package com.example.bhbusmetrop.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Onibus")
class BusModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_onibus")
    var id_onibus: Int = 0

    @ColumnInfo(name = "nome")
    var nome: String = ""

    @ColumnInfo(name = "numero")
    var numero: Int = 0

    @ColumnInfo(name = "cor")
    var cor: String = ""

    @ColumnInfo(name = "tipo")
    var tipo: String = ""

    @ColumnInfo(name = "peso")
    var peso: String = ""

}