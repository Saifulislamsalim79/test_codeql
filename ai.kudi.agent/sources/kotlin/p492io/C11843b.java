package kotlin.p492io;

import java.io.Closeable;
import kotlin.C11709c;
/* compiled from: Closeable.kt */
/* renamed from: kotlin.io.b */
/* loaded from: classes3.dex */
public final class C11843b {
    /* renamed from: a */
    public static final void m10259a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C11709c.m10411a(th, th2);
        }
    }
}
