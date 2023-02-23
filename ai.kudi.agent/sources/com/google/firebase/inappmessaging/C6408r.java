package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.model.C6400o;
import com.google.firebase.inappmessaging.p154j0.C6163c3;
import com.google.firebase.inappmessaging.p154j0.C6175e3;
import com.google.firebase.inappmessaging.p154j0.C6231o2;
import com.google.firebase.inappmessaging.p154j0.C6236p2;
import com.google.firebase.inappmessaging.p154j0.C6247q2;
import com.google.firebase.inappmessaging.p154j0.C6357z2;
import com.google.firebase.installations.InterfaceC6432h;
/* compiled from: FirebaseInAppMessaging.java */
/* renamed from: com.google.firebase.inappmessaging.r */
/* loaded from: classes2.dex */
public class C6408r {

    /* renamed from: a */
    private final C6247q2 f15484a;

    /* renamed from: b */
    private final C6236p2 f15485b;

    /* renamed from: c */
    private boolean f15486c = false;

    /* renamed from: d */
    private FirebaseInAppMessagingDisplay f15487d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6408r(C6357z2 c6357z2, C6175e3 c6175e3, C6231o2 c6231o2, InterfaceC6432h interfaceC6432h, C6247q2 c6247q2, C6236p2 c6236p2) {
        this.f15484a = c6247q2;
        this.f15485b = c6236p2;
        interfaceC6432h.mo22049h().f(C5998a.f14679a);
        c6357z2.m22233d().m11191H(new j.e.e0.e() { // from class: com.google.firebase.inappmessaging.b
            public final void accept(Object obj) {
                C6408r.this.m22093g((C6400o) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m22093g(C6400o c6400o) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.f15487d;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(c6400o.m22112a(), this.f15484a.m22487a(c6400o.m22112a(), c6400o.m22111b()));
        }
    }

    /* renamed from: a */
    public boolean m22099a() {
        return this.f15486c;
    }

    /* renamed from: b */
    public void m22098b() {
        C6163c3.m22619c("Removing display event component");
        this.f15487d = null;
    }

    /* renamed from: e */
    public void m22095e() {
        this.f15485b.m22496i();
    }

    /* renamed from: f */
    public void m22094f(FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        C6163c3.m22619c("Setting display event component");
        this.f15487d = firebaseInAppMessagingDisplay;
    }
}
