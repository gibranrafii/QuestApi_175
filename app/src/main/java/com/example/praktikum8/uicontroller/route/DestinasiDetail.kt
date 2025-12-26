package com.example.praktikum8.uicontroller.route

import com.example.praktikum8.R

object DestinasiDetail {
    val route = "item_detail"
    val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}