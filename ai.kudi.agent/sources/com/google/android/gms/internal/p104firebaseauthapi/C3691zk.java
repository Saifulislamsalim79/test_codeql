package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.p099l.C2946a;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zk */
/* loaded from: classes2.dex */
public final class C3691zk extends BroadcastReceiver {

    /* renamed from: a */
    private final String f9156a;

    /* renamed from: b */
    final /* synthetic */ C3058bl f9157b;

    public C3691zk(C3058bl c3058bl, String str) {
        this.f9157b = c3058bl;
        this.f9156a = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        C2946a c2946a;
        C2946a c2946a2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m32097h() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.f9157b.f8253c;
                C3031al c3031al = (C3031al) hashMap.get(this.f9156a);
                if (c3031al == null) {
                    c2946a2 = C3058bl.f8250d;
                    c2946a2.m31583c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String m31376b = C3058bl.m31376b(str);
                    c3031al.f8207e = m31376b;
                    if (m31376b == null) {
                        c2946a = C3058bl.f8250d;
                        c2946a.m31583c("Unable to extract verification code.", new Object[0]);
                    } else if (!C3516t1.m30219d(c3031al.f8206d)) {
                        C3058bl.m31373e(this.f9157b, this.f9156a);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
