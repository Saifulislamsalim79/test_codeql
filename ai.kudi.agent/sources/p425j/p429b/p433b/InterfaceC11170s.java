package p425j.p429b.p433b;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: Source.java */
/* renamed from: j.b.b.s */
/* loaded from: classes3.dex */
public interface InterfaceC11170s extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(C11146c c11146c, long j) throws IOException;

    C11171t timeout();
}
