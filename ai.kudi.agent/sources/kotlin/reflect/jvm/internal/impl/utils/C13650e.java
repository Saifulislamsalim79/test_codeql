package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Map;
import kotlin.C13218k;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13727r0;
/* compiled from: JavaTypeEnhancementState.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.e */
/* loaded from: classes3.dex */
public final class C13650e {

    /* renamed from: h */
    public static final EnumC13652f f30078h;

    /* renamed from: i */
    public static final C13650e f30079i;

    /* renamed from: a */
    private final EnumC13652f f30080a;

    /* renamed from: b */
    private final EnumC13652f f30081b;

    /* renamed from: c */
    private final Map<String, EnumC13652f> f30082c;

    /* renamed from: d */
    private final boolean f30083d;

    /* renamed from: e */
    private final EnumC13652f f30084e;

    /* renamed from: f */
    private final boolean f30085f;

    /* renamed from: g */
    private final boolean f30086g;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.e$a */
    /* loaded from: classes3.dex */
    static final class C13651a extends AbstractC11802m implements InterfaceC11756a<String[]> {
        C13651a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final String[] invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C13650e.this.m4257d().m4251b());
            EnumC13652f m4255f = C13650e.this.m4255f();
            if (m4255f != null) {
                arrayList.add(l.m("under-migration:", m4255f.m4251b()));
            }
            for (Map.Entry<String, EnumC13652f> entry : C13650e.this.m4254g().entrySet()) {
                arrayList.add('@' + entry.getKey() + ':' + entry.getValue().m4251b());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static {
        Map m3881k;
        Map m3881k2;
        Map m3881k3;
        EnumC13652f enumC13652f = EnumC13652f.WARN;
        f30078h = enumC13652f;
        m3881k = C13727r0.m3881k();
        new C13650e(enumC13652f, null, m3881k, false, null, 24, null);
        EnumC13652f enumC13652f2 = EnumC13652f.IGNORE;
        m3881k2 = C13727r0.m3881k();
        f30079i = new C13650e(enumC13652f2, enumC13652f2, m3881k2, false, null, 24, null);
        EnumC13652f enumC13652f3 = EnumC13652f.STRICT;
        m3881k3 = C13727r0.m3881k();
        new C13650e(enumC13652f3, enumC13652f3, m3881k3, false, null, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13650e(EnumC13652f enumC13652f, EnumC13652f enumC13652f2, Map<String, ? extends EnumC13652f> map, boolean z, EnumC13652f enumC13652f3) {
        l.f(enumC13652f, "globalJsr305Level");
        l.f(map, "userDefinedLevelForSpecificJsr305Annotation");
        l.f(enumC13652f3, "jspecifyReportLevel");
        this.f30080a = enumC13652f;
        this.f30081b = enumC13652f2;
        this.f30082c = map;
        this.f30083d = z;
        this.f30084e = enumC13652f3;
        C13218k.m5625b(new C13651a());
        EnumC13652f enumC13652f4 = this.f30080a;
        EnumC13652f enumC13652f5 = EnumC13652f.IGNORE;
        boolean z2 = true;
        boolean z3 = enumC13652f4 == enumC13652f5 && this.f30081b == enumC13652f5 && this.f30082c.isEmpty();
        this.f30085f = z3;
        if (!z3 && this.f30084e != EnumC13652f.IGNORE) {
            z2 = false;
        }
        this.f30086g = z2;
    }

    /* renamed from: a */
    public final boolean m4260a() {
        return this.f30086g;
    }

    /* renamed from: b */
    public final boolean m4259b() {
        return this.f30085f;
    }

    /* renamed from: c */
    public final boolean m4258c() {
        return this.f30083d;
    }

    /* renamed from: d */
    public final EnumC13652f m4257d() {
        return this.f30080a;
    }

    /* renamed from: e */
    public final EnumC13652f m4256e() {
        return this.f30084e;
    }

    /* renamed from: f */
    public final EnumC13652f m4255f() {
        return this.f30081b;
    }

    /* renamed from: g */
    public final Map<String, EnumC13652f> m4254g() {
        return this.f30082c;
    }

    public /* synthetic */ C13650e(EnumC13652f enumC13652f, EnumC13652f enumC13652f2, Map map, boolean z, EnumC13652f enumC13652f3, int i, kotlin.e0.d.g gVar) {
        this(enumC13652f, enumC13652f2, map, (i & 8) != 0 ? true : z, (i & 16) != 0 ? f30078h : enumC13652f3);
    }
}
