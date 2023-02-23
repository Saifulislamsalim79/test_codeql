package p576m;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: BufferedSource.java */
/* renamed from: m.e */
/* loaded from: classes3.dex */
public interface InterfaceC14346e extends InterfaceC14365s, ReadableByteChannel {
    /* renamed from: B */
    long mo1999B(byte b) throws IOException;

    /* renamed from: C */
    long mo1998C() throws IOException;

    /* renamed from: D */
    InputStream mo1997D();

    /* renamed from: R */
    C14342c mo1996R();

    /* renamed from: R0 */
    long mo1995R0(InterfaceC14364r interfaceC14364r) throws IOException;

    /* renamed from: a */
    void mo1994a(long j) throws IOException;

    @Deprecated
    /* renamed from: d */
    C14342c mo1992d();

    /* renamed from: e */
    boolean mo1991e(long j) throws IOException;

    /* renamed from: f */
    C14347f mo1990f(long j) throws IOException;

    /* renamed from: k */
    byte[] mo1988k() throws IOException;

    /* renamed from: l */
    boolean mo1987l() throws IOException;

    /* renamed from: l0 */
    boolean mo1986l0(long j, C14347f c14347f) throws IOException;

    /* renamed from: p */
    long mo1985p() throws IOException;

    /* renamed from: q */
    String mo1984q(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    String mo1983s(Charset charset) throws IOException;

    /* renamed from: u */
    String mo1982u() throws IOException;

    /* renamed from: v */
    int mo1981v() throws IOException;

    /* renamed from: w */
    byte[] mo1980w(long j) throws IOException;

    /* renamed from: y */
    short mo1979y() throws IOException;

    /* renamed from: z */
    void mo1978z(long j) throws IOException;
}
