package learnedma.generated.mydatamodel;

import java.io.IOException;
import learnedma.generated.mydatamodel.actions.CreateCourseResult;
import learnedma.generated.mydatamodel.actions.CreatePersonResult;
import learnedma.generated.mydatamodel.actions.CreateTeacherResult;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.mydatamodel.PersonID;

/**
 * The external interface for the model: MyDataModel
 */
public interface MyDataModel
{

    /**
     * Creates a new Person
     * @param firstName     Input parameter firstName
     * @param lastName      Input parameter lastName
     * @param personalMail  Input parameter personalMail
     * @return              
     */
    public CreatePersonResult createPerson(Name firstName, Name lastName, Email personalMail) throws IOException;

    /**
     * Creates a new Teacher
     * @param personID    Input parameter personID
     * @param schoolMail  Input parameter schoolMail
     * @return            
     */
    public CreateTeacherResult createTeacher(PersonID personID, Email schoolMail) throws IOException;

    /**
     * Creates a new Course
     * @param courseName  Input parameter courseName
     * @return            
     */
    public CreateCourseResult createCourse(Name courseName) throws IOException;

}
