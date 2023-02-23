package androidx.biometric;

import ai.kudi.agent.pin.KudiPin;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Service;
import androidx.lifecycle.n;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* loaded from: classes2.dex */
public class BiometricPrompt {

    /* renamed from: a */
    private androidx.fragment.app.i f3579a;

    /* renamed from: b */
    private Fragment f3580b;

    /* renamed from: c */
    private final Executor f3581c;

    /* renamed from: d */
    private final AbstractC1177b f3582d;

    /* renamed from: e */
    private C1194d f3583e;

    /* renamed from: f */
    private C1200e f3584f;

    /* renamed from: g */
    private C1182a f3585g;

    /* renamed from: h */
    private boolean f3586h;

    /* renamed from: i */
    private boolean f3587i;

    /* renamed from: j */
    private final DialogInterface.OnClickListener f3588j = new DialogInterface$OnClickListenerC1175a();

    /* renamed from: k */
    private final n f3589k = new Service() { // from class: androidx.biometric.BiometricPrompt.2
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        void onPause() {
            BiometricPrompt $r1 = BiometricPrompt.this;
            boolean $z0 = $r1.m36837y();
            if ($z0) {
                return;
            }
            boolean $z02 = BiometricPrompt.m36841u();
            if ($z02) {
                BiometricPrompt $r12 = BiometricPrompt.this;
                C1182a $r2 = $r12.f3585g;
                if ($r2 != null) {
                    BiometricPrompt $r13 = BiometricPrompt.this;
                    C1182a $r22 = $r13.f3585g;
                    boolean $z03 = $r22.m36816o();
                    if ($z03) {
                        BiometricPrompt $r14 = BiometricPrompt.this;
                        boolean $z04 = $r14.f3586h;
                        if ($z04) {
                            BiometricPrompt $r15 = BiometricPrompt.this;
                            C1182a $r23 = $r15.f3585g;
                            $r23.m36819k();
                        } else {
                            BiometricPrompt $r16 = BiometricPrompt.this;
                            $r16.f3586h = true;
                        }
                    } else {
                        BiometricPrompt $r17 = BiometricPrompt.this;
                        C1182a $r24 = $r17.f3585g;
                        $r24.m36819k();
                    }
                    BiometricPrompt $r18 = BiometricPrompt.this;
                    $r18.m36862C();
                }
            }
            BiometricPrompt $r19 = BiometricPrompt.this;
            C1194d $r3 = $r19.f3583e;
            if ($r3 != null) {
                BiometricPrompt $r110 = BiometricPrompt.this;
                C1200e $r4 = $r110.f3584f;
                if ($r4 != null) {
                    BiometricPrompt $r111 = BiometricPrompt.this;
                    C1194d $r32 = $r111.f3583e;
                    BiometricPrompt $r112 = BiometricPrompt.this;
                    C1200e $r42 = $r112.f3584f;
                    BiometricPrompt.m36840v($r32, $r42);
                }
            }
            BiometricPrompt $r182 = BiometricPrompt.this;
            $r182.m36862C();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        void onResume() {
            C1182a $r5;
            C11742 c11742;
            BiometricPrompt $r1 = BiometricPrompt.this;
            C11742 c117422 = this;
            boolean $z0 = BiometricPrompt.m36841u();
            if ($z0) {
                BiometricPrompt $r2 = BiometricPrompt.this;
                FragmentManager $r3 = $r2.m36838x();
                Fragment $r4 = $r3.m35938g0("BiometricFragment");
                $r5 = (C1182a) $r4;
            } else {
                $r5 = null;
            }
            $r1.f3585g = $r5;
            boolean $z02 = BiometricPrompt.m36841u();
            if ($z02) {
                BiometricPrompt $r12 = BiometricPrompt.this;
                c117422 = c117422;
                C1182a $r52 = $r12.f3585g;
                if ($r52 != null) {
                    BiometricPrompt $r13 = BiometricPrompt.this;
                    C1182a $r53 = $r13.f3585g;
                    BiometricPrompt $r14 = BiometricPrompt.this;
                    Executor $r6 = $r14.f3581c;
                    BiometricPrompt $r15 = BiometricPrompt.this;
                    DialogInterface.OnClickListener $r7 = $r15.f3588j;
                    BiometricPrompt $r16 = BiometricPrompt.this;
                    c11742 = c117422;
                    AbstractC1177b $r8 = $r16.f3582d;
                    $r53.m36814q($r6, $r7, $r8);
                    C11742 c117423 = c11742;
                    BiometricPrompt $r17 = BiometricPrompt.this;
                    $r17.m36864A();
                    BiometricPrompt $r18 = BiometricPrompt.this;
                    $r18.m36863B(false);
                }
            }
            C11742 c117424 = c117422;
            BiometricPrompt $r19 = BiometricPrompt.this;
            FragmentManager $r32 = $r19.m36838x();
            Fragment $r42 = $r32.m35938g0("FingerprintDialogFragment");
            C1194d $r9 = (C1194d) $r42;
            $r19.f3583e = $r9;
            BiometricPrompt $r110 = BiometricPrompt.this;
            FragmentManager $r33 = $r110.m36838x();
            Fragment $r43 = $r33.m35938g0("FingerprintHelperFragment");
            C1200e $r10 = (C1200e) $r43;
            $r110.f3584f = $r10;
            BiometricPrompt $r111 = BiometricPrompt.this;
            C11742 c117425 = c117424;
            C1194d $r92 = $r111.f3583e;
            if ($r92 != null) {
                BiometricPrompt $r112 = BiometricPrompt.this;
                C1194d $r93 = $r112.f3583e;
                BiometricPrompt $r113 = BiometricPrompt.this;
                c117425 = c117425;
                DialogInterface.OnClickListener $r72 = $r113.f3588j;
                $r93.m36788B($r72);
            }
            C11742 c117426 = c117425;
            BiometricPrompt $r114 = BiometricPrompt.this;
            c11742 = c117426;
            C1200e $r102 = $r114.f3584f;
            if ($r102 != null) {
                BiometricPrompt $r115 = BiometricPrompt.this;
                C1200e $r103 = $r115.f3584f;
                BiometricPrompt $r116 = BiometricPrompt.this;
                Executor $r62 = $r116.f3581c;
                BiometricPrompt $r117 = BiometricPrompt.this;
                AbstractC1177b $r82 = $r117.f3582d;
                $r103.m36753s($r62, $r82);
                BiometricPrompt $r118 = BiometricPrompt.this;
                c11742 = c11742;
                C1194d $r94 = $r118.f3583e;
                if ($r94 != null) {
                    BiometricPrompt $r119 = BiometricPrompt.this;
                    C1200e $r104 = $r119.f3584f;
                    BiometricPrompt $r120 = BiometricPrompt.this;
                    c11742 = c11742;
                    C1194d $r95 = $r120.f3583e;
                    Handler $r11 = $r95.m36774r();
                    $r104.m36751u($r11);
                }
            }
            C11742 c1174232 = c11742;
            BiometricPrompt $r172 = BiometricPrompt.this;
            $r172.m36864A();
            BiometricPrompt $r182 = BiometricPrompt.this;
            $r182.m36863B(false);
        }
    };

    /* renamed from: androidx.biometric.BiometricPrompt$a */
    /* loaded from: classes2.dex */
    class DialogInterface$OnClickListenerC1175a implements DialogInterface.OnClickListener {

        /* renamed from: androidx.biometric.BiometricPrompt$a$a */
        /* loaded from: classes2.dex */
        class RunnableC1176a implements Runnable {
            RunnableC1176a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!BiometricPrompt.m36841u() || BiometricPrompt.this.f3585g == null) {
                    if (BiometricPrompt.this.f3583e != null && BiometricPrompt.this.f3584f != null) {
                        CharSequence m36772t = BiometricPrompt.this.f3583e.m36772t();
                        BiometricPrompt.this.f3582d.onAuthenticationError(13, m36772t != null ? m36772t : "");
                        BiometricPrompt.this.f3584f.m36759l(2);
                        return;
                    }
                    Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
                    return;
                }
                CharSequence m36817n = BiometricPrompt.this.f3585g.m36817n();
                BiometricPrompt.this.f3582d.onAuthenticationError(13, m36817n != null ? m36817n : "");
                BiometricPrompt.this.f3585g.m36818l();
            }
        }

        DialogInterface$OnClickListenerC1175a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BiometricPrompt.this.f3581c.execute(new RunnableC1176a());
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1177b {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(C1178c c1178c) {
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$c */
    /* loaded from: classes2.dex */
    public static class C1178c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C1178c(C1179d c1179d) {
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$e */
    /* loaded from: classes2.dex */
    public static class C1180e {

        /* renamed from: a */
        private Bundle f3596a;

        /* renamed from: androidx.biometric.BiometricPrompt$e$a */
        /* loaded from: classes2.dex */
        public static class C1181a {

            /* renamed from: a */
            private final Bundle f3597a = new Bundle();

            /* renamed from: a */
            public C1180e m36829a() {
                CharSequence charSequence = this.f3597a.getCharSequence(KudiPin.KUDI_PIN_TITLE);
                CharSequence charSequence2 = this.f3597a.getCharSequence("negative_text");
                boolean z = this.f3597a.getBoolean("allow_device_credential");
                boolean z2 = this.f3597a.getBoolean("handling_device_credential_result");
                if (!TextUtils.isEmpty(charSequence)) {
                    if (TextUtils.isEmpty(charSequence2) && !z) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty");
                    }
                    if (TextUtils.isEmpty(charSequence2) || !z) {
                        if (z2 && !z) {
                            throw new IllegalArgumentException("Can't be handling device credential result without device credential enabled");
                        }
                        return new C1180e(this.f3597a);
                    }
                    throw new IllegalArgumentException("Can't have both negative button behavior and device credential enabled");
                }
                throw new IllegalArgumentException("Title must be set and non-empty");
            }

            /* renamed from: b */
            public C1181a m36828b(CharSequence charSequence) {
                this.f3597a.putCharSequence("description", charSequence);
                return this;
            }

            /* renamed from: c */
            public C1181a m36827c(CharSequence charSequence) {
                this.f3597a.putCharSequence("negative_text", charSequence);
                return this;
            }

            /* renamed from: d */
            public C1181a m36826d(CharSequence charSequence) {
                this.f3597a.putCharSequence(KudiPin.KUDI_PIN_TITLE, charSequence);
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1180e(Bundle bundle) {
            this.f3596a = bundle;
        }

        /* renamed from: a */
        Bundle m36832a() {
            return this.f3596a;
        }

        /* renamed from: b */
        public boolean m36831b() {
            return this.f3596a.getBoolean("allow_device_credential");
        }

        /* renamed from: c */
        boolean m36830c() {
            return this.f3596a.getBoolean("handling_device_credential_result");
        }
    }

    public BiometricPrompt(androidx.fragment.app.i iVar, Executor executor, AbstractC1177b abstractC1177b) {
        if (iVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null");
        }
        if (abstractC1177b != null) {
            this.f3579a = iVar;
            this.f3582d = abstractC1177b;
            this.f3581c = executor;
            iVar.getLifecycle().mo35506a(this.f3589k);
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m36864A() {
        C1193c m36801f;
        if (this.f3587i || (m36801f = C1193c.m36801f()) == null) {
            return;
        }
        int m36804c = m36801f.m36804c();
        if (m36804c == 1) {
            this.f3582d.onAuthenticationSucceeded(new C1178c(null));
            m36801f.m36790q();
            m36801f.m36798i();
        } else if (m36804c != 2) {
        } else {
            this.f3582d.onAuthenticationError(10, m36839w() != null ? m36839w().getString(C1212k.generic_error_user_canceled) : "");
            m36801f.m36790q();
            m36801f.m36798i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m36863B(boolean z) {
        C1200e c1200e;
        C1182a c1182a;
        if (Build.VERSION.SDK_INT >= 29) {
            return;
        }
        C1193c m36802e = C1193c.m36802e();
        if (this.f3587i) {
            if (m36841u() && (c1182a = this.f3585g) != null) {
                m36802e.m36797j(c1182a);
            } else {
                C1194d c1194d = this.f3583e;
                if (c1194d != null && (c1200e = this.f3584f) != null) {
                    m36802e.m36792o(c1194d, c1200e);
                }
            }
        } else {
            androidx.fragment.app.i m36839w = m36839w();
            if (m36839w != null) {
                try {
                    m36802e.m36795l(m36839w.getPackageManager().getActivityInfo(m36839w.getComponentName(), 0).getThemeResource());
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("BiometricPromptCompat", "Failed to register client theme to bridge", e);
                }
            }
        }
        m36802e.m36796k(this.f3581c, this.f3588j, this.f3582d);
        if (z) {
            m36802e.m36791p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m36862C() {
        C1193c m36801f = C1193c.m36801f();
        if (m36801f != null) {
            m36801f.m36798i();
        }
    }

    /* renamed from: t */
    private void m36842t(C1180e c1180e, C1179d c1179d) {
        int i;
        this.f3587i = c1180e.m36830c();
        androidx.fragment.app.i m36839w = m36839w();
        if (c1180e.m36831b() && (i = Build.VERSION.SDK_INT) <= 28) {
            if (!this.f3587i) {
                m36836z(c1180e);
                return;
            } else if (i >= 21) {
                if (m36839w == null) {
                    Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Activity was null.");
                    return;
                }
                C1193c m36801f = C1193c.m36801f();
                if (m36801f == null) {
                    Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Bridge was null.");
                    return;
                } else if (!m36801f.m36799h() && C1191b.m36809b(m36839w).m36810a() != 0) {
                    C1214m.m36739e("BiometricPromptCompat", m36839w, c1180e.m36832a(), null);
                    return;
                }
            }
        }
        FragmentManager m36838x = m36838x();
        if (m36838x.m35984M0()) {
            Log.w("BiometricPromptCompat", "Not launching prompt. authenticate() called after onSaveInstanceState()");
            return;
        }
        Bundle m36832a = c1180e.m36832a();
        boolean z = false;
        this.f3586h = false;
        if (m36839w != null && c1179d != null && C1214m.m36736h(m36839w, Build.MANUFACTURER, Build.MODEL)) {
            z = true;
        }
        if (!z && m36841u()) {
            C1182a c1182a = (C1182a) m36838x.m35938g0("BiometricFragment");
            if (c1182a != null) {
                this.f3585g = c1182a;
            } else {
                this.f3585g = C1182a.m36815p();
            }
            this.f3585g.m36814q(this.f3581c, this.f3588j, this.f3582d);
            this.f3585g.m36813r(c1179d);
            this.f3585g.setBundle(m36832a);
            if (c1182a == null) {
                AbstractC1449b0 m35924l = m36838x.m35924l();
                m35924l.m35826e(this.f3585g, "BiometricFragment");
                m35924l.mo35804j();
            } else if (this.f3585g.isDetached()) {
                AbstractC1449b0 m35924l2 = m36838x.m35924l();
                m35924l2.m35823h(this.f3585g);
                m35924l2.mo35804j();
            }
        } else {
            C1194d c1194d = (C1194d) m36838x.m35938g0("FingerprintDialogFragment");
            if (c1194d != null) {
                this.f3583e = c1194d;
            } else {
                this.f3583e = C1194d.m36789A();
            }
            this.f3583e.m36788B(this.f3588j);
            this.f3583e.setBundle(m36832a);
            if (m36839w != null && !C1214m.m36737g(m36839w, Build.MODEL)) {
                if (c1194d == null) {
                    this.f3583e.show(m36838x, "FingerprintDialogFragment");
                } else if (this.f3583e.isDetached()) {
                    AbstractC1449b0 m35924l3 = m36838x.m35924l();
                    m35924l3.m35823h(this.f3583e);
                    m35924l3.mo35804j();
                }
            }
            C1200e c1200e = (C1200e) m36838x.m35938g0("FingerprintHelperFragment");
            if (c1200e != null) {
                this.f3584f = c1200e;
            } else {
                this.f3584f = C1200e.m36755q();
            }
            this.f3584f.m36753s(this.f3581c, this.f3582d);
            Handler m36774r = this.f3583e.m36774r();
            this.f3584f.m36751u(m36774r);
            this.f3584f.m36752t(c1179d);
            m36774r.sendMessageDelayed(m36774r.obtainMessage(6), 500L);
            if (c1200e == null) {
                AbstractC1449b0 m35924l4 = m36838x.m35924l();
                m35924l4.m35826e(this.f3584f, "FingerprintHelperFragment");
                m35924l4.mo35804j();
            } else if (this.f3584f.isDetached()) {
                AbstractC1449b0 m35924l5 = m36838x.m35924l();
                m35924l5.m35823h(this.f3584f);
                m35924l5.mo35804j();
            }
        }
        m36838x.m35950c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static boolean m36841u() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static void m36840v(C1194d c1194d, C1200e c1200e) {
        c1194d.m36776p();
        c1200e.m36759l(0);
    }

    /* renamed from: w */
    private androidx.fragment.app.i m36839w() {
        androidx.fragment.app.i iVar = this.f3579a;
        return iVar != null ? iVar : this.f3580b.getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public FragmentManager m36838x() {
        androidx.fragment.app.i iVar = this.f3579a;
        return iVar != null ? iVar.getSupportFragmentManager() : this.f3580b.getChildFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m36837y() {
        return m36839w() != null && m36839w().isChangingConfigurations();
    }

    /* renamed from: z */
    private void m36836z(C1180e c1180e) {
        androidx.fragment.app.i m36839w = m36839w();
        if (m36839w != null && !m36839w.isFinishing()) {
            m36863B(true);
            Bundle m36832a = c1180e.m36832a();
            m36832a.putBoolean("handling_device_credential_result", true);
            Intent intent = new Intent((Context) m36839w, (Class<?>) DeviceCredentialHandlerActivity.class);
            intent.putExtra("prompt_info_bundle", m36832a);
            m36839w.startActivity(intent);
            return;
        }
        Log.w("BiometricPromptCompat", "Failed to start handler activity. Parent activity was null or finishing.");
    }

    /* renamed from: s */
    public void m36843s(C1180e c1180e) {
        if (c1180e != null) {
            m36842t(c1180e, null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo can not be null");
    }

    /* renamed from: androidx.biometric.BiometricPrompt$d */
    /* loaded from: classes2.dex */
    public static class C1179d {

        /* renamed from: a */
        private final Signature f3593a;

        /* renamed from: b */
        private final Cipher f3594b;

        /* renamed from: c */
        private final Mac f3595c;

        public C1179d(Signature signature) {
            this.f3593a = signature;
            this.f3594b = null;
            this.f3595c = null;
        }

        /* renamed from: a */
        public Cipher m36835a() {
            return this.f3594b;
        }

        /* renamed from: b */
        public Mac m36834b() {
            return this.f3595c;
        }

        /* renamed from: c */
        public Signature m36833c() {
            return this.f3593a;
        }

        public C1179d(Cipher cipher) {
            this.f3594b = cipher;
            this.f3593a = null;
            this.f3595c = null;
        }

        public C1179d(Mac mac) {
            this.f3595c = mac;
            this.f3594b = null;
            this.f3593a = null;
        }
    }
}
