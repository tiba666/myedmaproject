package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.Course;
import learnedma.generated.valuedomains.Course.CourseBuilderEtcs;
import learnedma.generated.valuedomains.Course.CourseBuilderId;
import learnedma.generated.valuedomains.Course.CourseBuilderName;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.Number;
import learnedma.generated.valuedomains.impl.NameImpl;
import learnedma.generated.valuedomains.impl.NumberImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class CourseBuilderImpl implements CourseBuilderEtcs, CourseBuilderId, CourseBuilderName
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
    public CourseBuilderName id(Number id)
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
        if(id != null) NumberImpl.edma_validate(id);
        if(id == null) throw new NullPointerException("The field id in the Course ValueDomain may not be null");
        edma_value[0] = NumberImpl.edma_create(id);
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the etcs field
     */
    public CourseBuilderEtcs name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in the Course ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the etcs field
     */
    public CourseBuilderEtcs name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException("The field name in the Course ValueDomain may not be null");
        edma_value[1] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the etcs field.
     * @param etcs  The value to assign to the etcs field
     * @return      The created Course value
     */
    public Course etcs(Number etcs)
    {
        if(etcs == null) throw new NullPointerException("The field etcs in the Course ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) etcs).edma_getValue();
        return new CourseImpl(CourseImpl.edma_create(edma_value));
    }

    /**
     * sets the etcs field.
     * @param etcs  The value to assign to the etcs field
     * @return      The created Course value
     */
    public Course etcs(Integer etcs) throws InvalidValueException
    {
        if(etcs != null) NumberImpl.edma_validate(etcs);
        if(etcs == null) throw new NullPointerException("The field etcs in the Course ValueDomain may not be null");
        edma_value[2] = NumberImpl.edma_create(etcs);
        return new CourseImpl(CourseImpl.edma_create(edma_value));
    }
}
