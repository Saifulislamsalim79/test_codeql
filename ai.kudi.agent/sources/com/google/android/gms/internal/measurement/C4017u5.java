package com.google.android.gms.internal.measurement;

import android.os.Binder;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.u5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4017u5 {
    /* renamed from: a */
    public static <V> V m28879a(InterfaceC4033v5<V> interfaceC4033v5) {
        try {
            return interfaceC4033v5.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC4033v5.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
