package learnedma.generated.mydatamodel.kinds.person;

import learnedma.generated.mydatamodel.kinds.person.PersonSet;
import learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.mydatamodel.PersonID;

/**
 * Interface for the kind: Person
 */
public interface PersonKind
{

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public PersonViewer getFromID(PersonID id);

    /**
     * Returns an empty set of Person entities.
     * @return  An empty set of Person entities.
     */
    public PersonSet getEmptyPersonSet();

    /**
     * Returns the set of all Person entities.
     * @return  The set of all Person entities.
     */
    public PersonSet getAll();

    /**
     * Returns the unique person from the unique-index on personalMail or
     * <tt>null</tt> if there is no person with the given personalMail.
     * @param personalMail  Value for personalMail
     * @return              The unique person from the unique-index on
     *                      personalMail or <tt>null</tt> if there is no person
     *                      with the given personalMail.
     */
    public PersonViewer getFromPersonalMail(Email personalMail);

}
