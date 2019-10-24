package com.example.biodataact;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.TextView;

public class biodata implements Parcelable {
   private String nim;
   private String nama;
   private String kelas;
   private String tgl;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nim);
        dest.writeString(this.nama);
        dest.writeString(this.kelas);
        dest.writeString(this.tgl);
    }

    public biodata() {
    }

    protected biodata(Parcel in) {
        this.nim = in.readString();
        this.nama = in.readString();
        this.kelas = in.readString();
        this.tgl = in.readString();
    }

    public static final Creator<biodata> CREATOR = new Creator<biodata>() {
        @Override
        public biodata createFromParcel(Parcel source) {
            return new biodata(source);
        }

        @Override
        public biodata[] newArray(int size) {
            return new biodata[size];
        }
    };
}
