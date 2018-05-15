package com.fffox.cookie;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.hyphenate.easeui.EaseUI;



import java.util.Iterator;
import java.util.List;

public class ECApplication extends Application {
    // 上下文菜单
    private Context mContext;
    // 记录是否已经初始化
    private boolean isInit = false;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        // 初始化SDK
        initEasemob();
    }
    /**
     * 初始化SDK
     */
    private void initEasemob() {

        if (EaseUI.getInstance().init(mContext, initOptions())) {
            // 设置开启debug模式
            EMClient.getInstance().setDebugMode(true);
            // 设置初始化已经完成
            isInit = true;
        }
    }
    /**
     * SDK初始化的一些配置
     * 关于 EMOptions 可以参考官方的 API 文档
     * http://www.easemob.com/apidoc/android/chat3.0/classcom_1_1hyphenate_1_1chat_1_1_e_m_options.html
     */
    private EMOptions initOptions() {

        EMOptions options = new EMOptions();
        // 设置自动登录
        options.setAutoLogin(true);
        // 设置是否需要发送已读回执
        options.setRequireAck(true);
        // 设置是否需要发送回执，
        options.setRequireDeliveryAck(true);
        // 设置是否根据服务器时间排序
        options.setSortMessageByServerTime(false);
        return options;
    }

}