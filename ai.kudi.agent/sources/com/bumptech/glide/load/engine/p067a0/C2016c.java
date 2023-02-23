package com.bumptech.glide.load.engine.p067a0;

import com.bumptech.glide.p086q.C2380j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: DiskCacheWriteLocker.java */
/* renamed from: com.bumptech.glide.load.engine.a0.c */
/* loaded from: classes2.dex */
final class C2016c {

    /* renamed from: a */
    private final Map<String, C2017a> f6112a = new HashMap();

    /* renamed from: b */
    private final C2018b f6113b = new C2018b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.c$a */
    /* loaded from: classes2.dex */
    public static class C2017a {

        /* renamed from: a */
        final Lock f6114a = new ReentrantLock();

        /* renamed from: b */
        int f6115b;

        C2017a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.c$b */
    /* loaded from: classes2.dex */
    private static class C2018b {

        /* renamed from: a */
        private final Queue<C2017a> f6116a = new ArrayDeque();

        C2018b() {
        }

        /* renamed from: a */
        C2017a m33920a() {
            C2017a poll;
            synchronized (this.f6116a) {
                poll = this.f6116a.poll();
            }
            return poll == null ? new C2017a() : poll;
        }

        /* renamed from: b */
        void m33919b(C2017a c2017a) {
            synchronized (this.f6116a) {
                if (this.f6116a.size() < 10) {
                    this.f6116a.offer(c2017a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m33922a(String str) {
        C2017a c2017a;
        synchronized (this) {
            c2017a = this.f6112a.get(str);
            if (c2017a == null) {
                c2017a = this.f6113b.m33920a();
                this.f6112a.put(str, c2017a);
            }
            c2017a.f6115b++;
        }
        c2017a.f6114a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m33921b(String str) {
        C2017a c2017a;
        synchronized (this) {
            C2017a c2017a2 = this.f6112a.get(str);
            C2380j.m33129d(c2017a2);
            c2017a = c2017a2;
            if (c2017a.f6115b >= 1) {
                int i = c2017a.f6115b - 1;
                c2017a.f6115b = i;
                if (i == 0) {
                    C2017a remove = this.f6112a.remove(str);
                    if (remove.equals(c2017a)) {
                        this.f6113b.m33919b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c2017a + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c2017a.f6115b);
            }
        }
        c2017a.f6114a.unlock();
    }
}
