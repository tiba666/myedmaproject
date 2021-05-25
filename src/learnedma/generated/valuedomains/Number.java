package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.learnedma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.NumberImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Number
 */
public abstract class Number implements Comparable<Number>
{
    protected static final IMetaValueDomain edma_domain = learnedma.environment.getValueDomainDefinitions().getValueDomain(9);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Number from the terminal
     */
    public static Number fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new NumberImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Number from the string representation
     */
    public static Number fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new NumberImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Number read from the stream
     */
    public static Number fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new NumberImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Number read from the stream
     */
    public static Number fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new NumberImpl(res);
    }

    /**
     * Call this method to create a new Number value. 
     * @param value  The value of the Number to be created.
     * @return       The newly created Number value
     */
    public static Number create(Integer value) throws InvalidValueException
    {
        NumberImpl.edma_validate(value);
        return new NumberImpl(NumberImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Integer is a valid Number
     * @param value  The Integer value to be tested
     * @return       true if the provided Integer is a valid Number
     */
    public static boolean isValidNumber(Integer value)
    {
        try
        {
            NumberImpl.edma_validate(value);
        }
        catch(InvalidValueException e)
        {
            return false;
        }
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Integer value that is stored in this Number
     * @return  The Integer value stored in this Number
     */
    public abstract Integer value();
}
