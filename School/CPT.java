import java.util.Scanner; //import scanner

public class CPT
{//start of object

    public static void main(String[] args)
    {//start of program
        Scanner keyboard = new Scanner(System.in);
        //declare variables
        int loadout = 0;//var for combat level
        int combat_level = 0;//var for combat level
        int speed_level = 0;//var for speed level
        int stealth_level = 0;//var for stealth level
        String char_name = null;// var for charcter name
        int choice_1 = 0; //var for choices with numbers***
        String play_again = null;//var for play again answer
        String answer_1 = null; //var for first yes or no***
        boolean not_play = true;
        boolean game_is_over = false;

        do
        {
            loadout = 0;
            combat_level = 0;
            speed_level = 0;
            stealth_level = 0;
            char_name = null;
            choice_1 = 0;
            play_again = null;
            answer_1 = null;
            not_play = true;
            game_is_over = false;

                System.out.println ("Welcome to Kings Knight");
                System.out.println ("With each set of options death is always a possibility! Play smart, every question counts. (Hint: Use all advantages given)");
                System.out.println ("If you complete the full game on the first try you are an elite level player, or got lucky.");
                System.out.println ("Your King has fallen ill and requires you to retrieve the potion to heal him, do you have what it takes?");
                System.out.println ("Lets get started!");
                System.out.println ("\n");
                System.out.println ("Enter your characters name: ");
                char_name = keyboard.next();

                System.out.println ("Class 1 stats:");
                System.out.println ("combat = 5 (medium)\n" +
                        "speed = 5 (medium)\n" +
                        "stealth = 5 (medium)\n ");
                System.out.println ("Class 2 stats:");
                System.out.println ("combat = 7 (high)\n" +
                        "speed = 5 (medium)\n" +
                        "stealth = 3 (low)\n ");
                System.out.println ("Class 3 stats:");
                System.out.println ("combat = 5 (medium)\n" +
                        "speed = 3 (low)\n" +
                        "stealth = 7 (high)\n ");

                System.out.println ("Choose your class (1,2, or 3). If no class is chosen default will be assigned: ");
                loadout = keyboard.nextInt();

                if (loadout == 1)
                {
                    combat_level = 5;
                    speed_level = 5;
                    stealth_level = 5;
                    System.out.print ("combat = 5\n" +
                            "speed = 5\n" +
                            "stealth = 5 \n ");
                }
                else if (loadout == 2)
                {
                    combat_level = 7;
                    speed_level = 5;
                    stealth_level = 3;
                    System.out.print ("combat = 7\n" +
                            "speed = 5\n" +
                            "stealth = 3 \n ");
                }
                else if (loadout == 3)
                {
                    combat_level = 5;
                    speed_level = 3;
                    stealth_level = 7;
                    System.out.print ("combat = 5\n" +
                            "speed = 5\n" +
                            "stealth = 5 \n ");
                }
                else
                {
                    combat_level = 5;
                    speed_level = 5;
                    stealth_level = 5;
                    System.out.print ("combat = 5\n" +
                            "speed = 5\n" +
                            "stealth = 5 \n");
                }
                // *****choice 1
                System.out.println ("The first spot you come across is an apothecary along theside of the road. You approach.");
                System.out.println ("\n");
                System.out.println (char_name+": Hello witch, do you have the potion of life?");
                System.out.println ("Witch: I do brave knight, but if you want it, you must do something for me.");
                System.out.println ("Do you (1) help the witch or (2) threaten the witch (beware!! The Witch requires a large combat level): ");
                choice_1 = keyboard.nextInt();
                keyboard.nextLine();

                if (choice_1 == 2 && combat_level >= 7)
                {
                    System.out.println (char_name+": Never will I ever do work for magical scum, off with your head witch!");
                    System.out.println ("Witch: AHHHHH please don't");
                    System.out.println (char_name+": Tell me where the potion is! ");
                    System.out.println ("Witch: I don't have it! But I can make it from the flower of youth, if you retrieve it for me.");
                    System.out.println (char_name+": Fine, where am I heading.");
                    System.out.println ("Witch: Snothbroke City...");
                    System.out.println ("Take this speed potion, it may save your life. (Y/N");
                    answer_1 = keyboard.nextLine();

                    if (answer_1.equalsIgnoreCase("Y"))
                    {
                        speed_level = speed_level + 4;
                        System.out.println ("Oh wow, I feel amazing");
                        play_again = "n";// have to get out of the first do while loop so this does it.
                    }
                    else
                    {
                        System.out.println ("Sorry, but no thanks.");
                        play_again = "n";// have to get out of the first do while loop so this does it.
                    }

                }
                else if (choice_1 == 2 && combat_level < 7)
                {
                    System.out.println (char_name+": I asked you for the potion, I don't have time for this, now heads will roll!");
                    System.out.println ("Witch: Yes they shall, YOURS SHALL!");
                    System.out.println (char_name+": arggg, my heart is poundi-...");
                    System.out.println ("The Witch exploded your heart.");
                    System.out.println ("YOU DIED");
                    System.out.println ("Play again? (Y/N): ");
                    play_again = keyboard.next();
                    if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                    {
                        not_play = false;
                        game_is_over = false;
                    }
                    else
                    {
                        not_play = true;
                        game_is_over = true;
                    }
                }
                else
                {
                    // answer_1
                    System.out.println (char_name+": Fine witch, what do you need exactly?");
                    System.out.println ("Witch: I need the flower of youth, it's located in Snothbroke city and is heavily guarded.");
                    System.out.println ("Take this speed potion, it may save your life. (Y/N");
                    answer_1 = keyboard.nextLine();

                    if (answer_1.equalsIgnoreCase("Y"))
                    {
                        speed_level = speed_level + 4;
                        System.out.println ("Oh wow, I feel amazing");
                        play_again = "n";// have to get out of the first do while loop so this does it.
                    }
                    else
                    {
                        System.out.println ("Sorry, but no thanks.");
                        play_again = "n";// have to get out of the first do while loop so this does it.
                    }
                }

            if(!game_is_over && !not_play)
                continue;
            else if(game_is_over && not_play)
                break;

                 //second body starts***

                    System.out.println (char_name+": Finally Snothbroke City, looks even worse then last time.");
                    System.out.println ("THUD THUD");
                    System.out.println (char_name+": What in the world? Oh no, is that Cheif? I need to hide he wants me dead!");
                    System.out.println ("Do you (1) try to run and hide or (2) stay put.");
                    choice_1 = keyboard.nextInt();
                    keyboard.nextLine(); // just to catch the enter key after the number
                    if (choice_1 == 2)
                    {
                        System.out.println ("Chief: What's that smell?"+char_name+"? I knew it was you, go get em boys!");
                        System.out.println (char_name+": AHHHH-");
                        System.out.println (char_name+": *awakens* Where am I? ");
                        System.out.println ("Chief: You wanna know the only good thing about you, you taste delicious, HAHAHA.");
                        System.out.println ("Chief and his goons ate you. WHY WOULD YOU STAY PUT?");
                        System.out.println ("YOU DIED");
                        System.out.println ("Play again? (Y/N)");
                        play_again = keyboard.next();
                        if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                        {
                            not_play = false;
                            game_is_over = false;
                        }
                        else
                        {
                            not_play = true;
                            game_is_over = true;
                        }
                    }
                    else if (choice_1 == 1 && speed_level <= 5)
                    {
                        System.out.println ("Chief: What's that smell?"+char_name+"? I knew it was you, go get em boys!");
                        System.out.println (char_name+": AHHHH why am I so slo-.");
                        System.out.println (char_name+": *awakens* Where am I? ");
                        System.out.println ("Chief: You wanna know the only good thing about you, you taste delicious, HAHAHA.");
                        System.out.println ("Chief and his goons ate you. WHY DIDN'T YOU TAKE THE SPEED POTION");
                        System.out.println ("YOU DIED");
                        System.out.println ("Play again? (Y/N)");
                        play_again = keyboard.next();
                        if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                        {
                            not_play = false;
                            game_is_over = false;
                        }
                        else
                        {
                            not_play = true;
                            game_is_over = true;
                        }
                    }
                    else
                    {
                        System.out.println (char_name+": Oh my god, that was a close one. Good thing I drank that speed potion or else I would have been dinner.");
                        System.out.println (char_name+": The flower! It is surrounded by heavy security though.");
                        System.out.println ("Do you (1) run away and say the flower isn't here or (2) sneak past the security.");
                        choice_1 = keyboard.nextInt();
                        keyboard.nextLine(); // just to catch the enter key after the number
                        if (choice_1 == 1)
                        {
                            System.out.println (char_name+": Ya there was definitely no way I was getting that flower.");
                            System.out.println (char_name+": Very smart choi- AHHH MY HEAD IS POUNDI-.");
                            System.out.println ("The witch hexed you and blew up your head. Coward.");
                            System.out.println ("YOU DIED");
                            System.out.println ("Play again? (Y/N)");
                            play_again = keyboard.next();

                            if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                            {
                                not_play = false;
                                game_is_over = false;
                            }
                            else
                            {
                                not_play = true;
                                game_is_over = true;
                            }

                        }
                        else
                        {
                            System.out.println (char_name+": Yay I finally got the flower. Now I can save ny king");//fix***
                            System.out.println ("\n");
                            System.out.println (char_name+": Witch! Witch! I have the flower.");
                            System.out.println ("Witch: Ah thank you my precious, that's just part one of the quest");
                            play_again = "n";
                        }
                    }


            if(!game_is_over && !not_play)
                continue;
            else if(game_is_over && not_play)
                break;

                //third body starts

                    System.out.println (char_name+": What do you mean part 1!");
                    System.out.println ("Witch: If you want the potion know your going to need blood from the most holy man.");
                    System.out.println (char_name+": I'm going to kill you for this witch! Where do I find the blood!");
                    System.out.println ("Witch: Why don't you try the local church? Maybe...");
                    System.out.println ("\n");
                    System.out.println ("*outside church*");
                    System.out.println (char_name+"*knock**knock* Pastor! It's "+char_name+" let me in.");
                    System.out.println (char_name+": What the heck is that nois- *thud*");
                    System.out.println ("Vampire: Ahhh a fresh new meal!");
                    System.out.println ("Do you (1) try to reason with the vampire or (2) spray him with holy water");
                    choice_1 = keyboard.nextInt();
                    keyboard.nextLine(); // just to catch the enter key after the number
                    if (choice_1 == 2)
                    {
                        System.out.println ("Vampire: AGHHH MY SKIN! Im going to rip you into pieces mortal!");
                        System.out.println (char_name+": Go back to hell dirt bag");
                        System.out.println ("*swings sword decapitating the vampire*");
                        System.out.println ("Pastor: "+char_name+"! Thank God you killed that monster");
                        System.out.println (char_name+": As a thank you I kindly ask for a donation of your blood, for a potion.");
                        System.out.println ("Pastor: Of course hero, here you are.");
                        System.out.println ("\n");
                        play_again = ("n");
                    }
                    else
                    {
                        System.out.println (char_name+": Listen I don't want to hurt you just crawl back into whatever hole you came out of!");
                        System.out.println ("Vampire: I am just so HUNGRYYYY");
                        System.out.println (char_name+": NO NO-AHHH release me you bea-.");
                        System.out.println ("WHY WOULD YOU TRY AND REASON WITH A VAMPIRE");
                        System.out.println ("YOU DIED");
                        System.out.println ("Play again? (Y/N)");
                        play_again = keyboard.next();

                        if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                        {
                            not_play = false;
                            game_is_over = false;
                        }
                        else
                        {
                            not_play = true;
                            game_is_over = true;
                        }
                    }

            if(!game_is_over && !not_play)
                continue;
            else if(game_is_over && not_play)
                break;

                 //fourth body starts

                    System.out.println (char_name+": I have the blood now I can save my king!");
                    System.out.println ("Bandit: Hey you! What you got in your hand, lemme see.");
                    System.out.println (char_name+": Get back you goons, I am a Knight of the King you will be demolished if anything happens to me!");
                    System.out.println ("Bandit: Hear that boys? We've got our selves a Knight! Get em.");
                    System.out.println ("*scuffling and fighting insues*");
                    System.out.println (char_name+": You will regret this");
                    System.out.println ("\n");
                    System.out.println (char_name+": I need to get out of here. There! A knife.");
                    System.out.println ("Do you (1) reach for knife and cut rope on hands then run or (2) cut the rope and kill the guards.");
                    choice_1 = keyboard.nextInt();
                    keyboard.nextLine(); // just to catch the enter key after the number
                    if (choice_1 == 1)
                    {
                        System.out.println ("Bandits: Hey he is getting away with the blood!");
                        System.out.println (char_name+": I told you goons you would regret this!");
                        System.out.println ("*Escapes narrowly*");
                        System.out.println (char_name+": I need to go back and grab the blood, damn!");
                        System.out.println ("\n");
                        play_again = ("n");
                    }
                    else
                    {
                        System.out.println (char_name+": I told you that this was a mistake! *slice*");
                        System.out.println ("Bandit: AWGHHH damn you...");
                        System.out.println (char_name+": Now where is that blood.");
                        play_again = ("n");
                    }

                    System.out.println (char_name+": Hello elderly man, did you see a vile of blood anywhere?");
                    System.out.println ("Elderly man: Hmmmm a vile of blood? I just bought one off some scary looking guys.");
                    System.out.println (char_name+": Would it be possible for me to take a look at the vile?");
                    System.out.println ("Elderly Man: Sure son, right this way... try my apple pie! Here.");
                    System.out.println (char_name+": Oh wow it actually tastes-s-s d-d-delico-. *Snoring");
                    System.out.println ("\n");
                    System.out.println ("*awakens*");
                    System.out.println (char_name+": What the heck happened, where am I? HELLOOOO. The vile! Old man release me at once!");
                    System.out.println ("Wraith: Oh no no no, I think I'm going to eat your brains first.");
                    System.out.println ("*head butts the Wraith*");
                    System.out.println (char_name+": You obviously didn't check to see if i had any weapons on me Wraith! *breaks lose*");
                    System.out.println ("Do you (1) attack the wraith in your weakened state or (2) flee with the vile.");
                    choice_1 = keyboard.nextInt();
                    if (choice_1 == 1)
                    {
                        System.out.println ("Wraith: You mortal try to stay and fight me? Take THIS!");
                        System.out.println (char_name+": Sorry Wraith, I am not just a regular human. *slice*");
                        System.out.println ("Wraith: AGHHHH, fine just take the vile and leave!");



                    }
                    else
                        System.out.println (char_name+"No dinner for you today Wraith!");
                    System.out.println ("Wraith: Noooo there goes my food!");

                    play_again = "n";



                 //fifth body starts

                    System.out.println ("\n");
                    System.out.println (char_name+": I really need to get out of this place, it's a death trap! That Witch sent me to my death!");
                    System.out.println (char_name+": I have the blood and the witch has the flower, that should be all.");
                    System.out.println ("*trip back to the witch*");
                    System.out.println ("\n");
                    System.out.println (char_name+": Witch! Open up.");
                    System.out.println ("*Loud screech*");
                    System.out.println (char_name+": What the heck is that nois- *thud*");
                    System.out.println ("Demon: I have your witch, she won't be making that potion and your King shall die!");
                    System.out.println (char_name+": Only you shall die, Demon!");
                    System.out.println ("Do you (1) attack demon with sword or (2) cast a spell to send him back to hell");
                    choice_1 = keyboard.nextInt();
                    keyboard.nextLine(); // just to catch the enter key after the number
                    if (choice_1 == 1)
                    {
                        System.out.println ("\n");
                        System.out.println ("Demon: You should have known regular metal doesn't work on a creature like me!");
                        System.out.println (char_name+": Oh shoot!");
                        System.out.println ("Demon: AGHHH *twist*");
                        System.out.println ("The demon snapped your neck. You should have known demons can only die from being expelled from their host!");
                        System.out.println ("YOU DIED");
                        System.out.println ("Play again (Y/N)");
                        play_again = keyboard.nextLine();
                        keyboard.next();

                        if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                        {
                            not_play = false;
                            game_is_over = false;
                        }
                        else
                        {
                            not_play = true;
                            game_is_over = true;
                        }
                    }
                    else
                    {
                        System.out.println ("\n");
                        System.out.println (char_name+": Foolish demon, you have no idea what I can do to you!");
                        System.out.println ("Demon: *attacks*");
                        System.out.println (char_name+": INSENDIA");
                        System.out.println ("Demon: AGHHH MY SKIN BURNSSS-");
                        System.out.println (char_name+": WITCH! WITCH! Where are you!");
                        System.out.println ("Witch: *faintly* righ-t ov-er h-ere.");
                        System.out.println (char_name+": I have the blood and the flower, lets make this potion!");
                        play_again = ("n");
                    }

            if(!game_is_over && !not_play)
                continue;
            else if(game_is_over && not_play)
                break;
                 //sixth body starts

                    System.out.println ("\n");
                    System.out.println ("Witch: Okay, here we go.");
                    System.out.println ("*mixes ingredients* *flames spark*");
                    System.out.println ("Witch: Done.");
                    System.out.println (char_name+": Just like that? And this will save my king?");
                    System.out.println ("Witch: Yes it shall, even though it has never been tested before");
                    System.out.println (char_name+": What do you mean? Can it harm him?");
                    System.out.println ("Witch: Death is always a possibility");
                    System.out.println (char_name+": What! How can I give my King something that might kill him!");
                    System.out.println ("Witch: He will die without it! What do you have to lose!");
                    System.out.println (char_name+": Your right, thanks for your help witch.");
                    System.out.println ("Do you (1) go back to the castle with the potion or (2) try and flee incase the potion fails");
                    choice_1 = keyboard.nextInt();
                    keyboard.nextLine(); // just to catch the enter key after the number

                    if (choice_1 == 2)
                    {
                        System.out.println ("\n");
                        System.out.println (char_name+": I can't go back there, what if he dies! I will surely be executed if he does not live!");
                        System.out.println (char_name+": I need to go now! *rides horse away*");
                        System.out.println ("Witch: My King my King, your Knight has fled with the potion! ");
                        System.out.println ("King: Track him down and bring me his head!");
                        System.out.println ("YOU DIED");
                        System.out.println ("Play again (Y/N)");
                        play_again = keyboard.next();

                        if (play_again.equalsIgnoreCase("Y")) //// added to try and exit loop
                        {
                            not_play = false;
                            game_is_over = false;
                        }
                        else
                        {
                            not_play = true;
                            game_is_over = true;
                        }
                    }
                    else
                    {
                        System.out.println ("\n");
                        System.out.println (char_name+": My Lord, I have the potion, but the outcome if you take this is not certain to give you life.");
                        System.out.println ("King: Life is never certain, we only have hope, thank you "+char_name+" for your efforts.");
                        System.out.println (char_name+": You are right my Lord, here, drink.");
                        System.out.println ("King: *gulp gulp* ahhh I don't think it is working I feel we-ak.");
                        System.out.println (char_name+": No my Lord, you can't. Who will lead!");
                        System.out.println ("King: *faintly* You will lead them... ");
                        System.out.println (char_name+": What? I am King?");
                        System.out.println ("King: Yes, do well my courages Knight.");
                        System.out.println (char_name+": I shall my Lord, I shall.");
                        System.out.println ("\n");
                        System.out.println ("YOU WIN");
                        System.out.println ("Play again? (Y/N)");
                        play_again = keyboard.nextLine();
                        keyboard.nextLine();
                    }

            if(game_is_over && not_play)
                break;


        }


        while(!game_is_over);

        // if you want to play the whole game again, and not just each part, you must
        // put another do while loop here.
        //Howver, you should consider removing the first do while loop and only let the person
        //play the second choice after they win the first.  you can do this with an if statement, or
        // include the 2nd option.  BTW your code always makes the person get eaten in the 2nd part.
        // finally, you need to use && not || for your if statements becuase you wanted to be the 1st choice and have enough speed to win
        // I hope tihs helps.
        System.out.println ("\n");
        System.out.println ("Thank you for playing my game!");





    }//end of program

}//end of object

