package com.example.praktikum7.repositori

import com.example.praktikum7.room.Siswa
import com.example.praktikum7.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun InsertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun InsertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}