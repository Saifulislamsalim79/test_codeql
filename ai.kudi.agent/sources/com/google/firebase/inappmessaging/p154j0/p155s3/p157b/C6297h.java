package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.C5988g;
import com.google.firebase.inappmessaging.p152i0.InterfaceC6142a;
import com.google.firebase.inappmessaging.p154j0.C6186g3;
import com.google.firebase.inappmessaging.p154j0.C6208k2;
import com.google.firebase.inappmessaging.p154j0.C6231o2;
import com.google.firebase.inappmessaging.p154j0.C6248q3;
import com.google.firebase.inappmessaging.p154j0.C6253r3;
import com.google.firebase.inappmessaging.p154j0.C6341v2;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p167m.InterfaceC6473d;
/* compiled from: ApiClientModule.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.h */
/* loaded from: classes2.dex */
public class C6297h {

    /* renamed from: a */
    private final C5988g f15295a;

    /* renamed from: b */
    private final InterfaceC6432h f15296b;

    /* renamed from: c */
    private final InterfaceC6332a f15297c;

    public C6297h(C5988g c5988g, InterfaceC6432h interfaceC6432h, InterfaceC6332a interfaceC6332a) {
        this.f15295a = c5988g;
        this.f15296b = interfaceC6432h;
        this.f15297c = interfaceC6332a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6208k2 m22368a(InterfaceC6142a<C6341v2> interfaceC6142a, Application application, C6186g3 c6186g3) {
        return new C6208k2(interfaceC6142a, this.f15295a, application, this.f15297c, c6186g3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C6231o2 m22367b(C6248q3 c6248q3, InterfaceC6473d interfaceC6473d) {
        return new C6231o2(this.f15295a, c6248q3, interfaceC6473d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C5988g m22366c() {
        return this.f15295a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC6432h m22365d() {
        return this.f15296b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C6248q3 m22364e() {
        return new C6248q3(this.f15295a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C6253r3 m22363f(C6248q3 c6248q3) {
        return new C6253r3(c6248q3);
    }
}
