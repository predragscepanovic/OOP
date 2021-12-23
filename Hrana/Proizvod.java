abstract public class Proizvod {
    String imeProizvoda;
    double cenaProizvoda;
    int rokTrajanja;

    Proizvod(String imeProizvoda, double cenaProizvoda, int rokTrajanja){
        this.imeProizvoda = imeProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.rokTrajanja = rokTrajanja;
    }

    String getImeProizvoda(){
        return this.imeProizvoda;
    }

    double getCenaProizvoda(){
        return this.cenaProizvoda;
    }

    int getRokTrajanja(){
        return this.rokTrajanja;
    }

    public String toString(){
        return "Ime : " + getImeProizvoda() + " Cena : " + getCenaProizvoda() + " Rok Trajanja : " + setTrajanje();
    }

    private String setTrajanje(){
        return switch (rokTrajanja) {
            case 0 -> "neograniceno";
            case 1 -> "1 mesec";
            case 2 -> "2 meseca";
            default -> this.rokTrajanja + " meseci";
        };
    }

}
