package com.netbrunch.myfirebasesample;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static android.content.ContentValues.TAG;

/**
 * Created by iorigin on 2017/01/19.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From:" + remoteMessage.getFrom());

        if(remoteMessage.getNotification() != null) {
            Log.d(TAG, "Notification Message");
            String title = remoteMessage.getNotification().getTitle();
            Log.d(TAG, "Notification Message Title: " + title);
            String body = remoteMessage.getNotification().getBody();
            Log.d(TAG, "Notification Message Body: " + body);
        }
    }
}
