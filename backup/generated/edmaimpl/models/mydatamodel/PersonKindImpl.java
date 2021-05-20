package learnedma.generated.edmaimpl.models.mydatamodel;

import learnedma.generated.edmaimpl.models.mydatamodel.PersonSetImpl;
import learnedma.generated.edmaimpl.models.mydatamodel.PersonVUImpl;
import learnedma.generated.mydatamodel.kinds.person.PersonKind;
import learnedma.generated.mydatamodel.kinds.person.PersonSet;
import learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class PersonKindImpl implements PersonKind
{
    private int edma_kindIndex;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_kindIndex  kind index
     * @param edma_dmview     Internal runtime interface
     */
    public PersonKindImpl(int edma_kindIndex, IDataModelView edma_dmview)
    {
        this.edma_kindIndex = edma_kindIndex;
        this.edma_dmview = edma_dmview;
    }

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public PersonViewer getFromID(PersonID id)
    {
        IEntity res = edma_dmview.kindGetFromID(edma_kindIndex, id.value());
        if(res == null) return null;
        return new PersonVUImpl(res, edma_dmview);
    }

    /**
     * Returns an empty set of Person entities.
     * @return  An empty set of Person entities.
     */
    public PersonSet getEmptyPersonSet()
    {
        int newSetID = edma_dmview.kindGetEmptySet(0);
        return new PersonSetImpl(newSetID, edma_dmview);
    }

    /**
     * Returns the set of all Person entities.
     * @return  The set of all Person entities.
     */
    public PersonSet getAll()
    {
        int newSetID = edma_dmview.kindGetAll(0);
        return new PersonSetImpl(newSetID, edma_dmview);
    }

    /**
     * Returns the unique person from the unique-index on personalMail or
     * <tt>null</tt> if there is no person with the given personalMail.
     * @param personalMail  Value for personalMail
     * @return              The unique person from the unique-index on
     *                      personalMail or <tt>null</tt> if there is no person
     *                      with the given personalMail.
     */
    public PersonViewer getFromPersonalMail(Email personalMail)
    {
        Object[] edma_values = new Object[1];
        edma_values[0] = ((IValueInstance) personalMail).edma_getValue();
        IEntity res = edma_dmview.getKindIndex(0, 0).getFromUnique(edma_values);
        if(res == null) return null;
        return new PersonVUImpl(res, edma_dmview);
    }
}
