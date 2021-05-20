package learnedma.generated.mydatamodel.kinds.teacher;

import learnedma.generated.mydatamodel.kinds.teacher.TeacherSet;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;

/**
 * Interface for the kind: Teacher
 */
public interface TeacherKind
{

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public TeacherViewer getFromID(TeacherID id);

    /**
     * Returns an empty set of Teacher entities.
     * @return  An empty set of Teacher entities.
     */
    public TeacherSet getEmptyTeacherSet();

    /**
     * Returns the set of all Teacher entities.
     * @return  The set of all Teacher entities.
     */
    public TeacherSet getAll();

    /**
     * Returns the unique teacher from the unique-index on schoolMail or
     * <tt>null</tt> if there is no teacher with the given schoolMail.
     * @param schoolMail  Value for schoolMail
     * @return            The unique teacher from the unique-index on
     *                    schoolMail or <tt>null</tt> if there is no teacher
     *                    with the given schoolMail.
     */
    public TeacherViewer getFromSchoolMail(Email schoolMail);

}
