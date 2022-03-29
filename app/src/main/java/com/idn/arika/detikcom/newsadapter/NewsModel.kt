package com.idn.arika.detikcom.newsadapter

import com.idn.arika.detikcom.R

data class news (var title: String, var desc: String, var photo: Int)

object NewsModel{
    val newslist = listOf<news>(
        news("Bersama Singapore Airlines Temukan Sisi Menarik di Bangkok",
        "detikNews | 1 Jam Yang Lalu",
            R.drawable.img_news1),
        news("Cashpop Penipuan dan Berbahaya? Begini Penjelasannya",
        "detikNews | 1 jam yang lalu ",
        R.drawable.img_news2),
        news("NewsCat, Aplikasi Baca Berita Dibayar Selain Berita Menarik",
            "detikNews | 2 Jam Yang Lalu",
            R.drawable.img_news3),

        news("7 Cara Bisnis Online Untuk Pelajar, Mahasiswa dan Umum",
            "detikNews | 3 Jam Yang Lalu",
            R.drawable.img_news4),

        news("MOBROG Penipuan atau Beneran Membayar Dollar Mahal?",
            "detikNews | 4 Jam Yang Lalu",
            R.drawable.img_news5),

        news("Wajib Baca: Pembangunan MRT di Jakarta dan 13 Tol Baru",
            "detikNews | 5 Jam Yang Lalu",
            R.drawable.img_news6),

        news("[POPULER PROPERTI] Masjid Terbesar di Eropa Ada di Rusia",
            "detikNews | 6 Jam Yang Lalu",
            R.drawable.img_news7),

        news("[POPULER PROPERTI] Cek Pilihan Rumah Subsidi di Kota Terdekat Anda",
            "detikNews | 7 Jam Yang Lalu",
            R.drawable.img_news8),

        news("Harga, Pasokan, dan Permintaan Properti Akan Meningkat Tahun 2022\n",
            "detikNews | Jum'at, 25 Februari 2022 09.30 WIB",
            R.drawable.img_news9)

    )



}