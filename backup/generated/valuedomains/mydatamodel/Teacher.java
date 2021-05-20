package learnedma.generated.valuedomains.mydatamodel;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.learnedma;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import learnedma.generated.valuedomains.mydatamodel.impl.TeacherBuilderImpl;
import learnedma.generated.valuedomains.mydatamodel.impl.TeacherImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Teacher
 */
public abstract class Teacher implements Comparable<Teacher>
{
    protected static final IMetaValueDomain edma_domain = learnedma.environment.getValueDomainDefinitions().getValueDomain(35);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Teacher from the terminal
     */
    public static Teacher fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new TeacherImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Teacher from the string representation
     */
    public static Teacher fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new TeacherImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Teacher read from the stream
     */
    public static Teacher fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new TeacherImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Teacher read from the stream
     */
    public static Teacher fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new TeacherImpl(res);
    }

    /**
     * Starts creation of a new Teacher
     * @return  Builder interface to set the ID field
     */
    public static TeacherBuilderID create()
    {
        return new TeacherBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field ID
     * @return  The value of the field ID
     */
    public abstract TeacherID ID();

    /**
     * returns the value of the field schoolMail
     * @return  The value of the field schoolMail
     */
    public abstract Email schoolMail();


    /**
     * Builder interface for setting the ID field of Teacher
     */
    public interface TeacherBuilderID
    {

        /**
         * sets the ID field.
         * @param ID  The value to assign to the ID field
         * @return    Builder interface for setting the schoolMail field
         */
        public TeacherBuilderSchoolMail ID(TeacherID ID);

        /**
         * sets the ID field.
         * @param ID  The value to assign to the ID field
         * @return    Builder interface for setting the schoolMail field
         */
        public TeacherBuilderSchoolMail ID(Long ID) throws InvalidValueException;

        /**
         * sets the fieldID to null.
         * @return  Builder interface for setting the schoolMail field
         */
        public TeacherBuilderSchoolMail noID();

    }



    /**
     * Builder interface for setting the schoolMail field of Teacher
     */
    public interface TeacherBuilderSchoolMail
    {

        /**
         * sets the schoolMail field.
         * @param schoolMail  The value to assign to the schoolMail field
         * @return            The created Teacher value
         */
        public Teacher schoolMail(Email schoolMail);

        /**
         * sets the schoolMail field.
         * @param schoolMail  The value to assign to the schoolMail field
         * @return            The created Teacher value
         */
        public Teacher schoolMail(String schoolMail) throws InvalidValueException;

    }

}
