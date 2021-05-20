package learnedma.generated.mydatamodel.kinds.teacher;

import java.util.Iterator;
import learnedma.generated.mydatamodel.kinds.course.CourseSet;
import learnedma.generated.mydatamodel.kinds.person.PersonSet;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import learnedma.generated.valuedomains.mydatamodel.TeacherList;

/**
 * This is the viewing interface for TeacherSet
 */
public interface TeacherSet extends Iterable<TeacherViewer>
{

    /**
     * Get the size of this set.
     * @return  The size of this set.
     */
    public int size();

    /**
     * Returns <tt>true</tt> if this set contains the entity with the given id.
     * @param id  The id of the entity to test containment of
     * @return    <tt>true</tt> if this set contains the entity with the given
     *            id
     */
    public boolean contains(TeacherID id);

    /**
     * Returns <tt>true</tt> if this set contains the given entity.
     * @param entity  The entity to test containment of
     * @return        <tt>true</tt> if this set contains the given entity
     */
    public boolean contains(TeacherViewer entity);

    /**
     * Returns <tt>true</tt> if this set contains every entity in the given set.
     * @param teacherSet  The TeacherSet to test containment of.
     * @return            <tt>true</tt> if this set contains every entity in
     *                    the given set
     */
    public boolean containsAll(TeacherSet teacherSet);

    /**
     * Creates a copy of this TeacherSet at this instance in time and returns
     * it as a list of values
     * @return  A copy of this TeacherSet as a list of values from the value
     *          domain TeacherList
     */
    public TeacherList snapshot();

    /**
     * Returns the union between this set and the given set
     * @param teacherSet  The TeacherSet to create the union with.
     * @return            The union between this TeacherSet and the provided
     *                    TeacherSet.
     */
    public TeacherSet union(TeacherSet teacherSet);

    /**
     * Returns the intersection between this set and the given set
     * @param teacherSet  The TeacherSet to create the intersection with.
     * @return            The intersection between this TeacherSet and the
     *                    provided TeacherSet.
     */
    public TeacherSet intersect(TeacherSet teacherSet);

    /**
     * Returns the subtraction of the given set from this set. The result set
     * will contain every element from this set, that are not contained in the
     * given set.
     * @param teacherSet  The TeacherSet to subtract from this set.
     * @return            The subtraction of the provided TeacherSet from this
     *                    TeacherSet. The result will contain every element from
     *                    this set, that are not contained in the provided set.
     */
    public TeacherSet subtract(TeacherSet teacherSet);

    /**
     * Returns a new set with all the entities from this set that are accepted
     * by the filter.
     * @param filter  The filter
     * @return        A new set with all the entities from this set that are
     *                accepted by the filter.
     */
    public TeacherSet filter(TeacherFilter filter);

    /**
     * Views the Teacher entries in this set as their base kind Person. The
     * resulting set will always be of the same size as this set, since Teacher
     * is always an extension of Person
     * @return  The PersonSet view of this TeacherSet
     */
    public PersonSet asPersonSet();

    /**
     * Returns a new set with the same entries but ordered by ID.
     * @return  A new set with the same entries but ordered by ID.
     */
    public TeacherSet orderByID();

    /**
     * Returns a new set with the same entries but ordered by ID.
     * @return  A new set with the same entries but ordered by ID.
     */
    public TeacherSet orderByIDDesc();

    /**
     * Returns a new set with the same entries but sub ordered by ID.
     * @return  A new set with the same entries but sub ordered by ID.
     */
    public TeacherSet subOrderByID();

    /**
     * Returns a new set with the same entries but sub ordered by ID.
     * @return  A new set with the same entries but sub ordered by ID.
     */
    public TeacherSet subOrderByIDDesc();

    /**
     * Returns a new set with the same entries but ordered by schoolMail
     * @return  A new set with the same entries but ordered by schoolMail
     */
    public TeacherSet orderBySchoolMail();

    /**
     * Returns a new set with the same entries but ordered by schoolMail
     * @return  A new set with the same entries but ordered by schoolMail
     */
    public TeacherSet orderBySchoolMailDesc();

    /**
     * Returns a new set with the same entries that is sub ordered by schoolMail
     * @return  A new set with the same entries that is sub ordered by
     *          schoolMail
     */
    public TeacherSet subOrderBySchoolMail();

    /**
     * Returns a new set with the same entries that is sub ordered by schoolMail
     * @return  A new set with the same entries that is sub ordered by
     *          schoolMail
     */
    public TeacherSet subOrderBySchoolMailDesc();

    /**
     * This methods follows the relation TeacherAssignment
     * @return  The result of following the relation TeacherAssignment
     */
    public CourseSet asTeacherSetGetCourseSet();

    /**
     * Returns an iterator for this set
     * @return  An iterator for this set
     */
    public Iterator<TeacherViewer> iterator();

}
