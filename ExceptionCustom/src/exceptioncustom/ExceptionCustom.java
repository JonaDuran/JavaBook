package exceptioncustom;

/**
 *
 * @author Jonathan
 */
public class ExceptionCustom {

    public static void main(String[] args) {
        String user = "jona";
        String pass = "123";
        String repass = "123";

        MiHelper h = new MiHelper();

        try {
            h.validarPassword(pass, repass);
            
        } catch (CustomException e) {
            System.err.println("Error: " + e.getMessage());
            //e.printStackTrace();
        }
    }

    static public class CustomException extends Exception {

        public static final long serialVersionUID = 700L;

        public CustomException(String mensaje) {
            super(mensaje);
        }
    }

    static public class MiHelper {

        public void validarPassword(String pass, String rpass) throws CustomException {
            if (!pass.equals(rpass)) {
                throw new CustomException("No coinsiden");
            }

            if (pass.length() < 8) {
                throw new CustomException("Es muy corto");
            }
        }
    }
}
