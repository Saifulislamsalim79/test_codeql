package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: ConstantValueFactory.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.h */
/* loaded from: classes3.dex */
public final class C12713h {

    /* renamed from: a */
    public static final C12713h f28573a = new C12713h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstantValueFactory.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.h$a */
    /* loaded from: classes3.dex */
    public static final class C12714a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13305c0, AbstractC12965b0> {

        /* renamed from: c */
        final /* synthetic */ AbstractC12965b0 f28574c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12714a(AbstractC12965b0 abstractC12965b0) {
            super(1);
            this.f28574c = abstractC12965b0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC12965b0 invoke(InterfaceC13305c0 interfaceC13305c0) {
            l.f(interfaceC13305c0, "it");
            return this.f28574c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstantValueFactory.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.h$b */
    /* loaded from: classes3.dex */
    public static final class C12715b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13305c0, AbstractC12965b0> {

        /* renamed from: c */
        final /* synthetic */ EnumC12052i f28575c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12715b(EnumC12052i enumC12052i) {
            super(1);
            this.f28575c = enumC12052i;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC12965b0 invoke(InterfaceC13305c0 interfaceC13305c0) {
            l.f(interfaceC13305c0, "module");
            AbstractC13010i0 m9920N = interfaceC13305c0.mo4979s().m9920N(this.f28575c);
            l.e(m9920N, "module.builtIns.getPrimitiveArrayKotlinType(componentType)");
            return m9920N;
        }
    }

    private C12713h() {
    }

    /* renamed from: a */
    private final C12707b m6912a(List<?> list, EnumC12052i enumC12052i) {
        List<Object> m3825B0;
        m3825B0 = C13742z.m3825B0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3825B0) {
            AbstractC12712g<?> m6910c = m6910c(obj);
            if (m6910c != null) {
                arrayList.add(m6910c);
            }
        }
        return new C12707b(arrayList, new C12715b(enumC12052i));
    }

    /* renamed from: b */
    public final C12707b m6911b(List<? extends AbstractC12712g<?>> list, AbstractC12965b0 abstractC12965b0) {
        l.f(list, "value");
        l.f(abstractC12965b0, "type");
        return new C12707b(list, new C12714a(abstractC12965b0));
    }

    /* renamed from: c */
    public final AbstractC12712g<?> m6910c(Object obj) {
        List<Boolean> m4023b0;
        List<Double> m4029V;
        List<Float> m4028W;
        List<Character> m4030U;
        List<Long> m4026Y;
        List<Integer> m4027X;
        List<Short> m4024a0;
        List<Byte> m4031T;
        if (obj instanceof Byte) {
            return new C12709d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C12739u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C12722m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C12736r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C12710e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C12721l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C12716i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C12708c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C12740v((String) obj);
        }
        if (obj instanceof byte[]) {
            m4031T = C13715n.m4031T((byte[]) obj);
            return m6912a(m4031T, EnumC12052i.BYTE);
        } else if (obj instanceof short[]) {
            m4024a0 = C13715n.m4024a0((short[]) obj);
            return m6912a(m4024a0, EnumC12052i.SHORT);
        } else if (obj instanceof int[]) {
            m4027X = C13715n.m4027X((int[]) obj);
            return m6912a(m4027X, EnumC12052i.INT);
        } else if (obj instanceof long[]) {
            m4026Y = C13715n.m4026Y((long[]) obj);
            return m6912a(m4026Y, EnumC12052i.LONG);
        } else if (obj instanceof char[]) {
            m4030U = C13715n.m4030U((char[]) obj);
            return m6912a(m4030U, EnumC12052i.CHAR);
        } else if (obj instanceof float[]) {
            m4028W = C13715n.m4028W((float[]) obj);
            return m6912a(m4028W, EnumC12052i.FLOAT);
        } else if (obj instanceof double[]) {
            m4029V = C13715n.m4029V((double[]) obj);
            return m6912a(m4029V, EnumC12052i.DOUBLE);
        } else if (obj instanceof boolean[]) {
            m4023b0 = C13715n.m4023b0((boolean[]) obj);
            return m6912a(m4023b0, EnumC12052i.BOOLEAN);
        } else if (obj == null) {
            return new C12737s();
        } else {
            return null;
        }
    }
}
