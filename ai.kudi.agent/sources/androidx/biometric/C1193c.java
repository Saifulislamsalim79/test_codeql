package androidx.biometric;

import android.content.DialogInterface;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import java.util.concurrent.Executor;
/* compiled from: DeviceCredentialHandlerBridge.java */
/* renamed from: androidx.biometric.c */
/* loaded from: classes2.dex */
public class C1193c {

    /* renamed from: j */
    private static C1193c f3628j;

    /* renamed from: a */
    private int f3629a;

    /* renamed from: b */
    private C1182a f3630b;

    /* renamed from: c */
    private C1194d f3631c;

    /* renamed from: d */
    private C1200e f3632d;

    /* renamed from: e */
    private Executor f3633e;

    /* renamed from: f */
    private BiometricPrompt.AbstractC1177b f3634f;

    /* renamed from: g */
    private boolean f3635g;

    /* renamed from: h */
    private int f3636h = 0;

    /* renamed from: i */
    private int f3637i = 0;

    private C1193c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1193c m36802e() {
        if (f3628j == null) {
            f3628j = new C1193c();
        }
        return f3628j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C1193c m36801f() {
        return f3628j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public BiometricPrompt.AbstractC1177b m36806a() {
        return this.f3634f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36805b() {
        return this.f3629a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m36804c() {
        return this.f3636h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Executor m36803d() {
        return this.f3633e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36800g() {
        if (this.f3637i == 0) {
            this.f3637i = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m36799h() {
        return this.f3635g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36798i() {
        int i = this.f3637i;
        if (i == 2) {
            return;
        }
        if (i == 1) {
            m36790q();
            return;
        }
        this.f3629a = 0;
        this.f3630b = null;
        this.f3631c = null;
        this.f3632d = null;
        this.f3633e = null;
        this.f3634f = null;
        this.f3636h = 0;
        this.f3635g = false;
        f3628j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m36797j(C1182a c1182a) {
        this.f3630b = c1182a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m36796k(Executor executor, DialogInterface.OnClickListener onClickListener, BiometricPrompt.AbstractC1177b abstractC1177b) {
        this.f3633e = executor;
        this.f3634f = abstractC1177b;
        C1182a c1182a = this.f3630b;
        if (c1182a != null && Build.VERSION.SDK_INT >= 28) {
            c1182a.m36814q(executor, onClickListener, abstractC1177b);
            return;
        }
        C1194d c1194d = this.f3631c;
        if (c1194d == null || this.f3632d == null) {
            return;
        }
        c1194d.m36788B(onClickListener);
        this.f3632d.m36753s(executor, abstractC1177b);
        this.f3632d.m36751u(this.f3631c.m36774r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m36795l(int i) {
        this.f3629a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m36794m(boolean z) {
        this.f3635g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m36793n(int i) {
        this.f3636h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m36792o(C1194d c1194d, C1200e c1200e) {
        this.f3631c = c1194d;
        this.f3632d = c1200e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36791p() {
        this.f3637i = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36790q() {
        this.f3637i = 0;
    }
}
