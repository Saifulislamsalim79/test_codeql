package kotlin.reflect.jvm.internal.impl.descriptors.p551i1;

import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: AdditionalClassPartsProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.i1.a */
/* loaded from: classes3.dex */
public interface InterfaceC13362a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.i1.a$a */
    /* loaded from: classes3.dex */
    public static final class C13363a implements InterfaceC13362a {

        /* renamed from: a */
        public static final C13363a f29579a = new C13363a();

        private C13363a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a
        /* renamed from: a */
        public Collection<InterfaceC13309d> mo5295a(InterfaceC13312e interfaceC13312e) {
            List m3891e;
            l.f(interfaceC13312e, "classDescriptor");
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a
        /* renamed from: b */
        public Collection<InterfaceC13543t0> mo5294b(C12614f c12614f, InterfaceC13312e interfaceC13312e) {
            List m3891e;
            l.f(c12614f, "name");
            l.f(interfaceC13312e, "classDescriptor");
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a
        /* renamed from: d */
        public Collection<AbstractC12965b0> mo5293d(InterfaceC13312e interfaceC13312e) {
            List m3891e;
            l.f(interfaceC13312e, "classDescriptor");
            m3891e = C13726r.m3891e();
            return m3891e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p551i1.InterfaceC13362a
        /* renamed from: e */
        public Collection<C12614f> mo5292e(InterfaceC13312e interfaceC13312e) {
            List m3891e;
            l.f(interfaceC13312e, "classDescriptor");
            m3891e = C13726r.m3891e();
            return m3891e;
        }
    }

    /* renamed from: a */
    Collection<InterfaceC13309d> mo5295a(InterfaceC13312e interfaceC13312e);

    /* renamed from: b */
    Collection<InterfaceC13543t0> mo5294b(C12614f c12614f, InterfaceC13312e interfaceC13312e);

    /* renamed from: d */
    Collection<AbstractC12965b0> mo5293d(InterfaceC13312e interfaceC13312e);

    /* renamed from: e */
    Collection<C12614f> mo5292e(InterfaceC13312e interfaceC13312e);
}
