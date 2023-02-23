package p425j.p429b.p433b;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: BufferedSource.java */
/* renamed from: j.b.b.e */
/* loaded from: classes3.dex */
public interface InterfaceC11151e extends InterfaceC11170s, ReadableByteChannel {
    /* renamed from: B */
    long mo11503B(byte b) throws IOException;

    /* renamed from: C */
    long mo11502C() throws IOException;

    /* renamed from: D */
    InputStream mo11501D();

    /* renamed from: Y */
    long mo11500Y(InterfaceC11169r interfaceC11169r) throws IOException;

    /* renamed from: a */
    void mo11499a(long j) throws IOException;

    /* renamed from: c0 */
    void mo11497c0(C11146c c11146c, long j) throws IOException;

    @Deprecated
    /* renamed from: d */
    C11146c mo11496d();

    /* renamed from: e */
    boolean mo11495e(long j) throws IOException;

    /* renamed from: f */
    C11152f mo11494f(long j) throws IOException;

    /* renamed from: k */
    byte[] mo11492k() throws IOException;

    /* renamed from: l */
    boolean mo11491l() throws IOException;

    /* renamed from: m0 */
    boolean mo11490m0(long j, C11152f c11152f) throws IOException;

    /* renamed from: p */
    long mo11489p() throws IOException;

    /* renamed from: q */
    String mo11488q(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    String mo11487s(Charset charset) throws IOException;

    /* renamed from: u */
    String mo11486u() throws IOException;

    /* renamed from: v */
    int mo11485v() throws IOException;

    /* renamed from: w */
    byte[] mo11484w(long j) throws IOException;

    /* renamed from: y */
    short mo11483y() throws IOException;

    /* renamed from: z */
    void mo11482z(long j) throws IOException;
}
