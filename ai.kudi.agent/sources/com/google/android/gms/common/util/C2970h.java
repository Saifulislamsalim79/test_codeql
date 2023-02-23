package com.google.android.gms.common.util;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.h */
/* loaded from: classes2.dex */
public class C2970h implements InterfaceC2967e {

    /* renamed from: a */
    private static final C2970h f8139a = new C2970h();

    private C2970h() {
    }

    /* renamed from: c */
    public static InterfaceC2967e m31533c() {
        return f8139a;
    }

    @Override // com.google.android.gms.common.util.InterfaceC2967e
    /* renamed from: a */
    public final long mo31535a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC2967e
    /* renamed from: b */
    public final long mo31534b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC2967e
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
