package kotlinx.coroutines;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.internal.C13913x;
/* compiled from: CompletionState.kt */
/* renamed from: kotlinx.coroutines.e0 */
/* loaded from: classes3.dex */
public final class C13810e0 {
    /* renamed from: a */
    public static final <T> Object m3621a(Object obj, InterfaceC11714d<? super T> interfaceC11714d) {
        if (obj instanceof C13755b0) {
            C13288p.C13289a c13289a = C13288p.f29444c;
            Throwable th = ((C13755b0) obj).f30198a;
            if (C13952q0.m3342d() && (interfaceC11714d instanceof InterfaceC11739e)) {
                th = C13913x.m3425j(th, (InterfaceC11739e) interfaceC11714d);
            }
            Object m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
            return m5358a;
        }
        C13288p.C13289a c13289a2 = C13288p.f29444c;
        C13288p.m5362a(obj);
        return obj;
    }

    /* renamed from: b */
    public static final <T> Object m3620b(Object obj, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        Throwable m5361b = C13288p.m5361b(obj);
        if (m5361b == null) {
            return interfaceC11767l != null ? new C13759c0(obj, interfaceC11767l) : obj;
        }
        return new C13755b0(m5361b, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m3619c(Object obj, InterfaceC13930m<?> interfaceC13930m) {
        Throwable m5361b = C13288p.m5361b(obj);
        if (m5361b != null) {
            if (C13952q0.m3342d() && (interfaceC13930m instanceof InterfaceC11739e)) {
                m5361b = C13913x.m3425j(m5361b, (InterfaceC11739e) interfaceC13930m);
            }
            obj = new C13755b0(m5361b, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m3618d(Object obj, InterfaceC11767l interfaceC11767l, int i, Object obj2) {
        if ((i & 1) != 0) {
            interfaceC11767l = null;
        }
        return m3620b(obj, interfaceC11767l);
    }
}
