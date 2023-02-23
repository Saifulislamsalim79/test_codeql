package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.AbstractC2699b;
import com.google.android.gms.cloudmessaging.C2697a;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.messaging.C6494f0;
import com.google.firebase.messaging.C6518m;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2699b {
    @Override // com.google.android.gms.cloudmessaging.AbstractC2699b
    /* renamed from: b */
    protected final int mo23064b(Context context, C2697a c2697a) {
        try {
            return ((Integer) C4469m.m27770a(new C6518m(context).m21730g(c2697a.m32146f()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC2699b
    /* renamed from: c */
    protected final void mo23063c(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C6494f0.m21855A(putExtras)) {
            C6494f0.m21835s(putExtras);
        }
    }
}
