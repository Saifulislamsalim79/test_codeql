package androidx.biometric;

import ai.kudi.agent.pin.KudiPin;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;
/* compiled from: BiometricFragment.java */
/* renamed from: androidx.biometric.a */
/* loaded from: classes2.dex */
public class C1182a extends Fragment {

    /* renamed from: A */
    private android.hardware.biometrics.BiometricPrompt f3599A;

    /* renamed from: B */
    private CancellationSignal f3600B;

    /* renamed from: C */
    private boolean f3601C;

    /* renamed from: D */
    private final Handler f3602D = new Handler(Looper.getMainLooper());

    /* renamed from: E */
    private final Executor f3603E = new ExecutorC1183a();

    /* renamed from: F */
    final BiometricPrompt.AuthenticationCallback f3604F = new C1184b();

    /* renamed from: G */
    private final DialogInterface.OnClickListener f3605G = new DialogInterface$OnClickListenerC1188c();

    /* renamed from: H */
    private final DialogInterface.OnClickListener f3606H = new DialogInterface$OnClickListenerC1189d();

    /* renamed from: c */
    private Context f3607c;

    /* renamed from: d */
    private Bundle f3608d;

    /* renamed from: e */
    Executor f3609e;

    /* renamed from: f */
    DialogInterface.OnClickListener f3610f;

    /* renamed from: w */
    BiometricPrompt.AbstractC1177b f3611w;

    /* renamed from: x */
    private BiometricPrompt.C1179d f3612x;

    /* renamed from: y */
    private CharSequence f3613y;

    /* renamed from: z */
    private boolean f3614z;

    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.a$a */
    /* loaded from: classes2.dex */
    class ExecutorC1183a implements Executor {
        ExecutorC1183a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1182a.this.f3602D.post(runnable);
        }
    }

    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.a$b */
    /* loaded from: classes2.dex */
    class C1184b extends BiometricPrompt.AuthenticationCallback {

        /* compiled from: BiometricFragment.java */
        /* renamed from: androidx.biometric.a$b$a */
        /* loaded from: classes2.dex */
        class RunnableC1185a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ CharSequence f3617c;

            /* renamed from: d */
            final /* synthetic */ int f3618d;

            RunnableC1185a(CharSequence charSequence, int i) {
                this.f3617c = charSequence;
                this.f3618d = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                CharSequence charSequence = this.f3617c;
                if (charSequence == null) {
                    charSequence = C1182a.this.f3607c.getString(C1212k.default_error_msg) + " " + this.f3618d;
                }
                C1182a.this.f3611w.onAuthenticationError(C1214m.m36741c(this.f3618d) ? 8 : this.f3618d, charSequence);
            }
        }

        /* compiled from: BiometricFragment.java */
        /* renamed from: androidx.biometric.a$b$b */
        /* loaded from: classes2.dex */
        class RunnableC1186b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ BiometricPrompt.C1178c f3620c;

            RunnableC1186b(BiometricPrompt.C1178c c1178c) {
                this.f3620c = c1178c;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1182a.this.f3611w.onAuthenticationSucceeded(this.f3620c);
            }
        }

        /* compiled from: BiometricFragment.java */
        /* renamed from: androidx.biometric.a$b$c */
        /* loaded from: classes2.dex */
        class RunnableC1187c implements Runnable {
            RunnableC1187c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1182a.this.f3611w.onAuthenticationFailed();
            }
        }

        C1184b() {
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            if (C1214m.m36743a()) {
                return;
            }
            C1182a.this.f3609e.execute(new RunnableC1185a(charSequence, i));
            C1182a.this.m36818l();
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            C1182a.this.f3609e.execute(new RunnableC1187c());
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            C1182a.this.f3609e.execute(new RunnableC1186b(authenticationResult != null ? new BiometricPrompt.C1178c(C1182a.m36812s(authenticationResult.getCryptoObject())) : new BiometricPrompt.C1178c(null)));
            C1182a.this.m36818l();
        }
    }

    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.a$c */
    /* loaded from: classes2.dex */
    class DialogInterface$OnClickListenerC1188c implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1188c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1182a.this.f3610f.onClick(dialogInterface, i);
        }
    }

    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.a$d */
    /* loaded from: classes2.dex */
    class DialogInterface$OnClickListenerC1189d implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1189d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                C1214m.m36739e("BiometricFragment", C1182a.this.getActivity(), C1182a.this.f3608d, null);
            }
        }
    }

    /* compiled from: BiometricFragment.java */
    /* renamed from: androidx.biometric.a$e */
    /* loaded from: classes2.dex */
    class RunnableC1190e implements Runnable {
        RunnableC1190e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1182a.this.f3601C = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static C1182a m36815p() {
        return new C1182a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static BiometricPrompt.C1179d m36812s(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new BiometricPrompt.C1179d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new BiometricPrompt.C1179d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new BiometricPrompt.C1179d(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: t */
    private static BiometricPrompt.CryptoObject m36811t(BiometricPrompt.C1179d c1179d) {
        if (c1179d == null) {
            return null;
        }
        if (c1179d.m36835a() != null) {
            return new BiometricPrompt.CryptoObject(c1179d.m36835a());
        }
        if (c1179d.m36833c() != null) {
            return new BiometricPrompt.CryptoObject(c1179d.m36833c());
        }
        if (c1179d.m36834b() != null) {
            return new BiometricPrompt.CryptoObject(c1179d.m36834b());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m36819k() {
        if (Build.VERSION.SDK_INT >= 29 && m36816o() && !this.f3601C) {
            Log.w("BiometricFragment", "Ignoring fast cancel signal");
            return;
        }
        CancellationSignal cancellationSignal = this.f3600B;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        m36818l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m36818l() {
        this.f3614z = false;
        androidx.fragment.app.i activity = getActivity();
        if (getFragmentManager() != null) {
            AbstractC1449b0 m35924l = getFragmentManager().m35924l();
            m35924l.mo35801m(this);
            m35924l.mo35804j();
        }
        C1214m.m36738f(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public CharSequence m36817n() {
        return this.f3613y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m36816o() {
        Bundle bundle = this.f3608d;
        return bundle != null && bundle.getBoolean("allow_device_credential", false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f3607c = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        if (!this.f3614z && (bundle2 = this.f3608d) != null) {
            this.f3613y = bundle2.getCharSequence("negative_text");
            BiometricPrompt.Builder builder = new BiometricPrompt.Builder(getContext());
            builder.setTitle(this.f3608d.getCharSequence(KudiPin.KUDI_PIN_TITLE)).setSubtitle(this.f3608d.getCharSequence("subtitle")).setDescription(this.f3608d.getCharSequence("description"));
            boolean z = this.f3608d.getBoolean("allow_device_credential");
            if (z && Build.VERSION.SDK_INT <= 28) {
                String string = getString(C1212k.confirm_device_credential_password);
                this.f3613y = string;
                builder.setNegativeButton(string, this.f3609e, this.f3606H);
            } else if (!TextUtils.isEmpty(this.f3613y)) {
                builder.setNegativeButton(this.f3613y, this.f3609e, this.f3605G);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setConfirmationRequired(this.f3608d.getBoolean("require_confirmation", true));
                builder.setDeviceCredentialAllowed(z);
            }
            if (z) {
                this.f3601C = false;
                this.f3602D.postDelayed(new RunnableC1190e(), 250L);
            }
            this.f3599A = builder.build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f3600B = cancellationSignal;
            BiometricPrompt.C1179d c1179d = this.f3612x;
            if (c1179d == null) {
                this.f3599A.authenticate(cancellationSignal, this.f3603E, this.f3604F);
            } else {
                this.f3599A.authenticate(m36811t(c1179d), this.f3600B, this.f3603E, this.f3604F);
            }
        }
        this.f3614z = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36814q(Executor executor, DialogInterface.OnClickListener onClickListener, BiometricPrompt.AbstractC1177b abstractC1177b) {
        this.f3609e = executor;
        this.f3610f = onClickListener;
        this.f3611w = abstractC1177b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m36813r(BiometricPrompt.C1179d c1179d) {
        this.f3612x = c1179d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBundle(Bundle bundle) {
        this.f3608d = bundle;
    }
}
