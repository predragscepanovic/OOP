import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prodavnica {
    private Proizvod[] proizvodi;

    Prodavnica(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        String count = sc.nextLine();
        int num = Integer.parseInt(count);

        proizvodi = new Proizvod[num];
        int i = 0;

        while(sc.hasNextLine()){
            String output = sc.nextLine();
            String[] arrOfStr = output.split(",");
            Proizvod novi = switch (arrOfStr[0]) {
                case "Cigarete" -> new Cigarete(arrOfStr[0], Double.parseDouble(arrOfStr[1]), Integer.parseInt(arrOfStr[2]), arrOfStr[3]);
                case "Voda" -> new Voda(arrOfStr[0], Double.parseDouble(arrOfStr[1]), Integer.parseInt(arrOfStr[2]), arrOfStr[3]);
                default -> null;
            };

            proizvodi[i] = novi;
            i++;
        }
    }

    Proizvod najskupljiProizvod(){
        double max;
        Proizvod najskuplji;

        if(proizvodi.length > 0) {
            max = proizvodi[0].getCenaProizvoda();
            najskuplji = proizvodi[0];
        }
        else
            return null;

        for(int i = 1; i < proizvodi.length; i++){
            if(proizvodi[i].getCenaProizvoda() > max) {
                max = proizvodi[i].getCenaProizvoda();
                najskuplji = proizvodi[i];
            }
        }

        return najskuplji;
    }

    public String staMoguKupiti(double iznos){
        StringBuilder mogucnosti = new StringBuilder("Za uneti unos mozete kupitit : ");

        for (Proizvod proizvod : proizvodi) {
            if (iznos <= proizvod.getCenaProizvoda())
                mogucnosti.append(proizvod.getImeProizvoda()).append(" ");
        }

        if(mogucnosti.toString().equals("Za uneti unos mozete kupitit : "))
            return "Nemate dovoljno novca za kupovinu.";
        else
            return mogucnosti.toString();
    }
}
