package kotlinx.coroutines.internal;

import kotlin.C13288p;
import kotlin.C13291q;
/* compiled from: FastServiceLoader.kt */
/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes3.dex */
public final class C13893j {

    /* renamed from: a */
    private static final boolean f30373a;

    static {
        Object m5358a;
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            m5358a = Class.forName("android.os.Build");
            C13288p.m5362a(m5358a);
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
        }
        f30373a = C13288p.m5359d(m5358a);
    }

    /* renamed from: a */
    public static final boolean m3495a() {
        return f30373a;
    }
}
