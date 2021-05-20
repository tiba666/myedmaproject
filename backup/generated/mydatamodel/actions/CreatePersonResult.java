package learnedma.generated.mydatamodel.actions;

import learnedma.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.runtime.intf.IResult;

/**
 * Access to the result of the method: createPerson
 */
public interface CreatePersonResult extends IResult
{

    /**
     * Returns the output id:PersonID
     * @return  The output id:PersonID
     */
    public PersonID getId();

}
