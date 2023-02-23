package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s9 */
/* loaded from: classes2.dex */
final class C3989s9<T> implements InterfaceC4101z9<T> {

    /* renamed from: a */
    private final InterfaceC3927o9 f9690a;

    /* renamed from: b */
    private final AbstractC3912na<?, ?> f9691b;

    /* renamed from: c */
    private final boolean f9692c;

    /* renamed from: d */
    private final AbstractC3705a8<?> f9693d;

    private C3989s9(AbstractC3912na<?, ?> abstractC3912na, AbstractC3705a8<?> abstractC3705a8, InterfaceC3927o9 interfaceC3927o9) {
        this.f9691b = abstractC3912na;
        this.f9692c = abstractC3705a8.mo29795c(interfaceC3927o9);
        this.f9693d = abstractC3705a8;
        this.f9690a = interfaceC3927o9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static <T> C3989s9<T> m28972j(AbstractC3912na<?, ?> abstractC3912na, AbstractC3705a8<?> abstractC3705a8, InterfaceC3927o9 interfaceC3927o9) {
        return new C3989s9<>(abstractC3912na, abstractC3705a8, interfaceC3927o9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: a */
    public final T mo28533a() {
        return (T) this.f9690a.mo29246f().mo29328Z();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: b */
    public final int mo28532b(T t) {
        int hashCode = this.f9691b.mo29099c(t).hashCode();
        if (this.f9692c) {
            this.f9693d.mo29797a(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: c */
    public final void mo28531c(T t) {
        this.f9691b.mo29095g(t);
        this.f9693d.mo29796b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: d */
    public final int mo28530d(T t) {
        AbstractC3912na<?, ?> abstractC3912na = this.f9691b;
        int mo29100b = abstractC3912na.mo29100b(abstractC3912na.mo29099c(t));
        if (this.f9692c) {
            this.f9693d.mo29797a(t);
            throw null;
        }
        return mo29100b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: e */
    public final void mo28529e(T t, T t2) {
        C3724ba.m29759f(this.f9691b, t, t2);
        if (this.f9692c) {
            C3724ba.m29760e(this.f9693d, t, t2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: f */
    public final boolean mo28528f(T t) {
        this.f9693d.mo29797a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: g */
    public final void mo28527g(T t, byte[] bArr, int i, int i2, C3753d7 c3753d7) throws IOException {
        AbstractC3894m8 abstractC3894m8 = (AbstractC3894m8) t;
        if (abstractC3894m8.zzc == C3928oa.m29243c()) {
            abstractC3894m8.zzc = C3928oa.m29241e();
        }
        AbstractC3863k8 abstractC3863k8 = (AbstractC3863k8) t;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: h */
    public final boolean mo28526h(T t, T t2) {
        if (this.f9691b.mo29099c(t).equals(this.f9691b.mo29099c(t2))) {
            if (this.f9692c) {
                this.f9693d.mo29797a(t);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: i */
    public final void mo28525i(T t, C4035v7 c4035v7) throws IOException {
        this.f9693d.mo29797a(t);
        throw null;
    }
}
