package com.example.bhbusmetrop.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.bhbusmetrop.model.BusModel

@Dao
interface BusDAO {

    @Insert
    fun InsertBus(bus: BusModel) : Long

    @Update
    fun updateBus(bus: BusModel) : Int

    @Delete
    fun deleteBus(bus: BusModel) : Int

    @Query("SELECT * FROM Onibus WHERE id_onibus = :id")
    fun get(id: Int): BusModel

    @Query("SELECT * FROM Onibus")
    fun getAll(): List<BusModel>
}
