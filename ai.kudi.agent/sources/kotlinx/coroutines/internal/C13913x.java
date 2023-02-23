package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C13287o;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13664u;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p549l0.C13276s;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.InterfaceC13814f0;
/* compiled from: StackTraceRecovery.kt */
/* renamed from: kotlinx.coroutines.internal.x */
/* loaded from: classes3.dex */
public final class C13913x {

    /* renamed from: a */
    private static final String f30402a;

    /* renamed from: b */
    private static final String f30403b;

    static {
        Object m5358a;
        Object m5358a2;
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            m5358a = Class.forName("kotlin.c0.k.a.a").getCanonicalName();
            C13288p.m5362a(m5358a);
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
        }
        if (C13288p.m5361b(m5358a) != null) {
            m5358a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f30402a = (String) m5358a;
        try {
            C13288p.C13289a c13289a3 = C13288p.f29444c;
            m5358a2 = Class.forName("kotlinx.coroutines.internal.x").getCanonicalName();
            C13288p.m5362a(m5358a2);
        } catch (Throwable th2) {
            C13288p.C13289a c13289a4 = C13288p.f29444c;
            m5358a2 = C13291q.m5358a(th2);
            C13288p.m5362a(m5358a2);
        }
        if (C13288p.m5361b(m5358a2) != null) {
            m5358a2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f30403b = (String) m5358a2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Throwable m3434a(Throwable th, InterfaceC11739e interfaceC11739e) {
        return m3425j(th, interfaceC11739e);
    }

    /* renamed from: b */
    public static final StackTraceElement m3433b(String str) {
        return new StackTraceElement(kotlin.e0.d.l.m("\b\b\b(", str), "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final <E extends Throwable> C13287o<E, StackTraceElement[]> m3432c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause != null && kotlin.e0.d.l.b(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (m3427h(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return C13664u.m4227a(cause, stackTrace);
            }
            return C13664u.m4227a(e, new StackTraceElement[0]);
        }
        return C13664u.m4227a(e, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final <E extends Throwable> E m3431d(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m3433b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int m3428g = m3428g(stackTrace, f30402a);
        int i = 0;
        if (m3428g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + m3428g];
        if (m3428g > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                stackTraceElementArr[i2] = stackTrace[i2];
                if (i3 >= m3428g) {
                    break;
                }
                i2 = i3;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i4 = i + 1;
            stackTraceElementArr[i + m3428g] = it.next();
            i = i4;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: e */
    private static final ArrayDeque<StackTraceElement> m3430e(InterfaceC11739e interfaceC11739e) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = interfaceC11739e.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(interfaceC11739e instanceof InterfaceC11739e)) {
                interfaceC11739e = null;
            }
            interfaceC11739e = interfaceC11739e == null ? null : interfaceC11739e.getCallerFrame();
            if (interfaceC11739e == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = interfaceC11739e.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: f */
    private static final boolean m3429f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.e0.d.l.b(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.e0.d.l.b(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.e0.d.l.b(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m3428g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (kotlin.e0.d.l.b(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m3427h(StackTraceElement stackTraceElement) {
        boolean m5447E;
        m5447E = C13276s.m5447E(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return m5447E;
    }

    /* renamed from: i */
    private static final void m3426i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m3427h(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            int i3 = length2 - 1;
            if (m3429f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            }
            length2 = i3;
        }
    }

    /* renamed from: j */
    public static final <E extends Throwable> E m3425j(E e, InterfaceC11739e interfaceC11739e) {
        C13287o m3432c = m3432c(e);
        Throwable th = (Throwable) m3432c.m5366a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m3432c.m5365b();
        E e2 = (E) m3422m(th);
        if (e2 == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> m3430e = m3430e(interfaceC11739e);
        if (m3430e.isEmpty()) {
            return e;
        }
        if (th != e) {
            m3426i(stackTraceElementArr, m3430e);
        }
        m3431d(th, e2, m3430e);
        return e2;
    }

    /* renamed from: k */
    public static final <E extends Throwable> E m3424k(E e) {
        E e2;
        if (C13952q0.m3342d() && (e2 = (E) m3422m(e)) != null) {
            m3423l(e2);
            return e2;
        }
        return e;
    }

    /* renamed from: l */
    private static final <E extends Throwable> E m3423l(E e) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int m3428g = m3428g(stackTrace, f30403b);
        int i = m3428g + 1;
        int m3428g2 = m3428g(stackTrace, f30402a);
        int i2 = (length - m3428g) - (m3428g2 == -1 ? 0 : length - m3428g2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = m3433b("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* renamed from: m */
    private static final <E extends Throwable> E m3422m(E e) {
        E e2 = (E) C13884h.m3508e(e);
        if (e2 == null) {
            return null;
        }
        if ((e instanceof InterfaceC13814f0) || kotlin.e0.d.l.b(e2.getMessage(), e.getMessage())) {
            return e2;
        }
        return null;
    }

    /* renamed from: n */
    public static final <E extends Throwable> E m3421n(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && kotlin.e0.d.l.b(e2.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (m3427h(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return e2;
            }
        }
        return e;
    }
}
