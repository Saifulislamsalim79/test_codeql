package com.bumptech.glide.load.engine.p069z;

import com.bumptech.glide.load.engine.p069z.InterfaceC2113m;
import com.bumptech.glide.p086q.C2381k;
import java.util.Queue;
/* compiled from: BaseKeyPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.d */
/* loaded from: classes2.dex */
abstract class AbstractC2099d<T extends InterfaceC2113m> {

    /* renamed from: a */
    private final Queue<T> f6375a = C2381k.m33123e(20);

    /* renamed from: a */
    abstract T mo33671a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public T m33736b() {
        T poll = this.f6375a.poll();
        return poll == null ? mo33671a() : poll;
    }

    /* renamed from: c */
    public void m33735c(T t) {
        if (this.f6375a.size() < 20) {
            this.f6375a.offer(t);
        }
    }
}
