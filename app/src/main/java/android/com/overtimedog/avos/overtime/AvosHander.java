package android.com.overtimedog.avos.overtime;

import com.avos.avoscloud.AVUser;

/**
 * Created by user on 2016/12/21.
 */
public class AvosHander {


    public AvosHander(){

    }


    private boolean isLogin() {
        if (AVUser.getCurrentUser() != null) {
            return true;
        }
        return  false;
    }

}
