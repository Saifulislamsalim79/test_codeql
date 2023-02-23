package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.j0.o.c.p0.b.o */
/* loaded from: classes3.dex */
public final class C12064o {

    /* renamed from: a */
    public static final C12064o f26891a = new C12064o();

    /* renamed from: b */
    private static final Set<C12614f> f26892b;

    /* renamed from: c */
    private static final HashMap<C12608b, C12608b> f26893c;

    /* renamed from: d */
    private static final HashMap<C12608b, C12608b> f26894d;

    /* renamed from: e */
    private static final Set<C12614f> f26895e;

    static {
        Set<C12614f> m3821F0;
        EnumC12063n[] values = EnumC12063n.values();
        ArrayList arrayList = new ArrayList(values.length);
        int i = 0;
        for (EnumC12063n enumC12063n : values) {
            arrayList.add(enumC12063n.m9820g());
        }
        m3821F0 = C13742z.m3821F0(arrayList);
        f26892b = m3821F0;
        EnumC12062m[] values2 = EnumC12062m.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (EnumC12062m enumC12062m : values2) {
            arrayList2.add(enumC12062m.m9824b());
        }
        C13742z.m3821F0(arrayList2);
        f26893c = new HashMap<>();
        f26894d = new HashMap<>();
        C13727r0.m3879m(C13664u.m4227a(EnumC12062m.f26876e, C12614f.m7349i("ubyteArrayOf")), C13664u.m4227a(EnumC12062m.f26877f, C12614f.m7349i("ushortArrayOf")), C13664u.m4227a(EnumC12062m.f26878w, C12614f.m7349i("uintArrayOf")), C13664u.m4227a(EnumC12062m.f26879x, C12614f.m7349i("ulongArrayOf")));
        EnumC12063n[] values3 = EnumC12063n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC12063n enumC12063n2 : values3) {
            linkedHashSet.add(enumC12063n2.m9822b().m7387j());
        }
        f26895e = linkedHashSet;
        EnumC12063n[] values4 = EnumC12063n.values();
        int length = values4.length;
        while (i < length) {
            EnumC12063n enumC12063n3 = values4[i];
            i++;
            f26893c.put(enumC12063n3.m9822b(), enumC12063n3.m9821e());
            f26894d.put(enumC12063n3.m9821e(), enumC12063n3.m9822b());
        }
    }

    private C12064o() {
    }

    /* renamed from: d */
    public static final boolean m9816d(AbstractC12965b0 abstractC12965b0) {
        InterfaceC13334h mo5206d;
        l.f(abstractC12965b0, "type");
        if (C12974c1.m6280v(abstractC12965b0) || (mo5206d = abstractC12965b0.mo5779W0().mo5206d()) == null) {
            return false;
        }
        return f26891a.m9817c(mo5206d);
    }

    /* renamed from: a */
    public final C12608b m9819a(C12608b c12608b) {
        l.f(c12608b, "arrayClassId");
        return f26893c.get(c12608b);
    }

    /* renamed from: b */
    public final boolean m9818b(C12614f c12614f) {
        l.f(c12614f, "name");
        return f26895e.contains(c12614f);
    }

    /* renamed from: c */
    public final boolean m9817c(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "descriptor");
        InterfaceC13513m mo4687d = interfaceC13513m.mo4687d();
        return (mo4687d instanceof InterfaceC13320f0) && l.b(((InterfaceC13320f0) mo4687d).mo4954f(), C12059k.f26808k) && f26892b.contains(interfaceC13513m.mo5012b());
    }
}
