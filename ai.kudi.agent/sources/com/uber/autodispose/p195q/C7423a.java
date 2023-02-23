package com.uber.autodispose.p195q;

import io.reactivex.exceptions.C11118a;
import p425j.p444e.p450e0.InterfaceC11289c;
/* compiled from: AutoDisposeAndroidPlugins.java */
/* renamed from: com.uber.autodispose.q.a */
/* loaded from: classes2.dex */
public final class C7423a {

    /* renamed from: a */
    private static volatile InterfaceC11289c f17580a;

    /* renamed from: a */
    public static boolean m18761a(InterfaceC11289c interfaceC11289c) {
        if (interfaceC11289c != null) {
            InterfaceC11289c interfaceC11289c2 = f17580a;
            try {
                if (interfaceC11289c2 == null) {
                    return interfaceC11289c.mo11199a();
                }
                return interfaceC11289c2.mo11199a();
            } catch (Exception e) {
                C11118a.m11647a(e);
                throw null;
            }
        }
        throw new NullPointerException("defaultChecker == null");
    }
}
