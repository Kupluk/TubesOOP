# TubesOOP
Final Fun-Tasy Tubes OOP 1

LIST SPESIFIKASI TUBES OOP

Note : List spek MINIMAL program, masih sangat bisa untuk dikembangkan lebih jauh lagi

===SPEK DARI DOKUMEN===
Spek yang sudah jelas tertulis di dokumen bagaimana keterangan dan attributnya

1. PEMAIN
Kontrol utama player, attributnya :
	a. Money 		: Jumlah uang, untuk beli item
	b. Item 		: Daftar item, untuk digunakan dalam battle
	c. Posisi 		: Posisi pemain di arena
	d. Characters 	: Daftar karakter / tokoh

2. KARAKTER
Harus ada 3 biji, masing-masing punya attribut :
	a. Nama 	: Nama karakter
	b. Status 	:
		- STR : Strength, menentukan damage karakter (Damage = 2*STR)
		- VIT : Vitality, menentukan kapasitas HP (10*VIT)
		- INT : Intelligence, menentukan kapasitas MP (10*INT)
	c. Level 	: Menentukan peningkatan status karakter
	d. HP		: Health Point, "darahnya"
	e. MP		: Magic Point, tenaga untuk melakukan magic
Tambahan :
	-Ketiga karakter memiliki magic tertentu, tergantung job-nya.
	-Nilai status tiap karakter berbeda-beda.
	-Pendetilan dari kelas karakter digunakan prinsip inheritance, 
	Contoh job Swordsman jadi -> public class Swordsman extends Karakter.

3. MONSTER
	a. Nama		: Nama monster
	b. ATK		: Damage monster kepada karakter
	c. HP		: Health Point, "darahnya"
	d. Posisi	: Posisi monster di arena
	e. Money	: Nilai uang yang diberikan ketika monster dikalahkan
	f. IncLevel	: Peningkatan level yang diperoleh ketika monster dikalahkan
Tambahan :
	-Nilai minimal jumlah monster tidak disebutkan, tapi kalau bisa buat banyak aja.
	-Pendetilan dari kelas monster digunakan prinsip inheritance, sama contohnya dengan karakter.

4. ITEM
	a. Harga	: Biaya yang diperlukan untuk mendapatkan item yang dimaksud
	b. Kegunaan	: Bervariasi, tergantung item.
Tambahan :
	-Minimal ada 3 item.
	-Buatlah item yang memiliki kegunaan yang unik.

5. ARENA
Keduanya wajib ada
	a. Tycoon Castle (World)
		-Luas arena 10x10
		-Toko 	 : 5 petak, pemain dapat melakukan pembelian item
		-Item 	 : 10 petak, pemain dapat mengambil item yang ada di dalam petak
		-Monster : 20 petak, tempat monster berada
	b. Battle Arena (Tempat bertarung)
		-Luas arena battle bebas.

6. PROGRAM UTAMA
Dibuka pertama kali, menampilkan :
	a. New Game
	Ketika pilih ini, diberikan tampilan untuk memberi nama seluruh karakter. Nama di spek menjadi defaultnya.

	b. Load Game
	Menampilkan daftar simpanan permainan yang telah tersimpan pada komputer.

	c. Exit

7. IN-GAME
Setelah memulai permainan, pengguna akan ditagih perintah kepada karakter berupa :
	a. Move	: Memindahkan karakter
	b. Shop	: Menampilkan daftar barang yang dapat dibeli beserta harganya dan jumlah barang yang mau dibeli
	c. Save	: Menyimpan data permainan, dapat overwrite ataupun slot baru yang masih tersedia

8. INTERFACE
Interaksi antara pengguna dan aplikasi dapat berupa :
	a. Angka	: Berupa pilihan aksi
	b. String	: Berupa nama aksi
	c. Tombol	: Berupa tombol pada keyboard yang telah di-assign untuk melakukan aksi tertentu
Tambahan :
	-Bebas, boleh pilih salah satu
	-Setiap aksi yang dipilih akan menampilkan respon ke pengguna
	-TIDAK perlu GUI



==SOP PEMBUATAN KODE===
1. Setiap attribut dalam kelas bersifat private atau protected, tergantung kebutuhan
2. Buatlah setter dan getternya, diawali dengan set dan get di awal method (set dan get kecil, diikuti nama attirbut huruf besar di awal, contoh getMoney() atau getSTR())
3. Setiap method harus dibuat komentar yang jelas, kecuali untuk setter dan getter seperlunya saja
4. Nama method diawali dengan huruf besar, kecuali setter dan getter atau yang lain seperlunya saja
	Contoh : Move(), Attack(), getMoney()
5. Nama objek/attribut diawali dengan huruf kecil


==TIMELINE==
Tanggal 11 - Basic Codes
Diupload ke GitHub

Punya saya
