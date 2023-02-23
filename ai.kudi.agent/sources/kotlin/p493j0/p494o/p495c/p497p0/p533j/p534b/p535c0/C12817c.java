package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p535c0;

import java.io.InputStream;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p492io.C11843b;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.InterfaceC12038b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p518y.C12584a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12896o;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.c0.c */
/* loaded from: classes3.dex */
public final class C12817c extends AbstractC12896o implements InterfaceC12038b {

    /* renamed from: D */
    public static final C12818a f28730D = new C12818a(null);

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.c0.c$a */
    /* loaded from: classes3.dex */
    public static final class C12818a {
        private C12818a() {
        }

        public /* synthetic */ C12818a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12817c m6698a(C12609c c12609c, InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, InputStream inputStream, boolean z) {
            l.f(c12609c, "fqName");
            l.f(interfaceC12954n, "storageManager");
            l.f(interfaceC13305c0, "module");
            l.f(inputStream, "inputStream");
            try {
                C12584a m7456a = C12584a.f28284f.m7456a(inputStream);
                if (m7456a != null) {
                    if (m7456a.m7457h()) {
                        C12539m m8023X = C12539m.m8023X(inputStream, C12814a.f28728m.m6745e());
                        C11843b.m10259a(inputStream, null);
                        l.e(m8023X, "proto");
                        return new C12817c(c12609c, interfaceC12954n, interfaceC13305c0, m8023X, m7456a, z, null);
                    }
                    throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C12584a.f28285g + ", actual " + m7456a + ". Please update Kotlin");
                }
                l.u("version");
                throw null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C11843b.m10259a(inputStream, th);
                    throw th2;
                }
            }
        }
    }

    private C12817c(C12609c c12609c, InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, C12539m c12539m, C12584a c12584a, boolean z) {
        super(c12609c, interfaceC12954n, interfaceC13305c0, c12539m, c12584a, null);
    }

    public /* synthetic */ C12817c(C12609c c12609c, InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, C12539m c12539m, C12584a c12584a, boolean z, g gVar) {
        this(c12609c, interfaceC12954n, interfaceC13305c0, c12539m, c12584a, z);
    }
}
