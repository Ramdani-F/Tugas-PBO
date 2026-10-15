
public class WaktuCahaya {
        public void tampilkan() {
        double kecepatanCahaya = 300000;     
        double jarakBumiBulan = 384400;        
        double jarakBumiMatahari = 152100000;  

        double waktuBulan = jarakBumiBulan / kecepatanCahaya;
        double waktuMatahari = jarakBumiMatahari / kecepatanCahaya;

        System.out.println("Waktu cahaya bumi ke bulan    = " + waktuBulan + " detik");
        System.out.println("Waktu cahaya bumi ke matahari = " + waktuMatahari
                + " detik (" + (waktuMatahari / 60) + " menit)");
    }
}
