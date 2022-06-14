package com.nisaardiyanti.catatanku //  nama packages

import android.content.Intent //mengambil data data dari android.content.intent
import androidx.appcompat.app.AppCompatActivity//mengambil data data dari aandroidx.appcompat.app.AppCompatActivity
import android.os.Bundle//mengambil data data dari android.content.intent
import android.provider.AlarmClock//mengambil data data dari android.provider.AlarmCloc
import android.view.View//mengambil data data dari android.view.View
import android.widget.TextView//mengambil data data dari android.widget.TextView
import android.widget.Toast//mengambil data data dari android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //onCreate adalah "Diganti" karena Aktivitas memiliki implementasi
        //yang sudah ada yang diganti oleh MainActivity3 kelas  dengan implementasinya sendiri.
        super.onCreate(savedInstanceState) //super digunakan untuk mereferensikan fungsi di class induk
        setContentView(R.layout.activity_main3) //SetContentView digunakan untuk mengisi jendela dengan UI yang disediakan
        // dari file tata letak setContentView(R. layout. activity_main3).

        val message = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE) //ekstrak string untuk mendapatkan Intent yang memulai aktivitas ini

        // Mengambil TextView layout dan atur string sebagai teksnya
        val textKegiatan = findViewById<TextView>(R.id.kegiatan).apply {
            text = message
        //findViewById adalah metode yang menemukan View dengan ID yang diberikan.
        }
        // Capture the layout's TextView and set the string as its text
        val textDeskripsi= findViewById<TextView>(R.id.deskripsi).apply {
            text = message
        }
        //mengembalikan nilai textDeskripsi dengan findViewById menggunakan metode yang menemukan View dengan ID yang diberikan yaitu R.id.deskripsi

        // Capture the layout's TextView and set the string as its text
        val textWaktu = findViewById<TextView>(R.id.waktu).apply {
            text = message
        }
        //mengembalikan nilai textWaktu dengan findViewById menggunakan metode yang menemukan View dengan ID yang diberikan yaitu R.id.deskripsi
        val textTempat = findViewById<TextView>(R.id.tempat).apply {
            text = message
        }
    }
    //mengembalikan nilai textTempat dengan findViewById menggunakan metode yang menemukan View dengan ID yang diberikan yaitu R.id.tempat
    fun ok(view: View) { // funtion ok menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity::class.java) //intent digunakan sebagai jembatan yang menghubungkan
        // interaksi antara Activity
        //pada intent diatas akan menghubungkan aktivitas MainActivity3 ke MainActivity
        startActivity(intent) //metode startActivity(intent) digunakan Untuk memulai aktivitas
    }
    fun hapus(view: View) {// funtion hapus menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity::class.java) ////intent digunakan sebagai jembatan yang menghubungkan
        // interaksi antara Activity
        //pada intent diatas akan menghubungkan aktivitas MainActivity3 ke MainActivity
        startActivity(intent) //metode startActivity(intent) digunakan Untuk memulai aktivitas
        Toast.makeText(applicationContext, "berhasil dihapus", Toast.LENGTH_LONG).show() //makeText() adalah method static yang ada
        // di dalam kelas Toast untuk membuat sebuah objek Toast baru berisi parameter yang akan menampilkan teks berhasil dihapus
    }
}