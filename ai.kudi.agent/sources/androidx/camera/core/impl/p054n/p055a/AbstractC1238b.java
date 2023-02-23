package androidx.camera.core.impl.p054n.p055a;

import com.google.common.util.concurrent.InterfaceFutureC5161c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p201g.p227h.p237k.C7675h;
/* compiled from: ImmediateFuture.java */
/* renamed from: androidx.camera.core.impl.n.a.b */
/* loaded from: classes2.dex */
abstract class AbstractC1238b<V> implements InterfaceFutureC5161c<V> {

    /* compiled from: ImmediateFuture.java */
    /* renamed from: androidx.camera.core.impl.n.a.b$a */
    /* loaded from: classes2.dex */
    static class C1239a<V> extends AbstractC1238b<V> {

        /* renamed from: c */
        private final Throwable f3706c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1239a(Throwable th) {
            this.f3706c = th;
        }

        @Override // androidx.camera.core.impl.p054n.p055a.AbstractC1238b, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f3706c);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f3706c + "]]";
        }
    }

    /* compiled from: ImmediateFuture.java */
    /* renamed from: androidx.camera.core.impl.n.a.b$b */
    /* loaded from: classes2.dex */
    static final class C1240b<V> extends AbstractC1238b<V> {

        /* renamed from: d */
        static final AbstractC1238b<Object> f3707d = new C1240b(null);

        /* renamed from: c */
        private final V f3708c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1240b(V v) {
            this.f3708c = v;
        }

        @Override // androidx.camera.core.impl.p054n.p055a.AbstractC1238b, java.util.concurrent.Future
        public V get() {
            return this.f3708c;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f3708c + "]]";
        }
    }

    AbstractC1238b() {
    }

    /* renamed from: a */
    public static <V> InterfaceFutureC5161c<V> m36699a() {
        return C1240b.f3707d;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        C7675h.m17866f(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
