package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.CourseList;
import learnedma.generated.valuedomains.JsonBoolean;
import learnedma.generated.valuedomains.Person;
import learnedma.generated.valuedomains.Person.PersonBuilderActive;
import learnedma.generated.valuedomains.Person.PersonBuilderCourselsit;
import learnedma.generated.valuedomains.Person.PersonBuilderStudent;
import learnedma.generated.valuedomains.Student;
import learnedma.generated.valuedomains.impl.JsonBooleanImpl;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class PersonBuilderImpl implements PersonBuilderActive, PersonBuilderCourselsit, PersonBuilderStudent
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public PersonBuilderImpl()
    {
        edma_value = new Object[3];
    }

    /**
     * sets the student field.
     * @param student  The value to assign to the student field
     * @return         Builder interface for setting the courselsit field
     */
    public PersonBuilderCourselsit student(Student student)
    {
        if(student == null) throw new NullPointerException("The field student in the Person ValueDomain may not be null");
        edma_value[0] = ((IValueInstance) student).edma_getValue();
        return this;
    }

    /**
     * sets the courselsit field.
     * @param courselsit  The value to assign to the courselsit field
     * @return            Builder interface for setting the active field
     */
    public PersonBuilderActive courselsit(CourseList courselsit)
    {
        if(courselsit == null) throw new NullPointerException("The field courselsit in the Person ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) courselsit).edma_getValue();
        return this;
    }

    /**
     * sets the active field.
     * @param active  The value to assign to the active field
     * @return        The created Person value
     */
    public Person active(JsonBoolean active)
    {
        if(active == null) throw new NullPointerException("The field active in the Person ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) active).edma_getValue();
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }

    /**
     * sets the active field.
     * @param active  The value to assign to the active field
     * @return        The created Person value
     */
    public Person active(Boolean active)
    {
        if(active == null) throw new NullPointerException("The field active in the Person ValueDomain may not be null");
        edma_value[2] = JsonBooleanImpl.edma_create(active);
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }
}
