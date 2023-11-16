public class Identitas {
    public static void main(String[] args) {
        // Data diri
        String nama = "Muhamad Najili";
        int umur = 18;
        double tinggi = 165;  // dalam sentimeter
        double beratBadan = 55;  // dalam kilogram
        String pekerjaan = "Mahasiswa";
        String hobi = "futsal";
        boolean statusMenikah = true;

        // Menampilkan data diri
        System.out.println("Data Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggi + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Hobi: " + hobi);

        if (statusMenikah) {
            System.out.println("Status: Belum Menikah");
        } else {
            System.out.println("Status: Menikah");
        }
    }
}
