package learnedma.generated.edmaimpl.models.mydatamodel;

import learnedma.generated.edmaimpl.models.mydatamodel.TeacherSetImpl;
import learnedma.generated.edmaimpl.models.mydatamodel.TeacherVUImpl;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherKind;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherSet;
import learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class TeacherKindImpl implements TeacherKind
{
    private int edma_kindIndex;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_kindIndex  kind index
     * @param edma_dmview     Internal runtime interface
     */
    public TeacherKindImpl(int edma_kindIndex, IDataModelView edma_dmview)
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
    public TeacherViewer getFromID(TeacherID id)
    {
        IEntity res = edma_dmview.kindGetFromID(edma_kindIndex, id.value());
        if(res == null) return null;
        return new TeacherVUImpl(res, edma_dmview);
    }

    /**
     * Returns an empty set of Teacher entities.
     * @return  An empty set of Teacher entities.
     */
    public TeacherSet getEmptyTeacherSet()
    {
        int newSetID = edma_dmview.kindGetEmptySet(1);
        return new TeacherSetImpl(newSetID, edma_dmview);
    }

    /**
     * Returns the set of all Teacher entities.
     * @return  The set of all Teacher entities.
     */
    public TeacherSet getAll()
    {
        int newSetID = edma_dmview.kindGetAll(1);
        return new TeacherSetImpl(newSetID, edma_dmview);
    }

    /**
     * Returns the unique teacher from the unique-index on schoolMail or
     * <tt>null</tt> if there is no teacher with the given schoolMail.
     * @param schoolMail  Value for schoolMail
     * @return            The unique teacher from the unique-index on
     *                    schoolMail or <tt>null</tt> if there is no teacher
     *                    with the given schoolMail.
     */
    public TeacherViewer getFromSchoolMail(Email schoolMail)
    {
        Object[] edma_values = new Object[1];
        edma_values[0] = ((IValueInstance) schoolMail).edma_getValue();
        IEntity res = edma_dmview.getKindIndex(1, 0).getFromUnique(edma_values);
        if(res == null) return null;
        return new TeacherVUImpl(res, edma_dmview);
    }
}
