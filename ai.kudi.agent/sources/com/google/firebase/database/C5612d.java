package com.google.firebase.database;

import com.google.firebase.database.p131s.C5726a0;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5833n;
import com.google.firebase.database.p131s.p134i0.C5785g;
import com.google.firebase.database.p131s.p134i0.C5789j;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.C5797n;
import com.google.firebase.database.p131s.p134i0.p135o.C5798a;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5948o;
import com.google.firebase.database.p139u.C5951r;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* compiled from: DatabaseReference.java */
/* renamed from: com.google.firebase.database.d */
/* loaded from: classes2.dex */
public class C5612d extends C5619l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DatabaseReference.java */
    /* renamed from: com.google.firebase.database.d$a */
    /* loaded from: classes2.dex */
    public class RunnableC5613a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC5945n f13830c;

        /* renamed from: d */
        final /* synthetic */ C5785g f13831d;

        RunnableC5613a(InterfaceC5945n interfaceC5945n, C5785g c5785g) {
            this.f13830c = interfaceC5945n;
            this.f13831d = c5785g;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5612d c5612d = C5612d.this;
            c5612d.f13843a.m23546Z(c5612d.m24304e(), this.f13830c, (InterfaceC5614b) this.f13831d.m23769b());
        }
    }

    /* compiled from: DatabaseReference.java */
    /* renamed from: com.google.firebase.database.d$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5614b {
        /* renamed from: a */
        void mo23738a(C5611c c5611c, C5612d c5612d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5612d(C5833n c5833n, C5830l c5830l) {
        super(c5833n, c5830l);
    }

    /* renamed from: o */
    private com.google.android.gms.tasks.j<Void> m24322o(Object obj, InterfaceC5945n interfaceC5945n, InterfaceC5614b interfaceC5614b) {
        C5797n.m23729i(m24304e());
        C5726a0.m23998g(m24304e(), obj);
        Object m23719j = C5798a.m23719j(obj);
        C5797n.m23730h(m23719j);
        InterfaceC5945n m23206b = C5948o.m23206b(m23719j, interfaceC5945n);
        C5785g<com.google.android.gms.tasks.j<Void>, InterfaceC5614b> m23739l = C5795m.m23739l(interfaceC5614b);
        this.f13843a.m23550V(new RunnableC5613a(m23206b, m23739l));
        return m23739l.m23770a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5612d) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: j */
    public C5612d m24327j(String str) {
        if (str != null) {
            if (m24304e().isEmpty()) {
                C5797n.m23732f(str);
            } else {
                C5797n.m23733e(str);
            }
            return new C5612d(this.f13843a, m24304e().m23593I(new C5830l(str)));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
    }

    /* renamed from: k */
    public String m24326k() {
        if (m24304e().isEmpty()) {
            return null;
        }
        return m24304e().m23589V().m23298b();
    }

    /* renamed from: l */
    public C5612d m24325l() {
        C5830l m23586b0 = m24304e().m23586b0();
        if (m23586b0 != null) {
            return new C5612d(this.f13843a, m23586b0);
        }
        return null;
    }

    /* renamed from: m */
    public C5612d m24324m() {
        return new C5612d(this.f13843a, m24304e().m23592J(C5921b.m23296g(C5789j.m23767a(this.f13843a.m23561K()))));
    }

    /* renamed from: n */
    public com.google.android.gms.tasks.j<Void> m24323n(Object obj) {
        return m24322o(obj, C5951r.m23199c(this.f13844b, null), null);
    }

    public String toString() {
        C5612d m24325l = m24325l();
        if (m24325l == null) {
            return this.f13843a.toString();
        }
        try {
            return m24325l.toString() + "/" + URLEncoder.encode(m24326k(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            throw new DatabaseException("Failed to URLEncode key: " + m24326k(), e);
        }
    }
}
