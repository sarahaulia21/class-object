public class PerpustakaanKampusX {
    public static void main(String[] args) {

        Buku[] teknologi = {

            new Buku("Desain Basis Data", new String[]{"Mark"}),
            new Buku("Pemrograman Lanjut", new String[]{"Steve"}),
            new Buku("Dasar Desain UI", new String[] {"Alan"}),
            new Buku("Sistem Operasi", new String[] {"Elon"}),
            new Buku("Pemrogrman Dasar", new String[] {"Bill"})
        };

        Buku[] filsafat = {

            new Buku("The Republic", new String[] {"Aristoteles"}),
            new Buku("Meditations", new String[] {"Karl"}),
            new Buku("A theory of Justice", new String[] {"Friedrich"}),
            new Buku("The Myth of Sisyphus", new String[] {"Immanuel"}),
            new Buku("The Problems of Philosophy", new String[] {"John"})
        };

        Buku[] sejarah = { 

            new Buku("Sejarah Indonesia", new String[] {"Anhar"}),
            new Buku("Sejarah Dunia", new String[] {"Ibnu Batutah"}),
            new Buku("Sejarah Jepang", new String[] {"Hirohito"}),
            new Buku("Sejarah Korea", new String[] {"Bae In Hyuk"}),
            new Buku("Sejarah Arab", new String[] {"Saladin"})
        };

        Buku[] agama = { 
            
            new Buku("Akidah Akhlak", new String[] {"Ahmad"}),
            new Buku("Al-Qur'an Hadist", new String[] {"Mahmud"}),
            new Buku("Fikih", new String[] {"Ibrahim"}),
            new Buku("Panduan Sholat Lengkap", new String[] {"Umar"}),
            new Buku("Ta'lim Muta'allim", new String[] {"Burhan"})
        };

        Buku[] psikologi = { 

            new Buku("Man's Search for Meaning", new String[] {"Victor"}),
            new Buku("Thinking, Fast and Slow", new String[] {"Paul"}),
            new Buku("Drive: The Surprising Truth About What Motivates Us", new String[] {"Dean"}),
            new Buku("Emotional Intelligence", new String[] {"Daniel"}),
            new Buku("The Power of Habit", new String[] {"Marcus"})
        };

        Buku[] politik = {

            new Buku("The Prince", new String[] {"Peter"}),
            new Buku("The Communist Manifesto", new String[] {"Nicholas"}),
            new Buku("Leviathan", new String[] {"Parker"}),
            new Buku("On Liberty", new String[] {"Thomas"}),
            new Buku("Two Treatises of Goverment", new String[] {"Matthew"})
        };

        Buku[] fiksi = {

            new Buku("Hujan", new String[] {"Esoke"}),
            new Buku("Si Anak", new String[] {"Ali"}),
            new Buku("Dialah Kakakku", new String[] {"Liam"}),
            new Buku("Matahari", new String[] {"Raib"}),
            new Buku("Rindu", new String[] {"Andipatti"})
        };

        Kategori k1 = new Kategori("Teknologi", teknologi);
        Kategori k2 = new Kategori("Filsafat", filsafat);
        Kategori k3 = new Kategori("Sejarah", sejarah);
        Kategori k4 = new Kategori("Agama", agama);
        Kategori k5 = new Kategori("Psikologi", psikologi);
        Kategori k6 = new Kategori("Politik", politik);
        Kategori k7 = new Kategori("Fiksi", fiksi);


        Kategori[] semuaKategori= {k1, k2, k3, k4, k5, k6, k7};
            
        for (Kategori k : semuaKategori) {
            k.tampilkanStokBukuTersedia();
            System.out.println("===============================================================");
        }

    }
}

