package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.Course;
import learnedma.generated.valuedomains.Course.CourseBuilderEcts;
import learnedma.generated.valuedomains.Course.CourseBuilderId;
import learnedma.generated.valuedomains.Course.CourseBuilderName;
import learnedma.generated.valuedomains.JsonInteger;
import learnedma.generated.valuedomains.JsonNumber;
import learnedma.generated.valuedomains.JsonString;
import learnedma.generated.valuedomains.impl.JsonIntegerImpl;
import learnedma.generated.valuedomains.impl.JsonNumberImpl;
import learnedma.generated.valuedomains.impl.JsonStringImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class CourseBuilderImpl implements CourseBuilderEcts, CourseBuilderId, CourseBuilderName
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public CourseBuilderImpl()
    {
        edma_value = new Object[3];
    }

    /**
     * sets the id field.
     * @param id  The value to assign to the id field
     * @return    Builder interface for setting the name field
     */
    public CourseBuilderName id(JsonInteger id)
    {
        if(id == null) throw new NullPointerException("The field id in the Course ValueDomain may not be null");
        edma_value[0] = ((IValueInstance) id).edma_getValue();
        return this;
    }

    /**
     * sets the id field.
     * @param id  The value to assign to the id field
     * @return    Builder interface for setting the name field
     */
    public CourseBuilderName id(Integer id) throws InvalidValueException
    {
        if(id != null) JsonIntegerImpl.edma_validate(id);
        if(id == null) throw new NullPointerException("The field id in the Course ValueDomain may not be null");
        edma_value[0] = JsonIntegerImpl.edma_create(id);
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the ects field
     */
    public CourseBuilderEcts name(JsonString name)
    {
        if(name == null) throw new NullPointerException("The field name in the Course ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the ects field
     */
    public CourseBuilderEcts name(String name) throws InvalidValueException
    {
        if(name != null) JsonStringImpl.edma_validate(name);
        if(name == null) throw new NullPointerException("The field name in the Course ValueDomain may not be null");
        edma_value[1] = JsonStringImpl.edma_create(name);
        return this;
    }

    /**
     * sets the ects field.
     * @param ects  The value to assign to the ects field
     * @return      The created Course value
     */
    public Course ects(JsonNumber ects)
    {
        if(ects == null) throw new NullPointerException("The field ects in the Course ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) ects).edma_getValue();
        return new CourseImpl(CourseImpl.edma_create(edma_value));
    }

    /**
     * sets the ects field.
     * @param ects  The value to assign to the ects field
     * @return      The created Course value
     */
    public Course ects(Double ects) throws InvalidValueException
    {
        if(ects != null) JsonNumberImpl.edma_validate(ects);
        if(ects == null) throw new NullPointerException("The field ects in the Course ValueDomain may not be null");
        edma_value[2] = JsonNumberImpl.edma_create(ects);
        return new CourseImpl(CourseImpl.edma_create(edma_value));
    }
}
