package com.google.mlkit.common.p186b;

import com.google.mlkit.common.p186b.C6922a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.t */
/* loaded from: classes2.dex */
final class C6951t extends PhantomReference implements C6922a.InterfaceC6923a {

    /* renamed from: a */
    private final Set f16662a;

    /* renamed from: b */
    private final Runnable f16663b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6951t(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C6950s c6950s) {
        super(obj, referenceQueue);
        this.f16662a = set;
        this.f16663b = runnable;
    }

    @Override // com.google.mlkit.common.p186b.C6922a.InterfaceC6923a
    /* renamed from: a */
    public final void mo20426a() {
        if (this.f16662a.remove(this)) {
            clear();
            this.f16663b.run();
        }
    }
}
