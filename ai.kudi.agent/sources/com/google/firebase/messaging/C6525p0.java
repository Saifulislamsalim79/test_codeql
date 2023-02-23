package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.InterfaceC4450c;
import java.util.Map;
import java.util.concurrent.Executor;
import p201g.p218e.C7521a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.p0 */
/* loaded from: classes2.dex */
public class C6525p0 {

    /* renamed from: a */
    private final Executor f15750a;

    /* renamed from: b */
    private final Map<String, com.google.android.gms.tasks.j<String>> f15751b = new C7521a();

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.p0$a */
    /* loaded from: classes2.dex */
    interface InterfaceC6526a {
        com.google.android.gms.tasks.j<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6525p0(Executor executor) {
        this.f15750a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized com.google.android.gms.tasks.j<String> m21719a(final String str, InterfaceC6526a interfaceC6526a) {
        com.google.android.gms.tasks.j<String> jVar = this.f15751b.get(str);
        if (jVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Joining ongoing request for: ".concat(valueOf) : new String("Joining ongoing request for: "));
            }
            return jVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf2 = String.valueOf(str);
            Log.d("FirebaseMessaging", valueOf2.length() != 0 ? "Making new request for: ".concat(valueOf2) : new String("Making new request for: "));
        }
        com.google.android.gms.tasks.j<String> j = interfaceC6526a.start().j(this.f15750a, new InterfaceC4450c() { // from class: com.google.firebase.messaging.o0
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(com.google.android.gms.tasks.j jVar2) {
                C6525p0.this.m21718b(str, jVar2);
                return jVar2;
            }
        });
        this.f15751b.put(str, j);
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public /* synthetic */ com.google.android.gms.tasks.j m21718b(String str, com.google.android.gms.tasks.j jVar) throws Exception {
        synchronized (this) {
            this.f15751b.remove(str);
        }
        return jVar;
    }
}
