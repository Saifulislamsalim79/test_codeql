package androidx.core.p058os;

import android.os.Build;
import android.os.CancellationSignal;
/* compiled from: CancellationSignal.java */
/* renamed from: androidx.core.os.c */
/* loaded from: classes2.dex */
public final class C1373c {

    /* renamed from: a */
    private boolean f4244a;

    /* renamed from: b */
    private InterfaceC1374a f4245b;

    /* renamed from: c */
    private Object f4246c;

    /* renamed from: d */
    private boolean f4247d;

    /* compiled from: CancellationSignal.java */
    /* renamed from: androidx.core.os.c$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1374a {
        /* renamed from: a */
        void mo35718a();
    }

    /* renamed from: d */
    private void m36170d() {
        while (this.f4247d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m36173a() {
        synchronized (this) {
            if (this.f4244a) {
                return;
            }
            this.f4244a = true;
            this.f4247d = true;
            InterfaceC1374a interfaceC1374a = this.f4245b;
            Object obj = this.f4246c;
            if (interfaceC1374a != null) {
                try {
                    interfaceC1374a.mo35718a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f4247d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f4247d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public Object m36172b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f4246c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f4246c = cancellationSignal;
                if (this.f4244a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f4246c;
        }
        return obj;
    }

    /* renamed from: c */
    public void m36171c(InterfaceC1374a interfaceC1374a) {
        synchronized (this) {
            m36170d();
            if (this.f4245b == interfaceC1374a) {
                return;
            }
            this.f4245b = interfaceC1374a;
            if (this.f4244a && interfaceC1374a != null) {
                interfaceC1374a.mo35718a();
            }
        }
    }
}
