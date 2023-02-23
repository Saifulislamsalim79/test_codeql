package com.google.firebase.installations;

import com.google.android.gms.tasks.C4465k;
import com.google.firebase.installations.AbstractC6435k;
import com.google.firebase.installations.p160p.AbstractC6447d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetAuthTokenListener.java */
/* renamed from: com.google.firebase.installations.i */
/* loaded from: classes2.dex */
public class C6433i implements InterfaceC6438m {

    /* renamed from: a */
    private final C6439n f15540a;

    /* renamed from: b */
    private final C4465k<AbstractC6435k> f15541b;

    public C6433i(C6439n c6439n, C4465k<AbstractC6435k> c4465k) {
        this.f15540a = c6439n;
        this.f15541b = c4465k;
    }

    @Override // com.google.firebase.installations.InterfaceC6438m
    /* renamed from: a */
    public boolean mo22037a(Exception exc) {
        this.f15541b.m27774d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC6438m
    /* renamed from: b */
    public boolean mo22036b(AbstractC6447d abstractC6447d) {
        if (!abstractC6447d.m22004k() || this.f15540a.m22030f(abstractC6447d)) {
            return false;
        }
        C4465k<AbstractC6435k> c4465k = this.f15541b;
        AbstractC6435k.AbstractC6436a m22048a = AbstractC6435k.m22048a();
        m22048a.mo22043b(abstractC6447d.mo22013b());
        m22048a.mo22041d(abstractC6447d.mo22012c());
        m22048a.mo22042c(abstractC6447d.mo22007h());
        c4465k.m27775c(m22048a.mo22044a());
        return true;
    }
}
