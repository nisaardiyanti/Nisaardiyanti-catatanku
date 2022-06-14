package com.nisaardiyanti.catatanku //nama packages
import android.content.Intent //mengambil data data dari android.content.intent
import androidx.appcompat.app.AppCompatActivity //mengambil data dari  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle //mengambil data data dari android.os.Bundle
import android.view.View //mengambil data data dari android.view.View

class MainActivity : AppCompatActivity() {  //kelas MainActivity
    override fun onCreate(savedInstanceState: Bundle?) { //override digunakan untuk mengganti fungsi
        super.onCreate(savedInstanceState)//super digunakan untuk mereferensikan fungsi di class induk
        setContentView(R.layout.activity_main) //SetContentView digunakan untuk mengisi jendela dengan UI
        // yang disediakan dari file tata letak setContentView(R. layout. activity_main).
    }
    fun catatan1(view: View) { //funtion catatan1 menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity3::class.java) //catatan 1 akan menuju intent MaintActivity3
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
    }
    fun catatan2(view: View) { //funtion catatan2 menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity3::class.java) //catatan 2 akan menuju intent MaintActivity3
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
    }
    fun catatan3(view: View) {//funtion catatan3 menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity3::class.java)//catatan 3 akan menuju intent MaintActivity3
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
    }
    fun tambah(view: View) {//funtion  catatan tambah menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity2::class.java) //tombol tambah jika diklik akan menuju intent MainActivity2
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
    }
}