package com.example.praktikum7.repositori

import com.example.praktikum7.room.Siswa
import com.example.praktikum7.room.SiswaDAO
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun InsertSiswa(siswa: Siswa)

    //Tambahan
    fun getSiswaStream(id: Int): Flow<Siswa?>

}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDAO
): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun InsertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    //tambahan
}