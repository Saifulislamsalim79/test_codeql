package p201g.p259r;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p557z.C13742z;
/* compiled from: InvalidateCallbackTracker.kt */
/* renamed from: g.r.v */
/* loaded from: classes2.dex */
public final class C8040v<T> {

    /* renamed from: a */
    private final InterfaceC11767l<T, C13666w> f19370a;

    /* renamed from: b */
    private final InterfaceC11756a<Boolean> f19371b;

    /* renamed from: c */
    private final ReentrantLock f19372c;

    /* renamed from: d */
    private final List<T> f19373d;

    /* renamed from: e */
    private boolean f19374e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8040v(InterfaceC11767l<? super T, C13666w> interfaceC11767l, InterfaceC11756a<Boolean> interfaceC11756a) {
        l.f(interfaceC11767l, "callbackInvoker");
        this.f19370a = interfaceC11767l;
        this.f19371b = interfaceC11756a;
        this.f19372c = new ReentrantLock();
        this.f19373d = new ArrayList();
    }

    /* renamed from: a */
    public final int m16835a() {
        return this.f19373d.size();
    }

    /* renamed from: b */
    public final boolean m16834b() {
        return this.f19374e;
    }

    /* renamed from: c */
    public final void m16833c() {
        List<T> m3825B0;
        if (this.f19374e) {
            return;
        }
        ReentrantLock reentrantLock = this.f19372c;
        reentrantLock.lock();
        try {
            if (m16834b()) {
                return;
            }
            this.f19374e = true;
            m3825B0 = C13742z.m3825B0(this.f19373d);
            this.f19373d.clear();
            C13666w c13666w = C13666w.f30112a;
            if (m3825B0 == null) {
                return;
            }
            InterfaceC11767l<T, C13666w> interfaceC11767l = this.f19370a;
            for (T t : m3825B0) {
                interfaceC11767l.invoke(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final void m16832d(T t) {
        InterfaceC11756a<Boolean> interfaceC11756a = this.f19371b;
        boolean z = false;
        if (interfaceC11756a != null && interfaceC11756a.invoke().booleanValue()) {
            m16833c();
        }
        if (this.f19374e) {
            this.f19370a.invoke(t);
            return;
        }
        ReentrantLock reentrantLock = this.f19372c;
        reentrantLock.lock();
        try {
            if (m16834b()) {
                C13666w c13666w = C13666w.f30112a;
                z = true;
            } else {
                this.f19373d.add(t);
            }
            if (z) {
                this.f19370a.invoke(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final void m16831e(T t) {
        ReentrantLock reentrantLock = this.f19372c;
        reentrantLock.lock();
        try {
            this.f19373d.remove(t);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ C8040v(InterfaceC11767l interfaceC11767l, InterfaceC11756a interfaceC11756a, int i, g gVar) {
        this(interfaceC11767l, (i & 2) != 0 ? null : interfaceC11756a);
    }
}
