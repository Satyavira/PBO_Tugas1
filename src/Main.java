public class Main {
    public static void main(String[] args) {
        Anjing Rex = new Anjing("Rex", 5, "Golden Retriever", 10, "Coklat");
        Anjing Snowy = new Anjing("Snowy", 3, "Siberian Husky", 5, "Putih");
        Anjing Bella = new Anjing("Bella", 2, "Poodle", 7, "Hitam");

        Rex.menyapa();
        System.out.println();
        System.out.println("Umur manusia Snowy: " + Snowy.hitungUmurManusia());
        System.out.println();
        Bella.infoLengkap();
        System.out.println();
        Rex.gonggong();
    }
}