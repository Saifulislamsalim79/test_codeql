package p425j.p444e.p451f0.p452a;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11661h;
/* compiled from: ListCompositeDisposable.java */
/* renamed from: j.e.f0.a.e */
/* loaded from: classes3.dex */
public final class C11298e implements c, InterfaceC11295b {

    /* renamed from: c */
    List<c> f25427c;

    /* renamed from: d */
    volatile boolean f25428d;

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
        C11312b.m11113d(cVar, "d is null");
        if (!this.f25428d) {
            synchronized (this) {
                if (!this.f25428d) {
                    List list = this.f25427c;
                    if (list == null) {
                        list = new LinkedList();
                        this.f25427c = list;
                    }
                    list.add(cVar);
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
        C11312b.m11113d(cVar, "Disposable item is null");
        if (this.f25428d) {
            return false;
        }
        synchronized (this) {
            if (this.f25428d) {
                return false;
            }
            List<c> list = this.f25427c;
            if (list != null && list.remove(cVar)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    void m11134d(List<c> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (c cVar : list) {
            try {
                cVar.i();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
    public void m11133i() {
        if (this.f25428d) {
            return;
        }
        synchronized (this) {
            if (this.f25428d) {
                return;
            }
            this.f25428d = true;
            List<c> list = this.f25427c;
            this.f25427c = null;
            m11134d(list);
        }
    }

    /* renamed from: j */
    public boolean m11132j() {
        return this.f25428d;
    }
}
