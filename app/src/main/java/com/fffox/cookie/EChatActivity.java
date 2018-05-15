package com.fffox.cookie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hyphenate.chat.EMMessage;
import com.hyphenate.easeui.ui.EaseChatFragment;
import com.hyphenate.easeui.widget.EaseChatMessageList;

/**
 * Created by dell-pc on 2018/2/11.
 */

    public class EChatActivity extends AppCompatActivity {
        // 当前聊天的 ID
        private String mChatId;
        private EaseChatFragment chatFragment;
        private EaseChatMessageList messageList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_chat);
            chatFragment = new EaseChatFragment();
            // 将参数传递给聊天界面
            chatFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.ec_layout_container, chatFragment).commit();
            initView();
        }
        /**
         * 初始化界面
         */
        private void initView() {
        }
        @Override
        protected void onResume() {
            super.onResume();
        }

        @Override
        protected void onStop() {
            super.onStop();
        }



    }