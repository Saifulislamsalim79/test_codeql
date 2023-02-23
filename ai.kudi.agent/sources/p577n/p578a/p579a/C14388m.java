package p577n.p578a.p579a;

import java.util.List;
import java.util.Map;
import p577n.p578a.p582b.C14426o;
import p577n.p578a.p583c.InterfaceC14438b;
import p577n.p578a.p583c.p585g.InterfaceC14453a;
/* compiled from: InlineParserContextImpl.java */
/* renamed from: n.a.a.m */
/* loaded from: classes3.dex */
public class C14388m implements InterfaceC14438b {

    /* renamed from: a */
    private final List<InterfaceC14453a> f31724a;

    /* renamed from: b */
    private final Map<String, C14426o> f31725b;

    public C14388m(List<InterfaceC14453a> list, Map<String, C14426o> map) {
        this.f31724a = list;
        this.f31725b = map;
    }

    @Override // p577n.p578a.p583c.InterfaceC14438b
    /* renamed from: a */
    public C14426o mo1740a(String str) {
        return this.f31725b.get(str);
    }

    @Override // p577n.p578a.p583c.InterfaceC14438b
    /* renamed from: b */
    public List<InterfaceC14453a> mo1739b() {
        return this.f31724a;
    }
}
