package w2_task;

public interface IAuthenticationService {
    User signUp(String username, String password);
    User logIn(String username, String password);
}