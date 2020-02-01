package com.dfl.appgamescore

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class DocumentEntity(
    var id: Int? = null,
    var name: String? = null
) : Parcelable