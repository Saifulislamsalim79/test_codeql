package p425j.p444e.p448c0;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import p425j.p444e.p451f0.p452a.InterfaceC11295b;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11661h;
import p425j.p444e.p451f0.p467j.C11667k;
/* compiled from: CompositeDisposable.java */
/* renamed from: j.e.c0.b */
/* loaded from: classes3.dex */
public final class C11280b implements c, InterfaceC11295b {

    /* renamed from: c */
    C11667k<c> f25419c;

    /* renamed from: d */
    volatile boolean f25420d;

    @Override // p425j.p444e.p451f0.p452a.InterfaceC11295b
    /* renamed from: a */
    public boolean mo11137a(c cVar) {
        if (mo11135c(cVar)) {
            cVar.i();
            return true;
        }
        return false;
    }

    @Override // p425j.p444e.p451f0.p452a.InterfaceC11295b
    /* renamed from: b */
    public boolean mo11136b(c cVar) {
        C11312b.m11113d(cVar, "disposable is null");
        if (!this.f25420d) {
            synchronized (this) {
                if (!this.f25420d) {
                    C11667k<c> c11667k = this.f25419c;
                    if (c11667k == null) {
                        c11667k = new C11667k<>();
                        this.f25419c = c11667k;
                    }
                    c11667k.m10629a(cVar);
                    return true;
                }
            }
        }
        cVar.i();
        return false;
    }

    @Override // p425j.p444e.p451f0.p452a.InterfaceC11295b
    /* renamed from: c */
    public boolean mo11135c(c cVar) {
        C11312b.m11113d(cVar, "disposables is null");
        if (this.f25420d) {
            return false;
        }
        synchronized (this) {
            if (this.f25420d) {
                return false;
            }
            C11667k<c> c11667k = this.f25419c;
            if (c11667k != null && c11667k.m10625e(cVar)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    public void m11214d() {
        if (this.f25420d) {
            return;
        }
        synchronized (this) {
            if (this.f25420d) {
                return;
            }
            C11667k<c> c11667k = this.f25419c;
            this.f25419c = null;
            m11213e(c11667k);
        }
    }

    /* renamed from: e */
    void m11213e(C11667k<c> c11667k) {
        Object[] m10628b;
        if (c11667k == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c11667k.m10628b()) {
            if (obj instanceof c) {
                try {
                    ((c) obj).i();
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C11661h.m10646d((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    /* renamed from: i */
    public void m11212i() {
        if (this.f25420d) {
            return;
        }
        synchronized (this) {
            if (this.f25420d) {
                return;
            }
            this.f25420d = true;
            C11667k<c> c11667k = this.f25419c;
            this.f25419c = null;
            m11213e(c11667k);
        }
    }

    /* renamed from: j */
    public boolean m11211j() {
        return this.f25420d;
    }
}
