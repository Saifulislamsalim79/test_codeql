package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* loaded from: classes2.dex */
public final class C3908n6 implements InterfaceC4049w5 {

    /* renamed from: c */
    private static final Map<String, C3908n6> f9572c = new C7521a();

    /* renamed from: a */
    private final SharedPreferences f9573a;

    /* renamed from: b */
    private final SharedPreferences.OnSharedPreferenceChangeListener f9574b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3908n6 m29348a(Context context, String str) {
        C3908n6 c3908n6;
        if (!C3907n5.m29349a()) {
            synchronized (C3908n6.class) {
                c3908n6 = f9572c.get(null);
                if (c3908n6 == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return c3908n6;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized void m29347b() {
        synchronized (C3908n6.class) {
            Iterator<C3908n6> it = f9572c.values().iterator();
            if (!it.hasNext()) {
                f9572c.clear();
            } else {
                C3908n6 next = it.next();
                SharedPreferences sharedPreferences = next.f9573a;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = next.f9574b;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4049w5
    /* renamed from: f */
    public final Object mo28545f(String str) {
        throw null;
    }
}
