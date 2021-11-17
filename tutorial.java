import javakara.JavaKaraProgram;

// if - else
// for
// while
// variablen
// klassen
// methoden
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */

// ====== DAS IST EINE KLASSE            "karas baukasten"
public class Dernamevonderklasse extends JavaKaraProgram {
    // alle methoden mit public vor kann kara sehen,
    // alle anderen nur der baukasten

    /*public oder kein public*/
    
    // void = wert der zurückgegeben wird
    void namedermethode() {
        kara.move();

        // bullshit
        // noch mehr bullshit
        // sehr viel bullshit
    }

    // unendliche viele Methoden pro Klasse
    void nochEineMethode() {
        // hehe nix
    }

    // braucht immer eine !!!public!! methode die myProgram heißt
    // void = null = undefiniert = gar nix

    // ALT Gr + 7 / 0
    public void myProgram() {
        // von hier die anderen methoden aufrufen
        // weil kara nur diese methode sieht & ausfdühren kann

// ################## METHODEN AUFRUFEN
        // ruft anderes werkzeug auf
        this.laufeUmBaum();

// ################## UNENDLICHE BEDINGUNG
        while(true) {
            kara.move();
            this.drehDich();
        }

// ################## IF UND ELSE
        // größer als
                        if(zahl > 3)

        // kleiner als
        if(zahl < 3)

        // genau
        if(zahl == 3) 

        // nicht
        if(zahl != 3)

        // nicht
        if(!kara.treeFront())

        // if / else
        if(kleeAnzahl > 3) {
            // wenn bedingung dann das
        } else {
            // wenn nicht das
        }

        //  String - buchstaben
        //  int    - zahlen

// ############ VARIABLEN 

        // typ          name         =      inhalt
        String linkZumCockBildVonMax = "https://www.cock.de";
        int cockGroesse = 18769; // 

        if(cockGroesse > 3) {
            // dann max sehr kuhl
        }

        if(linkZumCockBildVonMax == "https://google.de") {
            // falsche link
        }

        // max wird älter
        cockGroesse = cockGroesse + 50;

        // ==========
        cockGroesse++; 
        // BEIDES DAS GLEICHE
        cockGroesse = cockGroesse + 1;
        // ==========

        // ==========
        cockGroesse--; 
        // BEIDES DAS GLEICHE
        cockGroesse = cockGroesse - 1;
        // ==========

    }

    void drehDich() {
        for(int i = 4; i>0; i--) {
            kara.turnLeft();
        }
    }

    void schnecke() {
// ##################  FOR SCHLEIFE       
        for(int i = 10; i>0; i--) {
            this.machNeReihe(i);
            kara.turnLeft();
            this.machNeReihe(i);
            kara.turnLeft();
            this.machNeReihe(i);
            kara.turnLeft();
            this.machNeReihe(i);
            kara.turnLeft();
        }
    }

    void laufeUmBaum() {
        kara.move();
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
        kara.turnLeft();
    }
}
// ======== DAS IST DAS ENDE VON DER KLASSE