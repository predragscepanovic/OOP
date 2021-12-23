public class Voda extends Proizvod{
    String izvoriste;

    Voda(String imeProizvoda, double cenaProizvoda, int rokTrajanja, String izvoriste){
        super(imeProizvoda, cenaProizvoda, rokTrajanja);
        this.izvoriste = izvoriste;
    }

    @Override
    public String toString(){
        return "Ime : " + getImeProizvoda() + " Cena : " + getCenaProizvoda() + " Izvoriste " + this.izvoriste + " Rok Trajanja : " + getRokTrajanja();
    }

}
