public class Anjing {
    private String nama;
    private int usia;
    private String jenis;
    private int berat;
    private String warnaBulu;
    public Anjing(String nama, int usia, String jenis, int berat, String warnaBulu) {
        this.nama = nama;
        this.usia = usia;
        this.jenis = jenis;
        this.berat = berat;
        this.warnaBulu = warnaBulu;
    }
    public void menyapa() {
        System.out.println("Halo, saya adalah anjing bernama " + nama);
    }
    public int hitungUmurManusia() {
        return usia * 7;
    }
    public void infoLengkap() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Jenis: " + jenis);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Warna Bulu: " + warnaBulu);
    }
    public void gonggong() {
        System.out.println(nama + " sedang menggonggong!");
    }
}