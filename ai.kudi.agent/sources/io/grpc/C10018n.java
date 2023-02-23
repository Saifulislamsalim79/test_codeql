package io.grpc;

import com.google.common.base.C5051n;
import io.grpc.AbstractC9490c;
import java.util.concurrent.Executor;
/* compiled from: CompositeCallCredentials.java */
/* renamed from: io.grpc.n */
/* loaded from: classes2.dex */
public final class C10018n extends AbstractC9490c {

    /* renamed from: a */
    private final AbstractC9490c f23741a;

    /* compiled from: CompositeCallCredentials.java */
    /* renamed from: io.grpc.n$a */
    /* loaded from: classes2.dex */
    private final class C10019a extends AbstractC9490c.AbstractC9491a {
        public C10019a(C10018n c10018n, AbstractC9490c.AbstractC9492b abstractC9492b, Executor executor, AbstractC9490c.AbstractC9491a abstractC9491a, C10043s c10043s) {
            C5051n.m25779o(abstractC9491a, "delegate");
            C5051n.m25779o(c10043s, "context");
        }
    }

    public C10018n(AbstractC9490c abstractC9490c, AbstractC9490c abstractC9490c2) {
        C5051n.m25779o(abstractC9490c, "creds1");
        this.f23741a = abstractC9490c;
        C5051n.m25779o(abstractC9490c2, "creds2");
    }

    @Override // io.grpc.AbstractC9490c
    /* renamed from: a */
    public void mo13309a(AbstractC9490c.AbstractC9492b abstractC9492b, Executor executor, AbstractC9490c.AbstractC9491a abstractC9491a) {
        this.f23741a.mo13309a(abstractC9492b, executor, new C10019a(this, abstractC9492b, executor, abstractC9491a, C10043s.m13237I()));
    }
}
