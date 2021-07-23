import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
     
        model model=new model(2,"Beyaz","Honda Civic",145500);
        model model1=new model(4,"Siyah","Fiat Doblo",56300);
        model model2=new model(4,"Kırmızı","Opel Corsa",89500);

        String secim="1. Corsa\n"+
                     "2. Civic\n"+
                     "3. Doblo\n"+
                    "Cıkıs icin 0'a basiniz\n";
        System.out.println(secim);

        while(true) {
            System.out.println("Bilgi için model seçiniz: ");
            String sec = scanner.nextLine();
            if (sec.equals("1")) {
                model1.corsa();
            } else if (sec.equals("2")) {
                model.civic();
            } else if (sec.equals("3")) {
                model2.doblo();
            } else if(sec.equals("0")){
                System.out.println("Sonlandırılıyor...");
                break;
            } else {
                System.out.println("Gecersiz islem....");
            }

        }
    }
}
