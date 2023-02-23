package com.google.firebase.database;

import com.google.firebase.database.p131s.p134i0.p135o.C5798a;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import java.util.Iterator;
/* compiled from: DataSnapshot.java */
/* renamed from: com.google.firebase.database.b */
/* loaded from: classes2.dex */
public class C5608b {

    /* renamed from: a */
    private final C5938i f13820a;

    /* renamed from: b */
    private final C5612d f13821b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataSnapshot.java */
    /* renamed from: com.google.firebase.database.b$a */
    /* loaded from: classes2.dex */
    public class C5609a implements Iterable<C5608b> {

        /* renamed from: c */
        final /* synthetic */ Iterator f13822c;

        /* compiled from: DataSnapshot.java */
        /* renamed from: com.google.firebase.database.b$a$a */
        /* loaded from: classes2.dex */
        class C5610a implements Iterator<C5608b> {
            C5610a() {
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public C5608b next() {
                C5944m c5944m = (C5944m) C5609a.this.f13822c.next();
                return new C5608b(C5608b.this.f13821b.m24327j(c5944m.m23222c().m23298b()), C5938i.m23240e(c5944m.m23221d()));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return C5609a.this.f13822c.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }
        }

        C5609a(Iterator it) {
            this.f13822c = it;
        }

        @Override // java.lang.Iterable
        public Iterator<C5608b> iterator() {
            return new C5610a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5608b(C5612d c5612d, C5938i c5938i) {
        this.f13820a = c5938i;
        this.f13821b = c5612d;
    }

    /* renamed from: b */
    public boolean m24344b() {
        return !this.f13820a.m23236l().isEmpty();
    }

    /* renamed from: c */
    public Iterable<C5608b> m24343c() {
        return new C5609a(this.f13820a.iterator());
    }

    /* renamed from: d */
    public String m24342d() {
        return this.f13821b.m24326k();
    }

    /* renamed from: e */
    public C5612d m24341e() {
        return this.f13821b;
    }

    /* renamed from: f */
    public Object m24340f() {
        return this.f13820a.m23236l().getValue();
    }

    /* renamed from: g */
    public <T> T m24339g(Class<T> cls) {
        return (T) C5798a.m23720i(this.f13820a.m23236l().getValue(), cls);
    }

    /* renamed from: h */
    public Object m24338h(boolean z) {
        return this.f13820a.m23236l().mo23215W(z);
    }

    public String toString() {
        return "DataSnapshot { key = " + this.f13821b.m24326k() + ", value = " + this.f13820a.m23236l().mo23215W(true) + " }";
    }
}
