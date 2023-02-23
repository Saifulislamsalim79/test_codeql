package kotlinx.coroutines.p560r2;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.internal.C13883g;
/* compiled from: Cancellable.kt */
/* renamed from: kotlinx.coroutines.r2.a */
/* loaded from: classes3.dex */
public final class C14036a {
    /* renamed from: a */
    public static final /* synthetic */ void m3200a(InterfaceC11714d interfaceC11714d, Throwable th) {
        m3199b(interfaceC11714d, th);
        throw null;
    }

    /* renamed from: b */
    private static final void m3199b(InterfaceC11714d<?> interfaceC11714d, Throwable th) {
        C13288p.C13289a c13289a = C13288p.f29444c;
        Object m5358a = C13291q.m5358a(th);
        C13288p.m5362a(m5358a);
        interfaceC11714d.resumeWith(m5358a);
        throw th;
    }

    /* renamed from: c */
    public static final void m3198c(InterfaceC11714d<? super C13666w> interfaceC11714d, InterfaceC11714d<?> interfaceC11714d2) {
        InterfaceC11714d m10388c;
        try {
            m10388c = C11729c.m10388c(interfaceC11714d);
            C13288p.C13289a c13289a = C13288p.f29444c;
            C13666w c13666w = C13666w.f30112a;
            C13288p.m5362a(c13666w);
            C13883g.m3514c(m10388c, c13666w, null, 2, null);
        } catch (Throwable th) {
            m3200a(interfaceC11714d2, th);
            throw null;
        }
    }

    /* renamed from: d */
    public static final <T> void m3197d(InterfaceC11767l<? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11767l, InterfaceC11714d<? super T> interfaceC11714d) {
        InterfaceC11714d<C13666w> m10390a;
        InterfaceC11714d m10388c;
        try {
            m10390a = C11729c.m10390a(interfaceC11767l, interfaceC11714d);
            m10388c = C11729c.m10388c(m10390a);
            C13288p.C13289a c13289a = C13288p.f29444c;
            C13666w c13666w = C13666w.f30112a;
            C13288p.m5362a(c13666w);
            C13883g.m3514c(m10388c, c13666w, null, 2, null);
        } catch (Throwable th) {
            m3200a(interfaceC11714d, th);
            throw null;
        }
    }

    /* renamed from: e */
    public static final <R, T> void m3196e(InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, R r, InterfaceC11714d<? super T> interfaceC11714d, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        InterfaceC11714d<C13666w> m10389b;
        InterfaceC11714d m10388c;
        try {
            m10389b = C11729c.m10389b(interfaceC11771p, r, interfaceC11714d);
            m10388c = C11729c.m10388c(m10389b);
            C13288p.C13289a c13289a = C13288p.f29444c;
            C13666w c13666w = C13666w.f30112a;
            C13288p.m5362a(c13666w);
            C13883g.m3515b(m10388c, c13666w, interfaceC11767l);
        } catch (Throwable th) {
            m3200a(interfaceC11714d, th);
            throw null;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m3195f(InterfaceC11771p interfaceC11771p, Object obj, InterfaceC11714d interfaceC11714d, InterfaceC11767l interfaceC11767l, int i, Object obj2) {
        if ((i & 4) != 0) {
            interfaceC11767l = null;
        }
        m3196e(interfaceC11771p, obj, interfaceC11714d, interfaceC11767l);
    }
}
