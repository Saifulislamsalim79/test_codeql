package com.bumptech.glide.p066l;

import com.bumptech.glide.p082o.p083j.InterfaceC2360d;
import com.bumptech.glide.p086q.C2381k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: TargetTracker.java */
/* renamed from: com.bumptech.glide.l.p */
/* loaded from: classes2.dex */
public final class C1992p implements InterfaceC1981i {

    /* renamed from: c */
    private final Set<InterfaceC2360d<?>> f6069c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e */
    public void m33955e() {
        this.f6069c.clear();
    }

    /* renamed from: f */
    public List<InterfaceC2360d<?>> m33954f() {
        return C2381k.m33119i(this.f6069c);
    }

    /* renamed from: g */
    public void m33953g(InterfaceC2360d<?> interfaceC2360d) {
        this.f6069c.add(interfaceC2360d);
    }

    /* renamed from: h */
    public void m33952h(InterfaceC2360d<?> interfaceC2360d) {
        this.f6069c.remove(interfaceC2360d);
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onDestroy() {
        for (InterfaceC2360d interfaceC2360d : C2381k.m33119i(this.f6069c)) {
            interfaceC2360d.onDestroy();
        }
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onStart() {
        for (InterfaceC2360d interfaceC2360d : C2381k.m33119i(this.f6069c)) {
            interfaceC2360d.onStart();
        }
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public void onStop() {
        for (InterfaceC2360d interfaceC2360d : C2381k.m33119i(this.f6069c)) {
            interfaceC2360d.onStop();
        }
    }
}
