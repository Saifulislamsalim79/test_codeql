package p576m;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* compiled from: Sink.java */
/* renamed from: m.r */
/* loaded from: classes3.dex */
public interface InterfaceC14364r extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    /* renamed from: r0 */
    void mo1444r0(C14342c c14342c, long j) throws IOException;

    C14366t timeout();
}
