package com.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Logger {
    private static LoggerImpl logger;
    public static boolean isEnabled = true;

    static {
        logger = new LoggerImpl();
    }

    /**
     * Public api to enable user to print messages to logcat
     *
     * @param tagOrMsg you can pass here tag if you want to customize the tag string or directly
     *                 pass the message and the tag in this case will be {MyLogger}
     * @param msg      If you passed a tag in tagOrMsg, you will need to pass here msg.
     *                 <p>
     *                 Usage Example:
     *                 Logger.d("Network", "Network called started"); -> this will print a normal log
     *                 msg to logcat with a tag Network and msg "Network called started"
     *                 <p>
     *                 Logger.d("call method called"); -> this will print a log msg with tag "MyLogger"
     *                 and msg "call method called".
     *                 <p>
     *                 Logger.d("tag" , "msg1", "msg2"); -> this will print a log msg with tag
     *                 "tag" and messages "msg1 - msg2"
     */
    public static void d(@NonNull String tagOrMsg, @Nullable String... msg) {
        if (isEnabled && logger != null) {
            logger.logd(tagOrMsg, msg);
        }


    }
}