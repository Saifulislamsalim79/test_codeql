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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C2919d;
import com.google.android.gms.common.util.C2963a;
import com.google.android.gms.common.util.C2970h;
import com.google.android.gms.common.util.C2972j;
import com.google.android.gms.internal.p104firebaseauthapi.AsyncTaskC3218hj;
import com.google.android.gms.internal.p104firebaseauthapi.C3166fl;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
import com.google.android.gms.internal.p104firebaseauthapi.C3245ij;
import com.google.android.gms.internal.p104firebaseauthapi.C3523t8;
import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj;
import com.google.firebase.C5988g;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p201g.p215c.p216b.C7513a;
import p201g.p257p.p258a.C7816a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
@KeepName
/* loaded from: classes2.dex */
public class GenericIdpActivity extends androidx.fragment.app.i implements InterfaceC3272jj {

    /* renamed from: e */
    private static long f12976e;

    /* renamed from: f */
    private static final C5212a0 f12977f = C5212a0.m25347a();

    /* renamed from: c */
    private final Executor f12978c = C3523t8.m30217a().mo30218g(1);

    /* renamed from: d */
    private boolean f12979d = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private final void m25356i() {
        f12976e = 0L;
        this.f12979d = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C7816a.m17239b(this).m17238c(intent)) {
            f12977f.m25344d(this, C5227i.m25323a("WEB_CONTEXT_CANCELED"));
        } else {
            f12977f.m25346b(this);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    private final void m25355j(Status status) {
        f12976e = 0L;
        this.f12979d = false;
        Intent intent = new Intent();
        C5253z.m25262b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C7816a.m17239b(this).m17238c(intent)) {
            f12977f.m25344d(getApplicationContext(), status);
        } else {
            f12977f.m25346b(this);
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: a */
    public final Uri.Builder mo25354a(Intent intent, String str, String str2) {
        return m25357h(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        mo25350e(str, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    /* renamed from: e */
    public final void mo25350e(String str, Status status) {
        if (status == null) {
            m25356i();
        } else {
            m25355j(status);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final Uri.Builder m25357h(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str3, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String m30961a = C3245ij.m30961a(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str4 = jSONObject;
        String str5 = join;
        C5222f0.m25333b().m25331d(getApplicationContext(), str, uuid, m30961a, action, stringExtra2, stringExtra3, stringExtra4);
        String m25324c = C5224g0.m25326a(getApplicationContext(), C5988g.m23091k(stringExtra4).m23088n()).m25324c();
        if (TextUtils.isEmpty(m25324c)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m25355j(C5227i.m25323a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (m30961a == null) {
            return null;
        } else {
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("eid", "p");
            String valueOf = String.valueOf(stringExtra5);
            appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", m30961a).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m25324c);
            if (!TextUtils.isEmpty(str5)) {
                builder.appendQueryParameter("scopes", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                builder.appendQueryParameter("customParameters", str4);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder.appendQueryParameter("tid", stringExtra3);
            }
            return builder;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            String valueOf = String.valueOf(action);
            Log.e("GenericIdpActivity", valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
            m25356i();
            return;
        }
        long currentTimeMillis = C2970h.m31533c().currentTimeMillis();
        if (currentTimeMillis - f12976e < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f12976e = currentTimeMillis;
        if (bundle != null) {
            this.f12979d = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
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
            if (!this.f12979d) {
                String packageName = getPackageName();
                try {
                    String lowerCase = C2972j.m31525b(C2963a.m31546a(this, packageName)).toLowerCase(Locale.US);
                    C5988g m23091k = C5988g.m23091k(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                    if (!C3166fl.m31135f(m23091k)) {
                        new AsyncTaskC3218hj(packageName, lowerCase, getIntent(), this).executeOnExecutor(this.f12978c, new Void[0]);
                    } else {
                        mo25351d(m25357h(Uri.parse(C3166fl.m31140a(m23091k.m23089m().m23069b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 34 + String.valueOf(valueOf).length());
                    sb.append("Could not get package signature: ");
                    sb.append(packageName);
                    sb.append(" ");
                    sb.append(valueOf);
                    Log.e("GenericIdpActivity", sb.toString());
                    mo25350e(packageName, null);
                }
                this.f12979d = true;
                return;
            }
            m25356i();
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m25355j(C5253z.m25263a(intent.getStringExtra("firebaseError")));
        } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
            String stringExtra = intent.getStringExtra("link");
            String stringExtra2 = intent.getStringExtra("eventId");
            String packageName2 = getPackageName();
            boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
            C5220e0 m25334a = C5222f0.m25333b().m25334a(this, packageName2, stringExtra2);
            if (m25334a == null) {
                m25356i();
            }
            if (booleanExtra) {
                stringExtra = C5224g0.m25326a(getApplicationContext(), C5988g.m23091k(m25334a.m25339a()).m23088n()).m25325b(stringExtra);
            }
            C3168fn c3168fn = new C3168fn(m25334a, stringExtra);
            String m25335e = m25334a.m25335e();
            String m25338b = m25334a.m25338b();
            c3168fn.m31130l(m25335e);
            if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(m25338b) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(m25338b) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(m25338b)) {
                Log.e("GenericIdpActivity", m25338b.length() != 0 ? "unsupported operation: ".concat(m25338b) : new String("unsupported operation: "));
                m25356i();
                return;
            }
            f12976e = 0L;
            this.f12979d = false;
            Intent intent2 = new Intent();
            C2919d.m31640d(c3168fn, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
            intent2.putExtra("com.google.firebase.auth.internal.OPERATION", m25338b);
            intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (!C7816a.m17239b(this).m17238c(intent2)) {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit.putString("verifyAssertionRequest", C2919d.m31639e(c3168fn));
                edit.putString("operation", m25338b);
                edit.putString("tenantId", m25335e);
                edit.putLong("timestamp", C2970h.m31533c().currentTimeMillis());
                edit.commit();
            } else {
                f12977f.m25346b(this);
            }
            finish();
        } else {
            m25356i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onSaveInstanceState(Bundle bundle) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f12979d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3272jj
    public final Context zza() {
        return getApplicationContext();
    }
}
