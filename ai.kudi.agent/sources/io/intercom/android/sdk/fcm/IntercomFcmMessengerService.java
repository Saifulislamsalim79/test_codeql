package io.intercom.android.sdk.fcm;

import android.text.TextUtils;
import com.google.firebase.messaging.C6519m0;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.push.IntercomPushClient;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes2.dex */
public class IntercomFcmMessengerService extends FirebaseMessagingService {
    private final IntercomPushClient pushClient = new IntercomPushClient();
    private final Twig twig = LumberMill.getLogger();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(C6519m0 c6519m0) {
        this.pushClient.handlePush(getApplication(), c6519m0.m21728f());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            this.twig.m13068e("Intercom push registration failed. Please make sure you have added a google-services.json file", new Object[0]);
        } else {
            this.pushClient.sendTokenToIntercom(getApplication(), str);
        }
    }
}
