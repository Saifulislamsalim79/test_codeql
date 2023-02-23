package p577n.p587c.p589e;

import android.util.Log;
import p577n.p587c.p588d.AbstractC14462b;
import p577n.p587c.p588d.C14461a;
import p577n.p587c.p588d.C14463c;
/* compiled from: AndroidLoggerAdapter.java */
/* renamed from: n.c.e.a */
/* loaded from: classes3.dex */
class C14470a extends AbstractC14462b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C14470a(String str) {
        this.f31834c = str;
    }

    /* renamed from: k */
    private void m1637k(int i, String str, Throwable th) {
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Log.println(i, this.f31834c, str);
    }

    /* renamed from: l */
    private void m1636l(int i, String str, Object... objArr) {
        if (m1635m(i)) {
            C14461a m1669a = C14463c.m1669a(str, objArr);
            m1637k(i, m1669a.m1672a(), m1669a.m1671b());
        }
    }

    /* renamed from: m */
    private boolean m1635m(int i) {
        return Log.isLoggable(this.f31834c, i);
    }

    /* renamed from: n */
    private void m1634n(int i, String str, Throwable th) {
        if (m1635m(i)) {
            m1637k(i, str, th);
        }
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: a */
    public void mo1646a(String str, Object obj) {
        m1636l(5, str, obj);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: b */
    public void mo1645b(String str) {
        m1634n(6, str, null);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: c */
    public void mo1644c(String str, Throwable th) {
        m1634n(6, str, th);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: d */
    public void mo1643d(String str, Object obj, Object obj2) {
        m1636l(2, str, obj, obj2);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: e */
    public boolean mo1642e() {
        return m1635m(2);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: f */
    public void mo1641f(String str, Object obj) {
        m1636l(3, str, obj);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: g */
    public void mo1640g(String str) {
        m1634n(5, str, null);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: h */
    public void mo1639h(String str, Object... objArr) {
        m1636l(2, str, objArr);
    }

    @Override // p577n.p587c.InterfaceC14459b
    /* renamed from: i */
    public void mo1638i(String str) {
        m1634n(2, str, null);
    }
}
