package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12604i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12606j;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
/* compiled from: context.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.l */
/* loaded from: classes3.dex */
public final class C12893l {

    /* renamed from: a */
    private final C12889j f28913a;

    /* renamed from: b */
    private final InterfaceC12593c f28914b;

    /* renamed from: c */
    private final InterfaceC13513m f28915c;

    /* renamed from: d */
    private final C12598g f28916d;

    /* renamed from: e */
    private final C12604i f28917e;

    /* renamed from: f */
    private final AbstractC12587a f28918f;

    /* renamed from: g */
    private final InterfaceC12845f f28919g;

    /* renamed from: h */
    private final C12806b0 f28920h;

    /* renamed from: i */
    private final C12907u f28921i;

    public C12893l(C12889j c12889j, InterfaceC12593c interfaceC12593c, InterfaceC13513m interfaceC13513m, C12598g c12598g, C12604i c12604i, AbstractC12587a abstractC12587a, InterfaceC12845f interfaceC12845f, C12806b0 c12806b0, List<C12565s> list) {
        String mo6634c;
        l.f(c12889j, "components");
        l.f(interfaceC12593c, "nameResolver");
        l.f(interfaceC13513m, "containingDeclaration");
        l.f(c12598g, "typeTable");
        l.f(c12604i, "versionRequirementTable");
        l.f(abstractC12587a, "metadataVersion");
        l.f(list, "typeParameters");
        this.f28913a = c12889j;
        this.f28914b = interfaceC12593c;
        this.f28915c = interfaceC13513m;
        this.f28916d = c12598g;
        this.f28917e = c12604i;
        this.f28918f = abstractC12587a;
        this.f28919g = interfaceC12845f;
        String str = "Deserializer for \"" + this.f28915c.mo5012b() + '\"';
        InterfaceC12845f interfaceC12845f2 = this.f28919g;
        this.f28920h = new C12806b0(this, c12806b0, list, str, (interfaceC12845f2 == null || (mo6634c = interfaceC12845f2.mo6634c()) == null) ? "[container not found]" : mo6634c, false, 32, null);
        this.f28921i = new C12907u(this);
    }

    /* renamed from: b */
    public static /* synthetic */ C12893l m6475b(C12893l c12893l, InterfaceC13513m interfaceC13513m, List list, InterfaceC12593c interfaceC12593c, C12598g c12598g, C12604i c12604i, AbstractC12587a abstractC12587a, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC12593c = c12893l.f28914b;
        }
        InterfaceC12593c interfaceC12593c2 = interfaceC12593c;
        if ((i & 8) != 0) {
            c12598g = c12893l.f28916d;
        }
        C12598g c12598g2 = c12598g;
        if ((i & 16) != 0) {
            c12604i = c12893l.f28917e;
        }
        C12604i c12604i2 = c12604i;
        if ((i & 32) != 0) {
            abstractC12587a = c12893l.f28918f;
        }
        return c12893l.m6476a(interfaceC13513m, list, interfaceC12593c2, c12598g2, c12604i2, abstractC12587a);
    }

    /* renamed from: a */
    public final C12893l m6476a(InterfaceC13513m interfaceC13513m, List<C12565s> list, InterfaceC12593c interfaceC12593c, C12598g c12598g, C12604i c12604i, AbstractC12587a abstractC12587a) {
        l.f(interfaceC13513m, "descriptor");
        l.f(list, "typeParameterProtos");
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12598g, "typeTable");
        C12604i c12604i2 = c12604i;
        l.f(c12604i2, "versionRequirementTable");
        l.f(abstractC12587a, "metadataVersion");
        C12889j c12889j = this.f28913a;
        if (!C12606j.m7400b(abstractC12587a)) {
            c12604i2 = this.f28917e;
        }
        return new C12893l(c12889j, interfaceC12593c, interfaceC13513m, c12598g, c12604i2, abstractC12587a, this.f28919g, this.f28920h, list);
    }

    /* renamed from: c */
    public final C12889j m6474c() {
        return this.f28913a;
    }

    /* renamed from: d */
    public final InterfaceC12845f m6473d() {
        return this.f28919g;
    }

    /* renamed from: e */
    public final InterfaceC13513m m6472e() {
        return this.f28915c;
    }

    /* renamed from: f */
    public final C12907u m6471f() {
        return this.f28921i;
    }

    /* renamed from: g */
    public final InterfaceC12593c m6470g() {
        return this.f28914b;
    }

    /* renamed from: h */
    public final InterfaceC12954n m6469h() {
        return this.f28913a.m6491u();
    }

    /* renamed from: i */
    public final C12806b0 m6468i() {
        return this.f28920h;
    }

    /* renamed from: j */
    public final C12598g m6467j() {
        return this.f28916d;
    }

    /* renamed from: k */
    public final C12604i m6466k() {
        return this.f28917e;
    }
}
