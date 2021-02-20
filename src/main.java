public class main {

    // Nama     : Argya Aulia Fauzandika
    // NIM      : 10119035
    // Kelas    : IF1
    // Tanggal  : 20 Februari 2021
    // NO soal  : 2

    public static void main(String[] args){
        int saldoAwal, bulan, saldo, bonus;

        saldoAwal = 100000;
        bonus = 500;
        bulan = 5;

        for(int i=1; i <= bulan; i++) {
            saldo = saldoAwal + bonus;
            saldoAwal = saldo;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldo);
        }
    }
}
