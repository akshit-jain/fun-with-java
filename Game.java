//class Player
class Player{

    private String toss;

    public Player(){
        toss = "";
    }

    public synchronized void setValue(char a){
        toss = toss+a;
    }

    public synchronized String getValue(){
        return toss;
    }

}


//Main Class
public class Game implements Runnable{

    private Player object;
    private char toss;

    public Game(Player object, char toss){
        this.object = object;
        this.toss = toss;
    }

    public void run(){
        object.setValue(toss);
    }
//use of random
    public static char generatetoss(){

        if(Math.random()<0.5)
            return 'T';
        else
            return 'H';

    }

    public static void main(String[] args) {

        Player[] object = new Player[3];

        int i=0,j=0,flag =0;

        loop: while(true){

            for(i=0;i<3;i++){

                object[i] = new Player();
                Thread t1 = new Thread(new Game(object[i],generatetoss()));
                Thread t2 = new Thread(new Game(object[i],generatetoss()));
                Thread t3 = new Thread(new Game(object[i],generatetoss()));
                t1.start();t2.start();t3.start();
                try{
                    t1.join();
                    t2.join();
                    t3.join();
                }catch(InterruptedException e) {}
                //outputs
                System.out.println("\nPlayer "+(i+1)+": Coin 1: "+object[i].getValue().charAt(0));
                System.out.println("Player "+(i+1)+": Coin 2: "+object[i].getValue().charAt(1));
                System.out.println("Player "+(i+1)+": Coin 3: "+object[i].getValue().charAt(2));
                //condition for winning
                if("HHH".equals(object[i].getValue())){
                    System.out.println("\nCongratulations! Player "+ (i+1)+" wins the game!");
                    break loop;
                }
            }

        }

    }

}
