package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4465k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.u */
/* loaded from: classes2.dex */
public abstract class AbstractC2722u<T> {

    /* renamed from: a */
    final int f7667a;

    /* renamed from: b */
    final C4465k<T> f7668b = new C4465k<>();

    /* renamed from: c */
    final int f7669c;

    /* renamed from: d */
    final Bundle f7670d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2722u(int i, int i2, Bundle bundle) {
        this.f7667a = i;
        this.f7669c = i2;
        this.f7670d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo32118a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo32117b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m32120c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7668b.m27776b(zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m32119d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7668b.m27775c(t);
    }

    public final String toString() {
        int i = this.f7669c;
        int i2 = this.f7667a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo32117b());
        sb.append("}");
        return sb.toString();
    }
}
