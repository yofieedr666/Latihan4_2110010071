package penilaian;

public class Main {
  public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Yofie Elyandra Dwirizky");
        mahasiswa.setNpm("2110010071");
        
        // Membuat objek NilaiAkhir
        NilaiAkhir nilaiAkhir = new NilaiAkhir();
        nilaiAkhir.setUts(90);
        nilaiAkhir.setUas(96);
        nilaiAkhir.setTugas(90);
        
        // Menampilkan informasi mahasiswa dan nilai akhirnya
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nilai UTS: " + nilaiAkhir.getUts());
        System.out.println("Nilai UAS: " + nilaiAkhir.getUas());
        System.out.println("Nilai Tugas: " + nilaiAkhir.getTugas());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }
}