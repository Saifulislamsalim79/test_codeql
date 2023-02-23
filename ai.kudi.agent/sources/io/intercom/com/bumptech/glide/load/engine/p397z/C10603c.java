package io.intercom.com.bumptech.glide.load.engine.p397z;

import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: DiskCacheWriteLocker.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.c */
/* loaded from: classes3.dex */
final class C10603c {

    /* renamed from: a */
    private final Map<String, C10604a> f24385a = new HashMap();

    /* renamed from: b */
    private final C10605b f24386b = new C10605b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.c$a */
    /* loaded from: classes3.dex */
    public static class C10604a {

        /* renamed from: a */
        final Lock f24387a = new ReentrantLock();

        /* renamed from: b */
        int f24388b;

        C10604a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.c$b */
    /* loaded from: classes3.dex */
    private static class C10605b {

        /* renamed from: a */
        private final Queue<C10604a> f24389a = new ArrayDeque();

        C10605b() {
        }

        /* renamed from: a */
        C10604a m12639a() {
            C10604a poll;
            synchronized (this.f24389a) {
                poll = this.f24389a.poll();
            }
            return poll == null ? new C10604a() : poll;
        }

        /* renamed from: b */
        void m12638b(C10604a c10604a) {
            synchronized (this.f24389a) {
                if (this.f24389a.size() < 10) {
                    this.f24389a.offer(c10604a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12641a(String str) {
        C10604a c10604a;
        synchronized (this) {
            c10604a = this.f24385a.get(str);
            if (c10604a == null) {
                c10604a = this.f24386b.m12639a();
                this.f24385a.put(str, c10604a);
            }
            c10604a.f24388b++;
        }
        c10604a.f24387a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m12640b(String str) {
        C10604a c10604a;
        synchronized (this) {
            C10604a c10604a2 = this.f24385a.get(str);
            C10892h.m12014d(c10604a2);
            c10604a = c10604a2;
            if (c10604a.f24388b >= 1) {
                int i = c10604a.f24388b - 1;
                c10604a.f24388b = i;
                if (i == 0) {
                    C10604a remove = this.f24385a.remove(str);
                    if (remove.equals(c10604a)) {
                        this.f24386b.m12638b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c10604a + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c10604a.f24388b);
            }
        }
        c10604a.f24387a.unlock();
    }
}
