package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.learnedma;
import learnedma.generated.valuedomains.CourseList;
import learnedma.generated.valuedomains.JsonBoolean;
import learnedma.generated.valuedomains.Student;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.PersonBuilderImpl;
import learnedma.generated.valuedomains.impl.PersonImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Person
 */
public abstract class Person implements Comparable<Person>
{
    protected static final IMetaValueDomain edma_domain = learnedma.environment.getValueDomainDefinitions().getValueDomain(10);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Person from the terminal
     */
    public static Person fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new PersonImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Person from the string representation
     */
    public static Person fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new PersonImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Person read from the stream
     */
    public static Person fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new PersonImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Person read from the stream
     */
    public static Person fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new PersonImpl(res);
    }

    /**
     * Starts creation of a new Person
     * @return  Builder interface to set the student field
     */
    public static PersonBuilderStudent create()
    {
        return new PersonBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field student
     * @return  The value of the field student
     */
    public abstract Student student();

    /**
     * returns the value of the field courselsit
     * @return  The value of the field courselsit
     */
    public abstract CourseList courselsit();

    /**
     * returns the value of the field active
     * @return  The value of the field active
     */
    public abstract JsonBoolean active();


    /**
     * Builder interface for setting the student field of Person
     */
    public interface PersonBuilderStudent
    {

        /**
         * sets the student field.
         * @param student  The value to assign to the student field
         * @return         Builder interface for setting the courselsit field
         */
        public PersonBuilderCourselsit student(Student student);

    }



    /**
     * Builder interface for setting the courselsit field of Person
     */
    public interface PersonBuilderCourselsit
    {

        /**
         * sets the courselsit field.
         * @param courselsit  The value to assign to the courselsit field
         * @return            Builder interface for setting the active field
         */
        public PersonBuilderActive courselsit(CourseList courselsit);

    }



    /**
     * Builder interface for setting the active field of Person
     */
    public interface PersonBuilderActive
    {

        /**
         * sets the active field.
         * @param active  The value to assign to the active field
         * @return        The created Person value
         */
        public Person active(JsonBoolean active);

        /**
         * sets the active field.
         * @param active  The value to assign to the active field
         * @return        The created Person value
         */
        public Person active(Boolean active);

    }

}
