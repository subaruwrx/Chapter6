package ac.za.factory;

import ac.za.domain.UserAccount;

import java.util.Map;

/**
 * Created by Admin on 2016-05-02.
 */
public class UserAccountFactory {

    private static UserAccountFactory instance=null;
    private UserAccountFactory(){}

    public static UserAccountFactory getInstance() {
        if (instance == null) {
            instance = new UserAccountFactory();

        }
        return instance;
    }

    public static UserAccount createUserAccount(Map<String,String> values)
    {
        UserAccount account= new  UserAccount
                .Builder()
                .userName(values.get("userName"))
                .password(values.get("password"))
                .description(values.get("description"))
                .hintQuestion(values.get("hintQuestion"))
                .answer(values.get("answer"))
                .build();
        return account;
    }
}
