package learnedma.generated.mydatamodel.kinds.teacher;

import learnedma.generated.valuedomains.Email;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;

/**
 * This is the update interface for Teacher
 */
public interface TeacherUpdater extends TeacherViewer
{

    /**
     * Begin attribute updates on this Teacher
     * @return  An attribute update interface for chaining attribute updates
     */
    public TeacherAttUpd beginUpdate();

    /**
     * Interface for updating attributes on an entity of kind: Teacher
     */
    public interface TeacherAttUpd
    {

        /**
         * Sets the attribute schoolMail on this Teacher
         * @param schoolMail  The value to set
         * @return            Interface for chaining attribute updates
         */
        public TeacherAttUpdUnique setSchoolMail(Email schoolMail);

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save();

    }

    /**
     * Interface for updating attributes on an entity of kind: Teacher
     */
    public interface TeacherAttUpdUnique
    {

        /**
         * Sets the attribute schoolMail on this Teacher
         * @param schoolMail  The value to set
         * @return            Interface for chaining attribute updates
         */
        public TeacherAttUpdUnique setSchoolMail(Email schoolMail);

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save() throws UniqueException;

    }

}
