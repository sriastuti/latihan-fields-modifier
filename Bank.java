
public class Bank {
    public static void main(String[] args) {
        final String nBank=" A";
        System.out.println(" Nama Bank = " +nBank);
        System.out.println();
        Nasabah penarik = new Nasabah();
        penarik.isiNasabah("Sri");
        penarik.tabungan(4000000);
        penarik.tarikUang(100000);
        penarik.tarikUang(1000000,"Holiday");

        System.out.println(penarik.getSaldo());
        System.out.println(penarik.getSaldo() + "  " + penarik.getPesan());

        System.out.println();
        Nasabah penarik1 = new Nasabah();
        penarik1.isiNasabah("Astuti");
        penarik1.tabungan(1200000);
        penarik1.tarikUang(700000);
        penarik1.tarikUang(500000,"Shoping");
        
        System.out.println("\n Jumlah Tarik : " + penarik1.urut);
        
    }
    
}
