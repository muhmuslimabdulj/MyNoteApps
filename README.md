# My Note Apps

My Note Apps adalah aplikasi untuk membuat, mengedit, dan menghapus catatan yang sederhana.

## Fitur

- **Buat Catatan**: Pengguna dapat membuat catatan baru dengan judul dan konten.
- **Edit Catatan**: Pengguna dapat mengedit catatan yang sudah ada.
- **Hapus Catatan**: Pengguna dapat menghapus catatan yang tidak diperlukan lagi.
- **Penyimpanan Lokal**: Catatan disimpan secara lokal di perangkat pengguna.

## Instalasi

1. Clone repositori ini:
    ```bash
    git clone https://github.com/muhmuslimabdulj/MyNoteApps.git
    ```
2. Buka proyek di Android Studio.
3. Jalankan aplikasi di emulator atau perangkat fisik.

## Penggunaan

1. Buka aplikasi My Note Apps.
2. Klik tombol tambah untuk membuat catatan baru.
3. Isi judul dan deskripsi catatan, lalu simpan.
4. Klik pada catatan untuk mengedit atau menghapusnya dengan meng-klik tombol "X" di Action Bar.

## Dependency dan Plugins

Proyek ini menggunakan beberapa dependency dan plugins yang didefinisikan dalam file `build.gradle.kts` di level proyek dan modul.

### Dependency

Dependency utama yang digunakan dalam proyek ini meliputi:

- **AndroidX Core**: `implementation("androidx.core:core-ktx:1.15.0")`
- **AppCompat**: `implementation("androidx.appcompat:appcompat:1.7.0")`
- **Material Design**: `implementation("com.google.android.material:material:1.12.0")`
- **Activity KTX**: `implementation("androidx.activity:activity-ktx:1.10.1")`
- **ConstraintLayout**: `implementation("androidx.constraintlayout:constraintlayout:2.2.1")`
- **Lifecycle ViewModel KTX**: `implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")`
- **LiveData KTX**: `implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")`
- **Room Database**: 
  - `implementation("androidx.room:room-runtime:2.5.2")`
  - `ksp("androidx.room:room-compiler:2.5.2")`
- **JUnit**: `testImplementation("junit:junit:4.13.2")`
- **AndroidX Test**: 
  - `androidTestImplementation("androidx.test.ext:junit:1.2.1")`
  - `androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")`

### Plugins

Plugins yang digunakan dalam proyek ini meliputi:

- **Android Application Plugin**: `id("com.android.application") version "8.8.2"`
- **Kotlin Android Plugin**: `id("org.jetbrains.kotlin.android") version "1.9.24"`
- **KSP (Kotlin Symbol Processing)**: `id("com.google.devtools.ksp") version "1.9.0-1.0.11"`
- **Kotlin Parcelize**: `id("kotlin-parcelize")`

### Konfigurasi Build

Konfigurasi build didefinisikan dalam file `build.gradle.kts` di modul `app`:

- **Namespace**: `namespace = "com.mmuslimabdulj.mynoteapps"`
- **Compile SDK**: `compileSdk = 35`
- **Default Config**:
  - `applicationId = "com.mmuslimabdulj.mynoteapps"`
  - `minSdk = 24`
  - `targetSdk = 35`
  - `versionCode = 1`
  - `versionName = "1.0"`
- **Build Types**: Konfigurasi untuk build type `release`.
- **Build Features**: Mengaktifkan `viewBinding`.
- **Compile Options**: Mengatur kompatibilitas Java.
- **Kotlin Options**: Mengatur target JVM untuk Kotlin.
