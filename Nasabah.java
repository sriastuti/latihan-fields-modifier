
public class Nasabah {
    private int saldo;
    private String pesan;
    private String namaNasabah;
    static int urut=0;
    
    public void isiNasabah(String nama){
        namaNasabah=nama;
        System.out.println(" Nama Nasabah = " + namaNasabah);
    }
    public int tabungan(int jum){
        return saldo=saldo+jum;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int tarikUang(int uang){
        if(saldo- uang < 50000 ){
            System.out.println(" Tidak mencukupi.");
            return saldo;
        }else{
            System.out.println(" Tarik = " + uang);
            urut++;
           return saldo-=uang;
        }
        
    }
     public int tarikUang(int uang, String terisi){
        if(saldo - uang < 50000 ){
            System.out.println(" Tidak mencukupi.");
            return saldo;
        }else{
            System.out.println(" Tarik  = " + uang);
            urut++;
            pesan=terisi;
           return saldo-=uang;
           
        }
        
    }
   
}
