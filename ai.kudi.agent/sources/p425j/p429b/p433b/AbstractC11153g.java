package p425j.p429b.p433b;

import java.io.IOException;
/* compiled from: ForwardingSink.java */
/* renamed from: j.b.b.g */
/* loaded from: classes3.dex */
public abstract class AbstractC11153g implements InterfaceC11169r {
    private final InterfaceC11169r delegate;

    public AbstractC11153g(InterfaceC11169r interfaceC11169r) {
        if (interfaceC11169r != null) {
            this.delegate = interfaceC11169r;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC11169r delegate() {
        return this.delegate;
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r
    public C11171t timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    @Override // p425j.p429b.p433b.InterfaceC11169r
    public void write(C11146c c11146c, long j) throws IOException {
        this.delegate.write(c11146c, j);
    }
}
