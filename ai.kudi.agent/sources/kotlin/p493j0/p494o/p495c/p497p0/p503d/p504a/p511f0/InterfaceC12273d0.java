package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: javaElements.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.f0.d0 */
/* loaded from: classes3.dex */
public interface InterfaceC12273d0 extends InterfaceC12272d {

    /* compiled from: javaElements.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.f0.d0$a */
    /* loaded from: classes3.dex */
    public static final class C12274a {
        /* renamed from: a */
        public static InterfaceC12265a m9270a(InterfaceC12273d0 interfaceC12273d0, C12609c c12609c) {
            Object obj;
            l.f(interfaceC12273d0, "this");
            l.f(c12609c, "fqName");
            Iterator<T> it = interfaceC12273d0.mo4770y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C12608b mo4879h = ((InterfaceC12265a) next).mo4879h();
                if (l.b(mo4879h != null ? mo4879h.m7395b() : null, c12609c)) {
                    obj = next;
                    break;
                }
            }
            return (InterfaceC12265a) obj;
        }
    }
}
