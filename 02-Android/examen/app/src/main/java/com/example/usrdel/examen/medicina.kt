package com.example.usrdel.examen

import android.os.Parcel
import android.os.Parcelable

class  medicina ( var codigo: String,
                 var nombremed: String,
                 var precio: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(codigo)
        parcel.writeString(nombremed)
        parcel.writeString(precio)
    }

    override fun describeContents(): Int {
        return 0
    }
    override fun toString(): String {
        return "${codigo} ${nombremed} ${precio}"
    }

    companion object CREATOR : Parcelable.Creator<medicina> {
        override fun createFromParcel(parcel: Parcel): medicina {
            return medicina(parcel)
        }

        override fun newArray(size: Int): Array<medicina?> {
            return arrayOfNulls(size)
        }
    }




}

