package kotlin.p492io;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.e0.d.l;
/* compiled from: ReadWrite.kt */
/* renamed from: kotlin.io.m */
/* loaded from: classes3.dex */
public final class C11860m {
    /* renamed from: a */
    public static final long m10230a(Reader reader, Writer writer, int i) {
        l.f(reader, "$this$copyTo");
        l.f(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m10229b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m10230a(reader, writer, i);
    }

    /* renamed from: c */
    public static final String m10228c(Reader reader) {
        l.f(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        m10229b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        l.e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
