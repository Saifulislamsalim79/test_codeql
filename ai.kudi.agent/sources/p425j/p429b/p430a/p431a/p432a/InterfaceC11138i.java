package p425j.p429b.p430a.p431a.p432a;

import android.os.Looper;
/* compiled from: ThreadEnforcer.java */
/* renamed from: j.b.a.a.a.i */
/* loaded from: classes3.dex */
public interface InterfaceC11138i {

    /* renamed from: a */
    public static final InterfaceC11138i f25197a = new C11139a();

    /* renamed from: b */
    public static final InterfaceC11138i f25198b = new C11140b();

    /* compiled from: ThreadEnforcer.java */
    /* renamed from: j.b.a.a.a.i$a */
    /* loaded from: classes3.dex */
    static class C11139a implements InterfaceC11138i {
        C11139a() {
        }

        @Override // p425j.p429b.p430a.p431a.p432a.InterfaceC11138i
        /* renamed from: a */
        public void mo11589a(C11129b c11129b) {
        }
    }

    /* compiled from: ThreadEnforcer.java */
    /* renamed from: j.b.a.a.a.i$b */
    /* loaded from: classes3.dex */
    static class C11140b implements InterfaceC11138i {
        C11140b() {
        }

        @Override // p425j.p429b.p430a.p431a.p432a.InterfaceC11138i
        /* renamed from: a */
        public void mo11589a(C11129b c11129b) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return;
            }
            throw new IllegalStateException("Event bus " + c11129b + " accessed from non-main thread " + Looper.myLooper());
        }
    }

    /* renamed from: a */
    void mo11589a(C11129b c11129b);
}
