package p201g.p227h.p229f.p230a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.p058os.C1373c;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* compiled from: FingerprintManagerCompat.java */
@Deprecated
/* renamed from: g.h.f.a.a */
/* loaded from: classes2.dex */
public class C7620a {

    /* renamed from: a */
    private final Context f18301a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: g.h.f.a.a$a */
    /* loaded from: classes2.dex */
    public class C7621a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC7622b f18302a;

        C7621a(AbstractC7622b abstractC7622b) {
            this.f18302a = abstractC7622b;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f18302a.mo17982a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f18302a.mo17981b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f18302a.mo17980c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f18302a.mo17979d(new C7623c(C7620a.m17985f(authenticationResult.getCryptoObject())));
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: g.h.f.a.a$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7622b {
        /* renamed from: a */
        public abstract void mo17982a(int i, CharSequence charSequence);

        /* renamed from: b */
        public abstract void mo17981b();

        /* renamed from: c */
        public abstract void mo17980c(int i, CharSequence charSequence);

        /* renamed from: d */
        public abstract void mo17979d(C7623c c7623c);
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: g.h.f.a.a$c */
    /* loaded from: classes2.dex */
    public static final class C7623c {

        /* renamed from: a */
        private final C7624d f18303a;

        public C7623c(C7624d c7624d) {
            this.f18303a = c7624d;
        }

        /* renamed from: a */
        public C7624d m17978a() {
            return this.f18303a;
        }
    }

    private C7620a(Context context) {
        this.f18301a = context;
    }

    /* renamed from: b */
    public static C7620a m17989b(Context context) {
        return new C7620a(context);
    }

    /* renamed from: c */
    private static FingerprintManager m17988c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    /* renamed from: f */
    static C7624d m17985f(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C7624d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C7624d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new C7624d(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: g */
    private static FingerprintManager.AuthenticationCallback m17984g(AbstractC7622b abstractC7622b) {
        return new C7621a(abstractC7622b);
    }

    /* renamed from: h */
    private static FingerprintManager.CryptoObject m17983h(C7624d c7624d) {
        if (c7624d == null) {
            return null;
        }
        if (c7624d.m17977a() != null) {
            return new FingerprintManager.CryptoObject(c7624d.m17977a());
        }
        if (c7624d.m17975c() != null) {
            return new FingerprintManager.CryptoObject(c7624d.m17975c());
        }
        if (c7624d.m17976b() != null) {
            return new FingerprintManager.CryptoObject(c7624d.m17976b());
        }
        return null;
    }

    /* renamed from: a */
    public void m17990a(C7624d c7624d, int i, C1373c c1373c, AbstractC7622b abstractC7622b, Handler handler) {
        FingerprintManager m17988c;
        if (Build.VERSION.SDK_INT < 23 || (m17988c = m17988c(this.f18301a)) == null) {
            return;
        }
        m17988c.authenticate(m17983h(c7624d), c1373c != null ? (CancellationSignal) c1373c.m36172b() : null, i, m17984g(abstractC7622b), handler);
    }

    /* renamed from: d */
    public boolean m17987d() {
        FingerprintManager m17988c;
        return Build.VERSION.SDK_INT >= 23 && (m17988c = m17988c(this.f18301a)) != null && m17988c.hasEnrolledFingerprints();
    }

    /* renamed from: e */
    public boolean m17986e() {
        FingerprintManager m17988c;
        return Build.VERSION.SDK_INT >= 23 && (m17988c = m17988c(this.f18301a)) != null && m17988c.isHardwareDetected();
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: g.h.f.a.a$d */
    /* loaded from: classes2.dex */
    public static class C7624d {

        /* renamed from: a */
        private final Signature f18304a;

        /* renamed from: b */
        private final Cipher f18305b;

        /* renamed from: c */
        private final Mac f18306c;

        public C7624d(Signature signature) {
            this.f18304a = signature;
            this.f18305b = null;
            this.f18306c = null;
        }

        /* renamed from: a */
        public Cipher m17977a() {
            return this.f18305b;
        }

        /* renamed from: b */
        public Mac m17976b() {
            return this.f18306c;
        }

        /* renamed from: c */
        public Signature m17975c() {
            return this.f18304a;
        }

        public C7624d(Cipher cipher) {
            this.f18305b = cipher;
            this.f18304a = null;
            this.f18306c = null;
        }

        public C7624d(Mac mac) {
            this.f18306c = mac;
            this.f18305b = null;
            this.f18304a = null;
        }
    }
}
