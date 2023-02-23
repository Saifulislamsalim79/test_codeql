package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p549l0.C13276s;
/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.h */
/* loaded from: classes3.dex */
public final class C13462h {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m4915b(C12608b c12608b) {
        String m5435z;
        String m7382b = c12608b.m7388i().m7382b();
        l.e(m7382b, "relativeClassName.asString()");
        m5435z = C13276s.m5435z(m7382b, '.', '$', false, 4, null);
        if (c12608b.m7389h().m7380d()) {
            return m5435z;
        }
        return c12608b.m7389h() + '.' + m5435z;
    }
}
