# Riddle.solution.A.Einstein
Java based solution to Albert Einsteins's 15 hint/clue/step house riddle.

"This is NOTHING more, than my alpha level version of what it says it is. Read the comments if you wanna know more. Focused ONLY using it as a logic exercise, followed up with a beta level version that will have methods/functions/procedural style code. Followed by a version that is based off that code, but utilizing OOB style House class. Followed up with a better thought out way of storing the String arrays being used for each of the five types of vars that define the House object instantiation, & maybe a sixth type in regards to the location of the House (currently nothing more than a common integer used as a sub [0]-[4] reference. Almost done, uploading it before i lose the code, or something stupid. whatever. WATCH! https://www.twitch.tv/videos/1313413043 to see why I started this silly little logic exercise (not to prove anything at all. EXERCISE only."-JJ

EXAMPLE RUN/EXECUTION as of 05/31/2022 :


C:\Users\-User\riddle>javac Riddle.java

C:\Users\-User\riddle>java Riddle
*****************************************************************************
HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE NUMBER 04                 HOUSE NUMBER 05
BEVERAGE01:     beer            BEVERAGE02:     coffee          BEVERAGE03:     milk            BEVERAGE04:     tea             BEVERAGE05:     water


PET     01:     birds           PET     02:     cats            PET     03:     dogs            PET     04:     fishes          PET     05:     horses


NATNALIT01:     Dane            NATNALIT02:     English         NATNALIT03:     German          NATNALIT04:     Norwgan         NATNALIT05:     Swede


WALLCOLR01:     blue            WALLCOLR02:     green           WALLCOLR03:     red             WALLCOLR04:     white           WALLCOLR05:     yellow


CIGAR   01:     blended         CIGAR   02:     blumstr         CIGAR   03:     dunhill         CIGAR   04:     palmal          CIGAR   05:     prince

JUST PRINTING OUT THE INITIAL STARTING POINTS FOR THE ALPHABETICALLY ENTERED VARIABLES.
*****************************************************************************
HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE NUMBER 04                 HOUSE NUMBER 05
BEVERAGE01:     beer            BEVERAGE02:     coffee          BEVERAGE03:     milk            BEVERAGE04:     tea             BEVERAGE05:     water


PET     01:     birds           PET     02:     cats            PET     03:     dogs            PET     04:     fishes          PET     05:     horses


NATNALIT01:     Norwgan         NATNALIT02:     English         NATNALIT03:     German          NATNALIT04:     Dane            NATNALIT05:     Swede


WALLCOLR01:     blue            WALLCOLR02:     green           WALLCOLR03:     red             WALLCOLR04:     white           WALLCOLR05:     yellow


CIGAR   01:     blended         CIGAR   02:     blumstr         CIGAR   03:     dunhill         CIGAR   04:     palmal          CIGAR   05:     prince

HOUSES AFTER STEP 09 OF 15. ONE DOWN. NORWEIG IS LEFTMOST. BTW, BECAUSE OF THE TABBED OUT PUT, THE STRINGS ARE < 8 OR <= 7 IF YOU PREFER. FOR FORMATTING, YOU KNOW, YOU GET IT. RIGHT? TAKE OUT A BACKSLASH LOWERCASE T & SEE THE DIFFERENCE.

*****************************************************************************
HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE NUMBER 04                 HOUSE NUMBER 05
BEVERAGE01:     beer            BEVERAGE02:     coffee          BEVERAGE03:     milk            BEVERAGE04:     tea             BEVERAGE05:     water


PET     01:     birds           PET     02:     cats            PET     03:     dogs            PET     04:     fishes          PET     05:     horses


NATNALIT01:     Norwgan         NATNALIT02:     English         NATNALIT03:     German          NATNALIT04:     Dane            NATNALIT05:     Swede


WALLCOLR01:     green           WALLCOLR02:     blue            WALLCOLR03:     red             WALLCOLR04:     white           WALLCOLR05:     yellow


CIGAR   01:     blended         CIGAR   02:     blumstr         CIGAR   03:     dunhill         CIGAR   04:     palmal          CIGAR   05:     prince
        OK. DONE 3 STEPS. ALL TRUE. BASED ON STEP 04. GREEN WALL CAN'T GO ON FAR LEFT, BECAUSE OF WHITE WALL NIGHBOR DIRECTLY TO IT'S RIGHT. SO? WELL, LET'S SHIFT IT RIGHT & HOPE FOR THE BEST. CHECK AND SEE IF 4 IS TRUE OR NOT AFTER FINDING MORE TRUE'S & FALSES. NEED A DYNAMICLY GROWING ARRAY OF INTS TO KEEP TRACK. FOR NOW. USING PAPER & PENCIL.
*****************************************************************************
HOUSE NUMBER 01                 HOUSE NUMBER 02                 HOUSE NUMBER 03                 HOUSE 04                        HOUSE 05
BEVERAGE01:     beer            BEVERAGE02:     coffee          BEVERAGE03:     milk            BEVERAGE04:     tea             BEVERAGE05:     water


PET     01:     birds           PET     02:     cats            PET     03:     dogs            PET     04:     fishes          PET     05:     horses


NATNALIT01:     Norwgan         NATNALIT02:     German          NATNALIT03:     English         NATNALIT04:     Dane            NATNALIT05:     Swede


WALLCOLR01:     yellow          WALLCOLR02:     blue            WALLCOLR03:     red             WALLCOLR04:     green           WALLCOLR05:     white


CIGAR   01:     blended         CIGAR   02:     blumstr         CIGAR   03:     dunhill         CIGAR   04:     palmal          CIGAR   05:     prince

C:\Users\-User\riddle>
