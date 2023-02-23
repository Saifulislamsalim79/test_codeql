package p576m;

import java.io.IOException;
/* compiled from: ForwardingSink.java */
/* renamed from: m.g */
/* loaded from: classes3.dex */
public abstract class AbstractC14348g implements InterfaceC14364r {

    /* renamed from: c */
    private final InterfaceC14364r f31627c;

    public AbstractC14348g(InterfaceC14364r interfaceC14364r) {
        if (interfaceC14364r != null) {
            this.f31627c = interfaceC14364r;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31627c.close();
    }

    @Override // p576m.InterfaceC14364r, java.io.Flushable
    public void flush() throws IOException {
        this.f31627c.flush();
    }

    @Override // p576m.InterfaceC14364r
    /* renamed from: r0 */
    public void mo1444r0(C14342c c14342c, long j) throws IOException {
        this.f31627c.mo1444r0(c14342c, j);
    }

    @Override // p576m.InterfaceC14364r
    public C14366t timeout() {
        return this.f31627c.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f31627c.toString() + ")";
    }
}
