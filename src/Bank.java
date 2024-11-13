abstract class Bank implements BankMethods {

    public void informacjeOWplacie(){
        System.out.println("Informacje o przyjeciu prosby wyplaty");
    }
    public void SprawdzenieStanuKonta(){
        System.out.println("Sprawdzenie stanu konta");
    }
    public void PotwiedzenieWyplaty(){
        System.out.println("Potwierdzenie mozliwosci wyplaty");
    }

}
