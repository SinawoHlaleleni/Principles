package PLKnowledge;

import java.io.IOException;

/* Violeted PLK because can not call method if its not in the class that you have reference
public class Computer {
    private String name;
    private String processor;

    public String getName() {
        return name;
    }

    public String getProcessor() {
        return processor;
    }

    public class Storage{
        public void store(Computer computer){
            computer.getName().getBytes();
            computer.getProcessor().getBytes();
        }
    }
}*/


//fixed PLK
public class Computer{

    private String name;
    public void type(){
        name.length();
    }
}
