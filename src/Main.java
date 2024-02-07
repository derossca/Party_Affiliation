//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Pseudo Code

        //	main()
        //		String partyChoice
        //		output “Choose your party affiliation: Democrat, Republican, or Independent”
        //		input partyChoice
        //		if partyChoice == “Democrat” then
        //			output “You get a Democratic Donkey.”
        //		else if partyChoice == “Republican” then
        //			output “You get a Republican Elephant.”
        //		else partyChoice == “Independent”
        //			output “You get an Independent Man.”
        //		end if
        //	return
        //end class

        //Declaring variables
        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        String party = "D - Democrat\tR - Republican\tI - Independent\nChoose your party:";

        //display the parties
        System.out.println(party);
        //let user input party choice
        partyChoice = in.nextLine();

        //cascaded if structure that outputs correspondingly with the party choice chosen

        if(partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democrat Donkey");
        }
        else if(partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if(partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }
        //Do not need another else if as any other option is Other
        else {
            System.out.println("You get Other");
        }
    }
}