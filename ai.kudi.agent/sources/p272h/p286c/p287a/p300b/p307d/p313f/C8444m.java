package p272h.p286c.p287a.p300b.p307d.p313f;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.m */
/* loaded from: classes2.dex */
public final class C8444m {

    /* renamed from: a */
    static final Logger f20126a = Logger.getLogger(C8444m.class.getName());

    private C8444m() {
    }

    /* renamed from: a */
    public static void m16098a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            try {
                f20126a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
