/* Mathew Younan
   Mr. Ceccato
   May 26, 2020
   Pokemon Midterm CPT program
 */

import java.util.Scanner; // Importing Scanner class
import java.util.Random; // Importing Random class
public class PokemonMidtermCPT
{ // Start of PokemonMidtermCPT class

    public static void main(String[] args)
    { // Start of main method
        Scanner scan = new Scanner(System.in); // Creation of Scanner called scan
        Random rand = new Random(); // Creation of Random called rand
        String username = null; // Variable that will store the user's username
        String user_pokemon = null; // Variable that will store the user's pokemon
        String defeat_team_rocket_response = null; // Variable that will store the user's choice that regards to defeating team rocket
        String ready_daniel_choice = null; // Variable that will store the user's choice to being ready to fight grunt Daniel
        String ready_kent_choice = null; // Variable that will store the user's choice to being ready to fight grunt Kent
        String ready_ryan_choice = null; // Variable that will store the user's choice to being ready to fight grunt Ryan
        String ready_steve_choice = null; // Variable that will store the user's choice to being ready to fight grunt Steve
        String ready_william_choice = null; // Variable that will store the user's choice to being ready to fight grunt William
        String ready_lucas_choice = null; // Variable that will store the user's choice to being ready to fight grunt Lucas
        String ready_jacob_choice = null; // Variable that will store the user's choice to being ready to fight grunt Jacob
        String ready_david_choice = null; // Variable that will store the user's choice to being ready to fight grunt David
        String ready_jessie_choice = null; // Variable that will store the user's choice to being ready to fight grunt Jessie
        String ready_james_choice = null; // Variable that will store the user's choice to being ready to fight grunt James
        String enemy = null; // Variable that will store the enemy you are currently vsing
        String user_turn = null; // Variable that will store the user's turn choice
        String play_again_response = null; // Variable that will store the user's response regarding wanting to play again
        int user_max_hp = 0; // Variable that will store the user's total HP
        int user_current_hp = 0; // Variable that will store the user's current HP
        int user_base_damage = 0; // Variable that will store the user's base damage
        int user_damage = 0; // Variable that will store the user's current damage
        final int charmander_max_hp = 30; // Constant that stores Charmander's starting max HP
        final int charmander_damage = 7; // Constant that stores Charmander's starting damage
        final int squirtle_max_hp = 42; // Constant that stores Squirtle's starting max HP
        final int squirtle_damage = 6; // Constant that stores Squirtle's starting damage
        final int bulbasaur_max_hp = 46; // Constant that stores Bulbasaur's starting max HP
        final int bulbasaur_damage = 5; // Constant that stores Bulbasaur's starting damage
        final int rattata_max_hp = 29; // Constant that stores Rattata's max HP
        final int ekans_max_hp = 36; // Constant that stores Ekans' max HP
        final int gastly_max_hp = 34; // Constant that stores Gastly's max HP
        final int zubat_max_hp = 40; // Constant that stores Zubat's max HP
        final int koffing_max_hp = 32; // Constant that stores Koffing's max HP
        final int machop_max_hp = 35; // Constant that stores Machop's max HP
        final int sandshrew_max_hp = 33; // Constant that stores Sandshrew's max HP
        final int grimer_max_hp = 53; // Constant that stores Grimer's max HP
        final int arbok_max_hp= 59; // Constant that stores Arbok's max HP
        final int wobbuffet_max_hp = 67; // Constant that stores Wobbuffet's max HP
        final int muk_max_hp = 71; // Constant that stores Muk's max HP
        final int weezing_max_hp = 69; // Constant that stores Weezing's max HP
        final int meowth_max_hp = 79; // Constant that stores Meowth's max HP
        final int crit_damage_multiplier = 2; // Constant that will store a critical hit damage's multiplier
        int rattata_current_hp = 0; // Variable that will store Rattata's current HP
        int rattata_damage = 3; // Variable that will store Rattata's current damage
        final int rattata_xp_drop = 32; // Constant that will store the amount of XP gained upon defeating Rattata
        int ekans_current_hp = 0; // Variable that will store Ekans' current HP
        int ekans_damage = 4; // Variable that will store Ekan's current damage
        final int ekans_xp_drop = 39; // Constant that will store the amount of XP gained upon defeating Ekans
        int gastly_current_hp = 0; // Variable that will store Gastly's current HP
        int gastly_damage = 3; // Variable that will store Gastly's damage
        final int gastly_xp_drop = 38; // Constant that will store the amount of XP gained upon defeating Gastly
        int zubat_current_hp = 0; // Variable that will store Zubat's current HP
        int zubat_damage = 4; // Variable that will store Zubat's current damage
        final int zubat_xp_drop = 46; // Constant that will store the amount of XP gained upon defeating Zubat
        int koffing_current_hp = 0; // Variable that will store Koffing's current HP
        int koffing_base_damage = 5; // Variable that will store Koffing's base damage
        int koffing_damage = 5; // Variable that will store Koffing's current damage
        final int koffing_xp_drop = 54; // Constant that will store the amount of XP gained upon defeating Koffing
        int machop_current_hp = 0; // Variable that will store Machop's current HP
        int machop_damage = 6; // Variable that will store Machop's current damage
        final int machop_xp_drop = 61; // Variable that will store the amount of XP gained upon defeating Machop
        int sandshrew_current_hp = 0; // Variable that will store Sandshrew's current HP
        int sandshrew_damage = 6; // Variable that will store Sandshrew's current damage
        final int sandshrew_xp_drop = 66; // Constant that will store the amount of XP gained upon defeating Sandshrew
        int grimer_current_hp = 0; // Variable that will store Grimer's current HP
        int grimer_damage = 5; // Variable that will store Grimer's current damage
        final int grimer_xp_drop = 69; // Constant that will store the amount of XP gained upon defeating Grimer
        int arbok_current_hp = 0; // Variable that will store Arbok's current HP
        int arbok_damage = 8; // Variable that will store Arbok's current damage
        final int arbok_xp_drop = 92; // Constant that will store the amount of XP gained upon defeating Arbok
        int wobbuffet_current_hp = 0; // Variable that will store Wobbuffet's current HP
        int wobbuffet_damage = 7; // Variable that will store Wobbuffet's current damage
        final int wobbuffet_xp_drop = 86; // Constant that will store the amount of XP gained upon defeating Wobbuffet
        int muk_current_hp = 0; // Variable that will store Muk's current HP
        int muk_damage = 6; // Variable that will store Muk's current damage
        final int muk_xp_drop = 91; // Constant that will store the amount of XP gained upon defeating Muk
        int weezing_current_hp = 0; // Variable that will store Weezing's current HP
        int weezing_damage = 7; // Variable that will store Weezing's current damage
        final int weezing_xp_drop = 88; // Constant that will store the amount of XP gained upon defeating Weezing
        int meowth_current_hp = 0; // Variable that will store Meowth's current HP
        int meowth_damage = 7; // Variable that will store Meowth's current damage
        final int meowth_xp_drop = 111; // Constant that will store the amount of XP gained from defeating Meowth
        final double attack_boost_multiplier = 2; // Constant that will store the attack boost damage multiplier
        final double defense_boost_multiplier = 2; // Constant that will store the defense boost defense multiplier
        final int potion_heal = 20; // Constant that will store the amount of HP gained from using a potion
        int attack_boost_counter = 0; // Variable that will store the amount of attack boosts the user has
        int defense_boost_counter = 0; // Variable that will store the amount of defense boosts the user has
        int potion_counter = 0; // Variable that will store the amount of potions the user has
        int level = 5; // Variable that will store the user's current level
        int total_xp_to_next_level = 42; // Variable that will store the amount of total XP needed to reach the next level
        final int level_xp_addition = 15; // Constant that will store the amount of extra XP added after leveling up
        int xp_required = 42; // Variable that will store the current amount of XP needed to level up
        int crit_hit = rand.nextInt(10); // Variable that will store a random number from 1-10 and will be used to determine a critical hit (10% chance)
        boolean poke_selection_is_done = false; // Variable that will be used to run the while loop in charge of getting the user to select a starter pokemon
        boolean defeat_rocket_choice = false; // Variable that will be used to run the while loop in charge of getting the user to defeat Team Rocket
        boolean is_ready_daniel = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Daniel
        boolean is_ready_kent = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Kent
        boolean is_ready_ryan = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Ryan
        boolean is_ready_steve = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Steve
        boolean is_ready_william = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with William
        boolean is_ready_lucas = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Lucas
        boolean is_ready_jacob = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Jacob
        boolean is_ready_david = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with David
        boolean is_ready_jessie = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with Jessie
        boolean is_ready_james = false; // Variable that will be used to run the while loop in charge of getting the user to begin the fight with James
        boolean move_is_valid = false; // Variable that will be used to run the while loop in charge of getting the user to select a valid turn choice

        // I need 2 so that the game doesn't stop every time it reaches these while loops and can just continue if the game is not finished
        boolean not_play_again = true; // Variable that will be used to run the while loop in charge of deciding whether the user wants to play again or not
        boolean game_over = false; // Variable that will be used to run the while loop in charge of deciding whether the user wants to play again or not

            while(!game_over)
            { // Start of game loop
                // Reset all variables necessary in the game loop
                username = null;
                user_pokemon = null;
                defeat_team_rocket_response = null;
                ready_daniel_choice = null;
                ready_kent_choice = null;
                ready_ryan_choice = null;
                ready_steve_choice = null;
                ready_william_choice = null;
                ready_lucas_choice = null;
                ready_jacob_choice = null;
                ready_david_choice = null;
                ready_jessie_choice = null;
                ready_james_choice = null;
                enemy = null;
                user_turn = null;
                play_again_response = null;
                rattata_damage = 3;
                ekans_damage = 4;
                gastly_damage = 3;
                zubat_damage = 4;
                koffing_damage = 5;
                machop_damage = 6;
                sandshrew_damage = 6;
                grimer_damage = 5;
                arbok_damage = 8;
                wobbuffet_damage = 7;
                muk_damage = 6;
                weezing_damage = 7;
                meowth_damage = 7;
                user_max_hp = 0;
                user_current_hp = 0;
                user_base_damage = 0;
                user_damage = 0;
                level = 5;
                xp_required = 42;
                total_xp_to_next_level = 42;
                poke_selection_is_done = false;
                defeat_rocket_choice = false;
                is_ready_daniel = false;
                is_ready_kent = false;
                is_ready_ryan = false;
                is_ready_steve = false;
                is_ready_william = false;
                is_ready_lucas = false;
                is_ready_jacob = false;
                is_ready_david = false;
                is_ready_jessie = false;
                is_ready_james = false;
                move_is_valid = false;
                not_play_again = true;
                game_over = false;

                System.out.format("%s","Please enter your name [1 word]: "); // Ask user for username
                username = scan.next(); // Store their username under username variable

                // Storyline
                System.out.format("%s %s! %n", "Welcome to the world of Pokemon,", username);
                System.out.format("%s%n","This is a very peaceful world where humans can live alongside their pokemon.");
                System.out.format("%s%n","It is common for people to train their pokemon and challenge them in friendly battles!");
                System.out.format("%s%n","However, a group called Team Rocket is disrupting this peace and is trying to steal people's pokemon.");

                System.out.format("%n%s","Can you please defeat them and restore peace in our world? [Y/N]: "); // Ask user if they can defeat Team Rocket

                    while (!defeat_rocket_choice) // Will force user to say yes
                    { // Start of loop
                        defeat_team_rocket_response = scan.next(); // Store their response under defeat_team_rocket_response variable
                            if (defeat_team_rocket_response.equalsIgnoreCase("y"))
                                defeat_rocket_choice = true; // Break the loop if they answer yes
                            else
                                System.out.format("%s %s! %s", "But please, we need your help", username, "[Y/N]: "); // Ask them to help again
                    } // End of loop


                // Storyline
                System.out.format("%n%s%n","Awesome, You'll do great!");

                System.out.println("I have 3 pokemon that you may choose from: Charmander, " +
                        "a high damage but lower HP starter. \nI have Squirtle, a lower damage but " +
                        "higher HP starter. And finally, I have Bulbasaur, the lowest damage starter but very high HP");
                System.out.format("%n%s %s", "Please select your starter:", "[Charmander, Squirtle, or Bulbasaur]: "); // Ask user to select a starter pokemon

                    while (!poke_selection_is_done) // Will force user to enter a valid starter pokemon
                    { // Start of starter selection loop
                        user_pokemon = scan.next(); // Store user's input under user_pokemon variable
                            if (user_pokemon.equalsIgnoreCase("charmander"))
                            { // Start of true branch
                                user_pokemon = "Charmander"; // Make the user's pokemon "Charmander" mainly for fights
                                user_max_hp = charmander_max_hp; // Set the user's max HP to Charmander's max HP
                                user_base_damage = charmander_damage; // Set the user's base damage to Charmander's damage
                                poke_selection_is_done = true; // Break the loop as the starter pokemon is valid
                                System.out.format("%n%s %s. %s %s! %n", "Ah,", user_pokemon, "Interesting choice", username); // Storyline
                            } // End of true branch
                            else if (user_pokemon.equalsIgnoreCase("squirtle"))
                            { // Start of true branch
                                user_pokemon = "Squirtle"; // Make the user's pokemon "Squirtle" mainly for fights
                                user_max_hp = squirtle_max_hp; // Set the user's max HP to Squirtle's max HP
                                user_base_damage = squirtle_damage; // Set the user's base damage to Squirtle's damage
                                poke_selection_is_done = true; // Break the loop as the starter pokemon is valid
                                System.out.format("%n%s %s. %s %s! %n", "Ah,", user_pokemon, "Good choice", username); // Storyline
                            } // End of true branch
                            else if (user_pokemon.equalsIgnoreCase("bulbasaur"))
                            { // Start of true branch
                                user_pokemon = "Bulbasaur"; // Make the user's pokemon "Bulbasaur" mainly for fights
                                user_max_hp = bulbasaur_max_hp; // Set the user'a max HP to Squirtle's max HP
                                user_base_damage = bulbasaur_damage; // Set the user's base damage to Squirtle's damage
                                poke_selection_is_done = true; // Break the loop as the starter pokemon is valid
                                System.out.format("%n%s %s. %s %s! %n", "Ah,", user_pokemon, "Wise choice", username); // Storyline
                            } // End of true branch
                            else // If their starter selection was invalid
                                System.out.format("%s %s", "Please select a valid starter:", "[Charmander, Squirtle, or Bulbasaur]: "); // Ask user to select a valid starter
                    } // End of starter selection loop

                System.out.format("%s", "Watch out! Team Rocket Grunt Daniel is approaching you, are you ready to fight? [Y/N]: "); // Ask the user if they're ready to fight Grunt Daniel

                    while (!is_ready_daniel)
                    { // Start of ready to fight Daniel loop
                        ready_daniel_choice = scan.next(); // Store user's response under ready_daniel_choice variable
                            if (ready_daniel_choice.equalsIgnoreCase("y"))
                                is_ready_daniel = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.format("%s%n","A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.format("%s","Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Daniel loop

                System.out.format("%n%s","Team Rocket Grunt Daniel sent out a level 3 Rattata."); // Inform the user that Daniel sent out Rattata

                user_current_hp = user_max_hp; // Set the user's current HP to their max HP
                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                rattata_current_hp = rattata_max_hp; // Set Rattata's current HP to its max HP
                enemy = "Rattata"; // Set the enemy String to "Rattata"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Daniel");
                        System.out.println(enemy + " Lvl " + 3);
                        System.out.println(rattata_current_hp + " / " + rattata_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                if (user_turn.equalsIgnoreCase("attack"))
                                { // Start of true branch
                                        if (crit_hit == 5) // Check if the random number is 5, and will be a critical hit (10% chance)
                                        { // Start of true branch
                                            rattata_current_hp = rattata_current_hp - (user_damage * crit_damage_multiplier); // Rattata takes double damage
                                            System.out.format("%s%n","Critical hit, double the damage!"); // Output Critical hit message
                                        } // End of true branch
                                        else
                                        { // If it wasn't a crit hit
                                            rattata_current_hp -= user_damage; // Rattata is attacked and loses HP equal to user's damage
                                            System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                        } // End of normal hit
                                    move_is_valid = true; // Break the move is valid loop
                                } // End of true branch
                                else if (user_turn.equalsIgnoreCase("potion"))
                                { // Start of true branch
                                        if (potion_counter == 0)
                                        { // Start of true branch
                                            System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                            System.out.format("%s","Please select another move: "); // Ask them to select another move
                                        } // End of true branch
                                        else if (user_current_hp == user_max_hp)
                                        { // Start of true branch
                                            System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                            System.out.format("%s","Please select another move: "); // Ask them to select another move
                                        } // End of true branch
                                        else if ((user_current_hp + potion_heal) > user_max_hp)
                                        { // Start of true branch
                                            user_current_hp = user_max_hp; // Set the current HP to the max HP
                                            potion_counter--; // Remove 1 from the total amount of potions
                                            System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                            move_is_valid = true; // break the move is valid loop
                                        } // End of true branch
                                        else
                                        { // Start of normal heal
                                            user_current_hp += potion_heal; // Increase the user's current HP by 20
                                            potion_counter--; // Remove 1 from the total amount of potions
                                            System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                            move_is_valid = true; // break the move is valid loop
                                        } // End of normal heal
                                } // End of true branch
                                else if (user_turn.equalsIgnoreCase("attboost"))
                                { // Start of true branch
                                        if (attack_boost_counter == 0)
                                        { // Start of true branch
                                            System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                            System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                        } // End of true branch
                                        else
                                        { // Start of normal attack boost usage
                                            user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                            attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                            System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                            move_is_valid = true; // Break the move is valid loop
                                        } // End of normal attack boost usage
                                } // End of true branch
                                else if (user_turn.equalsIgnoreCase("defboost"))
                                { // Start of true branch
                                        if (defense_boost_counter == 0)
                                        { // Start of true branch
                                            System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                            System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                        } // End of true branch
                                        else
                                        { // Start of normal defense boost usage
                                            rattata_damage /= defense_boost_multiplier; // Divide Rattata's damage by 2
                                            defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                            System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                            move_is_valid = true; // Break the move is valid loop
                                        } // End of normal defense boost usage
                                } // End of true branch
                                else
                                    System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (rattata_current_hp <= 0)
                            { // Start of true branch
                                rattata_current_hp = 0; // Set Rattata's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Daniel");
                                System.out.println(enemy + " Lvl " + 3);
                                System.out.println(rattata_current_hp + " / " + rattata_max_hp);
                                System.out.format("%n%s%n","The foe Rattata fainted!"); // Tell the user that the Rattata fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Daniel");
                        System.out.println(enemy + " Lvl " + 3);
                        System.out.println(rattata_current_hp + " / " + rattata_max_hp);
                        System.out.println("");

                        user_current_hp -= rattata_damage; // Lose HP equivalent to Rattata's damage
                        System.out.println("Rattata attacked and dealt " + rattata_damage + " damage."); // Tell the user that they got hit by Rattata and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Daniel");
                                System.out.println(enemy + " Lvl " + 3);
                                System.out.println(rattata_current_hp + " / " + rattata_max_hp);
                                System.out.println("");

                                System.out.println("You have fainted!"); // Tell user they fainted
                                System.out.print("Would you like to play again? [Y/N]: "); // Ask them if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt Daniel!"); // Tell the user they defeated Daniel

                    if(rattata_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (rattata_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + rattata_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= rattata_xp_drop; // Subtract the Rattata XP drop from the xp required
                        System.out.println("You have gained " + rattata_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                attack_boost_counter++; // Give the user an attack boost
                defense_boost_counter++; // Give the user a defense boost
                System.out.format("%s%n%n","You obtained 1 potion, 1 attack boost, and 1 defence boost!"); // Tell the user they have gained a potion, an attack boost, and a defense boost

                System.out.print("Congratulations on winning your first pokemon battle! However, don't get cocky now, Team Rocket Grunt Kent is approaching you, are you ready to fight? [Y/N]: "); // Ask if they are ready to fight Kent

                    while (!is_ready_kent)
                    { // Start of ready to fight Kent loop
                        ready_kent_choice = scan.next(); // Store response under ready_kent_choice
                            if (ready_kent_choice.equalsIgnoreCase("y"))
                                is_ready_kent = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Kent loop

                System.out.println("");
                System.out.println("Team Rocket Grunt Kent sent out a level 4 Ekans."); // Inform the user that Kent sent out Ekans

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                ekans_current_hp = ekans_max_hp; // Set Ekans' current HP to its max HP
                enemy = "Ekans"; // Set the enemy String to "Ekans"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Kent");
                        System.out.println(enemy + " Lvl " + 4);
                        System.out.println(ekans_current_hp + " / " + ekans_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                ekans_current_hp = ekans_current_hp - (user_damage * crit_damage_multiplier); // Ekans takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                ekans_current_hp -= user_damage; // Ekans is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                ekans_damage /= defense_boost_multiplier; // Divide Ekans' damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (ekans_current_hp <= 0)
                            { // Start of true branch
                                ekans_current_hp = 0; // Set Ekans' HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Kent");
                                System.out.println(enemy + " Lvl " + 4);
                                System.out.println(ekans_current_hp + " / " + ekans_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Ekans fainted!"); // Tell the user that the Ekans fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Kent");
                        System.out.println(enemy + " Lvl " + 4);
                        System.out.println(ekans_current_hp + " / " + ekans_max_hp);
                        System.out.println("");

                        user_current_hp -= ekans_damage; // Lose HP equivalent to Ekans' damage
                        System.out.println("Ekans attacked and dealt " + ekans_damage + " damage."); // Tell the user that they got hit by Ekans and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Kent");
                                System.out.println(enemy + " Lvl " + 4);
                                System.out.println(ekans_current_hp + " / " + ekans_max_hp);
                                System.out.println("");

                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop
                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt Kent!"); // Tell the user they defeated Kent

                    if(ekans_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (ekans_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + ekans_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= ekans_xp_drop; // Subtract the Ekans XP drop from the xp required
                        System.out.println("You have gained " + ekans_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.print("Congratulations on defeating Grunt Kent, however, don't get cocky now because Team Rocket Grunt Ryan is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_ryan)
                    { // Start of ready to fight Ryan loop
                        ready_ryan_choice = scan.next(); // Store response under ready_ryan_choice
                            if (ready_ryan_choice.equalsIgnoreCase("y"))
                                is_ready_ryan = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Ryan loop


                System.out.format("%n%s","Team Rocket Grunt Ryan sent out a level 4 Gastly."); // Inform the user that Ryan sent out Gastly

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                gastly_current_hp = gastly_max_hp; // Set Gastly's current HP to its max HP
                enemy = "Gastly"; // Set the enemy String to "Gastly"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Ryan");
                        System.out.println(enemy + " Lvl " + 4);
                        System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                gastly_current_hp = gastly_current_hp - (user_damage * crit_damage_multiplier); // Gastly takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                gastly_current_hp -= user_damage; // Gastly is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                gastly_damage /= defense_boost_multiplier; // Divide Gastly's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (gastly_current_hp <= 0)
                            { // Start of true branch
                                gastly_current_hp = 0; // Set Gastly's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Ryan");
                                System.out.println(enemy + " Lvl " + 4);
                                System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                                System.out.println("");

                                System.out.format("%n%s%n","The foe Gastly fainted!"); // Tell the user that the Gastly fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Ryan");
                        System.out.println(enemy + " Lvl " + 4);
                        System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                        System.out.println("");

                        user_current_hp -= gastly_damage; // Lose HP equivalent to Gastly's damage
                        System.out.println("Gastly attacked and dealt " + gastly_damage + " damage."); // Tell the user that they got hit by Gastly and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Ryan");
                                System.out.println(enemy + " Lvl " + 4);
                                System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                                System.out.println("");

                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(gastly_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (gastly_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + gastly_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= gastly_xp_drop; // Subtract the Gastly XP drop from the xp required
                        System.out.println("You have gained " + gastly_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                System.out.println("Team Rocket Grunt Ryan sent out another level 4 Gastly!"); // Inform the user that Ryan sent out another Gastly

                gastly_current_hp = gastly_max_hp; // Set Gastly's current HP to its max HP
                enemy = "Gastly"; // Set the enemy String to "Gastly"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Ryan");
                        System.out.println(enemy + " Lvl " + 4);
                        System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                gastly_current_hp = gastly_current_hp - (user_damage * crit_damage_multiplier); // Gastly takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                gastly_current_hp -= user_damage; // Gastly is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                gastly_damage /= defense_boost_multiplier; // Divide Gastly's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (gastly_current_hp <= 0)
                            { // Start of true branch
                                gastly_current_hp = 0; // Set Gastly's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Ryan");
                                System.out.println(enemy + " Lvl " + 4);
                                System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Gastly fainted!"); // Tell the user that the Gastly fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Ryan");
                        System.out.println(enemy + " Lvl " + 4);
                        System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                        System.out.println("");

                        user_current_hp -= gastly_damage; // Lose HP equivalent to Gastly's damage
                        System.out.println("Gastly attacked and dealt " + gastly_damage + " damage."); // Tell the user that they got hit by Gastly and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Ryan");
                                System.out.println(enemy + " Lvl " + 4);
                                System.out.println(gastly_current_hp + " / " + gastly_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt Ryan!"); // Tell the user they defeated Ryan

                    if(gastly_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (gastly_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + gastly_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= gastly_xp_drop; // Subtract the Gastly XP drop from the xp required
                        System.out.println("You have gained " + gastly_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.print("Congratulations on defeating Grunt Ryan, however, don't get cocky now because Team Rocket Grunt Steve is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_steve)
                    { // Start of ready to fight Steve loop
                        ready_steve_choice = scan.next(); // Store response under ready_steve_choice
                            if (ready_steve_choice.equalsIgnoreCase("y"))
                                is_ready_steve = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Steve loop

                System.out.println("");
                System.out.println("Team Rocket Grunt Steve sent out a level 5 Zubat."); // Inform the user that Steve sent out Zubat

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                zubat_current_hp = zubat_max_hp; // Set Zubat's current HP to its max HP
                enemy = "Zubat"; // Set the enemy String to "Zubat"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Steve");
                        System.out.println(enemy + " Lvl " + 5);
                        System.out.println(zubat_current_hp + " / " + zubat_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                zubat_current_hp = zubat_current_hp - (user_damage * crit_damage_multiplier); // Zubat takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                zubat_current_hp -= user_damage; // Zubat is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                zubat_damage /= defense_boost_multiplier; // Divide Zubat's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (zubat_current_hp <= 0)
                            { // Start of true branch
                                zubat_current_hp = 0; // Set Zubat's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Steve");
                                System.out.println(enemy + " Lvl " + 5);
                                System.out.println(zubat_current_hp + " / " + zubat_max_hp);
                                System.out.println("");

                                System.out.format("%n%s%n","The foe Zubat fainted!"); // Tell the user that the Zubat fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Steve");
                        System.out.println(enemy + " Lvl " + 5);
                        System.out.println(zubat_current_hp + " / " + zubat_max_hp);
                        System.out.println("");

                        user_current_hp -= zubat_damage; // Lose HP equivalent to Zubat's damage
                        System.out.println("Zubat attacked and dealt " + zubat_damage + " damage."); // Tell the user that they got hit by Zubat and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Steve");
                                System.out.println(enemy + " Lvl " + 5);
                                System.out.println(zubat_current_hp + " / " + zubat_max_hp);
                                System.out.println("");

                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt Steve!"); // Tell the user they defeated Steve

                    if(zubat_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (zubat_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + zubat_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= zubat_xp_drop; // Subtract the Zubat XP drop from the xp required
                        System.out.println("You have gained " + zubat_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.print("Congratulations on defeating Grunt Steve, however, don't get cocky now because Team Rocket Grunt William is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_william)
                    { // Start of ready to fight William loop
                        ready_william_choice = scan.next(); // Store response under ready_william_choice
                            if (ready_william_choice.equalsIgnoreCase("y"))
                                is_ready_william = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight William loop

                System.out.println("");
                System.out.println("Team Rocket Grunt William sent out a level 6 Koffing."); // Inform the user that William sent out Koffing

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                koffing_current_hp = koffing_max_hp; // Set Koffing's current HP to its max HP
                enemy = "Koffing"; // Set the enemy String to "Koffing"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt William");
                        System.out.println(enemy + " Lvl " + 6);
                        System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                koffing_current_hp = koffing_current_hp - (user_damage * crit_damage_multiplier); // Koffing takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                koffing_current_hp -= user_damage; // Koffing is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                koffing_damage /= defense_boost_multiplier; // Divide Koffing's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (koffing_current_hp <= 0)
                            { // Start of true branch
                                koffing_current_hp = 0; // Set Koffing's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt William");
                                System.out.println(enemy + " Lvl " + 6);
                                System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Koffing fainted!"); // Tell the user that the Koffing fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt William");
                        System.out.println(enemy + " Lvl " + 6);
                        System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                        System.out.println("");

                        user_current_hp -= koffing_damage; // Lose HP equivalent to Koffing's damage
                        System.out.println("Koffing attacked and dealt " + koffing_damage + " damage."); // Tell the user that they got hit by Koffing and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt William");
                                System.out.println(enemy + " Lvl " + 6);
                                System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(koffing_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (koffing_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + koffing_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= koffing_xp_drop; // Subtract the Koffing XP drop from the xp required
                        System.out.println("You have gained " + koffing_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.print("Congratulations on defeating Grunt William, however, don't get cocky now because Team Rocket Grunt Lucas is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_lucas)
                    { // Start of ready to fight Lucas loop
                        ready_lucas_choice = scan.next(); // Store response under ready_lucas_choice
                            if (ready_lucas_choice.equalsIgnoreCase("y"))
                                is_ready_lucas = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Lucas loop

                System.out.println("");
                System.out.println("Team Rocket Grunt Lucas sent out a level 6 Machop."); // Inform the user that Lucas sent out Machop

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                machop_current_hp = machop_max_hp; // Set Machop's current HP to its max HP
                enemy = "Machop"; // Set the enemy String to "Machop"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Lucas");
                        System.out.println(enemy + " Lvl " + 6);
                        System.out.println(machop_current_hp + " / " + machop_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                machop_current_hp = machop_current_hp - (user_damage * crit_damage_multiplier); // Machop takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                machop_current_hp -= user_damage; // Machop is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                machop_damage /= defense_boost_multiplier; // Divide Machop's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (machop_current_hp <= 0)
                            { // Start of true branch
                                machop_current_hp = 0; // Set Machop's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Lucas");
                                System.out.println(enemy + " Lvl " + 6);
                                System.out.println(machop_current_hp + " / " + machop_max_hp);
                                System.out.println("");

                                System.out.format("%n%s%n","The foe Machop fainted!"); // Tell the user that the Machop fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Steve");
                        System.out.println(enemy + " Lvl " + 6);
                        System.out.println(machop_current_hp + " / " + machop_max_hp);
                        System.out.println("");

                        user_current_hp -= machop_damage; // Lose HP equivalent to Machop's damage
                        System.out.println("Machop attacked and dealt " + machop_damage + " damage."); // Tell the user that they got hit by Machop and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Lucas");
                                System.out.println(enemy + " Lvl " + 6);
                                System.out.println(machop_current_hp + " / " + machop_max_hp);
                                System.out.println("");

                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt Lucas!"); // Tell the user they defeated Lucas

                    if(machop_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (machop_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + machop_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= machop_xp_drop; // Subtract the Machop XP drop from the xp required
                        System.out.println("You have gained " + machop_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.print("Congratulations on defeating Grunt Lucas, however, don't get cocky now because Team Rocket Grunt Jacob is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_jacob)
                    { // Start of ready to fight Jacob loop
                        ready_jacob_choice = scan.next(); // Store response under ready_jacob_choice
                            if (ready_jacob_choice.equalsIgnoreCase("y"))
                                is_ready_jacob = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Jacob loop

                System.out.println("");
                System.out.println("Team Rocket Grunt Jacob sent out a level 6 Koffing."); // Inform the user that Jacob sent out Koffing

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                koffing_damage = koffing_base_damage; // Set Koffing's damage back to his base damage in case the user used a defense boost in the last battle
                koffing_current_hp = koffing_max_hp; // Set Koffing's current HP to its max HP
                enemy = "Koffing"; // Set the enemy String to "Koffing"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Jacob");
                        System.out.println(enemy + " Lvl " + 6);
                        System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                koffing_current_hp = koffing_current_hp - (user_damage * crit_damage_multiplier); // Koffing takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                koffing_current_hp -= user_damage; // Koffing is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                koffing_damage /= defense_boost_multiplier; // Divide Koffing's damage by 2
                                                sandshrew_damage /= defense_boost_multiplier; // Divide Sandshrew's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (koffing_current_hp <= 0)
                            { // Start of true branch
                                koffing_current_hp = 0; // Set Koffing's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Jacob");
                                System.out.println(enemy + " Lvl " + 6);
                                System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                                System.out.println("");

                                System.out.format("%n%s%n","The foe Koffing fainted!"); // Tell the user that the Koffing fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Jacob");
                        System.out.println(enemy + " Lvl " + 6);
                        System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                        System.out.println("");

                        user_current_hp -= koffing_damage; // Lose HP equivalent to Koffing's damage
                        System.out.println("Koffing attacked and dealt " + koffing_damage + " damage."); // Tell the user that they got hit by Koffing and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Jacob");
                                System.out.println(enemy + " Lvl " + 6);
                                System.out.println(koffing_current_hp + " / " + koffing_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    }// End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(koffing_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (koffing_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + koffing_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= koffing_xp_drop; // Subtract the Koffing XP drop from the xp required
                        System.out.println("You have gained " + koffing_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                System.out.println("Team Rocket Grunt Jacob sent out a level 7 Sandshrew!"); // Inform the user that Jacob sent out Sandshrew

                sandshrew_current_hp = sandshrew_max_hp; // Set Sandshrew's current HP to its max HP
                enemy = "Sandshrew"; // Set the enemy String to "Sandshrew"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Jacob");
                        System.out.println(enemy + " Lvl " + 7);
                        System.out.println(sandshrew_current_hp + " / " + sandshrew_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                sandshrew_current_hp = sandshrew_current_hp - (user_damage * crit_damage_multiplier); // Sandshrew takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                sandshrew_current_hp -= user_damage; // Sandshrew is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                sandshrew_damage /= defense_boost_multiplier; // Divide Sandshrew's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (sandshrew_current_hp <= 0)
                            { // Start of true branch
                                sandshrew_current_hp = 0; // Set Sandshrew's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Jacob");
                                System.out.println(enemy + " Lvl " + 7);
                                System.out.println(sandshrew_current_hp + " / " + sandshrew_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Sandshrew fainted!"); // Tell the user that the Sandshrew fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt Jacob");
                        System.out.println(enemy + " Lvl " + 7);
                        System.out.println(sandshrew_current_hp + " / " + sandshrew_max_hp);
                        System.out.println("");

                        user_current_hp -= sandshrew_damage; // Lose HP equivalent to Sandshrew's damage
                        System.out.println("Sandshrew attacked and dealt " + sandshrew_damage + " damage."); // Tell the user that they got hit by Sandshrew and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt Jacob");
                                System.out.println(enemy + " Lvl " + 7);
                                System.out.println(sandshrew_current_hp + " / " + sandshrew_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt Jacob!"); // Tell the user they defeated Jacob

                    if(sandshrew_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (sandshrew_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + sandshrew_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= sandshrew_xp_drop; // Subtract the Sandshrew XP drop from the xp required
                        System.out.println("You have gained " + sandshrew_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.print("Congratulations on defeating Grunt Jacob, however, don't get cocky now because Team Rocket Grunt David is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_david)
                    { // Start of ready to fight David loop
                        ready_david_choice = scan.next(); // Store response under ready_david_choice
                            if (ready_david_choice.equalsIgnoreCase("y"))
                                is_ready_david = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight David loop

                System.out.println("");
                System.out.println("Team Rocket Grunt David sent out a level 8 Grimer."); // Inform the user that David sent out Grimer

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                grimer_current_hp = grimer_max_hp; // Set Grimer's current HP to its max HP
                enemy = "Grimer"; // Set the enemy String to "Grimer"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt David");
                        System.out.println(enemy + " Lvl " + 8);
                        System.out.println(grimer_current_hp + " / " + grimer_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                grimer_current_hp = grimer_current_hp - (user_damage * crit_damage_multiplier); // Grimer takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                grimer_current_hp -= user_damage; // Grimer is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    }
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    }
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                grimer_damage /= defense_boost_multiplier; // Divide Grimer's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (grimer_current_hp <= 0)
                            { // Start of true branch
                                grimer_current_hp = 0; // Set Grimer's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt David");
                                System.out.println(enemy + " Lvl " + 8);
                                System.out.println(grimer_current_hp + " / " + grimer_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Grimer fainted!"); // Tell the user that the Grimer fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Grunt David");
                        System.out.println(enemy + " Lvl " + 8);
                        System.out.println(grimer_current_hp + " / " + grimer_max_hp);
                        System.out.println("");

                        user_current_hp -= grimer_damage; // Lose HP equivalent to Grimer's damage
                        System.out.println("Grimer attacked and dealt " + grimer_damage + " damage."); // Tell the user that they got hit by Grimer and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Grunt David");
                                System.out.println(enemy + " Lvl " + 8);
                                System.out.println(grimer_current_hp + " / " + grimer_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Grunt David!"); // Tell the user they defeated David

                    if(grimer_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (grimer_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + grimer_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= grimer_xp_drop; // Subtract the Grimer XP drop from the xp required
                        System.out.println("You have gained " + grimer_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                System.out.format("%s%n%n","You obtained 1 potion!"); // Tell the user they obtained a potion

                System.out.format("%s %n%s %n%n %s","Congratulations on defeating Grunt David!", "You are coming closer to defeating Team Rocket!", "Team Rocket Jessie is approaching you, are you ready to fight? [Y/N]: ");

                    while (!is_ready_jessie)
                    { // Start of ready to fight Jessie loop
                        ready_jessie_choice = scan.next(); // Store response under ready_jessie_choice
                            if (ready_jessie_choice.equalsIgnoreCase("y"))
                                is_ready_jessie = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight Jessie loop

                System.out.println("");
                System.out.println("Team Rocket Jessie sent out a level 9 Arbok."); // Inform the user that Jessie sent out Arbok

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                arbok_current_hp = arbok_max_hp; // Set Arbok's current HP to its max HP
                enemy = "Arbok"; // Set the enemy String to "Arbok"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Jessie");
                        System.out.println(enemy + " Lvl " + 9);
                        System.out.println(arbok_current_hp + " / " + arbok_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                arbok_current_hp = arbok_current_hp - (user_damage * crit_damage_multiplier); // Arbok takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                arbok_current_hp -= user_damage; // Arbok is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                arbok_damage /= defense_boost_multiplier; // Divide Arbok's damage by 2
                                                wobbuffet_damage /= defense_boost_multiplier; // Divide Wobbuffet's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (arbok_current_hp <= 0)
                            { // Start of true branch
                                arbok_current_hp = 0; // Set Arbok's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Jessie");
                                System.out.println(enemy + " Lvl " + 9);
                                System.out.println(arbok_current_hp + " / " + arbok_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Arbok fainted!"); // Tell the user that the Arbok fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Jessie");
                        System.out.println(enemy + " Lvl " + 9);
                        System.out.println(arbok_current_hp + " / " + arbok_max_hp);
                        System.out.println("");

                        user_current_hp -= arbok_damage; // Lose HP equivalent to Arbok's damage
                        System.out.println("Arbok attacked and dealt " + arbok_damage + " damage."); // Tell the user that they got hit by Arbok and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Jessie");
                                System.out.println(enemy + " Lvl " + 9);
                                System.out.println(arbok_current_hp + " / " + arbok_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(arbok_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (arbok_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + arbok_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= arbok_xp_drop; // Subtract the Arbok XP drop from the xp required
                        System.out.println("You have gained " + arbok_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                System.out.format("%s %n %n", "Team Rocket Jessie sent out a level 10 Wobbuffet!"); // Inform the user that Jessie sent out Wobbuffet

                wobbuffet_current_hp = wobbuffet_max_hp; // Set Wobbuffet's current HP to its max HP
                enemy = "Wobbuffet"; // Set the enemy String to "Wobbuffet"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Jessie");
                        System.out.println(enemy + " Lvl " + 10);
                        System.out.println(wobbuffet_current_hp + " / " + wobbuffet_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                wobbuffet_current_hp = wobbuffet_current_hp - (user_damage * crit_damage_multiplier); // Wobbuffet takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                wobbuffet_current_hp -= user_damage; // Wobbuffet is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                wobbuffet_damage /= defense_boost_multiplier; // Divide Wobbuffet's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (wobbuffet_current_hp <= 0)
                            { // Start of true branch
                                wobbuffet_current_hp = 0; // Set Wobbuffet's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Jessie");
                                System.out.println(enemy + " Lvl " + 10);
                                System.out.println(wobbuffet_current_hp + " / " + wobbuffet_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Wobbuffet fainted!"); // Tell the user that the Wobbuffet fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket Jessie");
                        System.out.println(enemy + " Lvl " + 10);
                        System.out.println(wobbuffet_current_hp + " / " + wobbuffet_max_hp);
                        System.out.println("");

                        user_current_hp -= wobbuffet_damage; // Lose HP equivalent to Wobbuffet's damage
                        System.out.println("Wobbuffet attacked and dealt " + wobbuffet_damage + " damage."); // Tell the user that they got hit by Wobbuffet and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket Jessie");
                                System.out.println(enemy + " Lvl " + 10);
                                System.out.println(wobbuffet_current_hp + " / " + wobbuffet_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                System.out.println("You defeated Team Rocket Jessie!"); // Tell the user they defeated Jessie

                    if(wobbuffet_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (wobbuffet_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + wobbuffet_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= wobbuffet_xp_drop; // Subtract the Wobbuffet XP drop from the xp required
                        System.out.println("You have gained " + wobbuffet_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                potion_counter++; // Give the user a potion
                attack_boost_counter++; // Give the user an attack boost
                defense_boost_counter++; // Give the user a defense boost
                System.out.format("%s%n%n","You obtained 1 potion, 1 attack boost, and 1 defense boost!"); // Tell the user they obtained a potion, an attack boost, and a defense boost


                System.out.format("%s%n %s", "You have reached the final boss fight: Team Rocket James!", "Are you ready to fight him and restore peace back to our world [Y/N]: ");

                    while (!is_ready_james)
                    { // Start of ready to fight James loop
                        ready_james_choice = scan.next(); // Store response under ready_james_choice
                            if (ready_james_choice.equalsIgnoreCase("y"))
                                is_ready_james = true; // Break loop, since their response is desired
                            else
                            { // If they entered anything other than y
                                System.out.println("A good trainer is always ready!"); // Let the user know they are a coward :)
                                System.out.print("Are you ready to fight? [Y/N]: "); // Ask them if they are ready to fight again
                            } // End of else branch
                    } // End of ready to fight James loop

                System.out.println("");
                System.out.println("Team Rocket James sent out a level 10 Muk."); // Inform the user that James sent out Muk

                user_damage = user_base_damage; // Set the user's damage to their base damage (reset)
                muk_current_hp = muk_max_hp; // Set Muk's current HP to its max HP
                enemy = "Muk"; // Set the enemy String to "Muk"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket James");
                        System.out.println(enemy + " Lvl " + 10);
                        System.out.println(muk_current_hp + " / " + muk_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                muk_current_hp = muk_current_hp - (user_damage * crit_damage_multiplier); // Muk takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                muk_current_hp -= user_damage; // Muk is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                muk_damage /= defense_boost_multiplier; // Divide Muk's damage by 2
                                                weezing_damage /= defense_boost_multiplier; // Divide Weezing's damage by 2
                                                meowth_damage /= defense_boost_multiplier; // Divide Meowth's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (muk_current_hp <= 0)
                            { // Start of true branch
                                muk_current_hp = 0; // Set Muk's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket James");
                                System.out.println(enemy + " Lvl " + 10);
                                System.out.println(muk_current_hp + " / " + muk_max_hp);
                                System.out.println("");

                                System.out.format("%n%s%n","The foe Muk fainted!"); // Tell the user that the Muk fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket James");
                        System.out.println(enemy + " Lvl " + 10);
                        System.out.println(muk_current_hp + " / " + muk_max_hp);
                        System.out.println("");

                        user_current_hp -= muk_damage; // Lose HP equivalent to Muk's damage
                        System.out.println("Muk attacked and dealt " + muk_damage + " damage."); // Tell the user that they got hit by Muk and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket James");
                                System.out.println(enemy + " Lvl " + 10);
                                System.out.println(muk_current_hp + " / " + muk_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(muk_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (muk_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + muk_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= muk_xp_drop; // Subtract the Muk XP drop from the xp required
                        System.out.println("You have gained " + muk_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                System.out.format("%s %n %n", "Team Rocket James sent out a level 10 Weezing!"); // Inform the user that James sent out Weezing

                weezing_current_hp = weezing_max_hp; // Set Weezing's current HP to its max HP
                enemy = "Weezing"; // Set the enemy String to "Weezing"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket James");
                        System.out.println(enemy + " Lvl " + 10);
                        System.out.println(weezing_current_hp + " / " + weezing_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                weezing_current_hp = weezing_current_hp - (user_damage * crit_damage_multiplier); // Weezing takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                weezing_current_hp -= user_damage; // Weezing is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                weezing_damage /= defense_boost_multiplier; // Divide Weezing's damage by 2
                                                meowth_damage /= defense_boost_multiplier; // Divide Meowth's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (weezing_current_hp <= 0)
                            { // Start of true branch
                                weezing_current_hp = 0; // Set Weezing's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket James");
                                System.out.println(enemy + " Lvl " + 10);
                                System.out.println(weezing_current_hp + " / " + weezing_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Weezing fainted!"); // Tell the user that the Weezing fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket James");
                        System.out.println(enemy + " Lvl " + 10);
                        System.out.println(weezing_current_hp + " / " + weezing_max_hp);
                        System.out.println("");

                        user_current_hp -= weezing_damage; // Lose HP equivalent to Weezing's damage
                        System.out.println("Weezing attacked and dealt " + weezing_damage + " damage."); // Tell the user that they got hit by Weezing and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0
                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket James");
                                System.out.println(enemy + " Lvl " + 10);
                                System.out.println(weezing_current_hp + " / " + weezing_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(weezing_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (weezing_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + weezing_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= weezing_xp_drop; // Subtract the Weezing XP drop from the xp required
                        System.out.println("You have gained " + weezing_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                System.out.format("%s %n %n", "Team Rocket James sent out a level 12 Meowth!"); // Inform the user that James sent out Meowth

                meowth_current_hp = meowth_max_hp; // Set Meowth's current HP to its max HP
                enemy = "Meowth"; // Set the enemy String to "Meowth"

                    while (true)
                    { // Start of fight loop
                        move_is_valid = false; // Set the move_is_valid variable to false so that the loop that checks if the move is valid can run again

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket James");
                        System.out.println(enemy + " Lvl " + 12);
                        System.out.println(meowth_current_hp + " / " + meowth_max_hp);
                        System.out.println("");

                        System.out.format("%s","What will you do? Type as shown: [Attack, Potion, Attboost, Defboost]: "); // Ask user for turn choice

                            while (!move_is_valid)
                            { // Start of move is valid loop
                                crit_hit = rand.nextInt(10); // Generate random number from 1-10
                                user_turn = scan.next(); // Store user's input under user_turn variable
                                    if (user_turn.equalsIgnoreCase("attack"))
                                    { // Start of true branch
                                            if (crit_hit == 5)
                                            { // Start of true branch
                                                meowth_current_hp = meowth_current_hp - (user_damage * crit_damage_multiplier); // Meowth takes double damage
                                                System.out.println("Critical hit, double the damage!"); // Output Critical hit message
                                            } // End of true branch
                                            else
                                            { // Start of normal attack
                                                meowth_current_hp -= user_damage; // Meowth is attacked and loses HP equal to user's damage
                                                System.out.format("%n%s %s %s%n","You attacked and dealt", user_damage, "damage."); // Inform the user that they attacked and did a certain amount of damage to the enemy
                                            } // End of normal attack
                                        move_is_valid = true; // Break the move is valid loop
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("potion"))
                                    { // Start of true branch
                                            if (potion_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no potions!"); // Tell the user they have no potions
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if (user_current_hp == user_max_hp)
                                            { // Start of true branch
                                                System.out.format("%s%n","Your HP is already full!"); // Tell the user that their HP is already full
                                                System.out.format("%s","Please select another move: "); // Ask them to select another move
                                            } // End of true branch
                                            else if ((user_current_hp + potion_heal) > user_max_hp)
                                            { // Start of true branch
                                                user_current_hp = user_max_hp; // Set the current HP to the max HP
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was fully restored!"); // Tell the user their HP was fully restored
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of true branch
                                            else
                                            { // Start of normal heal
                                                user_current_hp += potion_heal; // Increase the user's current HP by 20
                                                potion_counter--; // Remove 1 from the total amount of potions
                                                System.out.format("%s%n%n","Your HP was restored by 20!"); // Tell the user that their HP was restored by 20
                                                move_is_valid = true; // break the move is valid loop
                                            } // End of normal heal
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("attboost"))
                                    { // Start of true branch
                                            if (attack_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no attack boosts!"); // Tell the user they have no attack boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal attack boost usage
                                                user_damage *= attack_boost_multiplier; // Multiply the user's damage by 2
                                                attack_boost_counter--; // Remove 1 from the total amount of attack boosts
                                                System.out.format("%s%n%n","Your attack has been boosted by 2x"); // Tell the user that their attack has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal attack boost usage
                                    } // End of true branch
                                    else if (user_turn.equalsIgnoreCase("defboost"))
                                    { // Start of true branch
                                            if (defense_boost_counter == 0)
                                            { // Start of true branch
                                                System.out.format("%s%n","You have no defense boosts!"); // Tell the user they have no defense boosts
                                                System.out.format("%s","Please select another move: "); // Ask the user to select another move
                                            } // End of true branch
                                            else
                                            { // Start of normal defense boost usage
                                                weezing_damage /= defense_boost_multiplier; // Divide Weezing's damage by 2
                                                meowth_damage /= defense_boost_multiplier; // Divide Meowth's damage by 2
                                                defense_boost_counter--; // Remove 1 from the total amount of defense boosts
                                                System.out.format("%s%n%n","Your defence has been boosted by 2x"); // Tell the user their defense has been boosted by 2x
                                                move_is_valid = true; // Break the move is valid loop
                                            } // End of normal defense boost usage
                                    } // End of true branch
                                    else
                                        System.out.format("%s","Please make a move exactly as shown: "); // Tell the user to enter a move exactly as shown

                            } // End of move is valid loop

                            if (meowth_current_hp <= 0)
                            { // Start of true branch
                                meowth_current_hp = 0; // Set Meowth's HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket James");
                                System.out.println(enemy + " Lvl " + 12);
                                System.out.println(meowth_current_hp + " / " + meowth_max_hp);
                                System.out.println("");
                                System.out.format("%n%s%n","The foe Meowth fainted!"); // Tell the user that the Meowth fainted
                                break; // Break out of the fight loop
                            } // End of true branch

                        // Update Battle Information
                        System.out.format("%n%s%n",username);
                        System.out.println(user_pokemon + " Lvl " + level);
                        System.out.println(user_current_hp + " / " + user_max_hp);
                        System.out.println("XP until next level: " + xp_required);
                        System.out.println("");

                        System.out.println("Team Rocket James");
                        System.out.println(enemy + " Lvl " + 12);
                        System.out.println(meowth_current_hp + " / " + meowth_max_hp);
                        System.out.println("");

                        user_current_hp -= meowth_damage; // Lose HP equivalent to Meowth's damage
                        System.out.println("Meowth attacked and dealt " + meowth_damage + " damage."); // Tell the user that they got hit by Meowth and lost HP equivalent to its damage

                            if (user_current_hp <= 0)
                            { // Start of true branch
                                user_current_hp = 0; // Set the user HP to 0

                                // Update Battle Information
                                System.out.format("%n%s%n",username);
                                System.out.println(user_pokemon + " Lvl " + level);
                                System.out.println(user_current_hp + " / " + user_max_hp);
                                System.out.println("XP until next level: " + xp_required);
                                System.out.println("");

                                System.out.println("Team Rocket James");
                                System.out.println(enemy + " Lvl " + 12);
                                System.out.println(meowth_current_hp + " / " + meowth_max_hp);
                                System.out.println("");
                                System.out.format("%s%n%n","You have fainted!"); // Tell user they fainted
                                System.out.format("%s","Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                                play_again_response = scan.next(); // Get their response and store it under play_again_response
                                    if (play_again_response.equalsIgnoreCase("y"))
                                    { // Start of true branch
                                        not_play_again = false; // Set not_play_again to false
                                        game_over = false; // Set game_over to false
                                    } // End of true branch
                                    else
                                    { // Start of not play again branch
                                        not_play_again = true; // Set not_play_again to true
                                        game_over = true; // Set game_over to true
                                    } // End of not play again branch
                                break; // Break out of the fight loop
                            } // End of true branch
                    } // End of fight loop

                    if(!game_over && !not_play_again)
                        continue; // Go back to the start of the game loop
                    else if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

                    if(meowth_xp_drop >= xp_required)
                    { // Start of true branch
                        level++; // Increase the user's level by 1
                        user_max_hp += 5; // Add 5 to the user's max HP
                        user_current_hp += 5; // Add 5 to the user's current HP
                        user_base_damage++; // Add 1 to the user's base damage
                        total_xp_to_next_level += level_xp_addition; // Increase the total amount needed to level up to the next level
                        xp_required = total_xp_to_next_level - (meowth_xp_drop - xp_required); // Do the calculation for the new xp required amount
                        System.out.println("You have gained " + meowth_xp_drop + " XP!"); // Tell the user they have gained XP
                        System.out.format("%s%s%s%s%n%n", user_pokemon, " has leveled up to level ", level, "!"); // Tell the user they have leveled up to a new level
                    } // End of true branch
                    else
                    { // Start of normal XP gain branch
                        xp_required -= meowth_xp_drop; // Subtract the Meowth XP drop from the xp required
                        System.out.println("You have gained " + meowth_xp_drop + " XP!"); // Tell the user they have gained XP
                    } // End of normal XP gain branch

                System.out.println("Congratulations, you defeated Team Rocket and restored peace in the world of Pokemon!\n"); // Tell the user they defeated Team Rocket and restored peace in the world of pokemon

                System.out.print("Would you like to play again? [Y/N]: "); // Ask the user if they want to play again
                play_again_response = scan.next(); // Store their response under play_again_response

                    if (play_again_response.equalsIgnoreCase("y"))
                    { // Start of true branch
                        not_play_again = false; // Set not_play_again to false
                        game_over = false; // Set game_over to false
                    } // End of true branch
                    else
                    { // Start of not play again branch
                        not_play_again = true; // Set not_play_again to true
                        game_over = true; // Set game_over to true
                    } // End of not play again branch

                    if(game_over && not_play_again)
                        break; // Break out of the game loop (end program)

            } // End of game loop
    } // End of main method
} // End of PokemonMidtermCPT class





