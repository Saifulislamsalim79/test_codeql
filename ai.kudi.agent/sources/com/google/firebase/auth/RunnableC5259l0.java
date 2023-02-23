package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.l0 */
/* loaded from: classes2.dex */
public final class RunnableC5259l0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ FirebaseAuth f13067c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5259l0(FirebaseAuth firebaseAuth) {
        this.f13067c = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<FirebaseAuth.InterfaceC5190a> list;
        list = this.f13067c.f12936d;
        for (FirebaseAuth.InterfaceC5190a interfaceC5190a : list) {
            interfaceC5190a.m25393a(this.f13067c);
        }
    }
}
