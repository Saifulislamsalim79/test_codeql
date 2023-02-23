package com.bumptech.glide.p066l;

import com.bumptech.glide.p086q.C2381k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ActivityFragmentLifecycle.java */
/* renamed from: com.bumptech.glide.l.a */
/* loaded from: classes2.dex */
class C1971a implements InterfaceC1980h {

    /* renamed from: a */
    private final Set<InterfaceC1981i> f6037a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f6038b;

    /* renamed from: c */
    private boolean f6039c;

    @Override // com.bumptech.glide.p066l.InterfaceC1980h
    /* renamed from: a */
    public void mo34004a(InterfaceC1981i interfaceC1981i) {
        this.f6037a.add(interfaceC1981i);
        if (this.f6039c) {
            interfaceC1981i.onDestroy();
        } else if (this.f6038b) {
            interfaceC1981i.onStart();
        } else {
            interfaceC1981i.onStop();
        }
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1980h
    /* renamed from: b */
    public void mo34003b(InterfaceC1981i interfaceC1981i) {
        this.f6037a.remove(interfaceC1981i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m34012c() {
        this.f6039c = true;
        for (InterfaceC1981i interfaceC1981i : C2381k.m33119i(this.f6037a)) {
            interfaceC1981i.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34011d() {
        this.f6038b = true;
        for (InterfaceC1981i interfaceC1981i : C2381k.m33119i(this.f6037a)) {
            interfaceC1981i.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m34010e() {
        this.f6038b = false;
        for (InterfaceC1981i interfaceC1981i : C2381k.m33119i(this.f6037a)) {
            interfaceC1981i.onStop();
        }
    }
}
