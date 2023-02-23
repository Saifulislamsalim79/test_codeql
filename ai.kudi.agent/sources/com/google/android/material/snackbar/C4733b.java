package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: SnackbarManager.java */
/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes2.dex */
class C4733b {

    /* renamed from: e */
    private static C4733b f11862e;

    /* renamed from: a */
    private final Object f11863a = new Object();

    /* renamed from: b */
    private final Handler f11864b = new Handler(Looper.getMainLooper(), new C4734a());

    /* renamed from: c */
    private C4736c f11865c;

    /* renamed from: d */
    private C4736c f11866d;

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$a */
    /* loaded from: classes2.dex */
    class C4734a implements Handler.Callback {
        C4734a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C4733b.this.m26590d((C4736c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4735b {
        /* renamed from: a */
        void mo26579a(int i);

        /* renamed from: c */
        void mo26578c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$c */
    /* loaded from: classes2.dex */
    public static class C4736c {

        /* renamed from: a */
        final WeakReference<InterfaceC4735b> f11868a;

        /* renamed from: b */
        int f11869b;

        /* renamed from: c */
        boolean f11870c;

        C4736c(int i, InterfaceC4735b interfaceC4735b) {
            this.f11868a = new WeakReference<>(interfaceC4735b);
            this.f11869b = i;
        }

        /* renamed from: a */
        boolean m26577a(InterfaceC4735b interfaceC4735b) {
            return interfaceC4735b != null && this.f11868a.get() == interfaceC4735b;
        }
    }

    private C4733b() {
    }

    /* renamed from: a */
    private boolean m26593a(C4736c c4736c, int i) {
        InterfaceC4735b interfaceC4735b = c4736c.f11868a.get();
        if (interfaceC4735b != null) {
            this.f11864b.removeCallbacksAndMessages(c4736c);
            interfaceC4735b.mo26579a(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C4733b m26591c() {
        if (f11862e == null) {
            f11862e = new C4733b();
        }
        return f11862e;
    }

    /* renamed from: f */
    private boolean m26588f(InterfaceC4735b interfaceC4735b) {
        C4736c c4736c = this.f11865c;
        return c4736c != null && c4736c.m26577a(interfaceC4735b);
    }

    /* renamed from: g */
    private boolean m26587g(InterfaceC4735b interfaceC4735b) {
        C4736c c4736c = this.f11866d;
        return c4736c != null && c4736c.m26577a(interfaceC4735b);
    }

    /* renamed from: l */
    private void m26582l(C4736c c4736c) {
        int i = c4736c.f11869b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f11864b.removeCallbacksAndMessages(c4736c);
        Handler handler = this.f11864b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c4736c), i);
    }

    /* renamed from: n */
    private void m26580n() {
        C4736c c4736c = this.f11866d;
        if (c4736c != null) {
            this.f11865c = c4736c;
            this.f11866d = null;
            InterfaceC4735b interfaceC4735b = c4736c.f11868a.get();
            if (interfaceC4735b != null) {
                interfaceC4735b.mo26578c();
            } else {
                this.f11865c = null;
            }
        }
    }

    /* renamed from: b */
    public void m26592b(InterfaceC4735b interfaceC4735b, int i) {
        synchronized (this.f11863a) {
            if (m26588f(interfaceC4735b)) {
                m26593a(this.f11865c, i);
            } else if (m26587g(interfaceC4735b)) {
                m26593a(this.f11866d, i);
            }
        }
    }

    /* renamed from: d */
    void m26590d(C4736c c4736c) {
        synchronized (this.f11863a) {
            if (this.f11865c == c4736c || this.f11866d == c4736c) {
                m26593a(c4736c, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m26589e(InterfaceC4735b interfaceC4735b) {
        boolean z;
        synchronized (this.f11863a) {
            z = m26588f(interfaceC4735b) || m26587g(interfaceC4735b);
        }
        return z;
    }

    /* renamed from: h */
    public void m26586h(InterfaceC4735b interfaceC4735b) {
        synchronized (this.f11863a) {
            if (m26588f(interfaceC4735b)) {
                this.f11865c = null;
                if (this.f11866d != null) {
                    m26580n();
                }
            }
        }
    }

    /* renamed from: i */
    public void m26585i(InterfaceC4735b interfaceC4735b) {
        synchronized (this.f11863a) {
            if (m26588f(interfaceC4735b)) {
                m26582l(this.f11865c);
            }
        }
    }

    /* renamed from: j */
    public void m26584j(InterfaceC4735b interfaceC4735b) {
        synchronized (this.f11863a) {
            if (m26588f(interfaceC4735b) && !this.f11865c.f11870c) {
                this.f11865c.f11870c = true;
                this.f11864b.removeCallbacksAndMessages(this.f11865c);
            }
        }
    }

    /* renamed from: k */
    public void m26583k(InterfaceC4735b interfaceC4735b) {
        synchronized (this.f11863a) {
            if (m26588f(interfaceC4735b) && this.f11865c.f11870c) {
                this.f11865c.f11870c = false;
                m26582l(this.f11865c);
            }
        }
    }

    /* renamed from: m */
    public void m26581m(int i, InterfaceC4735b interfaceC4735b) {
        synchronized (this.f11863a) {
            if (m26588f(interfaceC4735b)) {
                this.f11865c.f11869b = i;
                this.f11864b.removeCallbacksAndMessages(this.f11865c);
                m26582l(this.f11865c);
                return;
            }
            if (m26587g(interfaceC4735b)) {
                this.f11866d.f11869b = i;
            } else {
                this.f11866d = new C4736c(i, interfaceC4735b);
            }
            if (this.f11865c == null || !m26593a(this.f11865c, 4)) {
                this.f11865c = null;
                m26580n();
            }
        }
    }
}
