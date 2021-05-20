package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.JsonInteger;
import learnedma.generated.valuedomains.JsonString;
import learnedma.generated.valuedomains.Student;
import learnedma.generated.valuedomains.Student.StudentBuilderAge;
import learnedma.generated.valuedomains.Student.StudentBuilderLastname;
import learnedma.generated.valuedomains.Student.StudentBuilderName;
import learnedma.generated.valuedomains.impl.JsonIntegerImpl;
import learnedma.generated.valuedomains.impl.JsonStringImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class StudentBuilderImpl implements StudentBuilderAge, StudentBuilderLastname, StudentBuilderName
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public StudentBuilderImpl()
    {
        edma_value = new Object[3];
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the lastname field
     */
    public StudentBuilderLastname name(JsonString name)
    {
        if(name == null) throw new NullPointerException("The field name in the Student ValueDomain may not be null");
        edma_value[0] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the lastname field
     */
    public StudentBuilderLastname name(String name) throws InvalidValueException
    {
        if(name != null) JsonStringImpl.edma_validate(name);
        if(name == null) throw new NullPointerException("The field name in the Student ValueDomain may not be null");
        edma_value[0] = JsonStringImpl.edma_create(name);
        return this;
    }

    /**
     * sets the lastname field.
     * @param lastname  The value to assign to the lastname field
     * @return          Builder interface for setting the age field
     */
    public StudentBuilderAge lastname(JsonString lastname)
    {
        if(lastname == null) throw new NullPointerException("The field lastname in the Student ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) lastname).edma_getValue();
        return this;
    }

    /**
     * sets the lastname field.
     * @param lastname  The value to assign to the lastname field
     * @return          Builder interface for setting the age field
     */
    public StudentBuilderAge lastname(String lastname) throws InvalidValueException
    {
        if(lastname != null) JsonStringImpl.edma_validate(lastname);
        if(lastname == null) throw new NullPointerException("The field lastname in the Student ValueDomain may not be null");
        edma_value[1] = JsonStringImpl.edma_create(lastname);
        return this;
    }

    /**
     * sets the age field.
     * @param age  The value to assign to the age field
     * @return     The created Student value
     */
    public Student age(JsonInteger age)
    {
        if(age == null) throw new NullPointerException("The field age in the Student ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) age).edma_getValue();
        return new StudentImpl(StudentImpl.edma_create(edma_value));
    }

    /**
     * sets the age field.
     * @param age  The value to assign to the age field
     * @return     The created Student value
     */
    public Student age(Integer age) throws InvalidValueException
    {
        if(age != null) JsonIntegerImpl.edma_validate(age);
        if(age == null) throw new NullPointerException("The field age in the Student ValueDomain may not be null");
        edma_value[2] = JsonIntegerImpl.edma_create(age);
        return new StudentImpl(StudentImpl.edma_create(edma_value));
    }
}
