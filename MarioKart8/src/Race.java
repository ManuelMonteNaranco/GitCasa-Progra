public class Race  {
    private String name;
    private Circuito circuito;

    final int NUM_KARTS = 3;

    Kart[] karts = new Kart[NUM_KARTS];
    Kart[] finishedKarts = new Kart[NUM_KARTS];

    public Race(String name, Kart[] karts, Kart[] finishedKarts) {
        this.name = name;
        this.karts = karts;
        this.finishedKarts = finishedKarts;
    }
    public void run(){
        for (int i = 0; i < this.karts.length ; i++) {
            if (notAllFinised () == true){

            }
            if (karts[i] != null){
                moveKart(karts[i]);
            }
        }
    }
    private boolean notAllFinised (){
        for (int i = 0; i < this.karts.length; i++) {
            if (karts[i] !=  null){
                return true;
            }
        }
        return false;
    }
    private void moveKart(Kart kart) {
        int movedPositions= 0;
        movedPositions= kart.move() - circuito.difficulty();
        kart.setPosition(kart.getPosition() + movedPositions);
    }
    private boolean isFinished(Kart kart){
        for (int i = 0; i < this.karts.length; i++) {
            if(i>= circuito.getDistance()){
                return true;
            }
        }
        return false;
    }
    private  void moveToFinished(Kart  kart){
        for (int i = 0; i < this.finishedKarts.length; i++) {
            if (finishedKarts[i] != null){
                finishedKarts[i] = kart;
                for (int j = 0; j < this.karts.length; j++) {
                    if (karts[i].equals(kart)){
                        karts[i] = null;
                    }
                }
            }
        }
    }
    public  String  showResult(){
        for (Kart kart: this.finishedKarts) {
            return "Nombre del circuito:"+circuito.getName()+circuito.toString() + kart.toString();
        }
       return "Game Over";
    }
    public  void addKart(Kart  kart){
        for (int i = 0; i < this.karts.length; i++) {
            if (karts[i] == null){
                karts[i] = kart;
            }
        }

    }
    public void setCircuit(Circuito circuito){
        this.circuito = circuito;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public int getNUM_KARTS() {
        return NUM_KARTS;
    }

    public Kart[] getKarts() {
        return karts;
    }

    public void setKarts(Kart[] karts) {
        this.karts = karts;
    }

    public Kart[] getFinishedKarts() {
        return finishedKarts;
    }

    public void setFinishedKarts(Kart[] finishedKarts) {
        this.finishedKarts = finishedKarts;
    }

    public String toString() {
        String result = "Race: " + this.getName() + "\n";
        result += "Circuit: "+ circuito.toString() + "\n";
        for(int i= 0; i< karts.length; i++) {
            if(karts[i] != null) {
                result += (i+ 1) + ".-"+ karts[i].toString() + "\n";
            }
        }
        return result;
    }

}