package com.example.praktikum8.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.praktikum8.viewmodel.EditViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.praktikum8.viewmodel.provider.PenyediaViewModel
import androidx.compose.material3.Scaffold
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.layout.padding
import com.example.praktikum8.uicontroller.route.DestinasiEdit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditSiswaScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel(factory = PenyediaViewModel.Factory)
){
    Scaffold(
    ){

    }

}