package io.intercom.com.bumptech.glide.p409m;

import io.intercom.com.bumptech.glide.p412p.InterfaceC10850c;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: RequestTracker.java */
/* renamed from: io.intercom.com.bumptech.glide.m.n */
/* loaded from: classes3.dex */
public class C10831n {

    /* renamed from: a */
    private final Set<InterfaceC10850c> f24710a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<InterfaceC10850c> f24711b = new ArrayList();

    /* renamed from: c */
    private boolean f24712c;

    /* renamed from: a */
    private boolean m12234a(InterfaceC10850c interfaceC10850c, boolean z) {
        boolean z2 = true;
        if (interfaceC10850c == null) {
            return true;
        }
        boolean remove = this.f24710a.remove(interfaceC10850c);
        if (!this.f24711b.remove(interfaceC10850c) && !remove) {
            z2 = false;
        }
        if (z2) {
            interfaceC10850c.clear();
            if (z) {
                interfaceC10850c.mo12091b();
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean m12233b(InterfaceC10850c interfaceC10850c) {
        return m12234a(interfaceC10850c, true);
    }

    /* renamed from: c */
    public void m12232c() {
        for (InterfaceC10850c interfaceC10850c : C10893i.m12003j(this.f24710a)) {
            m12234a(interfaceC10850c, false);
        }
        this.f24711b.clear();
    }

    /* renamed from: d */
    public void m12231d() {
        this.f24712c = true;
        for (InterfaceC10850c interfaceC10850c : C10893i.m12003j(this.f24710a)) {
            if (interfaceC10850c.isRunning()) {
                interfaceC10850c.pause();
                this.f24711b.add(interfaceC10850c);
            }
        }
    }

    /* renamed from: e */
    public void m12230e() {
        for (InterfaceC10850c interfaceC10850c : C10893i.m12003j(this.f24710a)) {
            if (!interfaceC10850c.mo12087f() && !interfaceC10850c.isCancelled()) {
                interfaceC10850c.pause();
                if (!this.f24712c) {
                    interfaceC10850c.mo12088e();
                } else {
                    this.f24711b.add(interfaceC10850c);
                }
            }
        }
    }

    /* renamed from: f */
    public void m12229f() {
        this.f24712c = false;
        for (InterfaceC10850c interfaceC10850c : C10893i.m12003j(this.f24710a)) {
            if (!interfaceC10850c.mo12087f() && !interfaceC10850c.isCancelled() && !interfaceC10850c.isRunning()) {
                interfaceC10850c.mo12088e();
            }
        }
        this.f24711b.clear();
    }

    /* renamed from: g */
    public void m12228g(InterfaceC10850c interfaceC10850c) {
        this.f24710a.add(interfaceC10850c);
        if (!this.f24712c) {
            interfaceC10850c.mo12088e();
        } else {
            this.f24711b.add(interfaceC10850c);
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f24710a.size() + ", isPaused=" + this.f24712c + "}";
    }
}
