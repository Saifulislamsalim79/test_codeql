package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.InterfaceC5211a;
import com.google.firebase.p171p.C6562b;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.k0 */
/* loaded from: classes2.dex */
public final class RunnableC5257k0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ FirebaseAuth f13065c;

    /* renamed from: d */
    final /* synthetic */ C6562b f13066d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5257k0(FirebaseAuth firebaseAuth, C6562b c6562b) {
        this.f13065c = firebaseAuth;
        this.f13066d = c6562b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<InterfaceC5211a> list;
        List<FirebaseAuth.InterfaceC5191b> list2;
        list = this.f13065c.f12935c;
        for (InterfaceC5211a interfaceC5211a : list) {
            interfaceC5211a.mo24294a(this.f13066d);
        }
        list2 = this.f13065c.f12934b;
        for (FirebaseAuth.InterfaceC5191b interfaceC5191b : list2) {
            interfaceC5191b.m25392a(this.f13065c);
        }
    }
}
