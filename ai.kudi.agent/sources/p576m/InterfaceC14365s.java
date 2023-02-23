package p576m;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: Source.java */
/* renamed from: m.s */
/* loaded from: classes3.dex */
public interface InterfaceC14365s extends Closeable {
    /* renamed from: O0 */
    long mo312O0(C14342c c14342c, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    C14366t timeout();
}
