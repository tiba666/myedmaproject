package learnedma.generated.edmaimpl.models.mydatamodel;

import java.io.IOException;
import learnedma.generated.edmaimpl.models.mydatamodel.actions.EDMA_CreateCourse;
import learnedma.generated.edmaimpl.models.mydatamodel.actions.EDMA_CreatePerson;
import learnedma.generated.edmaimpl.models.mydatamodel.actions.EDMA_CreateTeacher;
import learnedma.generated.mydatamodel.MyDataModel;
import learnedma.generated.mydatamodel.actions.CreateCourseResult;
import learnedma.generated.mydatamodel.actions.CreatePersonResult;
import learnedma.generated.mydatamodel.actions.CreateTeacherResult;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.mydatamodel.PersonID;
import learnedma.usercode.models.mydatamodel.actions.CreateCourseUserImpl;
import learnedma.usercode.models.mydatamodel.actions.CreatePersonUserImpl;
import learnedma.usercode.models.mydatamodel.actions.CreateTeacherUserImpl;
import org.abstractica.edma.runtime.intf.IDataModelInstance;

/**
 * 
 */
public class MyDataModelAPIImpl implements MyDataModel
{
    private IDataModelInstance edma_dmi;



    /**
     * Constructor
     * @param edma_dmi  Data model instance runtime interface
     */
    public MyDataModelAPIImpl(IDataModelInstance edma_dmi)
    {
        this.edma_dmi = edma_dmi;
    }

    /**
     * Access to the internal data model instance
     * @return  The internal data model instance
     */
    public IDataModelInstance edma_getDMI()
    {
        return edma_dmi;
    }

    /**
     * Creates a new Person
     * @param firstName     Input parameter firstName
     * @param lastName      Input parameter lastName
     * @param personalMail  Input parameter personalMail
     * @return              
     */
    public CreatePersonResult createPerson(Name firstName, Name lastName, Email personalMail) throws IOException
    {
        if(firstName == null)
        {
            throw new NullPointerException("firstName may not be null");
        }
        if(lastName == null)
        {
            throw new NullPointerException("lastName may not be null");
        }
        if(personalMail == null)
        {
            throw new NullPointerException("personalMail may not be null");
        }
        CreatePersonUserImpl edma_userMethod = new CreatePersonUserImpl(firstName, lastName, personalMail);
        EDMA_CreatePerson edma_method = new EDMA_CreatePerson(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Creates a new Teacher
     * @param personID    Input parameter personID
     * @param schoolMail  Input parameter schoolMail
     * @return            
     */
    public CreateTeacherResult createTeacher(PersonID personID, Email schoolMail) throws IOException
    {
        if(personID == null)
        {
            throw new NullPointerException("personID may not be null");
        }
        if(schoolMail == null)
        {
            throw new NullPointerException("schoolMail may not be null");
        }
        CreateTeacherUserImpl edma_userMethod = new CreateTeacherUserImpl(personID, schoolMail);
        EDMA_CreateTeacher edma_method = new EDMA_CreateTeacher(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Creates a new Course
     * @param courseName  Input parameter courseName
     * @return            
     */
    public CreateCourseResult createCourse(Name courseName) throws IOException
    {
        if(courseName == null)
        {
            throw new NullPointerException("courseName may not be null");
        }
        CreateCourseUserImpl edma_userMethod = new CreateCourseUserImpl(courseName);
        EDMA_CreateCourse edma_method = new EDMA_CreateCourse(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }
}
