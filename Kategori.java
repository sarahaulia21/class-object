public class Kategori {
    private String jenis;
    private Buku[] stokBuku;
    
    public Kategori(String jenis, Buku[] stokBuku) {
        this.jenis = jenis;
        this.stokBuku = stokBuku;
  } 

    public void tampilkanStokBukuTersedia() {
        System.out.print("Stok Buku Kategori " + jenis);
        System.out.println("                           ");
        for (Buku b : stokBuku) {
            b.tampilkanInformasiBuku();
        }
    }
}