package com.google.firebase.installations;

import com.google.android.gms.tasks.C4465k;
import com.google.firebase.installations.p160p.AbstractC6447d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetIdListener.java */
/* renamed from: com.google.firebase.installations.j */
/* loaded from: classes2.dex */
public class C6434j implements InterfaceC6438m {

    /* renamed from: a */
    final C4465k<String> f15542a;

    public C6434j(C4465k<String> c4465k) {
        this.f15542a = c4465k;
    }

    @Override // com.google.firebase.installations.InterfaceC6438m
    /* renamed from: a */
    public boolean mo22037a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC6438m
    /* renamed from: b */
    public boolean mo22036b(AbstractC6447d abstractC6447d) {
        if (abstractC6447d.m22003l() || abstractC6447d.m22004k() || abstractC6447d.m22006i()) {
            this.f15542a.m27773e(abstractC6447d.mo22011d());
            return true;
        }
        return false;
    }
}
