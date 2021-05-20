package learnedma.generated;

import java.util.ArrayList;
import java.util.Collection;
import org.abstractica.edma.metamodel.IMetaEnvironment;
import org.abstractica.edma.metamodel.impl.MetaEnvironment;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder.Field;
import org.abstractica.edma.runtime.implementations.mem.modelstore.speed.newindex.IndexUtil;
import org.abstractica.edma.runtime.intf.IRuntimeFactory;
import org.abstractica.edma.valuedomains.impl.Constraint;

/**
 * 
 */
public class learnedma
{
    public static final IMetaEnvironment environment = generateEnvironment();



    /**
     * generate the environment
     * @return  
     */
    public static IMetaEnvironment generateEnvironment()
    {
        ValueDomainBuilder vdb = new ValueDomainBuilder();
        
        //String value domain: JsonString
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("JsonString", null, 0, null, null, edma_constraints, false);
        }
        
        //Double value domain: JsonNumber
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newDoubleDomain("JsonNumber", null, 0.0d, null, edma_constraints, false);
        }
        
        //Integer value domain: JsonInteger
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("JsonInteger", null, 0, null, edma_constraints, false);
        }
        
        //Boolean value domain: JsonBoolean
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newBooleanDomain("JsonBoolean", null, edma_constraints, false);
        }
        
        //Integer value domain: JsonNull
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("JsonNull", null, 0, 0, edma_constraints, false);
        }
        
        //OneOf value domain: JsonObject
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<String> optionDomains = new ArrayList<String>(5);
            optionDomains.add("Array");
            optionDomains.add("JsonString");
            optionDomains.add("JsonNumber");
            optionDomains.add("JsonBoolean");
            optionDomains.add("JsonNull");
            vdb.newOneOfDomain("JsonObject", null, optionDomains, edma_constraints, false);
        }
        
        //List value domain: Array
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newListDomain("Array", null, "JsonObject", null, null, edma_constraints, false);
        }
        
        //Struct value domain: Course
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("id", "JsonInteger", false));
            fields.add(vdb.newStructField("name", "JsonString", false));
            fields.add(vdb.newStructField("ects", "JsonNumber", false));
            vdb.newStructDomain("Course", null, fields, edma_constraints, false);
        }
        
        //List value domain: CourseList
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newListDomain("CourseList", null, "Course", null, null, edma_constraints, false);
        }
        
        //Struct value domain: Student
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("name", "JsonString", false));
            fields.add(vdb.newStructField("lastname", "JsonString", false));
            fields.add(vdb.newStructField("age", "JsonInteger", false));
            vdb.newStructDomain("Student", null, fields, edma_constraints, false);
        }
        
        //Struct value domain: Person
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("student", "Student", false));
            fields.add(vdb.newStructField("courselsit", "CourseList", false));
            fields.add(vdb.newStructField("active", "JsonBoolean", false));
            vdb.newStructDomain("Person", null, fields, edma_constraints, false);
        }
        MetaEnvironment edma_environment = new MetaEnvironment("learnedma");
        vdb.buildWithEnvironment(edma_environment);
        //Hack to make serializeable work...
        IndexUtil.setValueDomainDefinitions(edma_environment.getValueDomainDefinitions());
        return edma_environment;
    }

    /**
     * Constructor
     * @param factory  The runtime factory
     */
    public learnedma(IRuntimeFactory factory)
    {
        
    }
}
