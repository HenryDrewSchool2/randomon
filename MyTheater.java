import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;  // Import the Scanner class

public class MyTheater {
  
  public static void main(String[] args) {

int turnAmount = 1;
    
    
Scene myScene = new Scene();

    Image bgPokemon = new Image("bgPokemon.png");

     myScene.drawImage(bgPokemon, 0, 0, 400);
    

    

    
//Randomon.randoDexView();
    
    
    String randomon_name = "";
    String randoRival_name = "";
    Scanner scanner = new Scanner(System.in);



      Randomon.summonRandomon();
      randoRival_name = Randomon.summonRivalRandomon();
    
      Randomon yourRandomon = new Randomon();
      Randomon rivalRandomon = new Randomon();

    
if(yourRandomon.randomonSummon1 == 0) {
  yourRandomon.randomonMoveWeak = "Ember";
  yourRandomon.randomonMoveStrong = "Pyroblast";
}

if(yourRandomon.randomonSummon1 == 1) {
  yourRandomon.randomonMoveWeak = "Water Gun";
  yourRandomon.randomonMoveStrong = "Hydro Cannon";
}

if(yourRandomon.randomonSummon1 == 2) {
  yourRandomon.randomonMoveWeak = "Razor Leaf";
  yourRandomon.randomonMoveStrong = "Plant Frenzy";
}

Image PokemonRivalImage = new Image(randoRival_name + ".png");

Image PokemonUserImage = new Image(yourRandomon.yourRandomonName + ".png");

   //yourRandomon.yourRandomonName
    myScene.drawImage(PokemonRivalImage, 200, 80, 200);

    myScene.drawImage(PokemonUserImage, 10, 210, 200);

    Theater.playScenes(myScene);




while (true) {

System.out.println("-------------------------------------------- Turn " + turnAmount + " --------------------------------------------");
  
    System.out.println("Which attack do you want to use? Your " + yourRandomon.yourRandomonName + " can use: " + yourRandomon.randomonMoveWeak + " (Weak) and " + yourRandomon.randomonMoveStrong + " (Strong)");
    
    String randomonAttack = scanner.nextLine();

    if(randomonAttack.toLowerCase().equals("strong")) {
      yourRandomon.rollForDamage();
    
    yourRandomon.calculateDamage(1); // 1 = strong attack
    } 

    if(randomonAttack.toLowerCase().equals("weak")) {
    
    yourRandomon.calculateDamage(0); // 0 = weak attack
    } 

  if(yourRandomon.getRivalHealth() <= 0) {
    System.out.println("You have won!");
    break;
  }

    rivalRandomon.rivalAttackTypeCalc(); //determines weak or strong attack
      rivalRandomon.rivalRollForDamage(); //chance of hitting strong attack successfully
rivalRandomon.rivalCalculateDamage();


  if(rivalRandomon.getYourHP() <= 0) {
    System.out.println("You lost!");
    break;
  }


  turnAmount++;
}


   // Read user input

   
  }
}

