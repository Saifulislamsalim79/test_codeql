package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.C13302b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0;
/* compiled from: PackageViewDescriptorFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a0 */
/* loaded from: classes3.dex */
public interface InterfaceC13378a0 {

    /* renamed from: a */
    public static final C13379a f29592a = C13379a.f29593a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a0$a */
    /* loaded from: classes3.dex */
    public static final class C13379a {

        /* renamed from: a */
        static final /* synthetic */ C13379a f29593a = new C13379a();

        /* renamed from: b */
        private static final C13302b0<InterfaceC13378a0> f29594b = new C13302b0<>("PackageViewDescriptorFactory");

        private C13379a() {
        }

        /* renamed from: a */
        public final C13302b0<InterfaceC13378a0> m5278a() {
            return f29594b;
        }
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a0$b */
    /* loaded from: classes3.dex */
    public static final class C13380b implements InterfaceC13378a0 {

        /* renamed from: b */
        public static final C13380b f29595b = new C13380b();

        private C13380b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13378a0
        /* renamed from: a */
        public InterfaceC13448k0 mo5277a(C13442x c13442x, C12609c c12609c, InterfaceC12954n interfaceC12954n) {
            l.f(c13442x, "module");
            l.f(c12609c, "fqName");
            l.f(interfaceC12954n, "storageManager");
            return new C13431r(c13442x, c12609c, interfaceC12954n);
        }
    }

    /* renamed from: a */
    InterfaceC13448k0 mo5277a(C13442x c13442x, C12609c c12609c, InterfaceC12954n interfaceC12954n);
}
