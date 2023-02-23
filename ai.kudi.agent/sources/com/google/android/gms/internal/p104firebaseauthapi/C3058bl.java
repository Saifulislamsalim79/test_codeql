package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.common.p102o.C2956c;
import com.google.firebase.auth.C5266p;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p272h.p286c.p287a.p300b.p303b.p304a.p305a.C8388a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bl */
/* loaded from: classes2.dex */
public final class C3058bl {

    /* renamed from: d */
    private static final C2946a f8250d = new C2946a("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a */
    private final Context f8251a;

    /* renamed from: b */
    private final ScheduledExecutorService f8252b;

    /* renamed from: c */
    private final HashMap<String, C3031al> f8253c = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3058bl(Context context) {
        s.j(context);
        this.f8251a = context;
        C3523t8.m30217a();
        this.f8252b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m31376b(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m31373e(C3058bl c3058bl, String str) {
        C3031al c3031al = c3058bl.f8253c.get(str);
        if (c3031al == null || C3516t1.m30219d(c3031al.f8206d) || C3516t1.m30219d(c3031al.f8207e) || c3031al.f8204b.isEmpty()) {
            return;
        }
        for (C3056bj c3056bj : c3031al.f8204b) {
            c3056bj.m31381o(C5266p.m25250s(c3031al.f8206d, c3031al.f8207e));
        }
        c3031al.f8210h = true;
    }

    /* renamed from: m */
    private static String m31365m(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String sb2 = sb.toString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(sb2.getBytes(C3506sh.f8947a));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            C2946a c2946a = f8250d;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(substring).length());
            sb3.append("Package: ");
            sb3.append(str);
            sb3.append(" -- Hash: ");
            sb3.append(substring);
            c2946a.m31585a(sb3.toString(), new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            C2946a c2946a2 = f8250d;
            String valueOf = String.valueOf(e.getMessage());
            c2946a2.m31583c(valueOf.length() != 0 ? "NoSuchAlgorithm: ".concat(valueOf) : new String("NoSuchAlgorithm: "), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m31364n(String str) {
        C3031al c3031al = this.f8253c.get(str);
        if (c3031al == null || c3031al.f8210h || C3516t1.m30219d(c3031al.f8206d)) {
            return;
        }
        f8250d.m31578h("Timed out waiting for SMS.", new Object[0]);
        for (C3056bj c3056bj : c3031al.f8204b) {
            c3056bj.m31393a(c3031al.f8206d);
        }
        c3031al.f8211i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m31370h(String str) {
        C3031al c3031al = this.f8253c.get(str);
        if (c3031al == null) {
            return;
        }
        if (!c3031al.f8211i) {
            m31364n(str);
        }
        m31368j(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final String m31375c() {
        Signature[] apkContentsSigners;
        try {
            String packageName = this.f8251a.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                apkContentsSigners = C2956c.m31548a(this.f8251a).m31551e(packageName, 64).signatures;
            } else {
                apkContentsSigners = C2956c.m31548a(this.f8251a).m31551e(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String m31365m = m31365m(packageName, apkContentsSigners[0].toCharsString());
            if (m31365m != null) {
                return m31365m;
            }
            f8250d.m31583c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f8250d.m31583c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m31369i(C3056bj c3056bj, String str) {
        C3031al c3031al = this.f8253c.get(str);
        if (c3031al == null) {
            return;
        }
        c3031al.f8204b.add(c3056bj);
        if (c3031al.f8209g) {
            c3056bj.mo29941b(c3031al.f8206d);
        }
        if (c3031al.f8210h) {
            c3056bj.m31381o(C5266p.m25250s(c3031al.f8206d, c3031al.f8207e));
        }
        if (c3031al.f8211i) {
            c3056bj.m31393a(c3031al.f8206d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m31368j(String str) {
        C3031al c3031al = this.f8253c.get(str);
        if (c3031al == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = c3031al.f8208f;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            c3031al.f8208f.cancel(false);
        }
        c3031al.f8204b.clear();
        this.f8253c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m31367k(final String str, C3056bj c3056bj, long j, boolean z) {
        this.f8253c.put(str, new C3031al(j, z));
        m31369i(c3056bj, str);
        C3031al c3031al = this.f8253c.get(str);
        if (c3031al.f8203a <= 0) {
            f8250d.m31578h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        c3031al.f8208f = this.f8252b.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.wk
            @Override // java.lang.Runnable
            public final void run() {
                C3058bl.this.m31370h(str);
            }
        }, c3031al.f8203a, TimeUnit.SECONDS);
        if (!c3031al.f8205c) {
            f8250d.m31578h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        C3691zk c3691zk = new C3691zk(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        this.f8251a.getApplicationContext().registerReceiver(c3691zk, intentFilter);
        C8388a.m16143a(this.f8251a).mo16128p().d(new C3639xk(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean m31366l(String str) {
        return this.f8253c.get(str) != null;
    }
}
