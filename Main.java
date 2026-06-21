public class Main {

  // Main execution entry point to test the thread execution
    public static void main(String[] args) {
        GameLoop game = new GameLoop();
        Thread gameThread = new Thread(game, "GameThread");
        
        // Start the background loop
        gameThread.start();

        // Let the game run for 2 seconds on the main thread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Request the game thread to stop execution
        game.stop();
    }
}
