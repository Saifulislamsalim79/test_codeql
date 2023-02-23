package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Iterator;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d1 */
/* loaded from: classes2.dex */
final class C3092d1 implements Iterator<String> {

    /* renamed from: c */
    final Iterator<String> f8376c;

    /* renamed from: d */
    final /* synthetic */ C3119e1 f8377d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3092d1(C3119e1 c3119e1) {
        InterfaceC3225i interfaceC3225i;
        this.f8377d = c3119e1;
        interfaceC3225i = this.f8377d.f8414c;
        this.f8376c = interfaceC3225i.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8376c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f8376c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
