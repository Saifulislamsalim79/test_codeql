package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0 */
/* loaded from: classes3.dex */
public final class C13514m0 {

    /* renamed from: a */
    private final InterfaceC13360i f29875a;

    /* renamed from: b */
    private final List<InterfaceC13131v0> f29876b;

    /* renamed from: c */
    private final C13514m0 f29877c;

    /* JADX WARN: Multi-variable type inference failed */
    public C13514m0(InterfaceC13360i interfaceC13360i, List<? extends InterfaceC13131v0> list, C13514m0 c13514m0) {
        kotlin.e0.d.l.f(interfaceC13360i, "classifierDescriptor");
        kotlin.e0.d.l.f(list, "arguments");
        this.f29875a = interfaceC13360i;
        this.f29876b = list;
        this.f29877c = c13514m0;
    }

    /* renamed from: a */
    public final List<InterfaceC13131v0> m4768a() {
        return this.f29876b;
    }

    /* renamed from: b */
    public final InterfaceC13360i m4767b() {
        return this.f29875a;
    }

    /* renamed from: c */
    public final C13514m0 m4766c() {
        return this.f29877c;
    }
}
