public class HandyPhone extends Phone{
    String mailAddress;

    void mail(String to){
        System.out.println(mailAddress + "から" + to + "へメールしました｡");
    }
}
