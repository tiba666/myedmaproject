package learnedma.generated.mydatamodel.remote;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.mydatamodel.MyDataModel;
import learnedma.generated.mydatamodel.actions.CreateCourseResult;
import learnedma.generated.mydatamodel.actions.CreatePersonResult;
import learnedma.generated.mydatamodel.actions.CreateTeacherResult;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.mydatamodel.CourseID;
import learnedma.generated.valuedomains.mydatamodel.PersonID;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;
import org.abstractica.edma.runtime.remote.IServerInstance;

/**
 * 
 */
public class MyDataModelServerInstance implements IServerInstance
{
    private MyDataModel edma_inst;



    /**
     * Constructor
     * @param edma_inst  The data model instance
     */
    public MyDataModelServerInstance(MyDataModel edma_inst)
    {
        this.edma_inst = edma_inst;
    }

    /**
     * call a method
     * @param methodID  ID of the method to call
     * @param edma_in   Stream to read input parameters from
     * @param edma_out  Stream to write output parameters to
     */
    public void call(int methodID, DataInput edma_in, DataOutput edma_out) throws IOException
    {
        switch(methodID)
        {
            case 0:
            {
                Name in_firstName = Name.fromStreamNoValidate(edma_in);
                Name in_lastName = Name.fromStreamNoValidate(edma_in);
                Email in_personalMail = Email.fromStreamNoValidate(edma_in);
                CreatePersonResult edma_res = edma_inst.createPerson(in_firstName, in_lastName, in_personalMail);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                PersonID out_id = edma_res.getId();
                out_id.toStream(edma_out);
                break;
            }
            case 1:
            {
                PersonID in_personID = PersonID.fromStreamNoValidate(edma_in);
                Email in_schoolMail = Email.fromStreamNoValidate(edma_in);
                CreateTeacherResult edma_res = edma_inst.createTeacher(in_personID, in_schoolMail);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                TeacherID out_id = edma_res.getId();
                out_id.toStream(edma_out);
                break;
            }
            case 2:
            {
                Name in_courseName = Name.fromStreamNoValidate(edma_in);
                CreateCourseResult edma_res = edma_inst.createCourse(in_courseName);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                CourseID out_id = edma_res.getId();
                out_id.toStream(edma_out);
                break;
            }
            default:
                throw new RuntimeException("Invalid method ID: " + methodID);
        }
    }
}
