package bank.t2308a;

public class ValidateAccount {

    public final String MOBILE =  "0909584263";
    public final String PASSWORD = "Le Quang Dat";
    public boolean checkAccount(String mobile, String password ) {
        if(mobile.equals(MOBILE)){
            if(password.equals(PASSWORD)){
                System.out.println("Đăng nhập thành công!");
                return true;
            }else{
                System.out.println("Mật khẩu sai, vui lòng nhập lại");
                return false;
            }
        }else{
            System.out.println("Kiểm tra lại số điện thoại hoặc passworld");
            return false;
        }
    }
}
