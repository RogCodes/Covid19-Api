public class soal1 {
    public static void main(String[] args){
    
        //Kecepatan = k  meter/detik
        int k1 = 6;//pkl 10:25:21 sd 10:36:20 (11 menit)
        int k2 = 7;//pkl 10:36:21 sd 10:46:20 (10 menit)
        int k3 = 8;//pkl 10:46:21 sd 10:56:20 (10 menit)
        int k4 = 9;//pkl 10:56:21 sd 11:06:20 (10 menit)
        int k5 = 10;//pkl 11:06:21 sd 11:16:20 (10 menit)
        int k6 = 11;//pkl 11:16:21 sd 11:26:20 (10 menit)
        int k7 = 12;//pkl 11:26:21 sd 11:36:20 (10 menit)
        int k8 = 13;//pkl 11:36:21 sd 11:46:20 (10 menit)
        int k9 = 14;//pkl 11:46:21 sd 11:56:20 (10 menit)
        int k10 = 15;//pkl 11:56:21 sd 12:00:00 (3 menit 39 detik)
        
        //waktu = w tempuh dalam detik
        int w1 = 11*60;
        int w2 = 10*60;
        int w3 = (3*60)+39;
        
        //Total Jarak = t tempuh dalam meter
        int t =    (k1*w1) + (k2*w2) + (k3*w2) + (k4*w2) + (k5*w2)
                 + (k6*w2) + (k7*w2) + (k8*w2) + (k9*w2) + (k10*w3);
        //Hasil 
        System.out.println("Jarak yang ditempuh dari pkl 10:25:21 sd 12:00:00 adalah " + t + "meter");
        
        
    }
}
