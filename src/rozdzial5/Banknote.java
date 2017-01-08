/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial5;

/**
 *
 * @author Strzelcu
 */
class Banknote {
    Nominal nominal;
    
    public Banknote(Nominal nominal) {
        this.nominal = nominal;
    }
    
    public void Describe() {
        System.out.print("To jest banknot ");
        switch(nominal) {
            case DZIESIEC_ZLOTYCH : System.out.println("dziesięciozłotowy"); break;
            case DWADZIESCIA_ZLOTYCH : System.out.println("dwudziestozłotowy"); break;
            case PIECDZIESIAT_ZLOTYCH : System.out.println("pięćdziesięciozłotowy"); break;
            case STO_ZLOTYCH : System.out.println("stuzłotowy"); break;
            case DWIESCIE_ZLOTYCH : System.out.println("dwustuzłotowy"); break;
            case PIECSET_ZLOTYCH : System.out.println("pięciusetzłotowy"); break;
            default : System.out.println("i tyle ;P");
        } 
    }
}
