package kotlin.p492io;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p549l0.C13254d;
import kotlin.p557z.C13712m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileReadWrite.kt */
/* renamed from: kotlin.io.j */
/* loaded from: classes3.dex */
public class C11857j extends C11856i {
    /* renamed from: a */
    public static byte[] m10240a(File file) {
        l.f(file, "$this$readBytes");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= Integer.MAX_VALUE) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    l.e(bArr, "java.util.Arrays.copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        C11845d c11845d = new C11845d(8193);
                        c11845d.write(read2);
                        C11842a.m10260b(fileInputStream, c11845d, 0, 2, null);
                        int size = c11845d.size() + i;
                        if (size >= 0) {
                            byte[] m10256c = c11845d.m10256c();
                            bArr = Arrays.copyOf(bArr, size);
                            l.e(bArr, "java.util.Arrays.copyOf(this, newSize)");
                            C13712m.m4066e(m10256c, bArr, i, 0, c11845d.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                C11843b.m10259a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C11843b.m10259a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static final String m10239b(File file, Charset charset) {
        l.f(file, "$this$readText");
        l.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m10228c = C11860m.m10228c(inputStreamReader);
            C11843b.m10259a(inputStreamReader, null);
            return m10228c;
        } finally {
        }
    }

    /* renamed from: c */
    public static /* synthetic */ String m10238c(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C13254d.f29413a;
        }
        return m10239b(file, charset);
    }

    /* renamed from: d */
    public static final void m10237d(File file, byte[] bArr) {
        l.f(file, "$this$writeBytes");
        l.f(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            C13666w c13666w = C13666w.f30112a;
            C11843b.m10259a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: e */
    public static final void m10236e(File file, String str, Charset charset) {
        l.f(file, "$this$writeText");
        l.f(str, AttributeType.TEXT);
        l.f(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l.e(bytes, "(this as java.lang.String).getBytes(charset)");
        m10237d(file, bytes);
    }

    /* renamed from: f */
    public static /* synthetic */ void m10235f(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C13254d.f29413a;
        }
        m10236e(file, str, charset);
    }
}
