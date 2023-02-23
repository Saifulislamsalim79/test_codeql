package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d0 */
/* loaded from: classes2.dex */
final class C3091d0<T> implements InterfaceC3307l0<T> {

    /* renamed from: a */
    private final InterfaceC3644y f8372a;

    /* renamed from: b */
    private final AbstractC3645y0<?, ?> f8373b;

    /* renamed from: c */
    private final boolean f8374c;

    /* renamed from: d */
    private final AbstractC3643xo<?> f8375d;

    private C3091d0(AbstractC3645y0<?, ?> abstractC3645y0, AbstractC3643xo<?> abstractC3643xo, InterfaceC3644y interfaceC3644y) {
        this.f8373b = abstractC3645y0;
        this.f8374c = abstractC3643xo.mo29917e(interfaceC3644y);
        this.f8375d = abstractC3643xo;
        this.f8372a = interfaceC3644y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static <T> C3091d0<T> m31277k(AbstractC3645y0<?, ?> abstractC3645y0, AbstractC3643xo<?> abstractC3643xo, InterfaceC3644y interfaceC3644y) {
        return new C3091d0<>(abstractC3645y0, abstractC3643xo, interfaceC3644y);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: a */
    public final T mo30816a() {
        return (T) this.f8372a.mo29999q().mo30069m();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: b */
    public final int mo30815b(T t) {
        int hashCode = this.f8373b.mo29992d(t).hashCode();
        if (this.f8374c) {
            this.f8375d.mo29921a(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: c */
    public final void mo30814c(T t) {
        this.f8373b.mo29983m(t);
        this.f8375d.mo29918d(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: d */
    public final int mo30813d(T t) {
        AbstractC3645y0<?, ?> abstractC3645y0 = this.f8373b;
        int mo29994b = abstractC3645y0.mo29994b(abstractC3645y0.mo29992d(t));
        if (this.f8374c) {
            this.f8375d.mo29921a(t);
            throw null;
        }
        return mo29994b;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: e */
    public final void mo30812e(T t, T t2) {
        C3359n0.m30611f(this.f8373b, t, t2);
        if (this.f8374c) {
            C3359n0.m30612e(this.f8375d, t, t2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: f */
    public final void mo30811f(T t, C3513so c3513so) throws IOException {
        this.f8375d.mo29921a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: g */
    public final boolean mo30810g(T t) {
        this.f8375d.mo29921a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: h */
    public final void mo30809h(T t, InterfaceC3280k0 interfaceC3280k0, C3617wo c3617wo) throws IOException {
        AbstractC3645y0<?, ?> abstractC3645y0 = this.f8373b;
        AbstractC3643xo<?> abstractC3643xo = this.f8375d;
        abstractC3645y0.mo29993c(t);
        abstractC3643xo.mo29920b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: i */
    public final void mo30808i(T t, byte[] bArr, int i, int i2, C3642xn c3642xn) throws IOException {
        AbstractC3251ip abstractC3251ip = (AbstractC3251ip) t;
        if (abstractC3251ip.zzc == C3011a1.m31462c()) {
            abstractC3251ip.zzc = C3011a1.m31460e();
        }
        AbstractC3197gp abstractC3197gp = (AbstractC3197gp) t;
        throw null;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: j */
    public final boolean mo30807j(T t, T t2) {
        if (this.f8373b.mo29992d(t).equals(this.f8373b.mo29992d(t2))) {
            if (this.f8374c) {
                this.f8375d.mo29921a(t);
                throw null;
            }
            return true;
        }
        return false;
    }
}
