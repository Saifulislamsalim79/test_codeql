package p576m;

import java.io.IOException;
/* compiled from: ForwardingSource.java */
/* renamed from: m.h */
/* loaded from: classes3.dex */
public abstract class AbstractC14349h implements InterfaceC14365s {

    /* renamed from: c */
    private final InterfaceC14365s f31628c;

    public AbstractC14349h(InterfaceC14365s interfaceC14365s) {
        if (interfaceC14365s != null) {
            this.f31628c = interfaceC14365s;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p576m.InterfaceC14365s
    /* renamed from: O0 */
    public long mo312O0(C14342c c14342c, long j) throws IOException {
        return this.f31628c.mo312O0(c14342c, j);
    }

    /* renamed from: c */
    public final InterfaceC14365s m2033c() {
        return this.f31628c;
    }

    @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31628c.close();
    }

    @Override // p576m.InterfaceC14365s
    public C14366t timeout() {
        return this.f31628c.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f31628c.toString() + ")";
    }
}
