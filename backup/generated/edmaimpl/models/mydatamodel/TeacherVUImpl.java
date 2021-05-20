package learnedma.generated.edmaimpl.models.mydatamodel;

import java.util.HashMap;
import java.util.Map;
import learnedma.generated.edmaimpl.models.mydatamodel.CourseSetImpl;
import learnedma.generated.edmaimpl.models.mydatamodel.PersonVUImpl;
import learnedma.generated.mydatamodel.kinds.course.CourseSet;
import learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherUpdater;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.impl.EmailImpl;
import learnedma.generated.valuedomains.mydatamodel.Teacher;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import learnedma.generated.valuedomains.mydatamodel.impl.TeacherIDImpl;
import learnedma.generated.valuedomains.mydatamodel.impl.TeacherImpl;
import org.abstractica.edma.runtime.intf.IDataModelUpdate;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class TeacherVUImpl implements TeacherUpdater, TeacherViewer
{
    protected IEntity edma_entity;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_entity  Internal entity
     * @param edma_dmview  Internal runtime interface
     */
    public TeacherVUImpl(IEntity edma_entity, IDataModelView edma_dmview)
    {
        this.edma_entity = edma_entity;
        this.edma_dmview = edma_dmview;
    }

    /**
     * Create a copy of this Teacher at this instance in time
     * @return  A copy of this Teacher entity as a value  from the value domain
     *          Teacher
     */
    public Teacher snapshot()
    {
        Object[] res = new Object[2];
        Object[] internal = edma_entity.getValue();
        res[0] = internal[0];
        res[1] = internal[1];
        return new TeacherImpl(res);
    }

    /**
     * Returns the ID of this Teacher
     * @return  The ID of this Teacher
     */
    public TeacherID getID()
    {
        return new TeacherIDImpl(edma_entity.getID());
    }

    /**
     * Returns the attribute schoolMail of this Teacher
     * @return  The value of the attribute schoolMail
     */
    public Email getSchoolMail()
    {
        return new EmailImpl(edma_entity.getValue()[1]);
    }

    /**
     * Views this Teacher as its base kind Person. Will never return
     * <tt>null</tt> since Teacher is always an extension of Person
     * @return  The Person view of this Teacher
     */
    public PersonViewer asPerson()
    {
        IEntity base = edma_dmview.kindGetFromID(0, edma_entity.getID());
        return new PersonVUImpl(base, edma_dmview);
    }

    /**
     * This methods follows the relation TeacherAssignment
     * @return  The result of following the relation TeacherAssignment
     */
    public CourseSet getCourseSet()
    {
        int setID = edma_dmview.relationAsBGetASet(1, edma_entity.getID());
        return new CourseSetImpl(setID, edma_dmview);
    }

    /**
     * Returns <tt>true</tt> if this entity has the same ID as the provided
     * entity
     * @param o  The object to compare with
     * @return   <tt>true</tt> if this entity has the same ID as the provided
     *           entity
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof TeacherViewer)) return false;
        TeacherViewer other = (TeacherViewer) o;
        return getID().equals(other.getID());
    }

    /**
     * Returns the hash code of this entity
     * @return  The hash code of this entity
     */
    public int hashCode()
    {
        return getID().hashCode();
    }

    /**
     * Begin attribute updates on this Teacher
     * @return  An attribute update interface for chaining attribute updates
     */
    public TeacherAttUpd beginUpdate()
    {
        return new TeacherAttUpdImpl(edma_entity.getID(), edma_dmview.getUpdateInterface());
    }


    /**
     * 
     */
    private class TeacherAttUpdImpl implements TeacherAttUpd
    {
        private Long entityID;
        private IDataModelUpdate edma_dmupdate;
        private Map<Integer, Object> updateMap;



        /**
         * Constructor
         * @param entityID       ID of the entity to update
         * @param edma_dmupdate  Internal runtime interface
         */
        private TeacherAttUpdImpl(Long entityID, IDataModelUpdate edma_dmupdate)
        {
            this.entityID = entityID;
            this.edma_dmupdate = edma_dmupdate;
            this.updateMap = new HashMap<Integer, Object>();
        }

        /**
         * Sets the attribute schoolMail on this Teacher
         * @param schoolMail  The value to set
         * @return            Interface for chaining attribute updates
         */
        public TeacherAttUpdUnique setSchoolMail(Email schoolMail)
        {
            updateMap.put(0, ((IValueInstance) schoolMail).edma_getValue());
            return new TeacherAttUpdUniqueImpl(entityID, updateMap, edma_dmupdate);
        }

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save()
        {
            return edma_dmupdate.entityUpdate(1, entityID, updateMap);
        }
    }



    /**
     * 
     */
    private class TeacherAttUpdUniqueImpl implements TeacherAttUpdUnique
    {
        private Long entityID;
        private Map<Integer, Object> updateMap;
        private IDataModelUpdate edma_dmupdate;



        /**
         * Constructor
         * @param entityID       ID of the entity to update
         * @param updateMap      Map of updates
         * @param edma_dmupdate  Internal runtime interface
         */
        private TeacherAttUpdUniqueImpl(Long entityID, Map<Integer, Object> updateMap, IDataModelUpdate edma_dmupdate)
        {
            this.entityID = entityID;
            this.updateMap = updateMap;
            this.edma_dmupdate = edma_dmupdate;
        }

        /**
         * Sets the attribute schoolMail on this Teacher
         * @param schoolMail  The value to set
         * @return            Interface for chaining attribute updates
         */
        public TeacherAttUpdUnique setSchoolMail(Email schoolMail)
        {
            updateMap.put(0, ((IValueInstance) schoolMail).edma_getValue());
            return this;
        }

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save() throws UniqueException
        {
            return edma_dmupdate.entityUpdateUnique(1, entityID, updateMap);
        }
    }

}
