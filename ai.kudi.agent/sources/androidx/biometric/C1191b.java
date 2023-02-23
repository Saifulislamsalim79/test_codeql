package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import p201g.p227h.p229f.p230a.C7620a;
/* compiled from: BiometricManager.java */
/* renamed from: androidx.biometric.b */
/* loaded from: classes2.dex */
public class C1191b {

    /* renamed from: a */
    private final C7620a f3626a;

    /* renamed from: b */
    private final BiometricManager f3627b;

    /* compiled from: BiometricManager.java */
    /* renamed from: androidx.biometric.b$a */
    /* loaded from: classes2.dex */
    private static class C1192a {
        /* renamed from: a */
        static int m36808a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        /* renamed from: b */
        static BiometricManager m36807b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }
    }

    private C1191b(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3627b = C1192a.m36807b(context);
            this.f3626a = null;
            return;
        }
        this.f3627b = null;
        this.f3626a = C7620a.m17989b(context);
    }

    /* renamed from: b */
    public static C1191b m36809b(Context context) {
        return new C1191b(context);
    }

    /* renamed from: a */
    public int m36810a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1192a.m36808a(this.f3627b);
        }
        if (this.f3626a.m17986e()) {
            return !this.f3626a.m17987d() ? 11 : 0;
        }
        return 12;
    }
}
