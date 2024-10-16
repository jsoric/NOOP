package pcks_wildcard;

import java.util.List;

public class AUX_CLS {

    public static void processNamesInList(List<? extends UserSND> lst){
        for(UserSND usr : lst){
            System.out.println("Name is: "+usr.getName());
        }
    }

//    public static void addSomeUser(List<? extends UserSND> lst, UserSND user ){
//      lst.add(user);
//      }

    public static void addNewUser(List<? super UserSND> users){
        users.add(new UserSND("Ime"));
    }


}
