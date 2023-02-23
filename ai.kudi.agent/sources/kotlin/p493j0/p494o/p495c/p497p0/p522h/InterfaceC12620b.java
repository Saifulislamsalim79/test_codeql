package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p557z.C13738x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: ClassifierNamePolicy.kt */
/* renamed from: kotlin.j0.o.c.p0.h.b */
/* loaded from: classes3.dex */
public interface InterfaceC12620b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.b$a */
    /* loaded from: classes3.dex */
    public static final class C12621a implements InterfaceC12620b {

        /* renamed from: a */
        public static final C12621a f28400a = new C12621a();

        private C12621a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12620b
        /* renamed from: a */
        public String mo7337a(InterfaceC13334h interfaceC13334h, AbstractC12624c abstractC12624c) {
            l.f(interfaceC13334h, "classifier");
            l.f(abstractC12624c, "renderer");
            if (interfaceC13334h instanceof InterfaceC13562z0) {
                C12614f mo5012b = ((InterfaceC13562z0) interfaceC13334h).mo5012b();
                l.e(mo5012b, "classifier.name");
                return abstractC12624c.mo7193v(mo5012b, false);
            }
            C12610d m7022m = C12673d.m7022m(interfaceC13334h);
            l.e(m7022m, "getFqName(classifier)");
            return abstractC12624c.mo7196u(m7022m);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.b$b */
    /* loaded from: classes3.dex */
    public static final class C12622b implements InterfaceC12620b {

        /* renamed from: a */
        public static final C12622b f28401a = new C12622b();

        private C12622b() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12620b
        /* renamed from: a */
        public String mo7337a(InterfaceC13334h interfaceC13334h, AbstractC12624c abstractC12624c) {
            boolean z;
            List m3835D;
            l.f(interfaceC13334h, "classifier");
            l.f(abstractC12624c, "renderer");
            if (interfaceC13334h instanceof InterfaceC13562z0) {
                C12614f mo5012b = ((InterfaceC13562z0) interfaceC13334h).mo5012b();
                l.e(mo5012b, "classifier.name");
                return abstractC12624c.mo7193v(mo5012b, false);
            }
            ArrayList arrayList = new ArrayList();
            InterfaceC13334h interfaceC13334h2 = interfaceC13334h;
            do {
                arrayList.add(interfaceC13334h2.mo5012b());
                InterfaceC13513m mo4687d = interfaceC13334h2.mo4687d();
                z = mo4687d instanceof InterfaceC13312e;
                interfaceC13334h2 = mo4687d;
            } while (z);
            m3835D = C13738x.m3835D(arrayList);
            return C12664n.m7079c(m3835D);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.b$c */
    /* loaded from: classes3.dex */
    public static final class C12623c implements InterfaceC12620b {

        /* renamed from: a */
        public static final C12623c f28402a = new C12623c();

        private C12623c() {
        }

        /* renamed from: b */
        private final String m7336b(InterfaceC13334h interfaceC13334h) {
            C12614f mo5012b = interfaceC13334h.mo5012b();
            l.e(mo5012b, "descriptor.name");
            String m7080b = C12664n.m7080b(mo5012b);
            if (interfaceC13334h instanceof InterfaceC13562z0) {
                return m7080b;
            }
            InterfaceC13513m mo4687d = interfaceC13334h.mo4687d();
            l.e(mo4687d, "descriptor.containingDeclaration");
            String m7335c = m7335c(mo4687d);
            if (m7335c == null || l.b(m7335c, "")) {
                return m7080b;
            }
            return ((Object) m7335c) + '.' + m7080b;
        }

        /* renamed from: c */
        private final String m7335c(InterfaceC13513m interfaceC13513m) {
            if (interfaceC13513m instanceof InterfaceC13312e) {
                return m7336b((InterfaceC13334h) interfaceC13513m);
            }
            if (interfaceC13513m instanceof InterfaceC13320f0) {
                C12610d m7374j = ((InterfaceC13320f0) interfaceC13513m).mo4954f().m7374j();
                l.e(m7374j, "descriptor.fqName.toUnsafe()");
                return C12664n.m7081a(m7374j);
            }
            return null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12620b
        /* renamed from: a */
        public String mo7337a(InterfaceC13334h interfaceC13334h, AbstractC12624c abstractC12624c) {
            l.f(interfaceC13334h, "classifier");
            l.f(abstractC12624c, "renderer");
            return m7336b(interfaceC13334h);
        }
    }

    /* renamed from: a */
    String mo7337a(InterfaceC13334h interfaceC13334h, AbstractC12624c abstractC12624c);
}
