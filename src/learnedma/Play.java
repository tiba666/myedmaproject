package learnedma;

import learnedma.generated.learnedma;

import learnedma.generated.valuedomains.*;
import org.abstractica.edma.runtime.implementations.common.collectionfactory.java.JavaCollectionFactory;
import org.abstractica.edma.runtime.implementations.mem.RuntimeFactory;
import org.abstractica.edma.valuedomains.userinput.SimpleTerminal;

import java.io.IOException;

public class Play {

    public static void main(String[] args) throws IOException {

        var o = JsonObject.create(
                JsonObjectLiteral.begin()
                        .add(Member.create()
                                .name("Student")
                                .value(JsonObject
                                        .create(JsonString.create("John"))))
                        .add(Member.create().name("courses").value(JsonObject.create(Array.begin().add(JsonObject.create(Course.create().id(1).name("horse riding").etcs(12))).add(JsonObject.create(Course.create().id(2).name("chess").etcs(13))).end())))
                        .end());

        System.out.println(getString(o));


    }

    public static String getString(JsonObject o) {
        if (o.isArray()) return getString(o.asArray());
        if (o.isJsonNull()) return "null";
        if (o.isArray()) return getString(o.asArray());
        if (o.isJsonNumber()) return o.asJsonNumber().value().toString();
        if (o.isJsonString()) return getString(o.asJsonString());
        if (o.isJsonObjectLiteral()) return getString(o.asJsonObjectLiteral());
        if(o.isCourse()) return getString(o.asCourse());
        return "";


    }
    private static String getString(Course asCourse) {
        var sb = new StringBuffer();
        sb.append("{");
        sb.append("\"id\" :" + asCourse.id());
        sb.append(",");
        sb.append("\"name\" :" + asCourse.name());
        sb.append(",");
        sb.append("\"etc\" :" + asCourse.etcs());
        sb.append("}");
        return sb.toString();
    }

    private static String getString(JsonObjectLiteral asJsonObjectLiteral) {
        var sb = new StringBuffer();
        sb.append("{");
        boolean first = true;
        for (Member m : asJsonObjectLiteral) {
            if (!first) {
                sb.append(",");
            } else {
                first = false;
            }
            sb.append(getString(m));
        }
        sb.append("}");
        return sb.toString();
    }

    private static String getString(Member m) {
        var sb = new StringBuffer();
        sb.append(m.name());
        sb.append(":");
        sb.append(getString(m.value()));
        return sb.toString();
    }

    private static String getString(Array asArray) {
        var sb = new StringBuffer();
        sb.append("[");
        boolean first = true;
        for (JsonObject e : asArray) {
            if (!first) {
                sb.append(",");
            } else {
                first = false;
            }
            sb.append(getString(e));

        }
        sb.append("]");
        return sb.toString();
    }

    private static String getString(JsonString s) {
        return "\"" + s.value() + "\"";
    }
}
