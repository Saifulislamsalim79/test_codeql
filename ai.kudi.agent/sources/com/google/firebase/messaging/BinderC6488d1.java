package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.firebase.messaging.ServiceConnectionC6499g1;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.d1 */
/* loaded from: classes2.dex */
class BinderC6488d1 extends Binder {

    /* renamed from: a */
    private final InterfaceC6489a f15657a;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.d1$a */
    /* loaded from: classes2.dex */
    interface InterfaceC6489a {
        /* renamed from: a */
        com.google.android.gms.tasks.j<Void> mo21825a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC6488d1(InterfaceC6489a interfaceC6489a) {
        this.f15657a = interfaceC6489a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m21857b(final ServiceConnectionC6499g1.C6500a c6500a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f15657a.mo21825a(c6500a.f15677a).c(ExecutorC6485c1.f15651c, new InterfaceC4454e() { // from class: com.google.firebase.messaging.b1
                @Override // com.google.android.gms.tasks.InterfaceC4454e
                /* renamed from: a */
                public final void mo21856a(com.google.android.gms.tasks.j jVar) {
                    ServiceConnectionC6499g1.C6500a.this.m21811b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
