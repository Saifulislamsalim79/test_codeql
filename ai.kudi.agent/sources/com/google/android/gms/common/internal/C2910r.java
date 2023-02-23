package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC2744e;
import com.google.android.gms.common.api.C2747g;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.tasks.C4465k;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes2.dex */
public class C2910r {

    /* renamed from: a */
    private static final InterfaceC2912r0 f8057a = new C2901o0();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.internal.r$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2911a<R extends InterfaceC2748h, T> {
        /* renamed from: a */
        T mo31695a(R r);
    }

    /* renamed from: a */
    public static <R extends InterfaceC2748h, T extends C2747g<R>> com.google.android.gms.tasks.j<T> m31697a(AbstractC2744e<R> abstractC2744e, T t) {
        return m31696b(abstractC2744e, new C2908q0(t));
    }

    /* renamed from: b */
    public static <R extends InterfaceC2748h, T> com.google.android.gms.tasks.j<T> m31696b(AbstractC2744e<R> abstractC2744e, InterfaceC2911a<R, T> interfaceC2911a) {
        InterfaceC2912r0 interfaceC2912r0 = f8057a;
        C4465k c4465k = new C4465k();
        abstractC2744e.mo32069b(new C2904p0(abstractC2744e, c4465k, interfaceC2911a, interfaceC2912r0));
        return c4465k.m27777a();
    }
}
