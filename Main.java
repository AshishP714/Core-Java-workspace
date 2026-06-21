public class Main {

    public static void main(String[] args) {
        GameLoop game = new GameLoop();
        Thread gameThread = new Thread(game, "GameThread");
       
        gameThread.start();
      
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      
        game.stop();
    }
}
