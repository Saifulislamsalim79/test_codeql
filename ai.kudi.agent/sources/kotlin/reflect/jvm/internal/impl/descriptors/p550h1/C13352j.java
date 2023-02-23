package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.Map;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: BuiltInAnnotationDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.j */
/* loaded from: classes3.dex */
public final class C13352j implements InterfaceC13340c {

    /* renamed from: a */
    private final AbstractC12046h f29520a;

    /* renamed from: b */
    private final C12609c f29521b;

    /* renamed from: c */
    private final Map<C12614f, AbstractC12712g<?>> f29522c;

    /* renamed from: d */
    private final InterfaceC11824h f29523d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.j$a */
    /* loaded from: classes3.dex */
    static final class C13353a extends AbstractC11802m implements InterfaceC11756a<AbstractC13010i0> {
        C13353a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final AbstractC13010i0 invoke() {
            return C13352j.this.f29520a.m9880o(C13352j.this.mo5309f()).mo5010x();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13352j(AbstractC12046h abstractC12046h, C12609c c12609c, Map<C12614f, ? extends AbstractC12712g<?>> map) {
        InterfaceC11824h m5626a;
        l.f(abstractC12046h, "builtIns");
        l.f(c12609c, "fqName");
        l.f(map, "allValueArguments");
        this.f29520a = abstractC12046h;
        this.f29521b = c12609c;
        this.f29522c = map;
        m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C13353a());
        this.f29523d = m5626a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: a */
    public Map<C12614f, AbstractC12712g<?>> mo5312a() {
        return this.f29522c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: c */
    public AbstractC12965b0 mo5310c() {
        Object value = this.f29523d.getValue();
        l.e(value, "<get-type>(...)");
        return (AbstractC12965b0) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: f */
    public C12609c mo5309f() {
        return this.f29521b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: m */
    public InterfaceC13545u0 mo5308m() {
        InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
        l.e(interfaceC13545u0, "NO_SOURCE");
        return interfaceC13545u0;
    }
}
