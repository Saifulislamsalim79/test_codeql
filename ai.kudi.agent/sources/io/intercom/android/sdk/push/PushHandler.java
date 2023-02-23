package io.intercom.android.sdk.push;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.user.DeviceData;
/* loaded from: classes3.dex */
class PushHandler {
    private static final String TAG = "PushHandler";
    private final Twig twig = LumberMill.getLogger();

    private boolean hasUserHashIfNeeded(UserIdentity userIdentity, AppConfig appConfig) {
        return appConfig.isReceivedFromServer() && (!appConfig.isIdentityVerificationEnabled() || (appConfig.isIdentityVerificationEnabled() && !TextUtils.isEmpty(userIdentity.getHmac())));
    }

    private void sendNotification(Bundle bundle, SystemNotificationManager systemNotificationManager, boolean z, Context context, MetricTracker metricTracker, AppConfig appConfig) {
        if (bundle.isEmpty()) {
            this.twig.m13068e("The push intent contained no data", new Object[0]);
            return;
        }
        Twig twig = this.twig;
        twig.internal(TAG, "Notification Data Json :" + bundle.getString(MetricTracker.Object.MESSAGE));
        PushPayload create = PushPayload.create(bundle);
        if (create.isIntercomPush()) {
            if (create.isPushOnly()) {
                metricTracker.receivedPushOnlyNotification(create.getPushOnlyConversationId(), create.getInstanceId());
                systemNotificationManager.createPushOnlyNotification(create, context, appConfig);
                return;
            } else if (z) {
                metricTracker.receivedPushNotification(create.getConversationId());
                systemNotificationManager.createNotification(create, context, appConfig);
                return;
            } else {
                this.twig.m13065i("Intercom message received but not displayed in notification bar. This happened because the host app was in the foreground.", new Object[0]);
                return;
            }
        }
        this.twig.m13065i("This is not a Intercom push message", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handlePush(Bundle bundle, UserIdentity userIdentity, SystemNotificationManager systemNotificationManager, boolean z, Context context, MetricTracker metricTracker, AppConfig appConfig) {
        if (userIdentity.identityExists()) {
            sendNotification(bundle, systemNotificationManager, z, context, metricTracker, appConfig);
            return;
        }
        systemNotificationManager.clear();
        this.twig.m13065i("Can't create push message as we have no user identity. This can be caused by messages being sent to a logged out user.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendTokenToIntercom(Context context, String str, Api api, UserIdentity userIdentity, Provider<AppConfig> provider) {
        if (userIdentity.identityExists() && hasUserHashIfNeeded(userIdentity, provider.get())) {
            api.setDeviceToken(str);
        }
        DeviceData.cacheDeviceToken(context, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldSendDeviceToken(Context context, String str) {
        return !DeviceData.hasCachedDeviceToken(context, str);
    }
}
