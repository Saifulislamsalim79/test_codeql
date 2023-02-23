package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.v1 */
/* loaded from: classes2.dex */
public final class C2928v1 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C2931w1 f8090a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2928v1(C2931w1 c2931w1, C2925u1 c2925u1) {
        this.f8090a = c2931w1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.f8090a.f8096f;
            synchronized (hashMap) {
                C2915s1 c2915s1 = (C2915s1) message.obj;
                hashMap2 = this.f8090a.f8096f;
                ServiceConnectionC2922t1 serviceConnectionC2922t1 = (ServiceConnectionC2922t1) hashMap2.get(c2915s1);
                if (serviceConnectionC2922t1 != null && serviceConnectionC2922t1.m31627i()) {
                    if (serviceConnectionC2922t1.m31626j()) {
                        serviceConnectionC2922t1.m31629g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f8090a.f8096f;
                    hashMap3.remove(c2915s1);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.f8090a.f8096f;
            synchronized (hashMap4) {
                C2915s1 c2915s12 = (C2915s1) message.obj;
                hashMap5 = this.f8090a.f8096f;
                ServiceConnectionC2922t1 serviceConnectionC2922t12 = (ServiceConnectionC2922t1) hashMap5.get(c2915s12);
                if (serviceConnectionC2922t12 != null && serviceConnectionC2922t12.m31635a() == 3) {
                    String valueOf = String.valueOf(c2915s12);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName m31634b = serviceConnectionC2922t12.m31634b();
                    if (m31634b == null) {
                        m31634b = c2915s12.m31692b();
                    }
                    if (m31634b == null) {
                        String m31690d = c2915s12.m31690d();
                        s.j(m31690d);
                        m31634b = new ComponentName(m31690d, "unknown");
                    }
                    serviceConnectionC2922t12.onServiceDisconnected(m31634b);
                }
            }
            return true;
        }
    }
}
