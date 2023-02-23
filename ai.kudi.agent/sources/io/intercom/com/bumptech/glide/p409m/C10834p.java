package io.intercom.com.bumptech.glide.p409m;

import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: TargetTracker.java */
/* renamed from: io.intercom.com.bumptech.glide.m.p */
/* loaded from: classes3.dex */
public final class C10834p implements InterfaceC10823i {

    /* renamed from: c */
    private final Set<InterfaceC10869h<?>> f24720c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void m12217a() {
        this.f24720c.clear();
    }

    /* renamed from: b */
    public List<InterfaceC10869h<?>> m12216b() {
        return C10893i.m12003j(this.f24720c);
    }

    /* renamed from: c */
    public void m12215c(InterfaceC10869h<?> interfaceC10869h) {
        this.f24720c.add(interfaceC10869h);
    }

    /* renamed from: d */
    public void m12214d(InterfaceC10869h<?> interfaceC10869h) {
        this.f24720c.remove(interfaceC10869h);
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onDestroy() {
        for (InterfaceC10869h interfaceC10869h : C10893i.m12003j(this.f24720c)) {
            interfaceC10869h.onDestroy();
        }
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStart() {
        for (InterfaceC10869h interfaceC10869h : C10893i.m12003j(this.f24720c)) {
            interfaceC10869h.onStart();
        }
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStop() {
        for (InterfaceC10869h interfaceC10869h : C10893i.m12003j(this.f24720c)) {
            interfaceC10869h.onStop();
        }
    }
}
