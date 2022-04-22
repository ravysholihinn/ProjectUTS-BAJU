package com.latihan.ravysholihin.projectuts_baju

import android.os.Parcel
import android.os.Parcelable

data class DataBaju(val imageSrc: Int, val imageTitle: String?, val imageDesc: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSrc)
        parcel.writeString(imageTitle)
        parcel.writeString(imageDesc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataBaju> {
        override fun createFromParcel(parcel: Parcel): DataBaju {
            return DataBaju(parcel)
        }

        override fun newArray(size: Int): Array<DataBaju?> {
            return arrayOfNulls(size)
        }
    }
}

