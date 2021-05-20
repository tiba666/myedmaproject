package learnedma.generated.mydatamodel.kinds.teacher;

import learnedma.generated.mydatamodel.kinds.course.CourseSet;
import learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.mydatamodel.Teacher;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;

/**
 * This is the viewing interface for Teacher
 */
public interface TeacherViewer
{

    /**
     * Create a copy of this Teacher at this instance in time
     * @return  A copy of this Teacher entity as a value  from the value domain
     *          Teacher
     */
    public Teacher snapshot();

    /**
     * Returns the ID of this Teacher
     * @return  The ID of this Teacher
     */
    public TeacherID getID();

    /**
     * Returns the attribute schoolMail of this Teacher
     * @return  The value of the attribute schoolMail
     */
    public Email getSchoolMail();

    /**
     * Views this Teacher as its base kind Person. Will never return
     * <tt>null</tt> since Teacher is always an extension of Person
     * @return  The Person view of this Teacher
     */
    public PersonViewer asPerson();

    /**
     * This methods follows the relation TeacherAssignment
     * @return  The result of following the relation TeacherAssignment
     */
    public CourseSet getCourseSet();

    /**
     * Returns <tt>true</tt> if this entity has the same ID as the provided
     * entity
     * @param o  The object to compare with
     * @return   <tt>true</tt> if this entity has the same ID as the provided
     *           entity
     */
    public boolean equals(Object o);

    /**
     * Returns the hash code of this entity
     * @return  The hash code of this entity
     */
    public int hashCode();

}
