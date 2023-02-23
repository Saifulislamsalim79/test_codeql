package kotlin.p475b0;

import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: Thread.kt */
/* renamed from: kotlin.b0.a */
/* loaded from: classes3.dex */
public final class C11707a {

    /* compiled from: Thread.kt */
    /* renamed from: kotlin.b0.a$a */
    /* loaded from: classes3.dex */
    public static final class C11708a extends Thread {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11756a f26437c;

        C11708a(InterfaceC11756a interfaceC11756a) {
            this.f26437c = interfaceC11756a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f26437c.invoke();
        }
    }

    /* renamed from: a */
    public static final Thread m10413a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "block");
        C11708a c11708a = new C11708a(interfaceC11756a);
        if (z2) {
            c11708a.setDaemon(true);
        }
        if (i > 0) {
            c11708a.setPriority(i);
        }
        if (str != null) {
            c11708a.setName(str);
        }
        if (classLoader != null) {
            c11708a.setContextClassLoader(classLoader);
        }
        if (z) {
            c11708a.start();
        }
        return c11708a;
    }
}
