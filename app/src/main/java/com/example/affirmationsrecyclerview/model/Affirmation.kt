package com.example.affirmationsrecyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Add anotaciones para poner los recursos correctos si se ingresan mal recibiremos una advertencia
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)