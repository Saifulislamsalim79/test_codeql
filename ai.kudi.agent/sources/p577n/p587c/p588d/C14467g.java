package p577n.p587c.p588d;

import p577n.p587c.InterfaceC14459b;
/* compiled from: SubstituteLogger.java */
/* renamed from: n.c.d.g */
/* loaded from: classes3.dex */
public class C14467g implements InterfaceC14459b {

    /* renamed from: c */
    private final String f31835c;

    /* renamed from: d */
    private volatile InterfaceC14459b f31836d;

    public C14467g(String str) {
        this.f31835c = str;
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: a */
    public void mo1646a(String str, Object obj) {
        m1653j().mo1646a(str, obj);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: b */
    public void mo1645b(String str) {
        m1653j().mo1645b(str);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: c */
    public void mo1644c(String str, Throwable th) {
        m1653j().mo1644c(str, th);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: d */
    public void mo1643d(String str, Object obj, Object obj2) {
        m1653j().mo1643d(str, obj, obj2);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: e */
    public boolean mo1642e() {
        return m1653j().mo1642e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C14467g.class == obj.getClass() && this.f31835c.equals(((C14467g) obj).f31835c);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: f */
    public void mo1641f(String str, Object obj) {
        m1653j().mo1641f(str, obj);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: g */
    public void mo1640g(String str) {
        m1653j().mo1640g(str);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: h */
    public void mo1639h(String str, Object... objArr) {
        m1653j().mo1639h(str, objArr);
    }

    public int hashCode() {
        return this.f31835c.hashCode();
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: i */
    public void mo1638i(String str) {
        m1653j().mo1638i(str);
    }

    /* renamed from: j */
    InterfaceC14459b m1653j() {
        return this.f31836d != null ? this.f31836d : C14464d.f31833d;
    }

    /* renamed from: k */
    public String m1652k() {
        return this.f31835c;
    }

    /* renamed from: l */
    public void m1651l(InterfaceC14459b interfaceC14459b) {
        this.f31836d = interfaceC14459b;
    }
}
