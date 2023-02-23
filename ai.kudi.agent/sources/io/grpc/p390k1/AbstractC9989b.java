package io.grpc.p390k1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC9508e;
import io.grpc.C9502d;
import io.grpc.p390k1.AbstractC9989b;
import java.util.concurrent.TimeUnit;
/* compiled from: AbstractStub.java */
/* renamed from: io.grpc.k1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9989b<S extends AbstractC9989b<S>> {

    /* renamed from: a */
    private final AbstractC9508e f23703a;

    /* renamed from: b */
    private final C9502d f23704b;

    /* compiled from: AbstractStub.java */
    /* renamed from: io.grpc.k1.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9990a<T extends AbstractC9989b<T>> {
        /* renamed from: a */
        T mo13358a(AbstractC9508e abstractC9508e, C9502d c9502d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9989b(AbstractC9508e abstractC9508e, C9502d c9502d) {
        C5051n.m25779o(abstractC9508e, "channel");
        this.f23703a = abstractC9508e;
        C5051n.m25779o(c9502d, "callOptions");
        this.f23704b = c9502d;
    }

    /* renamed from: a */
    protected abstract S mo13362a(AbstractC9508e abstractC9508e, C9502d c9502d);

    /* renamed from: b */
    public final C9502d m13361b() {
        return this.f23704b;
    }

    /* renamed from: c */
    public final AbstractC9508e m13360c() {
        return this.f23703a;
    }

    /* renamed from: d */
    public final S m13359d(long j, TimeUnit timeUnit) {
        return mo13362a(this.f23703a, this.f23704b.m14555l(j, timeUnit));
    }
}
