package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.ServiceLoader;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13722p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13364b;
import kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c;
/* compiled from: BuiltInsLoader.kt */
/* renamed from: kotlin.j0.o.c.p0.b.a */
/* loaded from: classes3.dex */
public interface InterfaceC12035a {

    /* renamed from: a */
    public static final C12036a f26754a = C12036a.f26755a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.a$a */
    /* loaded from: classes3.dex */
    public static final class C12036a {

        /* renamed from: a */
        static final /* synthetic */ C12036a f26755a;

        /* renamed from: b */
        private static final InterfaceC11824h<InterfaceC12035a> f26756b;

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.j0.o.c.p0.b.a$a$a */
        /* loaded from: classes3.dex */
        static final class C12037a extends AbstractC11802m implements InterfaceC11756a<InterfaceC12035a> {

            /* renamed from: c */
            public static final C12037a f26757c = new C12037a();

            C12037a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC12035a invoke() {
                ServiceLoader load = ServiceLoader.load(InterfaceC12035a.class, InterfaceC12035a.class.getClassLoader());
                l.e(load, "implementations");
                InterfaceC12035a interfaceC12035a = (InterfaceC12035a) C13722p.m3953S(load);
                if (interfaceC12035a != null) {
                    return interfaceC12035a;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            InterfaceC11824h<InterfaceC12035a> m5626a;
            C11813x.m10312f(new C11808s(C11813x.m10316b(C12036a.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"));
            f26755a = new C12036a();
            m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, C12037a.f26757c);
            f26756b = m5626a;
        }

        private C12036a() {
        }

        /* renamed from: a */
        public final InterfaceC12035a m9960a() {
            return f26756b.getValue();
        }
    }

    /* renamed from: a */
    InterfaceC13332g0 mo6701a(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0, Iterable<? extends InterfaceC13364b> iterable, InterfaceC13365c interfaceC13365c, InterfaceC13362a interfaceC13362a, boolean z);
}
