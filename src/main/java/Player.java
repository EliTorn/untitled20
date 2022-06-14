public class Player {
    private char x;
    private boolean keep;
    public Player() {
        this.keep = false;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }
    public String newPlayer(){
         if(!keep){
             keep = true;
             return "x";
         }
         else{
             keep =false;
             return "v";
         }

    }
}
