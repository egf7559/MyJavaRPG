

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Ella";
        Player player = new Player(name); //new player
        System.out.println("Player name: " + player.name);
        System.out.println("Your physical damage is: " + player.getPhysicalDamage()); //stating your stats
        System.out.println("Your magical damage is: " + player.getMagicalDamage());
        System.out.println("Your range damage is: " + player.getRangeDamage());

        player.setHp(50); // what hp you will start with
        System.out.println("Your hp is: " + player.getHp());


        Enemy enemy = new Enemy(); //making the enemy
        enemy.setHp(65);
        System.out.println("The enemy's HP is: " + enemy.getHp());
        System.out.println("The enemy can deal: " + enemy.getE_physicalDamage());


        Scanner scanner = new Scanner(System.in); //for user input

        boolean running = true;
        System.out.println("The Game is Starting!");
        // summary of the game before game actually starts
        System.out.println("There are three options when facing an enemy. Attack, Run, or Talk \n" +
                "If you Attack you get two moves to try and kill the enemy. If you run, you will lose 4 hp, \n" +
                "And lastly if you talk to the enemy and satisfy it, you can get coins"); // coin implementation will be added later
         while (running) {
             System.out.println("You have 3 options. 1. Attack 2. Run or 3. Talk");
             System.out.println("What would you like to do? option(1, 2, or 3): ");
             int option = scanner.nextInt();

             if (option == 1) {
                 System.out.println("You have 3 options. \n" + "A. Use a Physical attack against the enemy \n" +
                         "B. Use a Magic attack against the enemy \n" +
                         "C. Use a Range attack against the enemy ");
                 System.out.println("What would you like to do? option(A, B, or C): ");
                 char option2 = scanner.next().charAt(0);
                 if (option2 == 'A') {
                     enemy.setHp(enemy.getHp() - player.getPhysicalDamage());
                     System.out.println("The enemy has " + enemy.getHp() + " hp");
                 } else if (option2 == 'B') {
                     enemy.setHp(enemy.getHp() - player.getMagicalDamage());
                     System.out.println("The enemy has " + enemy.getHp() + " hp");
                 } else if (option2 == 'C') {
                     enemy.setHp(enemy.getHp() - player.getRangeDamage());
                     System.out.println("The enemy has " + enemy.getHp() + " hp");
                 }
             }
             else if (option == 2) {
                 player.setHp(player.getHp() - 4);
                 System.out.println("Your HP is: " + player.getHp() + "hp");
             }
             else if (option == 3) {
                 System.out.println("Hi I'm the enemy and you need to answer a math problem to get past me!!! " +
                         "Integrate 6x \n" +
                         "HAHA I BET YOU DONT KNOW INTEGRATION");
                 System.out.println("what do you think the answer is?: ");
                 int answer = scanner.nextInt();
                 if (answer == 6){
                     System.out.println("oh, I guess you do know... welp Ill give you 3 gold coins");
                 }
                 else {
                     System.out.println("WRONG!!!!!");
                     player.setHp(player.getHp() - 20);
                 }

             if  (player.getHp() <= 0 || enemy.getHp() <= 0){
                 System.out.println("Game Over");
                 running = false;
             }

             }
             }



         }











        }

