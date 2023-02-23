package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l */
/* loaded from: classes2.dex */
final class C3306l extends AbstractC3332m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3306l(C3252j c3252j) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m
    /* renamed from: a */
    public final <L> List<L> mo30721a(Object obj, long j) {
        InterfaceC3090d interfaceC3090d = (InterfaceC3090d) C3254j1.m30923k(obj, j);
        if (interfaceC3090d.mo30107c()) {
            return interfaceC3090d;
        }
        int size = interfaceC3090d.size();
        InterfaceC3090d mo29876i = interfaceC3090d.mo29876i(size == 0 ? 10 : size + size);
        C3254j1.m30910x(obj, j, mo29876i);
        return mo29876i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m
    /* renamed from: b */
    public final void mo30720b(Object obj, long j) {
        ((InterfaceC3090d) C3254j1.m30923k(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m
    /* renamed from: c */
    public final <E> void mo30719c(Object obj, Object obj2, long j) {
        InterfaceC3090d<E> interfaceC3090d = (InterfaceC3090d) C3254j1.m30923k(obj, j);
        InterfaceC3090d<E> interfaceC3090d2 = (InterfaceC3090d) C3254j1.m30923k(obj2, j);
        int size = interfaceC3090d.size();
        int size2 = interfaceC3090d2.size();
        InterfaceC3090d<E> interfaceC3090d3 = interfaceC3090d;
        interfaceC3090d3 = interfaceC3090d;
        if (size > 0 && size2 > 0) {
            boolean mo30107c = interfaceC3090d.mo30107c();
            InterfaceC3090d<E> interfaceC3090d4 = interfaceC3090d;
            if (!mo30107c) {
                interfaceC3090d4 = interfaceC3090d.mo29876i(size2 + size);
            }
            interfaceC3090d4.addAll(interfaceC3090d2);
            interfaceC3090d3 = interfaceC3090d4;
        }
        if (size > 0) {
            interfaceC3090d2 = interfaceC3090d3;
        }
        C3254j1.m30910x(obj, j, interfaceC3090d2);
    }
}
