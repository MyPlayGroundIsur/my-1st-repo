public class Demo37 {
    public static void main(String[] args) {
      Ijse ijse = new Ijse(programme1 , programme2);
      System.out.println(ijse.programme1);
      System.out.println(ijse.programme2);
      ijse = null;
    }
}

class Ijse {
    Programme programme1;
    Programme programme2;

    public Ijse () {
        this.programme1 = new Dep();
        this.programme2 = new Gdse();
    }

    public Ijse(Programme programme1 , Programme programme2) {
         this.programme1 = programme1;
        this.programme2 = programme2;
    }

}

interface Programme {}

class Dep implements Programme {}
class Gdse implements Programme {}

