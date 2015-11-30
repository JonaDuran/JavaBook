package scriptsjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.script.*;

/**
 *
 * @author Jonathan
 */
/*
http://javaexperto.blogspot.mx/2009/12/scripting-en-java.html
http://davidburgosonline.com/web-dev/2012/como-interpretar-expresiones-de-un-string-en-java/
*/
public class ScriptsJava {

    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        ScriptEngine se = new ScriptEngineManager().getEngineByName("js");
        
        String script = br.readLine();
        /*script = se.eval(script).toString();
        System.out.println(script);*/
        System.out.println(se.eval(script));
    }

    public static void ejemplo() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine interprete = manager.getEngineByName("js");
        
        try {
            String formula = "x*y/100";
            interprete.put("x", 5);
            interprete.put("y", 80);
            System.out.println("Resultado = " + interprete.eval(formula));
            
        } catch (ScriptException se) {
            se.printStackTrace();
        }
    }
    
}
