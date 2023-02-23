package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C2963a;
import com.google.android.gms.common.util.C2970h;
import com.google.android.gms.common.util.C2972j;
import com.google.android.gms.internal.p104firebaseauthapi.AsyncTaskC3218hj;
import com.google.android.gms.internal.p104firebaseauthapi.C3138ek;
import com.google.android.gms.internal.p104firebaseauthapi.C3166fl;
import com.google.android.gms.internal.p104firebaseauthapi.C3523t8;
import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj;
import com.google.firebase.C5988g;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p201g.p215c.p216b.C7513a;
import p201g.p257p.p258a.C7816a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* loaded from: classes2.dex */
public class RecaptchaActivity extends androidx.fragment.app.i implements InterfaceC3272jj {

    /* renamed from: d */
    private static final String f12980d = RecaptchaActivity.class.getSimpleName();

    /* renamed from: e */
    private static final ExecutorService f12981e = C3523t8.m30217a().mo30218g(2);

    /* renamed from: f */
    private static long f12982f = 0;

    /* renamed from: w */
    private static final C5212a0 f12983w = C5212a0.m25347a();

    /* renamed from: c */
    private boolean f12984c = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private final void m25349h() {
        f12982f = 0L;
        this.f12984c = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C7816a.m17239b(this).m17238c(intent);
        f12983w.m25346b(this);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private final void m25348i(Status status) {
        f12982f = 0L;
        this.f12984c = false;
        Intent intent = new Intent();
        C5253z.m25262b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C7816a.m17239b(this).m17238c(intent);
        f12983w.m25346b(this);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: a */
    public final Uri.Builder mo25354a(Intent intent, String str, String str2) {
        String m31181a;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C5988g m23091k = C5988g.m23091k(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m23091k);
        C5222f0.m25333b().m25330e(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String m25324c = C5224g0.m25326a(getApplicationContext(), m23091k.m23088n()).m25324c();
        if (TextUtils.isEmpty(m25324c)) {
            Log.e(f12980d, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m25348i(C5227i.m25323a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(firebaseAuth.m25412e())) {
            m31181a = firebaseAuth.m25412e();
        } else {
            m31181a = C3138ek.m31181a();
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", m31181a).appendQueryParameter("eventId", uuid);
        String valueOf = String.valueOf(stringExtra2);
        return appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m25324c);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: b */
    public final String mo25353b(String str) {
        return C3166fl.m31139b(str);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: c */
    public final HttpURLConnection mo25352c(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            InterfaceC3272jj.f8638h.m31583c("Error generating connection", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: d */
    public final void mo25351d(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                C7513a m18525a = new C7513a.C7514a().m18525a();
                m18525a.f17852a.addFlags(1073741824);
                m18525a.f17852a.addFlags(268435456);
                m18525a.m18526a(this, uri);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        Log.e(f12980d, "Device cannot resolve intent for: android.intent.action.VIEW");
        mo25350e(str, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: e */
    public final void mo25350e(String str, Status status) {
        if (status == null) {
            m25349h();
        } else {
            m25348i(status);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            String str = f12980d;
            String valueOf = String.valueOf(action);
            Log.e(str, valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
            m25349h();
            return;
        }
        long currentTimeMillis = C2970h.m31533c().currentTimeMillis();
        if (currentTimeMillis - f12982f < 30000) {
            Log.e(f12980d, "Could not start operation - already in progress");
            return;
        }
        f12982f = currentTimeMillis;
        if (bundle != null) {
            this.f12984c = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (!this.f12984c) {
                String packageName = getPackageName();
                try {
                    new AsyncTaskC3218hj(packageName, C2972j.m31525b(C2963a.m31546a(this, packageName)).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(f12981e, new Void[0]);
                } catch (PackageManager.NameNotFoundException e) {
                    String str = f12980d;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 34 + String.valueOf(valueOf).length());
                    sb.append("Could not get package signature: ");
                    sb.append(packageName);
                    sb.append(" ");
                    sb.append(valueOf);
                    Log.e(str, sb.toString());
                    mo25350e(packageName, null);
                }
                this.f12984c = true;
                return;
            }
            m25349h();
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m25348i(C5253z.m25263a(intent.getStringExtra("firebaseError")));
        } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
            String stringExtra = intent.getStringExtra("link");
            String m25332c = C5222f0.m25333b().m25332c(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
            if (TextUtils.isEmpty(m25332c)) {
                Log.e(f12980d, "Failed to find registration for this event - failing to prevent session injection.");
                m25348i(C5227i.m25323a("Failed to find registration for this reCAPTCHA event"));
            }
            if (intent.getBooleanExtra("encryptionEnabled", true)) {
                stringExtra = C5224g0.m25326a(getApplicationContext(), C5988g.m23091k(m25332c).m23088n()).m25325b(stringExtra);
            }
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
            f12982f = 0L;
            this.f12984c = false;
            Intent intent2 = new Intent();
            intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
            intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (!C7816a.m17239b(this).m17238c(intent2)) {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit.putString("recaptchaToken", queryParameter);
                edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                edit.putLong("timestamp", C2970h.m31533c().currentTimeMillis());
                edit.commit();
            } else {
                f12983w.m25346b(this);
            }
            finish();
        } else {
            m25349h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onSaveInstanceState(Bundle bundle) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f12984c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    public final Context zza() {
        return getApplicationContext();
    }
}
