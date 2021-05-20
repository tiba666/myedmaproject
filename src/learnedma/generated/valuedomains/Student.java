package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.learnedma;
import learnedma.generated.valuedomains.JsonInteger;
import learnedma.generated.valuedomains.JsonString;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.StudentBuilderImpl;
import learnedma.generated.valuedomains.impl.StudentImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Student
 */
public abstract class Student implements Comparable<Student>
{
    protected static final IMetaValueDomain edma_domain = learnedma.environment.getValueDomainDefinitions().getValueDomain(9);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Student from the terminal
     */
    public static Student fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new StudentImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Student from the string representation
     */
    public static Student fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new StudentImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Student read from the stream
     */
    public static Student fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new StudentImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Student read from the stream
     */
    public static Student fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new StudentImpl(res);
    }

    /**
     * Starts creation of a new Student
     * @return  Builder interface to set the name field
     */
    public static StudentBuilderName create()
    {
        return new StudentBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field name
     * @return  The value of the field name
     */
    public abstract JsonString name();

    /**
     * returns the value of the field lastname
     * @return  The value of the field lastname
     */
    public abstract JsonString lastname();

    /**
     * returns the value of the field age
     * @return  The value of the field age
     */
    public abstract JsonInteger age();


    /**
     * Builder interface for setting the name field of Student
     */
    public interface StudentBuilderName
    {

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the lastname field
         */
        public StudentBuilderLastname name(JsonString name);

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the lastname field
         */
        public StudentBuilderLastname name(String name) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the lastname field of Student
     */
    public interface StudentBuilderLastname
    {

        /**
         * sets the lastname field.
         * @param lastname  The value to assign to the lastname field
         * @return          Builder interface for setting the age field
         */
        public StudentBuilderAge lastname(JsonString lastname);

        /**
         * sets the lastname field.
         * @param lastname  The value to assign to the lastname field
         * @return          Builder interface for setting the age field
         */
        public StudentBuilderAge lastname(String lastname) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the age field of Student
     */
    public interface StudentBuilderAge
    {

        /**
         * sets the age field.
         * @param age  The value to assign to the age field
         * @return     The created Student value
         */
        public Student age(JsonInteger age);

        /**
         * sets the age field.
         * @param age  The value to assign to the age field
         * @return     The created Student value
         */
        public Student age(Integer age) throws InvalidValueException;

    }

}
