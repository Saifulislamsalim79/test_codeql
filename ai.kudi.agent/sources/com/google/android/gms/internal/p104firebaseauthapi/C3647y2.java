package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y2 */
/* loaded from: classes2.dex */
final class C3647y2 implements InterfaceC3040b3 {

    /* renamed from: a */
    final /* synthetic */ AbstractC3255j2 f9114a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3647y2(AbstractC3255j2 abstractC3255j2) {
        this.f9114a = abstractC3255j2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: a */
    public final Set<Class<?>> mo29911a() {
        return this.f9114a.m30904h();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: b */
    public final <Q> InterfaceC3039b2<Q> mo29910b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new C3093d2(this.f9114a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: c */
    public final Class<?> mo29909c() {
        return this.f9114a.getClass();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    /* renamed from: d */
    public final Class<?> mo29908d() {
        return null;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3040b3
    public final InterfaceC3039b2<?> zzb() {
        AbstractC3255j2 abstractC3255j2 = this.f9114a;
        return new C3093d2(abstractC3255j2, abstractC3255j2.m30907d());
    }
}
