package kotlin.p493j0.p494o;

import kotlin.C13287o;
import kotlin.InterfaceC11746d;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.InterfaceC11866e;
import kotlin.p493j0.p494o.p495c.C11884b;
import kotlin.p493j0.p494o.p495c.C11962k;
import kotlin.p493j0.p494o.p495c.C11972m0;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12495f;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12907u;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: reflectLambda.kt */
/* renamed from: kotlin.j0.o.b */
/* loaded from: classes3.dex */
public final class C11880b {

    /* compiled from: reflectLambda.kt */
    /* renamed from: kotlin.j0.o.b$a */
    /* loaded from: classes3.dex */
    static final /* synthetic */ class C11881a extends C11799i implements InterfaceC11771p<C12907u, C12531i, InterfaceC13543t0> {

        /* renamed from: B */
        public static final C11881a f26559B = new C11881a();

        C11881a() {
            super(2);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "loadFunction";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C12907u.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: l */
        public final InterfaceC13543t0 invoke(C12907u c12907u, C12531i c12531i) {
            l.f(c12907u, "p1");
            l.f(c12531i, "p2");
            return c12907u.m6442n(c12531i);
        }
    }

    /* renamed from: a */
    public static final <R> InterfaceC11866e<R> m10218a(InterfaceC11746d<? extends R> interfaceC11746d) {
        l.f(interfaceC11746d, "$this$reflect");
        Metadata metadata = (Metadata) interfaceC11746d.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] m10422d1 = metadata.m10422d1();
            if (m10422d1.length == 0) {
                m10422d1 = null;
            }
            if (m10422d1 != null) {
                C13287o<C12495f, C12531i> m8631j = C12497g.m8631j(m10422d1, metadata.m10421d2());
                C12495f m5366a = m8631j.m5366a();
                C12531i m5365b = m8631j.m5365b();
                C12494e c12494e = new C12494e(metadata.m10420mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = interfaceC11746d.getClass();
                C12569t m8154f0 = m5365b.m8154f0();
                l.e(m8154f0, "proto.typeTable");
                InterfaceC13543t0 interfaceC13543t0 = (InterfaceC13543t0) C11972m0.m10036f(cls, m5365b, m5366a, new C12598g(m8154f0), c12494e, C11881a.f26559B);
                if (interfaceC13543t0 != null) {
                    return new C11962k(C11884b.f26562f, interfaceC13543t0);
                }
            }
        }
        return null;
    }
}
