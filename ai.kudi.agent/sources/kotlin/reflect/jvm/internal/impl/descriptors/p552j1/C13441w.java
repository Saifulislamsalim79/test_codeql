package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.w */
/* loaded from: classes3.dex */
public final class C13441w implements InterfaceC13440v {

    /* renamed from: a */
    private final List<C13442x> f29782a;

    /* renamed from: b */
    private final Set<C13442x> f29783b;

    /* renamed from: c */
    private final List<C13442x> f29784c;

    public C13441w(List<C13442x> list, Set<C13442x> set, List<C13442x> list2, Set<C13442x> set2) {
        l.f(list, "allDependencies");
        l.f(set, "modulesWhoseInternalsAreVisible");
        l.f(list2, "directExpectedByDependencies");
        l.f(set2, "allExpectedByDependencies");
        this.f29782a = list;
        this.f29783b = set;
        this.f29784c = list2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13440v
    /* renamed from: a */
    public List<C13442x> mo5003a() {
        return this.f29782a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13440v
    /* renamed from: b */
    public Set<C13442x> mo5002b() {
        return this.f29783b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13440v
    /* renamed from: c */
    public List<C13442x> mo5001c() {
        return this.f29784c;
    }
}
