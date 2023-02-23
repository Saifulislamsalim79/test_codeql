package p565l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p565l.C14243z;
import p565l.p566g0.C14148c;
/* compiled from: Dispatcher.java */
/* renamed from: l.n */
/* loaded from: classes3.dex */
public final class C14219n {

    /* renamed from: c */
    private Runnable f31132c;

    /* renamed from: d */
    private ExecutorService f31133d;

    /* renamed from: a */
    private int f31130a = 64;

    /* renamed from: b */
    private int f31131b = 5;

    /* renamed from: e */
    private final Deque<C14243z.C14245b> f31134e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C14243z.C14245b> f31135f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C14243z> f31136g = new ArrayDeque();

    /* renamed from: d */
    private <T> void m2590d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f31132c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m2587g() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: g */
    private boolean m2587g() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C14243z.C14245b> it = this.f31134e.iterator();
            while (it.hasNext()) {
                C14243z.C14245b next = it.next();
                if (this.f31135f.size() >= this.f31130a) {
                    break;
                } else if (m2585i(next) < this.f31131b) {
                    it.remove();
                    arrayList.add(next);
                    this.f31135f.add(next);
                }
            }
            z = m2586h() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C14243z.C14245b) arrayList.get(i)).m2408f(m2591c());
        }
        return z;
    }

    /* renamed from: i */
    private int m2585i(C14243z.C14245b c14245b) {
        int i = 0;
        for (C14243z.C14245b c14245b2 : this.f31135f) {
            if (!c14245b2.m2407g().f31260x && c14245b2.m2406h().equals(c14245b.m2406h())) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2593a(C14243z.C14245b c14245b) {
        synchronized (this) {
            this.f31134e.add(c14245b);
        }
        m2587g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m2592b(C14243z c14243z) {
        this.f31136g.add(c14243z);
    }

    /* renamed from: c */
    public synchronized ExecutorService m2591c() {
        if (this.f31133d == null) {
            this.f31133d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C14148c.m2811G("OkHttp Dispatcher", false));
        }
        return this.f31133d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2589e(C14243z.C14245b c14245b) {
        m2590d(this.f31135f, c14245b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2588f(C14243z c14243z) {
        m2590d(this.f31136g, c14243z);
    }

    /* renamed from: h */
    public synchronized int m2586h() {
        return this.f31135f.size() + this.f31136g.size();
    }
}
