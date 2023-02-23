package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* compiled from: LogWriter.java */
/* renamed from: androidx.fragment.app.h0 */
/* loaded from: classes2.dex */
final class C1485h0 extends Writer {

    /* renamed from: c */
    private final String f4576c;

    /* renamed from: d */
    private StringBuilder f4577d = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1485h0(String str) {
        this.f4576c = str;
    }

    /* renamed from: c */
    private void m35750c() {
        if (this.f4577d.length() > 0) {
            Log.d(this.f4576c, this.f4577d.toString());
            StringBuilder sb = this.f4577d;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m35750c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m35750c();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m35750c();
            } else {
                this.f4577d.append(c);
            }
        }
    }
}
