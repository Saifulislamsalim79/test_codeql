package p201g.p219f.p223b.p224k.p225m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.p224k.C7556b;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7564f;
/* compiled from: WidgetGroup.java */
/* renamed from: g.f.b.k.m.o */
/* loaded from: classes2.dex */
public class C7591o {

    /* renamed from: f */
    static int f18249f;

    /* renamed from: b */
    int f18251b;

    /* renamed from: c */
    int f18252c;

    /* renamed from: a */
    ArrayList<C7561e> f18250a = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C7592a> f18253d = null;

    /* renamed from: e */
    private int f18254e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* renamed from: g.f.b.k.m.o$a */
    /* loaded from: classes2.dex */
    public class C7592a {
        public C7592a(C7591o c7591o, C7561e c7561e, C7543d c7543d, int i) {
            new WeakReference(c7561e);
            c7543d.m18380y(c7561e.f18091F);
            c7543d.m18380y(c7561e.f18092G);
            c7543d.m18380y(c7561e.f18093H);
            c7543d.m18380y(c7561e.f18094I);
            c7543d.m18380y(c7561e.f18095J);
        }
    }

    public C7591o(int i) {
        this.f18251b = -1;
        this.f18252c = 0;
        int i2 = f18249f;
        f18249f = i2 + 1;
        this.f18251b = i2;
        this.f18252c = i;
    }

    /* renamed from: e */
    private String m18095e() {
        int i = this.f18252c;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m18090j(C7543d c7543d, ArrayList<C7561e> arrayList, int i) {
        int m18380y;
        int m18380y2;
        C7564f c7564f = (C7564f) arrayList.get(0).m18288I();
        c7543d.m18405E();
        c7564f.mo18171g(c7543d, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo18171g(c7543d, false);
        }
        if (i == 0 && c7564f.f18177y0 > 0) {
            C7556b.m18327b(c7564f, c7543d, arrayList, 0);
        }
        if (i == 1 && c7564f.f18178z0 > 0) {
            C7556b.m18327b(c7564f, c7543d, arrayList, 1);
        }
        try {
            c7543d.m18409A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f18253d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f18253d.add(new C7592a(this, arrayList.get(i3), c7543d, i));
        }
        if (i == 0) {
            m18380y = c7543d.m18380y(c7564f.f18091F);
            m18380y2 = c7543d.m18380y(c7564f.f18093H);
            c7543d.m18405E();
        } else {
            m18380y = c7543d.m18380y(c7564f.f18092G);
            m18380y2 = c7543d.m18380y(c7564f.f18094I);
            c7543d.m18405E();
        }
        return m18380y2 - m18380y;
    }

    /* renamed from: a */
    public boolean m18099a(C7561e c7561e) {
        if (this.f18250a.contains(c7561e)) {
            return false;
        }
        this.f18250a.add(c7561e);
        return true;
    }

    /* renamed from: b */
    public void m18098b(ArrayList<C7591o> arrayList) {
        int size = this.f18250a.size();
        if (this.f18254e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C7591o c7591o = arrayList.get(i);
                if (this.f18254e == c7591o.f18251b) {
                    m18093g(this.f18252c, c7591o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m18097c() {
        return this.f18251b;
    }

    /* renamed from: d */
    public int m18096d() {
        return this.f18252c;
    }

    /* renamed from: f */
    public int m18094f(C7543d c7543d, int i) {
        if (this.f18250a.size() == 0) {
            return 0;
        }
        return m18090j(c7543d, this.f18250a, i);
    }

    /* renamed from: g */
    public void m18093g(int i, C7591o c7591o) {
        Iterator<C7561e> it = this.f18250a.iterator();
        while (it.hasNext()) {
            C7561e next = it.next();
            c7591o.m18099a(next);
            if (i == 0) {
                next.f18137m0 = c7591o.m18097c();
            } else {
                next.f18139n0 = c7591o.m18097c();
            }
        }
        this.f18254e = c7591o.f18251b;
    }

    /* renamed from: h */
    public void m18092h(boolean z) {
    }

    /* renamed from: i */
    public void m18091i(int i) {
        this.f18252c = i;
    }

    public String toString() {
        Iterator<C7561e> it;
        String str = m18095e() + " [" + this.f18251b + "] <";
        while (this.f18250a.iterator().hasNext()) {
            str = str + " " + it.next().m18230r();
        }
        return str + " >";
    }
}
