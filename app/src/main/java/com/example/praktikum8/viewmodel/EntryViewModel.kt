package com.example.praktikum8.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.praktikum8.modeldata.DetailSiswa
import com.example.praktikum8.modeldata.UIStateSiswa
import com.example.praktikum8.modeldata.toDataSiswa
import com.example.praktikum8.modeldata.toDetailSiswa
import com.example.praktikum8.repositori.RepositoryDataSiswa
import retrofit2.Response


class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa) :
    ViewModel() {

}