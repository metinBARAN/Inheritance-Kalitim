public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad,String telefon,String eposta,String departman,String mesai){
        super(adSoyad,telefon,eposta,departman,mesai);
        this.belge=belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(getAdSoyad()+" nobet yapti !");
    }
}
