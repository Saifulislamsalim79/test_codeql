package io.intercom.android.sdk.push;

import android.content.BroadcastReceiver;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes3.dex */
public class IntercomPushBroadcastReceiver extends BroadcastReceiver {
    static final String INTERCOM_PUSH_DISMISSED = "io.intercom.android.sdk.INTERCOM_PUSH_DISMISSED";
    static final String INTERCOM_PUSH_OPENED = "io.intercom.android.sdk.INTERCOM_PUSH_OPENED";
    private static final Twig TWIG = LumberMill.getLogger();
    private final PushReceiverDelegate pushReceiverDelegate = new PushReceiverDelegate();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r2.equals(io.intercom.android.sdk.push.IntercomPushBroadcastReceiver.INTERCOM_PUSH_DISMISSED) == false) goto L17;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            android.content.Context r0 = r9.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            io.intercom.android.sdk.Injector.initIfCachedCredentials(r0)
            boolean r0 = io.intercom.android.sdk.Injector.isNotInitialised()
            r1 = 0
            if (r0 == 0) goto L1a
            io.intercom.android.sdk.twig.Twig r9 = io.intercom.android.sdk.push.IntercomPushBroadcastReceiver.TWIG
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r0 = "Push not handled because Intercom is not initialised"
            r9.m13059w(r0, r10)
            return
        L1a:
            io.intercom.android.sdk.Injector r0 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.identity.UserIdentity r6 = r0.getUserIdentity()
            io.intercom.android.sdk.metrics.MetricTracker r7 = r0.getMetricTracker()
            java.lang.String r2 = r10.getAction()
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -1466442296(0xffffffffa897ddc8, float:-1.686055E-14)
            if (r4 == r5) goto L43
            r5 = 233030346(0xde3c2ca, float:1.4036849E-30)
            if (r4 == r5) goto L3a
            goto L4d
        L3a:
            java.lang.String r4 = "io.intercom.android.sdk.INTERCOM_PUSH_DISMISSED"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4d
            goto L4e
        L43:
            java.lang.String r1 = "io.intercom.android.sdk.INTERCOM_PUSH_OPENED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L4d
            r1 = 2
            goto L4e
        L4d:
            r1 = -1
        L4e:
            if (r1 == 0) goto L5c
            io.intercom.android.sdk.api.Api r5 = r0.getApi()
            io.intercom.android.sdk.push.PushReceiverDelegate r2 = r8.pushReceiverDelegate
            r3 = r9
            r4 = r10
            r2.handlePushTap(r3, r4, r5, r6, r7)
            goto L61
        L5c:
            io.intercom.android.sdk.push.PushReceiverDelegate r9 = r8.pushReceiverDelegate
            r9.trackDismiss(r10, r6, r7)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.push.IntercomPushBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
