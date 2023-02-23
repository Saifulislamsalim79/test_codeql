package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4465k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes2.dex */
public final class C2811u {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f7872a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C4465k<?>, Boolean> f7873b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m31907h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f7872a) {
            hashMap = new HashMap(this.f7872a);
        }
        synchronized (this.f7873b) {
            hashMap2 = new HashMap(this.f7873b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m32067e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4465k) entry2.getKey()).m27774d(new ApiException(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31912c(BasePendingResult<? extends InterfaceC2748h> basePendingResult, boolean z) {
        this.f7872a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo32069b(new C2806s(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void m31911d(C4465k<TResult> c4465k, boolean z) {
        this.f7873b.put(c4465k, Boolean.valueOf(z));
        c4465k.m27777a().b(new C2809t(this, c4465k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m31910e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m31907h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void m31909f() {
        m31907h(false, InterfaceC2769g.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m31908g() {
        return (this.f7872a.isEmpty() && this.f7873b.isEmpty()) ? false : true;
    }
}
