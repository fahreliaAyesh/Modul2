class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    public String toString() {
        return "Nama: " + this.nama + ", NIM: " + this.nim + ", Jurusan: " + this.jurusan;
    }
}