package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: ProtoBasedClassDataFinder.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.w */
/* loaded from: classes3.dex */
public final class C12915w implements InterfaceC12881g {

    /* renamed from: a */
    private final InterfaceC12593c f28959a;

    /* renamed from: b */
    private final AbstractC12587a f28960b;

    /* renamed from: c */
    private final InterfaceC11767l<C12608b, InterfaceC13545u0> f28961c;

    /* renamed from: d */
    private final Map<C12608b, C12509c> f28962d;

    /* JADX WARN: Multi-variable type inference failed */
    public C12915w(C12539m c12539m, InterfaceC12593c interfaceC12593c, AbstractC12587a abstractC12587a, InterfaceC11767l<? super C12608b, ? extends InterfaceC13545u0> interfaceC11767l) {
        int m3867o;
        int m3898f;
        int m10271a;
        l.f(c12539m, "proto");
        l.f(interfaceC12593c, "nameResolver");
        l.f(abstractC12587a, "metadataVersion");
        l.f(interfaceC11767l, "classSource");
        this.f28959a = interfaceC12593c;
        this.f28960b = abstractC12587a;
        this.f28961c = interfaceC11767l;
        List<C12509c> m8036J = c12539m.m8036J();
        l.e(m8036J, "proto.class_List");
        m3867o = C13728s.m3867o(m8036J, 10);
        m3898f = C13725q0.m3898f(m3867o);
        m10271a = C11841h.m10271a(m3898f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
        for (Object obj : m8036J) {
            linkedHashMap.put(C12914v.m6431a(this.f28959a, ((C12509c) obj).m8422r0()), obj);
        }
        this.f28962d = linkedHashMap;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12881g
    /* renamed from: a */
    public C12880f mo6429a(C12608b c12608b) {
        l.f(c12608b, "classId");
        C12509c c12509c = this.f28962d.get(c12608b);
        if (c12509c == null) {
            return null;
        }
        return new C12880f(this.f28959a, c12509c, this.f28960b, this.f28961c.invoke(c12608b));
    }

    /* renamed from: b */
    public final Collection<C12608b> m6428b() {
        return this.f28962d.keySet();
    }
}
