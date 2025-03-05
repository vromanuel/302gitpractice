package w2_task.program.src;

import java.util.ArrayList;


public class AuthenticationService implements IAuthenticationService
{
    private ArrayList<User> users = new ArrayList<>();

    public AuthenticationService()
    {
        User defaultUser = new User("test", "test");
        this.users.add(defaultUser);
    }

    public User signUp(String username, String password)
    {
        for(int i = 0; i<this.users.size(); i++)
        {
            if(username.equals(users.get(i).username))
            {
                return null;
            }
        }

        User newUser = new User(username, password);
        this.users.add(newUser);
        return newUser;

    }


}
