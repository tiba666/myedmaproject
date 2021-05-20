import org.abstractica.edma.generator.EdmaGenerator;

public class Make {

    public static void main(String[] args) {
        String projectdir = "C:/edma_projects/myedmaproject";
        EdmaGenerator generator = new EdmaGenerator("learnedma",projectdir+"/edmasrc",projectdir+"/src", "learnedma");
        generator.make();
    }
}
