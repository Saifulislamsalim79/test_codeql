package kotlinx.coroutines.p563u2;

import kotlin.p491i0.C11841h;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.internal.C13871b0;
import kotlinx.coroutines.internal.C13915z;
/* compiled from: Dispatcher.kt */
/* renamed from: kotlinx.coroutines.u2.b */
/* loaded from: classes3.dex */
public final class C14074b extends C14075c {

    /* renamed from: y */
    public static final C14074b f30696y = new C14074b();

    /* renamed from: z */
    private static final AbstractC13857h0 f30697z;

    static {
        int m10271a;
        int m3553d;
        C14074b c14074b = f30696y;
        m10271a = C11841h.m10271a(64, C13915z.m3420a());
        m3553d = C13871b0.m3553d("kotlinx.coroutines.io.parallelism", m10271a, 0, 0, 12, null);
        f30697z = new ExecutorC14077e(c14074b, m3553d, "Dispatchers.IO", 1);
    }

    private C14074b() {
        super(0, 0, null, 7, null);
    }

    /* renamed from: L0 */
    public final AbstractC13857h0 m3097L0() {
        return f30697z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        return "Dispatchers.Default";
    }
}
