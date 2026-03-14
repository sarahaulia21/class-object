public class Buku {
    private String[] penulis;
    private String judul;


    public Buku(String judul, String[] penulis) {
        this.judul = judul;
        this.penulis = penulis;
  }

    public void tampilkanInformasiBuku() {
        System.out.println("-Judul Buku : " + judul);
        System.out.print(" Penulis Buku : ");
        for (int i = 0; i < penulis.length; i++) {
            System.out.print(penulis[i]);
            if (i < penulis.length - 1) {
                System.out.print(", ");
           }
       }

       System.out.println("                            ");

    }
}
