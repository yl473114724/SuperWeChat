package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import cn.ucai.superwechat.R;
import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.MainActivity;
import cn.ucai.superwechat.ui.RegisterActivity;
import cn.ucai.superwechat.ui.SettingsActivity;
import cn.ucai.superwechat.ui.UserProfileActivity;


public class MFGT {
    public static void finish(Activity activity){
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    /**
     * 跳转主页面
     * @param context
     */
    public static void gotoMainActivity(Activity context){
        startActivity(context, MainActivity.class);
    }

    /**
     * 启动Activity
     * @param context
     * @param cls
     */
    public static void startActivity(Activity context, Class<?> cls){
        Intent intent = new Intent();
        intent.setClass(context,cls);
        startActivity(context,intent);
    }

    /**
     *动画
     * @param context
     * @param intent
     */
    public static void startActivity(Context context, Intent intent){
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

    /**
     * 从注册页面将结果返回到登录页面
     * @param context
     * @param intent
     * @param requestCode
     */
    public static void startActivityForResult(Activity context, Intent intent, int requestCode){
        context.startActivityForResult(intent,requestCode);
        context.overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

    /**
     * 跳转至登录页面
     * @param context
     */
    public static void gotoLogin(Activity context){
        startActivity(context, LoginActivity.class);
    }

    /**
     * 跳转至注册页面
     * @param context
     */
    public static void gotoRegister(Activity context){
        startActivity(context, RegisterActivity.class);
    }

    /**
     * 跳转至设置页面
     * @param context
     */
    public static void gotoSetting(Activity context){
        startActivity(context, SettingsActivity.class);
    }

    /**
     * 跳转至个人中心
     * @param context
     */
    public static void gotoUserProfile(Activity context){
        startActivity(context, UserProfileActivity.class);
    }

}
