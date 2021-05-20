package learnedma.usercode.models.mydatamodel.actions;

import learnedma.generated.mydatamodel.MyDataModelUpdater;
import learnedma.generated.mydatamodel.actions.CreateTeacherResult;
import learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.mydatamodel.PersonID;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import org.abstractica.edma.runtime.implementations.common.Result;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;

/**
 * 
 */
public class CreateTeacherUserImpl extends Result implements CreateTeacherResult
{
    private static final int OK = 0;
    private static final int EMAIL_ALREADY_EXISTS = 1;
    private final PersonID in_personID;
    private final Email in_schoolMail;
    private TeacherID out_id;



    /**
     * Constructor
     * @param in_personID    Input parameter 1
     * @param in_schoolMail  Input parameter 2
     */
    public CreateTeacherUserImpl(PersonID in_personID, Email in_schoolMail)
    {
        this.in_personID = in_personID;
        this.in_schoolMail = in_schoolMail;
        out_id = null;
    }

    /**
     * Execution of the action
     * @param upd  Update interface
     * @return     Return 0 to commit or one of the error codes to roll back
     */
    public int execute(MyDataModelUpdater upd)
    {
        // Implementation of createTeacher
        // Return one of the following error codes:
        // OK
        // EMAIL_ALREADY_EXISTS
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        try {
            PersonViewer person = upd.getPersonKind().getFromID(in_personID);
            TeacherViewer newTeacher = upd.newTeacher(person).schoolMail(in_schoolMail);
            out_id = newTeacher.getID();
            return OK;
        } catch (UniqueException e) {
            return EMAIL_ALREADY_EXISTS;
        }
        
        // EDMA_non-generated_code_end
    }

    /**
     * Returns the output id:TeacherID
     * @return  The output id:TeacherID
     */
    public TeacherID getId()
    {
        if(errorCode() != 0) return null;
        return out_id;
    }
}
