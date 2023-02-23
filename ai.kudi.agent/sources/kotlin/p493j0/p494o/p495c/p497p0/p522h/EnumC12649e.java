package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import java.util.ArrayList;
import java.util.Set;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13742z;
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.j0.o.c.p0.h.e */
/* loaded from: classes3.dex */
public enum EnumC12649e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: d */
    public static final Set<EnumC12649e> f28440d;

    /* renamed from: e */
    public static final Set<EnumC12649e> f28441e;

    /* renamed from: c */
    private final boolean f28447c;

    static {
        Set<EnumC12649e> m3821F0;
        Set<EnumC12649e> m4012m0;
        EnumC12649e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC12649e enumC12649e : values) {
            if (enumC12649e.m7158b()) {
                arrayList.add(enumC12649e);
            }
        }
        m3821F0 = C13742z.m3821F0(arrayList);
        f28440d = m3821F0;
        m4012m0 = C13715n.m4012m0(values());
        f28441e = m4012m0;
    }

    EnumC12649e(boolean z) {
        this.f28447c = z;
    }

    /* renamed from: b */
    public final boolean m7158b() {
        return this.f28447c;
    }
}
