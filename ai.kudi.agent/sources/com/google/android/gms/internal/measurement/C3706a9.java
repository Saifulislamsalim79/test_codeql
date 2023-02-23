package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.a9 */
/* loaded from: classes2.dex */
final class C3706a9 extends AbstractC3723b9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3706a9(C4084y8 c4084y8) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3723b9
    /* renamed from: a */
    public final void mo28535a(Object obj, long j) {
        ((InterfaceC3988s8) C4070xa.m28637k(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.AbstractC3723b9
    /* renamed from: b */
    public final <E> void mo28534b(Object obj, Object obj2, long j) {
        InterfaceC3988s8<E> interfaceC3988s8 = (InterfaceC3988s8) C4070xa.m28637k(obj, j);
        InterfaceC3988s8<E> interfaceC3988s82 = (InterfaceC3988s8) C4070xa.m28637k(obj2, j);
        int size = interfaceC3988s8.size();
        int size2 = interfaceC3988s82.size();
        InterfaceC3988s8<E> interfaceC3988s83 = interfaceC3988s8;
        interfaceC3988s83 = interfaceC3988s8;
        if (size > 0 && size2 > 0) {
            boolean mo28973c = interfaceC3988s8.mo28973c();
            InterfaceC3988s8<E> interfaceC3988s84 = interfaceC3988s8;
            if (!mo28973c) {
                interfaceC3988s84 = interfaceC3988s8.mo28653i(size2 + size);
            }
            interfaceC3988s84.addAll(interfaceC3988s82);
            interfaceC3988s83 = interfaceC3988s84;
        }
        if (size > 0) {
            interfaceC3988s82 = interfaceC3988s83;
        }
        C4070xa.m28624x(obj, j, interfaceC3988s82);
    }
}
