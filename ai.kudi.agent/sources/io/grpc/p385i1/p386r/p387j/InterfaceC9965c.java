package io.grpc.p385i1.p386r.p387j;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import p576m.C14342c;
/* compiled from: FrameWriter.java */
/* renamed from: io.grpc.i1.r.j.c */
/* loaded from: classes2.dex */
public interface InterfaceC9965c extends Closeable {
    /* renamed from: E */
    void mo13405E(int i, EnumC9962a enumC9962a) throws IOException;

    /* renamed from: W */
    void mo13403W(boolean z, int i, C14342c c14342c, int i2) throws IOException;

    /* renamed from: W0 */
    void mo13402W0(boolean z, boolean z2, int i, int i2, List<C9966d> list) throws IOException;

    /* renamed from: a1 */
    void mo13401a1(int i, EnumC9962a enumC9962a, byte[] bArr) throws IOException;

    void connectionPreface() throws IOException;

    void flush() throws IOException;

    int maxDataLength();

    /* renamed from: p0 */
    void mo13397p0(C9978i c9978i) throws IOException;

    void ping(boolean z, int i, int i2) throws IOException;

    /* renamed from: t0 */
    void mo13396t0(C9978i c9978i) throws IOException;

    void windowUpdate(int i, long j) throws IOException;
}
