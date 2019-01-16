package collegedreamersdemo.demo.forms;




import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min = 2, max = 20,
            message = "Please Enter value between 5-20")
    private String username;

    @Size(min = 3 , max = 20 , message = "Please Enter value between 5- 20")
    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
