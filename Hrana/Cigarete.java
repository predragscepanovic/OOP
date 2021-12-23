public class Cigarete extends Proizvod{
    String porekloPaklice;

    Cigarete(String imeProizvoda, double cenaProizvoda, int rokTrajanja, String porekloPaklice){
        super(imeProizvoda, cenaProizvoda, rokTrajanja);
        this.porekloPaklice = porekloPaklice;
    }

    @Override
    public String toString(){
        return "Ime : " + getImeProizvoda() + " Cena : " + getCenaProizvoda() + " Poreklo paklice : " + this.porekloPaklice + " Rok Trajanja : " + getRokTrajanja();
    }
}
