package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z2 */
/* loaded from: classes2.dex */
final class C3673z2 implements InterfaceC3040b3 {

    /* renamed from: a */
    final /* synthetic */ AbstractC3621x2 f9139a;

    /* renamed from: b */
    final /* synthetic */ AbstractC3255j2 f9140b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3673z2(AbstractC3621x2 abstractC3621x2, AbstractC3255j2 abstractC3255j2) {
        this.f9139a = abstractC3621x2;
        this.f9140b = abstractC3255j2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: a */
    public final Set<Class<?>> mo29911a() {
        return this.f9139a.m30904h();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: b */
    public final <Q> InterfaceC3039b2<Q> mo29910b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new C3595w2(this.f9139a, this.f9140b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: c */
    public final Class<?> mo29909c() {
        return this.f9139a.getClass();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: d */
    public final Class<?> mo29908d() {
        return this.f9140b.getClass();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    public final InterfaceC3039b2<?> zzb() {
        AbstractC3621x2 abstractC3621x2 = this.f9139a;
        return new C3595w2(abstractC3621x2, this.f9140b, abstractC3621x2.m30907d());
    }
}
