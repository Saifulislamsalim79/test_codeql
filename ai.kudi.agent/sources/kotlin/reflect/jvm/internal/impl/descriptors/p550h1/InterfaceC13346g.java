package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13722p;
/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.g */
/* loaded from: classes3.dex */
public interface InterfaceC13346g extends Iterable<InterfaceC13340c>, InterfaceC11791a {

    /* renamed from: s */
    public static final C13347a f29516s = C13347a.f29517a;

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.g$a */
    /* loaded from: classes3.dex */
    public static final class C13347a {

        /* renamed from: a */
        static final /* synthetic */ C13347a f29517a = new C13347a();

        /* renamed from: b */
        private static final InterfaceC13346g f29518b = new C13348a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.g$a$a */
        /* loaded from: classes3.dex */
        public static final class C13348a implements InterfaceC13346g {
            C13348a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
            /* renamed from: Q */
            public boolean mo5304Q(C12609c c12609c) {
                return C13349b.m5314b(this, c12609c);
            }

            /* renamed from: e */
            public Void m5316e(C12609c c12609c) {
                l.f(c12609c, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<InterfaceC13340c> iterator() {
                return C13722p.m3941e().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g
            /* renamed from: r */
            public /* bridge */ /* synthetic */ InterfaceC13340c mo5302r(C12609c c12609c) {
                return (InterfaceC13340c) m5316e(c12609c);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private C13347a() {
        }

        /* renamed from: a */
        public final InterfaceC13346g m5318a(List<? extends InterfaceC13340c> list) {
            l.f(list, "annotations");
            return list.isEmpty() ? f29518b : new C13350h(list);
        }

        /* renamed from: b */
        public final InterfaceC13346g m5317b() {
            return f29518b;
        }
    }

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.g$b */
    /* loaded from: classes3.dex */
    public static final class C13349b {
        /* renamed from: a */
        public static InterfaceC13340c m5315a(InterfaceC13346g interfaceC13346g, C12609c c12609c) {
            InterfaceC13340c interfaceC13340c;
            l.f(interfaceC13346g, "this");
            l.f(c12609c, "fqName");
            Iterator<InterfaceC13340c> it = interfaceC13346g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC13340c = null;
                    break;
                }
                interfaceC13340c = it.next();
                if (l.b(interfaceC13340c.mo5309f(), c12609c)) {
                    break;
                }
            }
            return interfaceC13340c;
        }

        /* renamed from: b */
        public static boolean m5314b(InterfaceC13346g interfaceC13346g, C12609c c12609c) {
            l.f(interfaceC13346g, "this");
            l.f(c12609c, "fqName");
            return interfaceC13346g.mo5302r(c12609c) != null;
        }
    }

    /* renamed from: Q */
    boolean mo5304Q(C12609c c12609c);

    boolean isEmpty();

    /* renamed from: r */
    InterfaceC13340c mo5302r(C12609c c12609c);
}
