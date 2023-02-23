package p201g.p259r;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.p559q2.C13978g0;
import kotlinx.coroutines.p559q2.InterfaceC13970e0;
import kotlinx.coroutines.p559q2.InterfaceC14022s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteMediatorAccessor.kt */
/* renamed from: g.r.b */
/* loaded from: classes2.dex */
public final class C7829b<Key, Value> {

    /* renamed from: a */
    private final ReentrantLock f18699a = new ReentrantLock();

    /* renamed from: b */
    private final InterfaceC14022s<C7825a0> f18700b = C13978g0.m3302a(C7825a0.f18693d.m17214a());

    /* renamed from: c */
    private final C7820a<Key, Value> f18701c = new C7820a<>();

    /* renamed from: a */
    public final InterfaceC13970e0<C7825a0> m17212a() {
        return this.f18700b;
    }

    /* renamed from: b */
    public final <R> R m17211b(InterfaceC11767l<? super C7820a<Key, Value>, ? extends R> interfaceC11767l) {
        l.f(interfaceC11767l, "block");
        ReentrantLock reentrantLock = this.f18699a;
        reentrantLock.lock();
        try {
            R invoke = interfaceC11767l.invoke(this.f18701c);
            this.f18700b.setValue(this.f18701c.m17233e());
            return invoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
