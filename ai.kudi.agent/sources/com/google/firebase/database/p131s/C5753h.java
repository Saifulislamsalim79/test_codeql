package com.google.firebase.database.p131s;

import com.google.firebase.C5988g;
/* compiled from: DatabaseConfig.java */
/* renamed from: com.google.firebase.database.s.h */
/* loaded from: classes2.dex */
public class C5753h extends C5743g {
    /* renamed from: H */
    public void m23898H(InterfaceC5892y interfaceC5892y) {
        this.f14137d = interfaceC5892y;
    }

    /* renamed from: I */
    public void m23897I(InterfaceC5892y interfaceC5892y) {
        this.f14136c = interfaceC5892y;
    }

    /* renamed from: J */
    public synchronized void m23896J(C5988g c5988g) {
        this.f14145l = c5988g;
    }

    /* renamed from: K */
    public synchronized void m23895K(String str) {
        m23939a();
        if (str != null && !str.isEmpty()) {
            this.f14139f = str;
        } else {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
    }
}
