package dev.duncan.jurassicpark;
import java.util.Scanner;
public class JurassicPark {
       public static void clearScreen() {
       System.out.print("\033[H\033[2J");
       System.out.flush();
      }
     public static void main(String [] objs)
      throws InterruptedException {
      // ART
      String art [] = {
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%%%%%%%%%%%%%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%%%%%&@@@@@@@@@@@@@@@@@@@&%%%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%@@@@@@@@@@@%/***********/#@@@@@@@@@@@&%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%&@@@@@@&*********************************%@@@@@@@%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%@@@@@@**************************/@@@@@@@%(*********&@@@@@%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%&@@@@&*********************@@@@@@@@@@@@@@@@@@@@************#@@@@@%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%&@@@@*********************@@@@/@@@@@@@@@@@@@@@@&*%@@@&************@@@@@%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%@@@@********************@@@***@@@@@@@@@@@@@@@@@@@(**#@@@@@@************@@@@%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%@@@&***********************&@@@@@@@@@@@@@@@@@@@@@@@@***@@#**@@@@#**********(@@@&%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%@@@#**********************(@@@@@@@@@@@@@@@@@@@@@@@@@***#@@@@***(@@@@@@#*********@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%@@@#************************@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*******@@@@@@@@&*******@@@&%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@*************************@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@****@@@@@@@@@@@@@%****%@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@*************************@@@@@@@@@@@@@@@@@@@@@@@@@@@@#**#@&%@@@@@@@@@&%%@@@@@@@@@@(****@@@&%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@************************@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@********#/@@@@@@@@@@@@@@@@@@@@****&@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@*****************@#**@%(@@@@@@@@@@@@@@@@/@@@@@@@@@@@@@@@@@*******#%*@/(*#@@@&@@@@@@@@@*****%@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@*********@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@%@*&*&@@@@@@@@@@@@*(*********#&*&/@*(@@@@@//@@********%@@@%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@%&***@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@%@@##*%****#@@@@@@@@@@@@*%**/**************/***&************@@@&%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@(@@@@@@@@@@@@@@@@@@@@@@&/@@@@/@#*@*%**********/@@@@@@@@@@*&%(********************************@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(@@@(**(%*&****#@@/**********%@@@@@@@@*@*@#*@**#***********************(@@@%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**%@@**(*/*****/@@@#***(*********(@@@@@@/&*(@*@/************************@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@***********%@/******************@@@@@@@@#*#/%***********************@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@(%@@@*%@@@@@@@@@@**@@#***%*************&@@@@@@@/************************%@@&%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@#@@/*@@*@@@@%*@#@@@@%*****@@@@@@@&*/@**********************************************#@@&%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@@@@@#&@(*@(**/@****@@@@@@@@@@@@@@@(/*********#*********************************************&@@%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@....,(&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@........#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@...%...@.....@@@&....,%.......&@@@@@@.......@@@@@@..#@@@@@..*@@.....@@@@@@,.@@@@@@@*..#....%...@@@@#....../@@@.......*@@@@.....@@@.%@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@...%...@..#..@@@@..,.(%.%....(,.,@@@@.....(.%@@@..(,..*@..,(...%..,.@@@&..*/..(@@@@&..#..@&..%..#@@..%..#..@@@..%....%..@@*.%..@@,.%..&@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@,..%..*@,.*..@@@@..,.%%.%.*@@..#..@@*.#.*.,..@&..%..@@@..#..#@@@..,.@@..*,.(@@@@@@@@..#..@@@..%..@@.,..../.@@@..%.@@(..#.,#.#..@..%..@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@#..%../@(.,..@@@@..,.&%.%.*@@&..*.(@.,..@*.%.@@..%..@@@..#..@@@@..,.@*.(..@@@@@@@@@@..%..@@@%.#..&*.(.%@.*.,@@,.#.@@@..%..&.(....(,%@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@@..%..(@#.,..@@@@..,.@%.#.,@...%.,@*.(.&@@.,..@@..*..,@@,.,..*@@..,.@..*.%@@@@@@@@@@..%..@@@..%..@.*..@@*.(.@@,.#.&@..,,.@@./..##.#@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@@..#..(@%....@@@@..,.@%.#.../(.,@@@./../(/..(.@@@@..#..@@@../..@..,.@..(.,@@@@@@@@@@..%..@...%..&/.#.,#((./..@,.#...#..@@@@.*,,..%.,@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@@../..#@%....@@@@..*.@%.%.....,.@@,./.......#.,@@@..(..@@@..*..@..,.@%..*.*@@@@@@@@@..%...#,..*@@.(......../.@..#....%..@@@.*..@/./.,@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@@@@@%..(..(@%..%.....(.*.@%.%..@/.*..@.#..@@@@@..,.@..,,..@@../...@@..,.@@%..%...@@@@@@@..#....@@@@@,.#..@@@@/.#....#.,@..&.,@&.*..@@%,,*,(@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@&%%@@@......,,..&@@@/..........@%.%..@@%.,.../..@@@@@..%......@@@,....@@@&..,.@@@@/.....@@@@@#..#..@@@@@@@.#..%@@@@%..,...%..@@..%.,%....@@@&....@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@%%@@@........./@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,..*..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@&****************************************************************@@@@&%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%@@@@@********&**/@@@@@*&@@&*(#&@#%******@@@&**#@@&*************@@@@@%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%&@@@@@*@@@@@@@/@@*@@@@@@*@@@@@@@@@@@@/@@@&*/@@@@/(*@@%**@@@@@&%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%&@@@@@@@@/&@@@@@@*@@@@@@@@@@@@@@@*@@/@@@@@@@@@@@@@@@@@%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&%%%%%%%%%%%%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
      "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
      };
      
      
      
      
   // presets
      String inputU = " ";
      String inputP = " ";
      String PASSWORD = "Thank You:1993";
      String USERNAME = "Dennis Nedry";
      String userInput = " ";
      int x = 0;
      int y = 0;
      Scanner keyboardU = new Scanner(System.in);
      Scanner keyboardP = new Scanner(System.in);
      Scanner User_Input = new Scanner(System.in);
      String systemBoot = " ";
      String systemBootN = "n";
      String systemBootY ="y";
      //ENCLOSURE LIST//
      
      
      String Enclosure_List []={
         "Brachiosaurus ",
         "Parasaurolophus ",
         "Gallimimus ",
         "Triceratops ",
         "Dilophosaurus ",
         "Protoceratasaurus ",
         "Velociraptor ",
         "Tyrannosaurus ",
         "Metriacanthosaurus ",
         "Segisaurus ",
         "Baryonyx "
      };

      
    //beginning of program
      Thread.sleep(1000);
      System.out.println("Welcome to the Jurrassic Park Terminal Interface.");
      Thread.sleep(1000);
      System.out.print(">Would you like to boot the system? y/n:");
      systemBoot = User_Input.nextLine();
      if (systemBoot.equals(systemBootY)) {
      System.out.print("\n");
      System.out.println("Loading");
      for(x = 0; x <= 4; x++){
         Thread.sleep(1000);
         System.out.println("...");
      }
      //clearScreen();
      for (int c = 0; c <art.length; c++){
         Thread.sleep(100);
         System.out.println(art[c]);
         }
      Thread.sleep(1000);
      System.out.println("Welcome to the Jurrassic Park Security Terminal.");
      Thread.sleep(1000);
      System.out.println("Unauthorised Access is prohibited.");
      Thread.sleep(1000);
      System.out.println("=================================================");
      Thread.sleep(1000);
      System.out.println("Username:");
      System.out.print(">");
      inputU = keyboardU.nextLine();
      Thread.sleep(1000);
      System.out.println("Password:");
      System.out.print(">");
      inputP = keyboardP.nextLine();
      
      
      //IF STATEMENT SECTION
            if ((inputP.equals(PASSWORD))&&(inputU.equals(USERNAME))) {
           
               Thread.sleep(1000);
               System.out.println("Park System security reactivated");
               
               Thread.sleep(500);
               System.out.println("  Which enclosures should be reactivated?");
               
               for (int c = 0; c <Enclosure_List.length; c++){
               Thread.sleep(500);
               System.out.println("  .....: " + Enclosure_List[c]);
               }
               System.out.println("Type in a dinosaur name to activate an enclosure. Type exit to exit");
               System.out.print(">");
               userInput = User_Input.nextLine();
               while (!userInput.equalsIgnoreCase("EXIT")){
                 Thread.sleep(1000);
                 /* switch (userInput) {
                     case "Brachiosaurus":
                        //stuff to match dinos
                        //C&P
                        break;
                     default:
                        //stuff to do if the dino doesn't match
                        break;
                  }*/
                  for(int t = 0; t < 1; t++){
                     if (userInput.equals("Brachiosaurus")){
                        System.out.println("Brachiosaurus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Parasaurolophus")){
                        System.out.println("Parasaurolophus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Gallimimus")){
                        System.out.println("Gallimimus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Triceratops")){
                        System.out.println("Triceratops enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Dilophosaurus")){
                        System.out.println("Dilophosaurus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Protoceratasaurus")){
                        System.out.println("Protoceratasaurus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Velociraptor")){
                        System.out.println("Velociraptor enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Tyrannosaurus")){
                        System.out.println("Tyrannosaurus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Metriacanthosaurus")){
                        System.out.println("Metriacanthosaurus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Segisaurus")){
                        System.out.println("Segisaurus enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else if (userInput.equals("Baryonyx")){
                        System.out.println("Baryonyx enclosure activated");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     else {
                        System.out.println("Invalid enclosure name");
                        Thread.sleep(500);
                        System.out.println("Select another enclosure or type exit");
                        t=t+1;
                     }
                     userInput = User_Input.nextLine();
                    }
                  }
               }
               
                      
           else {
              Thread.sleep(1000);
              System.out.println("You didn't say the magic word!");
              do{
                  Thread.sleep(500);
                  System.out.println("Ha Ha Ha");
                  y = y+= 1; //count = count + 1;
                 }while(y<= 10);
               }
         }
      else if (systemBoot.equals(systemBootN)) {
      Thread.sleep(600);
      System.out.println("Session Terminated");
      }
      else{
      Thread.sleep(600);
      System.out.println("Session Terminated");
      }
   }//end of main

}



