//mengimport packade java.io dan classnya
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proses {
    //deklarasi dan inisialisasi
    int bilPositif = 0, bilNegatif = 0, ulang, bilangan;
  
         //instansiasi input dari keyboard
         BufferedReader lebet = new BufferedReader(new InputStreamReader(System.in));
    
    //method(procedure) untuk input dan looping bilangan
    public void perjalanan(){
        System.out.print("Jumlah bilangan yang akan diinputkan : ");
        try {
            ulang = Integer.parseInt(lebet.readLine()); //input data    
        } catch (IOException ex) {
            System.out.println("Error bro");
          }
            for(int i=1; i<=ulang; i++){
                System.out.print("Masukan bilangan ke "+i+" : ");
                try {
                    bilangan = Integer.parseInt(lebet.readLine()); //input data
                    seleksi(bilangan); //memanggil method seleksi
                } catch (IOException ex) {
                   System.out.println("Error bro"); 
                  }
            }
            jumlahBil(bilPositif, bilNegatif); //memanggil method jumlahBil
      } 

    //method(fungsi) untuk menyeleksi bilangan yang diinputkan
    public int seleksi(int angka){
        if(angka > 0){
            return bilPositif++;
        }
        else{
            return bilNegatif++;
        }
    }

    //method(procedure) untuk menampilkan banyaknya jumlah bilangan 
    public void jumlahBil(int bilPositif, int bilNegatif){
        System.out.println("Jumlah Bilangan Positif : "+ bilPositif);
        System.out.println("Jumlah Bilangan Negatif : "+ bilNegatif);
    }  
}