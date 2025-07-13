# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mood harian kita menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi
Aplikasi ini merupakan aplikasi yang dirancang untuk membantu pengguna mencatat suasana hati mereka setiap hari.

Aplikasi ini menerima input berupa mood harian pengguna, dan memberikan output berupa informasi detail dari mood pengguna seperti, tanggal berapa mood terburuk pengguna, dan statik mood pengguna.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `User`, `MoodEntryl`, dan `MoodTracker` adalah contoh dari class.

```bash
public class User {
    ...
}

public class MoodEntry {
    ...
}

public class MoodTracker {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `User user = new User(nama);` dan `MoodTracker tracker = new MoodTracker();` adalah contoh pembuatan object.

```bash
User user = new User(Nama);

MoodTracker tracker = new MoodTracker();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `tanggal`, `deskripsi`, dan `Tingkat Mood` adalah contoh atribut.

```bash
private String nama;

private LocalDate tanggal;

private String deskripsi;

private int tingkatMood;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `User` dan `MoodEntry`.

```bash
public User(String nama){
    this.nama = nama;
}

public MoodEntry(LocalDate tanggal, String deskripsi, int tingkatMood) {
    this.tanggal = tanggal;
    this.deskripsi = deskripsi;
    this.tingkatMood = tingkatMood;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setDeskripsi`, dan `setTingkatMood` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
}

public void setTingkatMood(int tingkatMood) {
    this.tingkarMood = tingkatMood;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`,`getTanggal`,`getDeskripsi`,`getTingkatMood` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public LocalDate getTanggal() {
    return tanggal;
}

public String getDeskripsi(){
    return deskripsi;
}

public int getTingkatMood(){
    return tingkatMood;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini tidak memiliki konsep inheritance.



9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `toString()` merupakan override dari method `MoodEntry`

```bash
@Override
public String toString() {
    return "Tanggal: "+ tanngal +
            "\nDeskripsi:" + deskripsi +
            "\nTingkat Mood:" + tingkatMood;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` atau `switch` dalam method `Motivator.java`
```bash
 public static String dapatkanMotivasi(int mood) {
        if (mood <= 2) {
            return "Take a deep breath. You handled hard things before, you will do it again.";
        } else if (mood == 3) {
            return "You're doing okay. One step at a time.";
        } else {
            return "Keep going! Today is a good day.";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
boolean jalan = true;
 while (jalan) {
    System.out.println("\n==== Mental Health Tracker ====");
    System.out.println("1. Tambah catatan mood");
    System.out.println("2. Lihat semua catatan");
    System.out.println("3. Statistik mood");
    System.out.println("4. Keluar");
    System.out.print("Pilih: ");
    int pilih = sc.nextInt();
    sc.nextLine();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nama Anda: ");
String nama = sc.nextLine();

System.out.println("Pilihan tidak valid.");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MoodTracker` adalah contoh penggunaan array.

```bash
public class MoodTracker {
    private ArrayList<MoodEntry> entries = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
 System.out.print("Tanggal (yyyy-mm-dd): ");
 LocalDate tanggal = LocalDate.parse(sc.nextLine());

catch (Exception e) {
    System.out.println("Terjadi kesalahan input: " + e.getMessage());
    sc.nextLine();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Ilqy Rahmatullah
NPM: 2310010029
