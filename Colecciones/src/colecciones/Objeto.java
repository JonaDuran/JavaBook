package colecciones;

/**
 *
 * @author jonathan
 */
public class Objeto {

    String str;
    int num;

    Objeto(String str, int num) {
        this.str = str;
        this.num = num;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }
    
}
