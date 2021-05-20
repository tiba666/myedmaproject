package learnedma.generated.mydatamodel.test;

import java.io.IOException;
import learnedma.generated.mydatamodel.MyDataModel;
import learnedma.generated.mydatamodel.actions.CreateCourseResult;
import learnedma.generated.mydatamodel.actions.CreatePersonResult;
import learnedma.generated.mydatamodel.actions.CreateTeacherResult;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.valuedomains.userinput.ITerminal;

/**
 * 
 */
public class MyDataModelTest
{
    private MyDataModel edma_dm;
    private ITerminal edma_terminal;



    /**
     * Constructor
     * @param edma_dm        Interface to an instance of the MyDataModel data
     *                       model
     * @param edma_terminal  Terminal to get value domains from
     */
    public MyDataModelTest(MyDataModel edma_dm, ITerminal edma_terminal)
    {
        this.edma_dm = edma_dm;
        this.edma_terminal = edma_terminal;
    }

    /**
     * Starts the test
     */
    public void start() throws IOException
    {
        while(true)
        {
            menu();
            String val = readInputLine();
            if("exit".equalsIgnoreCase(val)) break;
            try
            {
                int choice = Integer.parseInt(val);
                switch(choice)
                {
                    case 1:
                        callCreatePerson();
                        break;
                    case 2:
                        callCreateTeacher();
                        break;
                    case 3:
                        callCreateCourse();
                        break;
                    default:
                        edma_terminal.put(choice + " does not exist! Please try again!\n");
                }
            }
            catch(NumberFormatException e)
            {
                edma_terminal.put(val + " is not a valid input! Please try again!\n");
            }
        }
    }

    /**
     * Prints the menu
     */
    private void menu()
    {
        edma_terminal.put("Welcome to the MyDataModel interactive test!\n");
        edma_terminal.put("************************************************************************\n");
        edma_terminal.put("  Actions\n  -------\n");
        edma_terminal.put("    1 - createPerson(firstName : Name, lastName : Name, personalMail : Email) -> (id : PersonID)\n");
        edma_terminal.put("    2 - createTeacher(personID : PersonID, schoolMail : Email) -> (id : TeacherID)\n");
        edma_terminal.put("    3 - createCourse(courseName : Name) -> (id : CourseID)\n");
        edma_terminal.put("  Views\n  -----\n");
        edma_terminal.put("Please choose a transaction to call (or type exit to exit):\n");
    }

    /**
     * Reads a line from stdin
     * @return  
     */
    private String readInputLine()
    {
        edma_terminal.put(": ");
        return edma_terminal.getString();
    }

    /**
     * Calls the method: createPerson
     */
    private void callCreatePerson() throws IOException
    {
        
        //Input parameter firstName
        Name in_firstName;
        edma_terminal.put("Enter input parameter firstName : Name\n");
        in_firstName = Name.fromTerminal(edma_terminal);
        
        //Input parameter lastName
        Name in_lastName;
        edma_terminal.put("Enter input parameter lastName : Name\n");
        in_lastName = Name.fromTerminal(edma_terminal);
        
        //Input parameter personalMail
        Email in_personalMail;
        edma_terminal.put("Enter input parameter personalMail : Email\n");
        in_personalMail = Email.fromTerminal(edma_terminal);
        
        //Make the call
        CreatePersonResult res = edma_dm.createPerson(in_firstName, in_lastName, in_personalMail);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter id:\n");
        edma_terminal.put("  " + res.getId() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: createTeacher
     */
    private void callCreateTeacher() throws IOException
    {
        
        //Input parameter personID
        PersonID in_personID;
        edma_terminal.put("Enter input parameter personID : PersonID\n");
        in_personID = PersonID.fromTerminal(edma_terminal);
        
        //Input parameter schoolMail
        Email in_schoolMail;
        edma_terminal.put("Enter input parameter schoolMail : Email\n");
        in_schoolMail = Email.fromTerminal(edma_terminal);
        
        //Make the call
        CreateTeacherResult res = edma_dm.createTeacher(in_personID, in_schoolMail);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter id:\n");
        edma_terminal.put("  " + res.getId() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: createCourse
     */
    private void callCreateCourse() throws IOException
    {
        
        //Input parameter courseName
        Name in_courseName;
        edma_terminal.put("Enter input parameter courseName : Name\n");
        in_courseName = Name.fromTerminal(edma_terminal);
        
        //Make the call
        CreateCourseResult res = edma_dm.createCourse(in_courseName);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter id:\n");
        edma_terminal.put("  " + res.getId() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }
}
