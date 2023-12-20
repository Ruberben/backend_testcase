class Mamalia {
    void suara() {
        System.out.println("aing maung");
    }
}
class Anjing extends  Mamalia{
    @Override
    void suara(){
        System.out.println("gukguk");
    }
}

public class Binatang {

        public static void main(String[] args) {
            Mamalia anjing = new Anjing ();
            anjing.suara();

        }
    }


