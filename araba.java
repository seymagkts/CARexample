public class araba { //Baseclass
    private int yolcuSayisi;
    private String renk;
    private String marka;
    private double fiyat;

    public araba(int yolcuSayisi,String renk,String marka,double fiyat){
        this.renk = renk;
        this.fiyat = fiyat;
        this.marka = marka;
        this.yolcuSayisi = yolcuSayisi;
    }
    public void bilgiGoster(){
        System.out.println("Arabanın markası: "+marka);
        System.out.println("Arabanın fiyatı: "+fiyat+ "tl");
        System.out.println("Arabanin rengi: "+renk);
        System.out.println("Arabanın yolcu kapasitesi: "+yolcuSayisi+ "\n");
    }


    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
