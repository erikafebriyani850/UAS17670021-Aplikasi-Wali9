package com.erika.uas17670021;

import java.util.ArrayList;

public class wali9data {
    private static String[] wali9Name = {
            "Sunan Kalijaga",
            "Sunan Gresik",
            "Sunan Bonang",
            "Sunan Muria",
            "Sunan Ampel",
            "Sunan Kudus",
            "Sunan Gunungjati",
            "Sunan Drajat",
            "Sunan Giri",
    };
    private static String[] wali9Details = {
            "Sunan Kalijaga diperkirakan lahir pada tahun 1450 dengan nama Raden Said. Dia adalah putra adipati Tuban yang bernama Tumenggung Wilatikta atau Raden Sahur. Nama lain Sunan Kalijaga antara lain Lokajaya, Syekh Malaya, Pangeran Tuban, dan Raden Abdurrahman. Berdasarkan satu versi masyarakat Cirebon, nama Kalijaga berasal dari Desa Kalijaga di Cirebon. Pada saat Sunan Kalijaga berdiam di sana, dia sering berendam di sungai (kali), atau jaga kali.",
            "Sunan Gresik atau Maulana Malik Ibrahim (w. 1419 M/882 H) adalah nama salah seorang Walisongo, yang dianggap yang pertama kali menyebarkan agama Islam di tanah Jawa. Ia dimakamkan di desa Gapurosukolilo, Gresik.",
            "Sunan Bonang  dilahirkan pada tahun 1465, dengan nama Raden Maulana Makdum Ibrahim. Dia adalah putra Sunan Ampel dan Nyai Ageng Manila. Bonang adalah sebuah desa di kabupaten Rembang. Nama Sunan Bonang diduga adalah Bong Ang sesuai nama marga Bong seperti nama ayahnya Bong Swi Hoo alias Sunan Ampel.",
            "Sunan Muria dilahirkan dengan nama Raden Umar Said atau Raden Said. Menurut beberapa riwayat, dia adalah putra dari Sunan Kalijaga yang menikah dengan Dewi Saroh, putri Sunan Ngudung. Nama Sunan Muria sendiri diperkirakan berasal dari nama gunung (Gunung Muria), yang terletak di sebelah utara kota Kudus, Jawa Tengah, tempat dia dimakamkan.",
            "Suan Ampel adalah salah seorang wali di antara Walisongo yang menyebarkan ajaran Islam di Pulau Jawa. Ia lahir 1401 di Campa. Menurut Encyclopedia Van Nederlandesh Indie diketahui bahwa Campa adalah satu negeri kecil yang terletak di Vietnam, sementara Raffles menyatakan bahwa Champa terletak di Aceh yang kini bernama Jeumpa.",
            "Sunan Kudus adalah salah satu penyebar agama Islam di Indonesia yang tergabung dalam walisongo, yang lahir sekitar 1500an Masehi. Nama lengkapnya adalah nama Sayyid Ja'far Shadiq Azmatkhan. Ia adalah putra dari pasangan Sunan Ngudung.",
            "Sunan Gunungjati adalah salah seorang dari Walisongo, ia dilahirkan Tahun 1448 Masehi dari pasangan Syarif Abdullah Umdatuddin bin Ali Nurul Alam [2] dan Nyai Rara Santang, Putri Sri Baduga Maharaja Prabu Siliwangi dari Kerajaan Padjajaran (yang setelah masuk Islam berganti nama menjadi Syarifah Mudaim)",
            "Sunan Drajat diperkirakan lahir pada tahun 1470 Masehi. Nama kecilnya adalah Raden Qasim, kemudian mendapat gelar Raden Syarifudin. Dia adalah putra dari Sunan Ampel, dan bersaudara dengan Sunan Bonang.",
            "Sunan Giri adalah nama salah seorang Walisongo dan pendiri kerajaan Giri Kedaton, yang berkedudukan di daerah Gresik, Jawa Timur. Sunan Giri membangun Giri Kedaton sebagai pusat penyebaran agama Islam di Jawa, yang pengaruhnya bahkan sampai ke Madura, Lombok, Kalimantan, Sulawesi, dan Maluku. Sunan Giri memiliki beberapa nama panggilan, yaitu Raden Paku, Prabu Satmata, Sultan Abdul Faqih, Raden 'Ainul Yaqin dan Joko Samudro. Ia lahir di Blambangan tahun 1442, dan dimakamkan di desa Giri, Kebomas, Gresik.",
    };
    private static int[] wali9Images = {
            R.drawable.sunankalijaga,
            R.drawable.sunangresik,
            R.drawable.sunanbonang,
            R.drawable.sunanmuria,
            R.drawable.sunanampel,
            R.drawable.sunankudus,
            R.drawable.sunangunungjati,
            R.drawable.sunandrajat,
            R.drawable.sunangiri,
    };
    static ArrayList<wali9> getListData() {
        ArrayList<wali9> list = new ArrayList<>();
        for (int position = 0; position < wali9Name.length; position++) {
            wali9 wali9 = new wali9();
            wali9.setName(wali9Name[position]);
            wali9.setDetail(wali9Details[position]);
            wali9.setPhoto(wali9Images[position]);
            list.add(wali9);
        }
        return list;
    }
}



