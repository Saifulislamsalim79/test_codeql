package kotlin.p492io;

import java.io.ByteArrayOutputStream;
import kotlin.e0.d.l;
/* compiled from: FileReadWrite.kt */
/* renamed from: kotlin.io.d */
/* loaded from: classes3.dex */
final class C11845d extends ByteArrayOutputStream {
    public C11845d(int i) {
        super(i);
    }

    /* renamed from: c */
    public final byte[] m10256c() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        l.e(bArr, "buf");
        return bArr;
    }
}
