package kotlinx.coroutines;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p476c0.InterfaceC11714d;
import kotlinx.coroutines.internal.C13881f;
/* compiled from: DebugStrings.kt */
/* renamed from: kotlinx.coroutines.r0 */
/* loaded from: classes3.dex */
public final class C14034r0 {
    /* renamed from: a */
    public static final String m3204a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m3203b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m3202c(InterfaceC11714d<?> interfaceC11714d) {
        String str;
        if (interfaceC11714d instanceof C13881f) {
            return interfaceC11714d.toString();
        }
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            String str2 = interfaceC11714d + '@' + m3203b(interfaceC11714d);
            C13288p.m5362a(str2);
            str = str2;
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            Object m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
            str = m5358a;
        }
        Throwable m5361b = C13288p.m5361b(str);
        String str3 = str;
        if (m5361b != null) {
            str3 = ((Object) interfaceC11714d.getClass().getName()) + '@' + m3203b(interfaceC11714d);
        }
        return (String) str3;
    }
}
