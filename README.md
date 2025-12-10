Project Individu Pemrograman Berorientasi Objek

ProjectBus merupakan tugas individu pada mata kuliah Pemrograman Berorientasi Objek (PBO). Project ini bertujuan untuk mengimplementasikan prinsip-prinsip dasar OOP melalui simulasi sistem manajemen penumpang pada sebuah bus. Program dikembangkan menggunakan bahasa Java dan diorganisasi menggunakan lingkungan BlueJ.

 1. Deskripsi Umum
Program ini mensimulasikan proses naik dan turun penumpang pada sebuah bus dengan tiga jenis area penempatan, yaitu kursi prioritas, kursi biasa, dan tempat berdiri. Setiap penumpang memiliki atribut tertentu yang akan menentukan apakah ia berhak untuk menempati kursi prioritas. Selain mengatur posisi penumpang, program juga melakukan pencatatan pendapatan dari biaya perjalanan yang dibayarkan oleh penumpang.

 2. Fitur Program
1. Pengelolaan data penumpang, meliputi:
   - ID penumpang  
   - Umur  
   - Status hamil  
   - Informasi saldo  
2. Pengaturan posisi penumpang berdasarkan prioritas:
   - Kursi prioritas  
   - Kursi biasa  
   - Tempat berdiri  
3. Mekanisme naik dan turun penumpang.
4. Pemotongan saldo secara otomatis ketika penumpang naik ke dalam bus.
5. Pencatatan pendapatan total bus.
6. Menu interaktif untuk menjalankan fungsi-fungsi utama program.

 3. Struktur File
  - Penumpang.java : Class yang menangani data dan logika terkait penumpang
  - Bus.java : Class yang menangani pengaturan tempat, prioritas, dan transaksi
  - TestBus.java : Class utama yang berisi menu dan logika interaksi pengguna
  - package.bluej : File konfigurasi project BlueJ
  - README.md : Dokumentasi project
