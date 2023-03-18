package com.logger;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LoggerImpl {
    private final String TAG = "MyLogger";

    public void logd(@NonNull String tagOrMsg, @Nullable String... msgs) {
        if (msgs == null) {
            Log.d(TAG, tagOrMsg);
        } else if (msgs != null) {
            StringBuilder messageBuilder = new StringBuilder("");
            for (int i = 0; i < msgs.length; i++) {
                messageBuilder.append(msgs[i]);
                if (msgs.length - 1 > i)
                    messageBuilder.append(" - ");
            }
            Log.d(tagOrMsg, messageBuilder.toString());
        }
    }
}