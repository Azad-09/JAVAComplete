static abstract class Game{
    
    // Regular Method
     void startGame(){
        System.out.println("Press Anykey To Start");
    } 

     void exitGame(){
        System.out.println("Much More To Go, Are You Sure");
    }

    // Abstract Method
    abstract void calcScore();
    abstract void displayScore();

}

class Badminton extends Game{
    void calcScore(){
        System.out.println("Calculate Badminton Score");
    }

    void displayScore(){
        System.out.println("Display Badminton Score");
    }
}

class TableTennis extends Game{
    void calcScore(){
        System.out.println("Calculate TT Score");
    }

    void displayScore(){
        System.out.println("Display TT Score");
    }
}

class Chess extends Game{
    void calcScore(){
        System.out.println("Calculate Chess Score");
    }

    void displayScore(){
        System.out.println("Display Chess Score");
    }
}

class GameMain{
   public static void main(String [] args){
    Game obj1 = new Badminton();
    Game obj2 = new TableTennis();
    Game obj3 = new Chess();

    obj1.startGame();
    obj1.calcScore();
    obj1.displayScore();
    obj1.exitGame();

    obj2.startGame();
    obj2.calcScore();
    obj2.displayScore();
    obj2.exitGame();


    obj3.startGame();
    obj3.calcScore();
    obj3.displayScore();
    obj3.exitGame();
   }
}