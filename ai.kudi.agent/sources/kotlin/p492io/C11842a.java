package kotlin.p492io;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.e0.d.l;
/* compiled from: IOStreams.kt */
/* renamed from: kotlin.io.a */
/* loaded from: classes3.dex */
public final class C11842a {
    /* renamed from: a */
    public static final long m10261a(InputStream inputStream, OutputStream outputStream, int i) {
        l.f(inputStream, "$this$copyTo");
        l.f(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m10260b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m10261a(inputStream, outputStream, i);
    }
}
