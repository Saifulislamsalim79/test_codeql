package p425j.p429b.p433b;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* compiled from: Sink.java */
/* renamed from: j.b.b.r */
/* loaded from: classes3.dex */
public interface InterfaceC11169r extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    C11171t timeout();

    void write(C11146c c11146c, long j) throws IOException;
}
