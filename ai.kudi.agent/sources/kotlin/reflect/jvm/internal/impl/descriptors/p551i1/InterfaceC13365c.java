package kotlin.reflect.jvm.internal.impl.descriptors.p551i1;

import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: PlatformDependentDeclarationFilter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.i1.c */
/* loaded from: classes3.dex */
public interface InterfaceC13365c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.i1.c$a */
    /* loaded from: classes3.dex */
    public static final class C13366a implements InterfaceC13365c {

        /* renamed from: a */
        public static final C13366a f29580a = new C13366a();

        private C13366a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c
        /* renamed from: c */
        public boolean mo5288c(InterfaceC13312e interfaceC13312e, InterfaceC13543t0 interfaceC13543t0) {
            l.f(interfaceC13312e, "classDescriptor");
            l.f(interfaceC13543t0, "functionDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.i1.c$b */
    /* loaded from: classes3.dex */
    public static final class C13367b implements InterfaceC13365c {

        /* renamed from: a */
        public static final C13367b f29581a = new C13367b();

        private C13367b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13365c
        /* renamed from: c */
        public boolean mo5288c(InterfaceC13312e interfaceC13312e, InterfaceC13543t0 interfaceC13543t0) {
            l.f(interfaceC13312e, "classDescriptor");
            l.f(interfaceC13543t0, "functionDescriptor");
            return !interfaceC13543t0.mo4956y().mo5304Q(C13368d.m5287a());
        }
    }

    /* renamed from: c */
    boolean mo5288c(InterfaceC13312e interfaceC13312e, InterfaceC13543t0 interfaceC13543t0);
}
