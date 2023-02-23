package p425j.p429b.p433b;

import java.io.IOException;
/* compiled from: ForwardingSource.java */
/* renamed from: j.b.b.h */
/* loaded from: classes3.dex */
public abstract class AbstractC11154h implements InterfaceC11170s {
    private final InterfaceC11170s delegate;

    public AbstractC11154h(InterfaceC11170s interfaceC11170s) {
        if (interfaceC11170s != null) {
            this.delegate = interfaceC11170s;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC11170s delegate() {
        return this.delegate;
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public long read(C11146c c11146c, long j) throws IOException {
        return this.delegate.read(c11146c, j);
    }

    @Override // p425j.p429b.p433b.InterfaceC11170s
    public C11171t timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}
