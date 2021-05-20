package learnedma.generated.mydatamodel;

import learnedma.generated.mydatamodel.kinds.course.CourseKind;
import learnedma.generated.mydatamodel.kinds.person.PersonKind;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherKind;

/**
 * This is the viewing interface for the MyDataModel data model.
 */
public interface MyDataModelViewer
{

    /**
     * Returns the interface to the kind Person
     * @return  The interface to the kind Person
     */
    public PersonKind getPersonKind();

    /**
     * Returns the interface to the kind Teacher
     * @return  The interface to the kind Teacher
     */
    public TeacherKind getTeacherKind();

    /**
     * Returns the interface to the kind Course
     * @return  The interface to the kind Course
     */
    public CourseKind getCourseKind();

}
