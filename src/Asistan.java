public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adSoyad,String telefon,String eposta,String bolum,String unvan){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad()+" quiz yapti!");
    }
}
