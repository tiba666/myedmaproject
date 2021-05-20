package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.learnedma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.JsonIntegerImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonInteger
 */
public abstract class JsonInteger implements Comparable<JsonInteger>
{
    protected static final IMetaValueDomain edma_domain = learnedma.environment.getValueDomainDefinitions().getValueDomain(2);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonInteger from the terminal
     */
    public static JsonInteger fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonIntegerImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonInteger from the string representation
     */
    public static JsonInteger fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonIntegerImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonInteger read from the stream
     */
    public static JsonInteger fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonIntegerImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonInteger read from the stream
     */
    public static JsonInteger fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonIntegerImpl(res);
    }

    /**
     * Call this method to create a new JsonInteger value. 
     * @param value  The value of the JsonInteger to be created.
     * @return       The newly created JsonInteger value
     */
    public static JsonInteger create(Integer value) throws InvalidValueException
    {
        JsonIntegerImpl.edma_validate(value);
        return new JsonIntegerImpl(JsonIntegerImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Integer is a valid JsonInteger
     * @param value  The Integer value to be tested
     * @return       true if the provided Integer is a valid JsonInteger
     */
    public static boolean isValidJsonInteger(Integer value)
    {
        try
        {
            JsonIntegerImpl.edma_validate(value);
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
     * returns the Integer value that is stored in this JsonInteger
     * @return  The Integer value stored in this JsonInteger
     */
    public abstract Integer value();
}
