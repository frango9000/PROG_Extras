package PROG_Ej_22_Genericos;
/**
 * @author fsancheztemprano
 */
public class NewMain {
    public static void main(String[] args) {
        

    }
    
    void e1(){
        ClaseObject obx1 = new ClaseObject();
        obx1.setVariable("aaa");
        String str = (String)obx1.getVariable();
        System.out.println(str);
    }
    void e2(){
        ClaseObject obx1 = new ClaseObject();
        Persona per = new Persona("ana",2000);
        obx1.setVariable(per);
        Persona per2 = (Persona)obx1.getVariable();
    }
}