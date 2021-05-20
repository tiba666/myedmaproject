package learnedma.generated.valuedomains.mydatamodel.impl;

import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.impl.EmailImpl;
import learnedma.generated.valuedomains.mydatamodel.Teacher;
import learnedma.generated.valuedomains.mydatamodel.Teacher.TeacherBuilderID;
import learnedma.generated.valuedomains.mydatamodel.Teacher.TeacherBuilderSchoolMail;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import learnedma.generated.valuedomains.mydatamodel.impl.TeacherIDImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class TeacherBuilderImpl implements TeacherBuilderID, TeacherBuilderSchoolMail
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public TeacherBuilderImpl()
    {
        edma_value = new Object[2];
    }

    /**
     * sets the ID field.
     * @param ID  The value to assign to the ID field
     * @return    Builder interface for setting the schoolMail field
     */
    public TeacherBuilderSchoolMail ID(TeacherID ID)
    {
        edma_value[0] = (ID == null ? null : (((IValueInstance) ID).edma_getValue()));
        return this;
    }

    /**
     * sets the ID field.
     * @param ID  The value to assign to the ID field
     * @return    Builder interface for setting the schoolMail field
     */
    public TeacherBuilderSchoolMail ID(Long ID) throws InvalidValueException
    {
        if(ID != null) TeacherIDImpl.edma_validate(ID);
        edma_value[0] = (ID == null ? null : (TeacherIDImpl.edma_create(ID)));
        return this;
    }

    /**
     * sets the fieldID to null.
     * @return  Builder interface for setting the schoolMail field
     */
    public TeacherBuilderSchoolMail noID()
    {
        edma_value[0] = null;
        return this;
    }

    /**
     * sets the schoolMail field.
     * @param schoolMail  The value to assign to the schoolMail field
     * @return            The created Teacher value
     */
    public Teacher schoolMail(Email schoolMail)
    {
        if(schoolMail == null) throw new NullPointerException("The field schoolMail in the Teacher ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) schoolMail).edma_getValue();
        return new TeacherImpl(TeacherImpl.edma_create(edma_value));
    }

    /**
     * sets the schoolMail field.
     * @param schoolMail  The value to assign to the schoolMail field
     * @return            The created Teacher value
     */
    public Teacher schoolMail(String schoolMail) throws InvalidValueException
    {
        if(schoolMail != null) EmailImpl.edma_validate(schoolMail);
        if(schoolMail == null) throw new NullPointerException("The field schoolMail in the Teacher ValueDomain may not be null");
        edma_value[1] = EmailImpl.edma_create(schoolMail);
        return new TeacherImpl(TeacherImpl.edma_create(edma_value));
    }
}
