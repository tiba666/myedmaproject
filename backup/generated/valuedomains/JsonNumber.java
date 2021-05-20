package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.learnedma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.JsonNumberImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonNumber
 */
public abstract class JsonNumber implements Comparable<JsonNumber>
{
    protected static final IMetaValueDomain edma_domain = learnedma.environment.getValueDomainDefinitions().getValueDomain(23);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonNumber from the terminal
     */
    public static JsonNumber fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonNumberImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonNumber from the string representation
     */
    public static JsonNumber fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonNumberImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonNumber read from the stream
     */
    public static JsonNumber fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonNumberImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonNumber read from the stream
     */
    public static JsonNumber fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonNumberImpl(res);
    }

    /**
     * Call this method to create a new JsonNumber value. 
     * @param value  The value of the JsonNumber to be created.
     * @return       The newly created JsonNumber value
     */
    public static JsonNumber create(Double value) throws InvalidValueException
    {
        JsonNumberImpl.edma_validate(value);
        return new JsonNumberImpl(JsonNumberImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Double is a valid JsonNumber
     * @param value  The Double value to be tested
     * @return       true if the provided Double is a valid JsonNumber
     */
    public static boolean isValidJsonNumber(Double value)
    {
        try
        {
            JsonNumberImpl.edma_validate(value);
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
     * returns the Double value that is stored in this JsonNumber
     * @return  The Double value stored in this JsonNumber
     */
    public abstract Double value();
}
