package p577n.p578a.p579a;

import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.InterfaceC14448d;
/* compiled from: BlockStartImpl.java */
/* renamed from: n.a.a.d */
/* loaded from: classes3.dex */
public class C14373d extends AbstractC14450f {

    /* renamed from: a */
    private final InterfaceC14448d[] f31674a;

    /* renamed from: b */
    private int f31675b = -1;

    /* renamed from: c */
    private int f31676c = -1;

    /* renamed from: d */
    private boolean f31677d = false;

    public C14373d(InterfaceC14448d... interfaceC14448dArr) {
        this.f31674a = interfaceC14448dArr;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14450f
    /* renamed from: a */
    public AbstractC14450f mo1713a(int i) {
        this.f31676c = i;
        return this;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14450f
    /* renamed from: b */
    public AbstractC14450f mo1712b(int i) {
        this.f31675b = i;
        return this;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14450f
    /* renamed from: e */
    public AbstractC14450f mo1709e() {
        this.f31677d = true;
        return this;
    }

    /* renamed from: f */
    public InterfaceC14448d[] m1931f() {
        return this.f31674a;
    }

    /* renamed from: g */
    public int m1930g() {
        return this.f31676c;
    }

    /* renamed from: h */
    public int m1929h() {
        return this.f31675b;
    }

    /* renamed from: i */
    public boolean m1928i() {
        return this.f31677d;
    }
}
