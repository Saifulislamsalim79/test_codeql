package androidx.biometric;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.BiometricPrompt;
import androidx.core.p058os.C1373c;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;
import p201g.p227h.p229f.p230a.C7620a;
/* compiled from: FingerprintHelperFragment.java */
/* renamed from: androidx.biometric.e */
/* loaded from: classes2.dex */
public class C1200e extends Fragment {

    /* renamed from: A */
    private C1373c f3655A;

    /* renamed from: B */
    final C7620a.AbstractC7622b f3656B = new C1201a();

    /* renamed from: c */
    private C1206b f3657c;

    /* renamed from: d */
    Executor f3658d;

    /* renamed from: e */
    BiometricPrompt.AbstractC1177b f3659e;

    /* renamed from: f */
    private Handler f3660f;

    /* renamed from: w */
    private boolean f3661w;

    /* renamed from: x */
    private BiometricPrompt.C1179d f3662x;

    /* renamed from: y */
    private Context f3663y;

    /* renamed from: z */
    private int f3664z;

    /* compiled from: FingerprintHelperFragment.java */
    /* renamed from: androidx.biometric.e$a */
    /* loaded from: classes2.dex */
    class C1201a extends C7620a.AbstractC7622b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FingerprintHelperFragment.java */
        /* renamed from: androidx.biometric.e$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC1202a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f3666c;

            /* renamed from: d */
            final /* synthetic */ CharSequence f3667d;

            RunnableC1202a(int i, CharSequence charSequence) {
                this.f3666c = i;
                this.f3667d = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1200e.this.f3659e.onAuthenticationError(this.f3666c, this.f3667d);
            }
        }

        /* compiled from: FingerprintHelperFragment.java */
        /* renamed from: androidx.biometric.e$a$b */
        /* loaded from: classes2.dex */
        class RunnableC1203b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f3669c;

            /* renamed from: d */
            final /* synthetic */ CharSequence f3670d;

            RunnableC1203b(int i, CharSequence charSequence) {
                this.f3669c = i;
                this.f3670d = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1201a.this.m36747f(this.f3669c, this.f3670d);
                C1200e.this.m36758n();
            }
        }

        /* compiled from: FingerprintHelperFragment.java */
        /* renamed from: androidx.biometric.e$a$c */
        /* loaded from: classes2.dex */
        class RunnableC1204c implements Runnable {

            /* renamed from: c */
            final /* synthetic */ BiometricPrompt.C1178c f3672c;

            RunnableC1204c(BiometricPrompt.C1178c c1178c) {
                this.f3672c = c1178c;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1200e.this.f3659e.onAuthenticationSucceeded(this.f3672c);
            }
        }

        /* compiled from: FingerprintHelperFragment.java */
        /* renamed from: androidx.biometric.e$a$d */
        /* loaded from: classes2.dex */
        class RunnableC1205d implements Runnable {
            RunnableC1205d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1200e.this.f3659e.onAuthenticationFailed();
            }
        }

        C1201a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m36747f(int i, CharSequence charSequence) {
            C1200e.this.f3657c.m36746a(3);
            if (C1214m.m36743a()) {
                return;
            }
            C1200e.this.f3658d.execute(new RunnableC1202a(i, charSequence));
        }

        @Override // p201g.p227h.p229f.p230a.C7620a.AbstractC7622b
        /* renamed from: a */
        public void mo17982a(int i, CharSequence charSequence) {
            if (i == 5) {
                if (C1200e.this.f3664z == 0) {
                    m36747f(i, charSequence);
                }
                C1200e.this.m36758n();
            } else if (i != 7 && i != 9) {
                if (charSequence == null) {
                    Log.e("FingerprintHelperFrag", "Got null string for error message: " + i);
                    charSequence = C1200e.this.f3663y.getResources().getString(C1212k.default_error_msg);
                }
                if (C1214m.m36741c(i)) {
                    i = 8;
                }
                C1200e.this.f3657c.m36745b(2, i, 0, charSequence);
                C1200e.this.f3660f.postDelayed(new RunnableC1203b(i, charSequence), C1194d.m36773s(C1200e.this.getContext()));
            } else {
                m36747f(i, charSequence);
                C1200e.this.m36758n();
            }
        }

        @Override // p201g.p227h.p229f.p230a.C7620a.AbstractC7622b
        /* renamed from: b */
        public void mo17981b() {
            C1200e.this.f3657c.m36744c(1, C1200e.this.f3663y.getResources().getString(C1212k.fingerprint_not_recognized));
            C1200e.this.f3658d.execute(new RunnableC1205d());
        }

        @Override // p201g.p227h.p229f.p230a.C7620a.AbstractC7622b
        /* renamed from: c */
        public void mo17980c(int i, CharSequence charSequence) {
            C1200e.this.f3657c.m36744c(1, charSequence);
        }

        @Override // p201g.p227h.p229f.p230a.C7620a.AbstractC7622b
        /* renamed from: d */
        public void mo17979d(C7620a.C7623c c7623c) {
            C1200e.this.f3657c.m36746a(5);
            C1200e.this.f3658d.execute(new RunnableC1204c(c7623c != null ? new BiometricPrompt.C1178c(C1200e.m36750v(c7623c.m17978a())) : new BiometricPrompt.C1178c(null)));
            C1200e.this.m36758n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintHelperFragment.java */
    /* renamed from: androidx.biometric.e$b */
    /* loaded from: classes2.dex */
    public static class C1206b {

        /* renamed from: a */
        private final Handler f3675a;

        C1206b(Handler handler) {
            this.f3675a = handler;
        }

        /* renamed from: a */
        void m36746a(int i) {
            this.f3675a.obtainMessage(i).sendToTarget();
        }

        /* renamed from: b */
        void m36745b(int i, int i2, int i3, Object obj) {
            this.f3675a.obtainMessage(i, i2, i3, obj).sendToTarget();
        }

        /* renamed from: c */
        void m36744c(int i, Object obj) {
            this.f3675a.obtainMessage(i, obj).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m36758n() {
        this.f3661w = false;
        androidx.fragment.app.i activity = getActivity();
        if (getFragmentManager() != null) {
            AbstractC1449b0 m35924l = getFragmentManager().m35924l();
            m35924l.mo35801m(this);
            m35924l.mo35804j();
        }
        if (C1214m.m36743a()) {
            return;
        }
        C1214m.m36738f(activity);
    }

    /* renamed from: o */
    private String m36757o(Context context, int i) {
        if (i != 1) {
            switch (i) {
                case 10:
                    return context.getString(C1212k.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(C1212k.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(C1212k.fingerprint_error_hw_not_present);
                default:
                    Log.e("FingerprintHelperFrag", "Unknown error code: " + i);
                    return context.getString(C1212k.default_error_msg);
            }
        }
        return context.getString(C1212k.fingerprint_error_hw_not_available);
    }

    /* renamed from: p */
    private boolean m36756p(C7620a c7620a) {
        if (!c7620a.m17986e()) {
            m36754r(12);
            return true;
        } else if (c7620a.m17987d()) {
            return false;
        } else {
            m36754r(11);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static C1200e m36755q() {
        return new C1200e();
    }

    /* renamed from: r */
    private void m36754r(int i) {
        if (C1214m.m36743a()) {
            return;
        }
        this.f3659e.onAuthenticationError(i, m36757o(this.f3663y, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static BiometricPrompt.C1179d m36750v(C7620a.C7624d c7624d) {
        if (c7624d == null) {
            return null;
        }
        if (c7624d.m17977a() != null) {
            return new BiometricPrompt.C1179d(c7624d.m17977a());
        }
        if (c7624d.m17975c() != null) {
            return new BiometricPrompt.C1179d(c7624d.m17975c());
        }
        if (c7624d.m17976b() != null) {
            return new BiometricPrompt.C1179d(c7624d.m17976b());
        }
        return null;
    }

    /* renamed from: w */
    private static C7620a.C7624d m36749w(BiometricPrompt.C1179d c1179d) {
        if (c1179d == null) {
            return null;
        }
        if (c1179d.m36835a() != null) {
            return new C7620a.C7624d(c1179d.m36835a());
        }
        if (c1179d.m36833c() != null) {
            return new C7620a.C7624d(c1179d.m36833c());
        }
        if (c1179d.m36834b() != null) {
            return new C7620a.C7624d(c1179d.m36834b());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m36759l(int i) {
        this.f3664z = i;
        if (i == 1) {
            m36754r(10);
        }
        C1373c c1373c = this.f3655A;
        if (c1373c != null) {
            c1373c.m36173a();
        }
        m36758n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f3663y = getContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.f3661w) {
            this.f3655A = new C1373c();
            this.f3664z = 0;
            C7620a m17989b = C7620a.m17989b(this.f3663y);
            if (m36756p(m17989b)) {
                this.f3657c.m36746a(3);
                m36758n();
            } else {
                m17989b.m17990a(m36749w(this.f3662x), 0, this.f3655A, this.f3656B, null);
                this.f3661w = true;
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36753s(Executor executor, BiometricPrompt.AbstractC1177b abstractC1177b) {
        this.f3658d = executor;
        this.f3659e = abstractC1177b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36752t(BiometricPrompt.C1179d c1179d) {
        this.f3662x = c1179d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36751u(Handler handler) {
        this.f3660f = handler;
        this.f3657c = new C1206b(handler);
    }
}
