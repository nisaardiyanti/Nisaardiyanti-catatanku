package com.nisaardiyanti.catatanku // nama packages

import android.content.Intent //import data pada android.content.Intent
import androidx.appcompat.app.AppCompatActivity // import data androidx.appcompat.app.AppCompatActivity
import android.os.Bundle // import data pada android.os.Bundle
import android.view.View//import data pada android.view.View
import android.widget.Toast//import data pada android.widget.Toast

class MainActivity2 : AppCompatActivity() { //kelas MainActivity2
    override fun onCreate(savedInstanceState: Bundle?) { //onCreate adalah "Diganti" karena Aktivitas memiliki implementasi
        // yang sudah ada yang diganti oleh MainActivity2 kelas  dengan implementasinya sendiri.
        super.onCreate(savedInstanceState) //super digunakan untuk mereferensikan fungsi di class induk
        setContentView(R.layout.activity_main2)//SetContentView digunakan untuk mengisi jendela dengan UI
    // yang disediakan dari file tata letak setContentView(R. layout. activity_main2).
    }
    fun simpan(view: View) { // funtion simpan menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity::class.java) //intent digunakan sebagai jembatan yang menghubungkan
        // interaksi antara Activity
        //pada intent diatas akan menghubungkan aktivitas MainActivity2 ke MainActivity
        startActivity(intent) //metode startActivity(intent) digunakan Untuk memulai aktivitas
        Toast.makeText(applicationContext, "berhasil disimpan", Toast.LENGTH_LONG).show() //makeText() adalah method static yang ada
    // di dalam kelas Toast untuk membuat sebuah objek Toast baru berisi parameter yang akan menampilkan teks berhasil disimpan
    }
}