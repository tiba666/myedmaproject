package learnedma.generated.mydatamodel.remote;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import learnedma.generated.mydatamodel.MyDataModel;
import learnedma.generated.mydatamodel.actions.CreateCourseResult;
import learnedma.generated.mydatamodel.actions.CreatePersonResult;
import learnedma.generated.mydatamodel.actions.CreateTeacherResult;
import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.mydatamodel.CourseID;
import learnedma.generated.valuedomains.mydatamodel.PersonID;
import learnedma.generated.valuedomains.mydatamodel.TeacherID;

/**
 * 
 */
public class MyDataModelClientInstance implements MyDataModel
{
    private String edma_hostname;
    private int edma_port;



    /**
     * Constructor
     * @param edma_hostname  Name of the server host
     * @param edma_port      port to connect to
     */
    public MyDataModelClientInstance(String edma_hostname, int edma_port)
    {
        this.edma_hostname = edma_hostname;
        this.edma_port = edma_port;
    }

    /**
     * Creates a new Person
     * @param firstName     Input parameter firstName
     * @param lastName      Input parameter lastName
     * @param personalMail  Input parameter personalMail
     * @return              
     */
    public CreatePersonResult createPerson(Name firstName, Name lastName, Email personalMail) throws IOException
    {
        if(firstName == null)
        {
            throw new NullPointerException("firstName may not be null");
        }
        if(lastName == null)
        {
            throw new NullPointerException("lastName may not be null");
        }
        if(personalMail == null)
        {
            throw new NullPointerException("personalMail may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(0);
        firstName.toStream(edma_out);
        lastName.toStream(edma_out);
        personalMail.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        PersonID out_id = PersonID.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteCreatePersonResult(errorCode, errorMsg, errorDesc, out_id);
    }

    /**
     * Creates a new Teacher
     * @param personID    Input parameter personID
     * @param schoolMail  Input parameter schoolMail
     * @return            
     */
    public CreateTeacherResult createTeacher(PersonID personID, Email schoolMail) throws IOException
    {
        if(personID == null)
        {
            throw new NullPointerException("personID may not be null");
        }
        if(schoolMail == null)
        {
            throw new NullPointerException("schoolMail may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(1);
        personID.toStream(edma_out);
        schoolMail.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        TeacherID out_id = TeacherID.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteCreateTeacherResult(errorCode, errorMsg, errorDesc, out_id);
    }

    /**
     * Creates a new Course
     * @param courseName  Input parameter courseName
     * @return            
     */
    public CreateCourseResult createCourse(Name courseName) throws IOException
    {
        if(courseName == null)
        {
            throw new NullPointerException("courseName may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(2);
        courseName.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        CourseID out_id = CourseID.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteCreateCourseResult(errorCode, errorMsg, errorDesc, out_id);
    }
}
