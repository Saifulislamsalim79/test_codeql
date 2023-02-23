package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12599h;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12604i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12823b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13547v;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13390d0;
/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.d0.j */
/* loaded from: classes3.dex */
public final class C12872j extends C13384c0 implements InterfaceC12823b {

    /* renamed from: S */
    private final C12542n f28850S;

    /* renamed from: T */
    private final InterfaceC12593c f28851T;

    /* renamed from: U */
    private final C12598g f28852U;

    /* renamed from: V */
    private final C12604i f28853V;

    /* renamed from: W */
    private final InterfaceC12845f f28854W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12872j(InterfaceC13513m interfaceC13513m, InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, C12614f c12614f, InterfaceC13300b.EnumC13301a enumC13301a, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C12542n c12542n, InterfaceC12593c interfaceC12593c, C12598g c12598g, C12604i c12604i, InterfaceC12845f interfaceC12845f) {
        super(interfaceC13513m, interfaceC13518o0, interfaceC13346g, enumC13560z, abstractC13544u, z, c12614f, enumC13301a, InterfaceC13545u0.f29903a, z2, z3, z6, false, z4, z5);
        l.f(interfaceC13513m, "containingDeclaration");
        l.f(interfaceC13346g, "annotations");
        l.f(enumC13560z, "modality");
        l.f(abstractC13544u, "visibility");
        l.f(c12614f, "name");
        l.f(enumC13301a, "kind");
        l.f(c12542n, "proto");
        l.f(interfaceC12593c, "nameResolver");
        l.f(c12598g, "typeTable");
        l.f(c12604i, "versionRequirementTable");
        this.f28850S = c12542n;
        this.f28851T = interfaceC12593c;
        this.f28852U = c12598g;
        this.f28853V = c12604i;
        this.f28854W = interfaceC12845f;
        InterfaceC12846g.EnumC12847a enumC12847a = InterfaceC12846g.EnumC12847a.COMPATIBLE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: E */
    public boolean mo4662E() {
        Boolean mo7435d = C12588b.f28306D.mo7435d(mo6548K().m7983S());
        l.e(mo7435d, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return mo7435d.booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g
    /* renamed from: S0 */
    public List<C12599h> mo6547S0() {
        return InterfaceC12823b.C12824a.m6684a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0
    /* renamed from: Z0 */
    protected C13384c0 mo5262Z0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13518o0 interfaceC13518o0, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0) {
        l.f(interfaceC13513m, "newOwner");
        l.f(enumC13560z, "newModality");
        l.f(abstractC13544u, "newVisibility");
        l.f(enumC13301a, "kind");
        l.f(c12614f, "newName");
        l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
        return new C12872j(interfaceC13513m, interfaceC13518o0, mo4956y(), enumC13560z, abstractC13544u, mo5093t0(), c12614f, enumC13301a, mo5139B0(), mo5124G(), mo4662E(), mo5266W(), mo4660T(), mo6548K(), mo6540j0(), mo6544b0(), mo6541h0(), mo6539m0());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g
    /* renamed from: b0 */
    public C12598g mo6544b0() {
        return this.f28852U;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g
    /* renamed from: h0 */
    public C12604i mo6541h0() {
        return this.f28853V;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g
    /* renamed from: j0 */
    public InterfaceC12593c mo6540j0() {
        return this.f28851T;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g
    /* renamed from: m0 */
    public InterfaceC12845f mo6539m0() {
        return this.f28854W;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12846g
    /* renamed from: m1 */
    public C12542n mo6548K() {
        return this.f28850S;
    }

    /* renamed from: n1 */
    public final void m6552n1(C13390d0 c13390d0, InterfaceC13522q0 interfaceC13522q0, InterfaceC13547v interfaceC13547v, InterfaceC13547v interfaceC13547v2, InterfaceC12846g.EnumC12847a enumC12847a) {
        l.f(enumC12847a, "isExperimentalCoroutineInReleaseEnvironment");
        super.m5256f1(c13390d0, interfaceC13522q0, interfaceC13547v, interfaceC13547v2);
        C13666w c13666w = C13666w.f30112a;
    }
}
