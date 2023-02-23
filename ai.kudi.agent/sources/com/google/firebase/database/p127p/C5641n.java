package com.google.firebase.database.p127p;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.database.p131s.InterfaceC5829k;
/* compiled from: AndroidEventTarget.java */
/* renamed from: com.google.firebase.database.p.n */
/* loaded from: classes2.dex */
public class C5641n implements InterfaceC5829k {

    /* renamed from: a */
    private final Handler f13874a = new Handler(Looper.getMainLooper());

    @Override // com.google.firebase.database.p131s.InterfaceC5829k
    /* renamed from: a */
    public void mo23596a() {
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5829k
    /* renamed from: b */
    public void mo23595b(Runnable runnable) {
        this.f13874a.post(runnable);
    }
}
