// eyeNstyN rihdull sahlvuhr
// by: jjstyles0001
// this is an elementary/rudimentary attempt at demonstrating how to solve the infamous riddle
// with the 5 houses &  etc etc etc etc etc with only fifteen (15) supplied clues.
// I originally started this in Java thinking it would be nice to make a House object
// that could be populated by all these String array values, BASED, upon the clues.
// BUT THEN! I thought it would be more interesting (for programmers that might read this code)
// to do away with the object,  & just use the array sub, as like the object. instead.
// So like location [0] is house 1, [1] is house 2.... & finally [4] is house five.
// Elegant, yes? I WILL still make the OOB one, but this one comes first.
// We have five (5) arrays, of five (5) String entries, that will get shuffled around, using
// a single String temporary variable, where we will store the value to be overwritten, once
// we have copied the overriding value over the overwritten value, will will copy the tempvar
// back over to it's new sub location, which will of course be, the location what the overriding
// value just got copied from. The most elementary of variable swaps.
// The fifteen clues, or rather, steps, to get us to the final solution, will be commented thoughroughly,
// So we don't miss a step, nor double up on a step, nor just ruin the step.
// HERE WE GO!

public class Riddle {

	public static void main(String[] args) {

                String riddleBev[] = {"beer",
                                      "coffee",
                                      "milk",
                                      "tea",
                                      "water"};

                String riddlePet[] = {"birds",
                                      "cats",
                                      "dogs",
                                      "fishes",
                                      "horses"};

                String riddleNationalities[] = {"Dane",
                                      		"English",
                                      		"German",
                                      		"Norwgan",
                                      		"Swede"};

                String riddleWallColors[] = {"blue",
                                             "green",
                                             "red",
                                             "white",
                                             "yellow"};

                String riddleCigar[] = {"blended",
                                        "blumstr",
                                        "dunhill",
                                        "palmal",
                                        "prince"};

		System.out.println("*****************************************************************************");
		System.out.println("HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE NUMBER 04                 HOUSE NUMBER 05");
                for (int i = 1; i <= 5; i++) {
                        System.out.print("BEVERAGE0" + i + ":\t" +riddleBev[i-1] + "\t\t");
                }
		System.out.println();
		System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("PET     0" + i + ":\t" +riddlePet[i-1] + "\t\t");
                }
		System.out.println();
		System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("NATNALIT0" + i + ":\t" +riddleNationalities[i-1] + "\t\t");
                }
		System.out.println();
		System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("WALLCOLR0" + i + ":\t" +riddleWallColors[i-1] + "\t\t");
                }
		System.out.println();
		System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("CIGAR   0" + i + ":\t" +riddleCigar[i-1] + "\t\t");
                }
		System.out.println();
		System.out.println("JUST PRINTING OUT THE INITIAL STARTING POINTS FOR THE ALPHABETICALLY ENTERED VARIABLES.");

		// WE ASSING NORWEGIAN TO SUB 0 BECAUSE IT IS HOUSE #01, meaning, the farthest on the LEFT.... according to step  #09 from: https://getpocket.com/explore/item/can-you-solve-albert-einstein-s-famous-house-riddle or  http://web.archive.org/web/20220531094910/https://getpocket.com/explore/item/can-you-solve-albert-einstein-s-famous-house-riddle
		String temp = "temp"; // making our swap variable.
		temp = riddleNationalities[0]; // Dane in temp.
		riddleNationalities[0] = riddleNationalities[3]; // Norwegian to Dane.
		riddleNationalities[3] = temp; // Dane to Norwegian. swap made. done with clue #01
		System.out.println("*****************************************************************************");
		System.out.println("HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE NUMBER 04                 HOUSE NUMBER 05");
		for (int i = 1; i <= 5; i++) {
                        System.out.print("BEVERAGE0" + i + ":\t" +riddleBev[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("PET     0" + i + ":\t" +riddlePet[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("NATNALIT0" + i + ":\t" +riddleNationalities[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("WALLCOLR0" + i + ":\t" +riddleWallColors[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("CIGAR   0" + i + ":\t" +riddleCigar[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println("HOUSES AFTER STEP 09 OF 15. ONE DOWN. NORWEIG IS LEFTMOST. BTW, BECAUSE OF THE TABBED OUT PUT, THE STRINGS ARE < 8 OR <= 7 IF YOU PREFER. FOR FORMATTING, YOU KNOW, YOU GET IT. RIGHT? TAKE OUT A BACKSLASH LOWERCASE T & SEE THE DIFFERENCE. \n");
                temp = riddleBev[3]; // doing step 08. it's already done, because MILK is in sub two or [2], which is the middle house, changing nothing. but, still doing it, because what if you choose not to load the data alphabettically?
                riddleBev[3] = riddleBev[3];
                riddleBev[3] = temp; // done. next step.

                temp = riddleWallColors[1]; // doing step 08. it's already done, because MILK is in sub two or [2], which is the middle house, >
                riddleWallColors[1] = riddleWallColors[0];
                riddleWallColors[0] = temp; // swapped blue and green/ step 14 of 15 done.

                System.out.println("*****************************************************************************");
                System.out.println("HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE NUMBER 04			HOUSE NUMBER 05");
                for (int i = 1; i <= 5; i++) {
                        System.out.print("BEVERAGE0" + i + ":\t" +riddleBev[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("PET     0" + i + ":\t" +riddlePet[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("NATNALIT0" + i + ":\t" +riddleNationalities[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("WALLCOLR0" + i + ":\t" +riddleWallColors[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("CIGAR   0" + i + ":\t" +riddleCigar[i-1] + "\t\t");
                }
                System.out.println("OK. DONE 3 STEPS. ALL TRUE. BASED ON STEP 04. GREEN WALL CAN'T GO ON FAR LEFT, BECAUSE OF WHITE WALL NIGHBOR DIRECTLY TO IT'S RIGHT. SO? WELL, LET'S SHIFT IT RIGHT & HOPE FOR THE BEST. CHECK AND SEE IF 4 IS TRUE OR NOT AFTER FINDING MORE TRUE'S & FALSES. NEED A DYNAMICLY GROWING ARRAY OF INTS TO KEEP TRACK. FOR NOW. USING PAPER & PENCIL.");

                temp = riddleWallColors[2];
		riddleWallColors[2] = riddleWallColors[0];
                riddleWallColors[0] = temp;

		// GREAT! SO NOW WHAT?? Well, based on clue #01, Red can't go in HOUSE ONE, because it goes with the Englishman, &  the Englishman can't go in spot one, because he's not the Norwegan man, and we 100% know the NORWEGAN MAN goes in HOUSE ONE, because of clue...  09? 08? one of those two. can't remember, but I JUST KNOW at this point, because those first 2 that are truly the important ones, because they are 100% true values right off the bat. RIGHT? SO PUT RED NEXT TO GREEN, or rather, SHIFT RIGHT, hope for the best.

                temp = riddleWallColors[3];
                riddleWallColors[3] = riddleWallColors[0];
                riddleWallColors[0] = temp;
		// swap complete, next clue.
		// GREAT! SO NOW WHAT?? Well, back to clue 04. IT IS NOW UNTRUE! WHY?  BECAUSE GREEN WALLS IS TO THE LEFT OF RED NOW, NOT WHITE. WE HAVE TWO CHOICES, SHIFT GREEN RIGHT, OR SHIFT RED RIGHT.NO! ACTUALLY THREE , MAYBE FOUR CHOISES? FUCK. NEED MORE DATA!!! Any step that helps make 4 true? analyzing......
		// Well, I don't know, but white is in spot one, can't have green to it's left, let's shift it right, and hope for the best.
		// BUT WAIT! Does white swap with yellow or green? swapping with red would be a step backwards. because of clue 01 with the english man.
		// yellow goes with dunhill cigars, dunno dunhill for sure. theres a clue about dunhill and horses.  doesn't help yet. green and coffee? dunno. clues  05 & 12 dont help yet, with making a certain true decision.  clue one doesn't help yet, not until we can tie the englishman to a house number. for sure. 01 05 and 12 are important like 04 clues/tips.  not certain tho.
		// what have we secured? the Norweg, the Milk, and the Blue. we're confused about the colors, let's remain focused on comparing the Nationalities, and the Beverages THEN!
		// fine boos of the UNIVERSE! what about the fucking drinks? well, what clues pertain to drinks? LOOK! we know they are water, tea, coffee, milk, & beer, from the array we made, also know milk is secure, TELL ME! NOW!
		// the Dane drinks tea is clue 03. Can the Dane live in the middle house. NO! cuz of milk. know anything about the Dane besides? no. RATS!  WAIT! YOU LIE! why master??? WE KNOW THE NORWEG! HOUSE ONE! so tea drinking Dane can't live in houses 01 farthest left, nor house 3 in the center. that is A LOT OF INFO! !!!! THAT WE DIDN'T GET FROM CLUES. not explicitly. TELL ME ANOTHER BEVERAGE FACT! NOW!!
		// clue 05 says coffee goes with green walls. house two is blue walls, house three is milk, green can't be far left cuz of the blue walls, cuz green goes left of white. so houses one, two & three are off limits, meaning... GREEN REQUIRES HOUSE 4! AND WHITE REQUIRES HOUSE FIVE!
		// THIS IS news. GOOD... and... BAD. the algorhythm needs adjusting. We have been crossing off steps, as they becom true, in order to prograess to the end of this riddle. BUT NOW, we must keep track of the variable that we know to be 100% true, because if we put green in house 4, and white in house 5, that does NOT finish any steps. not really. WAIT! IT DOES!
		// remember? Englishman goes with red, right? red can't be Norweg, English & Red require house 3. At this point, EVERY COLOR HAS BEEN SECURED, SO, clue  04, 05, 01, AND EVEN 07 ARE DONE! 
		// Let's continue with this step/clue based procedure, & see if we can avoid keeping track of the TRUEST, MOST BOOLEAN of values, & make it to the end, through all of them.
		// Jeez that was like, difficult to piece together, but look at the reward. FOUR clues/steps made TRUE at once. Bringing us to SEVEN, halfway done. Almost.
		// Make it so codemaster.....
		// aw jeez, put what where? *sigh* ok let's backtrack. white is far right? and green is next to it at house 4. english & red are house 3. lemme do that. which steeps did that? fuck it, one thing at a time.

                temp = riddleWallColors[4];
                riddleWallColors[4] = riddleWallColors[0];
                riddleWallColors[0] = temp; // white is far right now. oh! and yellow is far left. watch the next few exchanges...

                temp = riddleWallColors[3];
                riddleWallColors[3] = riddleWallColors[2];
                riddleWallColors[2] = temp; // green is next to white. red is center. all colors are TRUE now.

                temp = riddleNationalities[2];
                riddleNationalities[2] = riddleNationalities[1];
                riddleNationalities[1] = temp; // Englishman is now TRUE, not sure about German. Dane is in wrong house, because of coffee & green. so Dane goes either where the Swede is, or where the German is.

                System.out.println("*****************************************************************************");
                System.out.println("HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE 04			HOUSE 05");
                for (int i = 1; i <= 5; i++) {
                        System.out.print("BEVERAGE0" + i + ":\t" +riddleBev[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("PET     0" + i + ":\t" +riddlePet[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("NATNALIT0" + i + ":\t" +riddleNationalities[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("WALLCOLR0" + i + ":\t" +riddleWallColors[i-1] + "\t\t");
                }
                System.out.println();
                System.out.println();
                for (int i = 1; i <= 5; i++) {
                        System.out.print("CIGAR   0" + i + ":\t" +riddleCigar[i-1] + "\t\t");
                }

        }
}

//09 of 15 - step nine complete
//08 of 15 - step eight complete
//14 of 15 - step eight complete
//04 of 15 MIGHT BE COMPLATE, OR MIGHT NOT BE COMPLETE. SHIFTED VALUE BASED ON TRUE CONFLICTING DATA.
//01 of 15 MIGHT BE COMPLATE, OR MIGHT NOT BE COMPLETE. SHIFTED VALUE BASED ON TRUE CONFLICTING DATA.
