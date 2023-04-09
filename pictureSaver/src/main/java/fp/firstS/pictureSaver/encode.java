package fp.firstS.pictureSaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class encode {

    public static void main(String[] args) {

        String passwordToEncode = "test12345";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(passwordToEncode);
        System.out.println("Encoded password: " + encodedPassword);
    }
}
