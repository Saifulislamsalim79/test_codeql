package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y0 */
/* loaded from: classes2.dex */
abstract class AbstractC3645y0<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo29995a(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo29994b(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract B mo29993c(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract T mo29992d(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract T mo29991e(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo29990f();

    /* renamed from: g */
    abstract T mo29989g(B b);

    /* renamed from: h */
    abstract void mo29988h(B b, int i, int i2);

    /* renamed from: i */
    abstract void mo29987i(B b, int i, long j);

    /* renamed from: j */
    abstract void mo29986j(B b, int i, T t);

    /* renamed from: k */
    abstract void mo29985k(B b, int i, AbstractC3223ho abstractC3223ho);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract void mo29984l(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract void mo29983m(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract void mo29982n(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo29981o(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final boolean m29980p(B b, InterfaceC3280k0 interfaceC3280k0) throws IOException {
        int mo30744d = interfaceC3280k0.mo30744d();
        int i = mo30744d >>> 3;
        int i2 = mo30744d & 7;
        if (i2 == 0) {
            mo29984l(b, i, interfaceC3280k0.mo30736l());
            return true;
        } else if (i2 == 1) {
            mo29987i(b, i, interfaceC3280k0.mo30733o());
            return true;
        } else if (i2 == 2) {
            mo29985k(b, i, interfaceC3280k0.mo30741g());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    mo29988h(b, i, interfaceC3280k0.mo30738j());
                    return true;
                }
                throw zzaae.m29873a();
            }
            return false;
        } else {
            Object mo29990f = mo29990f();
            int i3 = 4 | (i << 3);
            while (interfaceC3280k0.mo30745c() != Integer.MAX_VALUE && m29980p(mo29990f, interfaceC3280k0)) {
            }
            if (i3 == interfaceC3280k0.mo30744d()) {
                mo29989g(mo29990f);
                mo29986j(b, i, mo29990f);
                return true;
            }
            throw zzaae.m29872b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo29979q(InterfaceC3280k0 interfaceC3280k0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract void mo29978r(T t, C3513so c3513so) throws IOException;
}
