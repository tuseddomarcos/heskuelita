package Package;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main (String [] args) {

        Auth auth = new Auth ();

        auth.login ("juan", "qwerty");
    }
}

class Auth {

    public void login (String email, String pw) {


        List<IValidate<String>> list = Arrays.asList (new EmailValidation (),
                                                      new GmailValidation ());

        list.forEach ( e-> e.validate (email));
    }
}

class ValidateException extends RuntimeException {


    public ValidateException (String msg) {

        super (msg);
    }
}

interface IValidate<T> {


    void validate (T arg);
}

class EmailValidation implements IValidate<String> {


    public void validate (String arg) {

        if (!arg.contains ("@")) {

            throw new ValidateException ("Email "  + arg + " invalid !!!");
        }
    }
}

class GmailValidation implements IValidate<String> {


    public void validate (String arg) {

        if (!arg.endsWith ("gmail.com")) {

            throw new ValidateException ("Email "  + arg + " invalid !!!");
        }
    }
}