package learnedma;

import learnedma.generated.learnedma;

import learnedma.generated.valuedomains.Course;
import learnedma.generated.valuedomains.CourseList;
import learnedma.generated.valuedomains.Person;
import learnedma.generated.valuedomains.Student;
import org.abstractica.edma.runtime.implementations.common.collectionfactory.java.JavaCollectionFactory;
import org.abstractica.edma.runtime.implementations.mem.RuntimeFactory;
import org.abstractica.edma.valuedomains.userinput.SimpleTerminal;

import java.io.IOException;

public class Play {

    public static void main(String[] args) throws IOException {

        var student = Student.create().name("nico").lastname("pedersen").age(15);
        var course = Course.create().id(1).name("klatrekursus").ects(0.0);
        var courselist = CourseList.begin().add(course).end();
        var person = Person.create().student(student).courselsit(courselist).active(true);

        System.out.println(person);

        System.out.println(toStringOpbject(person));





    }
    private static String toStringOpbject(Person person) {
        return "{\"student\": { \"name\": " + person.student().name() + ", \"age\":" + person.student().age() + "}," +
                "\"courses\": [{\"id\":" + person.courselsit().get(0).id() + ", \"name\":" + person.courselsit().get(0).name() + ", \"ects\":" + person.courselsit().get(0).ects() + "}]" + "}";
    }
}
