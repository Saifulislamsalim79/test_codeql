package io.intercom.com.bumptech.glide.p409m;

import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ActivityFragmentLifecycle.java */
/* renamed from: io.intercom.com.bumptech.glide.m.a */
/* loaded from: classes3.dex */
class C10813a implements InterfaceC10822h {

    /* renamed from: a */
    private final Set<InterfaceC10823i> f24688a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f24689b;

    /* renamed from: c */
    private boolean f24690c;

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10822h
    /* renamed from: a */
    public void mo12257a(InterfaceC10823i interfaceC10823i) {
        this.f24688a.remove(interfaceC10823i);
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10822h
    /* renamed from: b */
    public void mo12256b(InterfaceC10823i interfaceC10823i) {
        this.f24688a.add(interfaceC10823i);
        if (this.f24690c) {
            interfaceC10823i.onDestroy();
        } else if (this.f24689b) {
            interfaceC10823i.onStart();
        } else {
            interfaceC10823i.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12265c() {
        this.f24690c = true;
        for (InterfaceC10823i interfaceC10823i : C10893i.m12003j(this.f24688a)) {
            interfaceC10823i.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m12264d() {
        this.f24689b = true;
        for (InterfaceC10823i interfaceC10823i : C10893i.m12003j(this.f24688a)) {
            interfaceC10823i.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m12263e() {
        this.f24689b = false;
        for (InterfaceC10823i interfaceC10823i : C10893i.m12003j(this.f24688a)) {
            interfaceC10823i.onStop();
        }
    }
}
