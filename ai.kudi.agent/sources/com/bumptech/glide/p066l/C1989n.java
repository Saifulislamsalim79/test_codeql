package com.bumptech.glide.p066l;

import android.util.Log;
import com.bumptech.glide.p082o.InterfaceC2348c;
import com.bumptech.glide.p086q.C2381k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: RequestTracker.java */
/* renamed from: com.bumptech.glide.l.n */
/* loaded from: classes2.dex */
public class C1989n {

    /* renamed from: a */
    private final Set<InterfaceC2348c> f6059a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<InterfaceC2348c> f6060b = new ArrayList();

    /* renamed from: c */
    private boolean f6061c;

    /* renamed from: a */
    public boolean m33976a(InterfaceC2348c interfaceC2348c) {
        boolean z = true;
        if (interfaceC2348c == null) {
            return true;
        }
        boolean remove = this.f6059a.remove(interfaceC2348c);
        if (!this.f6060b.remove(interfaceC2348c) && !remove) {
            z = false;
        }
        if (z) {
            interfaceC2348c.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void m33975b() {
        for (InterfaceC2348c interfaceC2348c : C2381k.m33119i(this.f6059a)) {
            m33976a(interfaceC2348c);
        }
        this.f6060b.clear();
    }

    /* renamed from: c */
    public void m33974c() {
        this.f6061c = true;
        for (InterfaceC2348c interfaceC2348c : C2381k.m33119i(this.f6059a)) {
            if (interfaceC2348c.isRunning() || interfaceC2348c.mo33176f()) {
                interfaceC2348c.clear();
                this.f6060b.add(interfaceC2348c);
            }
        }
    }

    /* renamed from: d */
    public void m33973d() {
        this.f6061c = true;
        for (InterfaceC2348c interfaceC2348c : C2381k.m33119i(this.f6059a)) {
            if (interfaceC2348c.isRunning()) {
                interfaceC2348c.pause();
                this.f6060b.add(interfaceC2348c);
            }
        }
    }

    /* renamed from: e */
    public void m33972e() {
        for (InterfaceC2348c interfaceC2348c : C2381k.m33119i(this.f6059a)) {
            if (!interfaceC2348c.mo33176f() && !interfaceC2348c.mo33174h()) {
                interfaceC2348c.clear();
                if (!this.f6061c) {
                    interfaceC2348c.mo33177e();
                } else {
                    this.f6060b.add(interfaceC2348c);
                }
            }
        }
    }

    /* renamed from: f */
    public void m33971f() {
        this.f6061c = false;
        for (InterfaceC2348c interfaceC2348c : C2381k.m33119i(this.f6059a)) {
            if (!interfaceC2348c.mo33176f() && !interfaceC2348c.isRunning()) {
                interfaceC2348c.mo33177e();
            }
        }
        this.f6060b.clear();
    }

    /* renamed from: g */
    public void m33970g(InterfaceC2348c interfaceC2348c) {
        this.f6059a.add(interfaceC2348c);
        if (!this.f6061c) {
            interfaceC2348c.mo33177e();
            return;
        }
        interfaceC2348c.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f6060b.add(interfaceC2348c);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f6059a.size() + ", isPaused=" + this.f6061c + "}";
    }
}
