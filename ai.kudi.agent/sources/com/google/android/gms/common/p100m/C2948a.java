package com.google.android.gms.common.p100m;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@Deprecated
/* renamed from: com.google.android.gms.common.m.a */
/* loaded from: classes2.dex */
public class C2948a {

    /* renamed from: a */
    private static InterfaceC2949a f8124a;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.m.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2949a {
        @Deprecated
        /* renamed from: a */
        ScheduledExecutorService mo31569a();
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized InterfaceC2949a m31570a() {
        InterfaceC2949a interfaceC2949a;
        synchronized (C2948a.class) {
            if (f8124a == null) {
                f8124a = new C2950b();
            }
            interfaceC2949a = f8124a;
        }
        return interfaceC2949a;
    }
}
