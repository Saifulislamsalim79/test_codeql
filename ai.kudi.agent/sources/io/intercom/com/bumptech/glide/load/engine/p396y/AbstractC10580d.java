package io.intercom.com.bumptech.glide.load.engine.p396y;

import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10594m;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.Queue;
/* compiled from: BaseKeyPool.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.d */
/* loaded from: classes3.dex */
abstract class AbstractC10580d<T extends InterfaceC10594m> {

    /* renamed from: a */
    private final Queue<T> f24348a = C10893i.m12007f(20);

    /* renamed from: a */
    abstract T mo12645a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public T m12708b() {
        T poll = this.f24348a.poll();
        return poll == null ? mo12645a() : poll;
    }

    /* renamed from: c */
    public void m12707c(T t) {
        if (this.f24348a.size() < 20) {
            this.f24348a.offer(t);
        }
    }
}
