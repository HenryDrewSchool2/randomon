import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class Randomon {

public int rivalAttackCalc;
  
public int damage; //Your damage to rival
public int rivalDamage; //Rival's damage to your randomon
public int yourRandomonHP = 1000; // initial hp of your pokemon
public int yourRandomonRemainingHP = 1000;
public int rivalHP = 1000; //initial rival hp
public int rivalRemainingHP = 1000; //remaining hp of rival after being attacked


public static String randomonAttackType; //type of randomon ex. fire water grass
public static String rivalRandomonAttackType; //type of randomon ex. fire water grass
public int attackStrength; //weak or strong attackStrength (0 = weak, 1 = Strong)
public int rivalAttackStrength;
public static String stringFormType; //type of randomon in string form

  
public static int randomonSummon1 = (int)(Math.random()*2.9); //random number for row
public static int randomonSummon2 = (int)(Math.random()*2.9); //random number for column
public static int rivalRandomonSummon1 = (int)(Math.random()*2.9); //random number for row
public static int rivalRandomonSummon2 = (int)(Math.random()*2.9); //random number for column
  
public int strongAttackChance; //variable to determine if your randomon successfully does strong attacks

public int rivalStrongAttackChance;
  
public String randomonMoveWeak; //name of weak move for randomon
public String randomonMoveStrong; //name strong move for randomon
public String rivalRandomonMoveWeak; //name of weak move for rival's randomon
public String rivalRandomonMoveStrong; //name of strong move for rival's randomon

public String yourRandomonName = randomonIndex[randomonSummon1][randomonSummon2];
  
public static String randomonIndexed; //randomon in index
  
//                                          First gen    Second Gen    Third Gen
public static String[][] randomonIndex = {{"Charmander", "Cyndaquil", "Torchic"}, //fire
                                   {"Squirtle", "Totadile", "Mudkip"}, // water
                                   {"Bulbasaur", "Chickorita", "Treecko"}}; // grass


//row = type
//col = gen
  
                                          //F W G
public int[][] randomonTypeChart = {{1,2,1}, //F
                                    {1,1,2}, //W
                                    {2,1,1}};//G


public int getRivalHealth() {
  return rivalRemainingHP;
}

public int getYourHP() {
  return yourRandomonRemainingHP;
}

public void UserRandomon(String stringFormType, String yourRandomonName) {
    if(randomonSummon1 == 0) {
      stringFormType.equals("Fire");
    }
    if(randomonSummon1 == 1) {
      stringFormType.equals("Water");
    }
    if(randomonSummon1 == 2) {
      stringFormType.equals("Grass");
    }
  }

public void rollForDamage() {
   strongAttackChance = (int)(Math.random()*10);
}

  public void rivalRollForDamage() {
   rivalStrongAttackChance = (int)(Math.random()*10);
}

public void rivalAttackTypeCalc() {
rivalAttackCalc = (int)(Math.random()*9);

}

public static void summonRandomon(){
  System.out.println("Your randomon is: " + randomonIndex[randomonSummon1][randomonSummon2]);
 // System.out.println(randomonSummon1);
//  System.out.println(rivalRandomonSummon1);
  //if (randomonSummon2 == 0) {
//    Randomon.stringFormType.equals("fire");
  //}

}

public static String summonRivalRandomon(){
  System.out.println("Your rival's randomon is: " + randomonIndex[rivalRandomonSummon1][rivalRandomonSummon2]);
  return randomonIndex[rivalRandomonSummon1][rivalRandomonSummon2];
}



  public static String[][] randoDexView() {

  for(int i = 0; i < randomonIndex.length;i++) {
    for(int j = 0; j < randomonIndex[0].length ;j++) {
     
      randomonIndexed = randomonIndex[i][j];
      System.out.println(randomonIndexed);
    }
  }
    return randomonIndex;
}

  
public void calculateDamage(int attackStrength) {



  if(randomonSummon1 == 0) {
    randomonAttackType = "Fire";
  }
  if(randomonSummon1 == 1) {
    randomonAttackType = "Water";
  }
  if(randomonSummon1 == 2) {
    randomonAttackType = "Grass";
  }
  

  
  if (randomonAttackType.equals("Fire")) { //WIP attack strength stuff
    if(attackStrength == 0) {
  damage = Fire.fireDamageWeak;
   rivalRemainingHP -= damage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
    }
if(attackStrength == 1) {
  if(strongAttackChance >= 5) {
  damage = Fire.fireDamageStrong;
    rivalRemainingHP -= damage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1]; 
  }
  else{
    System.out.println("Your randomon missed!");
  }
}
    

  }
  
if (randomonAttackType.equals("Water")) {
  if(attackStrength == 0) {
        damage = Water.waterDamageWeak;
   rivalRemainingHP -= damage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
  }
if(attackStrength == 1) {
  if(strongAttackChance >= 5) {
    damage = Water.waterDamageStrong;
    rivalRemainingHP -= damage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
  }
  else{
    System.out.println("Your randomon missed!");
  }
}

  }

if (randomonAttackType.equals("Grass")) {
  if(attackStrength == 0) {
     damage = Grass.grassDamageWeak;
  rivalRemainingHP -= damage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
  }
  if(attackStrength == 1) {
    if(strongAttackChance >= 5) {
        damage = Grass.grassDamageStrong;
          rivalRemainingHP -= damage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
    }
    else{
      System.out.println("Your randomon missed!");
    }
  }
  

  }
  
  System.out.println("Rival's Randomon has " + rivalRemainingHP + " HP left!");
}

//------------------------------------------------------------------------------------------------------
public void rivalCalculateDamage() {

    if (rivalAttackCalc >= 4) {
    rivalAttackStrength = 0;
  }
  else {
    rivalAttackStrength = 1;
  }

  if(rivalRandomonSummon1 == 0) {
    rivalRandomonAttackType = "Fire";
  }
  if(rivalRandomonSummon1 == 1) {
    rivalRandomonAttackType = "Water";
  }
  if(rivalRandomonSummon1 == 2) {
    rivalRandomonAttackType = "Grass";
  }
  
 

  
  if (rivalRandomonAttackType.equals("Fire")) {
    if(rivalAttackStrength == 0) {
      rivalDamage = Fire.fireDamageWeak;
   yourRandomonRemainingHP -= rivalDamage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
    }
    if(rivalAttackStrength == 1) {
      if(rivalStrongAttackChance >= 5) {
        rivalDamage = Fire.fireDamageStrong;
        yourRandomonRemainingHP -= rivalDamage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1]; //subtracts damage from rival from your randomon hp
      }
      else{
        System.out.println("Rival's randomon missed!");
      }
    }
    
  }
  
if (rivalRandomonAttackType.equals("Water")) {
  if(rivalAttackStrength == 0) {
    rivalDamage = Water.waterDamageWeak;
   yourRandomonRemainingHP -= rivalDamage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
  }
  if(rivalAttackStrength == 1) {
    if(rivalStrongAttackChance >= 5) {
        rivalDamage = Water.waterDamageStrong;
      yourRandomonRemainingHP -= rivalDamage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
    }
  
 else{
   System.out.println("Rival's randomon missed!");
 }   
  }
  
  }

if (rivalRandomonAttackType.equals("Grass")) {
  if(rivalAttackStrength == 0) {
     rivalDamage = Grass.grassDamageWeak;
   yourRandomonRemainingHP -= rivalDamage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
  }
if(rivalAttackStrength == 1) {
  if(rivalStrongAttackChance >= 5) {
    rivalDamage = Grass.grassDamageStrong;
      yourRandomonRemainingHP -= rivalDamage * randomonTypeChart[randomonSummon1][rivalRandomonSummon1];
  }
  else{

    System.out.println("Rival's randomon missed!");
  }
}
  
  }
  
  System.out.println("Your Randomon has " + yourRandomonRemainingHP + " HP left!");
}
  
}
