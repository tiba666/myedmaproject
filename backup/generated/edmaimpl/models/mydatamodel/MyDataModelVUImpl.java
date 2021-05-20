package learnedma.generated.edmaimpl.models.mydatamodel;

import learnedma.generated.edmaimpl.models.mydatamodel.CourseVUImpl;
import learnedma.generated.edmaimpl.models.mydatamodel.PersonVUImpl;
import learnedma.generated.edmaimpl.models.mydatamodel.TeacherVUImpl;
import learnedma.generated.mydatamodel.MyDataModelUpdater;
import learnedma.generated.mydatamodel.kinds.course.CourseKind;
import learnedma.generated.mydatamodel.kinds.course.CourseUpdater;
import learnedma.generated.mydatamodel.kinds.course.CourseViewer;
import learnedma.generated.mydatamodel.kinds.person.PersonKind;
import learnedma.generated.mydatamodel.kinds.person.PersonUpdater;
import learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherKind;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherUpdater;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.mydatamodel.Course;
import learnedma.generated.valuedomains.mydatamodel.Person;
import learnedma.generated.valuedomains.mydatamodel.Teacher;
import org.abstractica.edma.runtime.intf.IDataModelUpdate;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class MyDataModelVUImpl implements MyDataModelUpdater
{
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_dmview  The internal runtime interface
     */
    public MyDataModelVUImpl(IDataModelView edma_dmview)
    {
        this.edma_dmview = edma_dmview;
    }

    /**
     * Returns the interface to the kind Person
     * @return  The interface to the kind Person
     */
    public PersonKind getPersonKind()
    {
        return new PersonKindImpl(0, edma_dmview);
    }

    /**
     * Returns the interface to the kind Teacher
     * @return  The interface to the kind Teacher
     */
    public TeacherKind getTeacherKind()
    {
        return new TeacherKindImpl(1, edma_dmview);
    }

    /**
     * Returns the interface to the kind Course
     * @return  The interface to the kind Course
     */
    public CourseKind getCourseKind()
    {
        return new CourseKindImpl(2, edma_dmview);
    }

    /**
     * Starts creation of a new Person entity.
     * @return  Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson()
    {
        return new PersonBuilder(edma_dmview.getUpdateInterface(), null);
    }

    /**
     * Starts creation of a new Person entity.
     * @param ID  ID of the entity
     * @return    Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson(Long ID)
    {
        return new PersonBuilder(edma_dmview.getUpdateInterface(), ID);
    }

    /**
     * Creates a new Person from a value in the value domain Person
     * @param person  The value for the new Person.
     * @return        The newly created Person
     * @throws        Throws a UniqueException, if the new entity violates any
     *                of the unique indexes for this kind.
     */
    public PersonUpdater newPerson(Person person) throws UniqueException
    {
        Object[] edma_tmpValues = (Object[]) ((IValueInstance) person).edma_getValue();
        Object[] edma_values = new Object[edma_tmpValues.length];
        for(int i = 0; i < edma_tmpValues.length; ++i)
        {
            edma_values[i] = edma_tmpValues[i];
        }
        IEntity edma_entity = edma_dmview.getUpdateInterface().entityNewUnique(0, edma_values);
        return new PersonVUImpl(edma_entity, edma_dmview);
    }

    /**
     * Deletes an entity of kind Person
     * @param person  The Person to be deleted. All extensions to this entity
     *                will also be deleted.
     * @return        <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(PersonViewer person)
    {
        IDataModelUpdate edma_dmupdate = edma_dmview.getUpdateInterface();
        //Delete Teacher extension.
        edma_dmupdate.entityDelete(1, person.getID().value());
        //Delete the entity.
        return edma_dmupdate.entityDelete(0, person.getID().value());
    }

    /**
     * Updates an entity of kind: Person
     * @param person  The entity to update
     * @return        The updater interface for the entities of kind: Person
     */
    public PersonUpdater update(PersonViewer person)
    {
        return (PersonVUImpl) person;
    }

    /**
     * Starts creation of a new Teacher entity.
     * @param person  The base entity
     * @return        Builder interface to set the schoolMail attribute.
     */
    public TeacherBuilderSchoolMail newTeacher(PersonViewer person)
    {
        return new TeacherBuilder(edma_dmview.getUpdateInterface(), person.getID().value());
    }

    /**
     * Creates a new Teacher from a value in the value domain Teacher
     * @param person   The Person to extend.
     * @param teacher  The value for the new Teacher.
     * @return         The newly created Teacher
     * @throws         Throws a UniqueException, if the new entity violates any
     *                 of the unique indexes for this kind.
     */
    public TeacherUpdater newTeacher(PersonViewer person, Teacher teacher) throws UniqueException
    {
        Object[] edma_tmpValues = (Object[]) ((IValueInstance) teacher).edma_getValue();
        Object[] edma_values = new Object[edma_tmpValues.length];
        for(int i = 0; i < edma_tmpValues.length; ++i)
        {
            edma_values[i] = edma_tmpValues[i];
        }
        IEntity edma_entity = edma_dmview.getUpdateInterface().entityNewUnique(1, edma_values);
        return new TeacherVUImpl(edma_entity, edma_dmview);
    }

    /**
     * Deletes an entity of kind Teacher
     * @param teacher  The Teacher to be deleted. All extensions to this entity
     *                 will also be deleted.
     * @return         <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(TeacherViewer teacher)
    {
        IDataModelUpdate edma_dmupdate = edma_dmview.getUpdateInterface();
        //Delete the entity.
        return edma_dmupdate.entityDelete(1, teacher.getID().value());
    }

    /**
     * Updates an entity of kind: Teacher
     * @param teacher  The entity to update
     * @return         The updater interface for the entities of kind: Teacher
     */
    public TeacherUpdater update(TeacherViewer teacher)
    {
        return (TeacherVUImpl) teacher;
    }

    /**
     * Starts creation of a new Course entity.
     * @return  Builder interface to set the name attribute.
     */
    public CourseBuilderName newCourse()
    {
        return new CourseBuilder(edma_dmview.getUpdateInterface(), null);
    }

    /**
     * Starts creation of a new Course entity.
     * @param ID  ID of the entity
     * @return    Builder interface to set the name attribute.
     */
    public CourseBuilderName newCourse(Long ID)
    {
        return new CourseBuilder(edma_dmview.getUpdateInterface(), ID);
    }

    /**
     * Creates a new Course from a value in the value domain Course
     * @param course  The value for the new Course.
     * @return        The newly created Course
     * @throws        Throws a UniqueException, if the new entity violates any
     *                of the unique indexes for this kind.
     */
    public CourseUpdater newCourse(Course course) throws UniqueException
    {
        Object[] edma_tmpValues = (Object[]) ((IValueInstance) course).edma_getValue();
        Object[] edma_values = new Object[edma_tmpValues.length];
        for(int i = 0; i < edma_tmpValues.length; ++i)
        {
            edma_values[i] = edma_tmpValues[i];
        }
        IEntity edma_entity = edma_dmview.getUpdateInterface().entityNewUnique(2, edma_values);
        return new CourseVUImpl(edma_entity, edma_dmview);
    }

    /**
     * Deletes an entity of kind Course
     * @param course  The Course to be deleted. All extensions to this entity
     *                will also be deleted.
     * @return        <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(CourseViewer course)
    {
        IDataModelUpdate edma_dmupdate = edma_dmview.getUpdateInterface();
        //Delete the entity.
        return edma_dmupdate.entityDelete(2, course.getID().value());
    }

    /**
     * Updates an entity of kind: Course
     * @param course  The entity to update
     * @return        The updater interface for the entities of kind: Course
     */
    public CourseUpdater update(CourseViewer course)
    {
        return (CourseVUImpl) course;
    }


    /**
     * 
     */
    public class PersonBuilder implements PersonBuilderFirstName, PersonBuilderLastName, PersonBuilderPersonalMail
    {
        private IDataModelUpdate edma_upd;
        private Object[] value;



        /**
         * Constructor
         * @param edma_upd  Internal runtime interface
         * @param edma_ID   ID of the entity
         */
        public PersonBuilder(IDataModelUpdate edma_upd, Long edma_ID)
        {
            this.edma_upd = edma_upd;
            value = new Object[4];
            value[0] = edma_ID;
        }

        /**
         * sets the firstName attribute.
         * @param firstName  The value to assign to the firstName attribute
         * @return           Builder interface for setting the lastName
         *                   attribute
         */
        public PersonBuilderLastName firstName(Name firstName)
        {
            if(firstName == null) throw new NullPointerException();
            value[1] = ((IValueInstance) firstName).edma_getValue();
            return this;
        }

        /**
         * sets the lastName attribute.
         * @param lastName  The value to assign to the lastName attribute
         * @return          Builder interface for setting the personalMail
         *                  attribute
         */
        public PersonBuilderPersonalMail lastName(Name lastName)
        {
            if(lastName == null) throw new NullPointerException();
            value[2] = ((IValueInstance) lastName).edma_getValue();
            return this;
        }

        /**
         * sets the personalMail attribute.
         * @param personalMail  The value to assign to the personalMail
         *                      attribute
         * @return              The id of the created Person entity
         */
        public PersonUpdater personalMail(Email personalMail) throws UniqueException
        {
            if(personalMail == null) throw new NullPointerException();
            value[3] = ((IValueInstance) personalMail).edma_getValue();
            IEntity edma_entity = edma_upd.entityNewUnique(0, value);
            return new PersonVUImpl(edma_entity, edma_upd);
        }
    }



    /**
     * 
     */
    public class TeacherBuilder implements TeacherBuilderSchoolMail
    {
        private IDataModelUpdate edma_upd;
        private Object[] value;



        /**
         * Constructor
         * @param edma_upd  Internal runtime interface
         * @param edma_ID   ID of the entity
         */
        public TeacherBuilder(IDataModelUpdate edma_upd, Long edma_ID)
        {
            this.edma_upd = edma_upd;
            value = new Object[2];
            value[0] = edma_ID;
        }

        /**
         * sets the schoolMail attribute.
         * @param schoolMail  The value to assign to the schoolMail attribute
         * @return            The id of the created Teacher entity
         */
        public TeacherUpdater schoolMail(Email schoolMail) throws UniqueException
        {
            if(schoolMail == null) throw new NullPointerException();
            value[1] = ((IValueInstance) schoolMail).edma_getValue();
            IEntity edma_entity = edma_upd.entityNewUnique(1, value);
            return new TeacherVUImpl(edma_entity, edma_upd);
        }
    }



    /**
     * 
     */
    public class CourseBuilder implements CourseBuilderName
    {
        private IDataModelUpdate edma_upd;
        private Object[] value;



        /**
         * Constructor
         * @param edma_upd  Internal runtime interface
         * @param edma_ID   ID of the entity
         */
        public CourseBuilder(IDataModelUpdate edma_upd, Long edma_ID)
        {
            this.edma_upd = edma_upd;
            value = new Object[2];
            value[0] = edma_ID;
        }

        /**
         * sets the name attribute.
         * @param name  The value to assign to the name attribute
         * @return      The id of the created Course entity
         */
        public CourseUpdater name(Name name) throws UniqueException
        {
            if(name == null) throw new NullPointerException();
            value[1] = ((IValueInstance) name).edma_getValue();
            IEntity edma_entity = edma_upd.entityNewUnique(2, value);
            return new CourseVUImpl(edma_entity, edma_upd);
        }
    }

}
