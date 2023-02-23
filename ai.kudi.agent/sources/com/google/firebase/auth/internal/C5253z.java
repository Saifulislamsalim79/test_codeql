package com.google.firebase.auth.internal;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C2919d;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.z */
/* loaded from: classes2.dex */
public final class C5253z {

    /* renamed from: a */
    static final Map<String, String> f13062a;

    static {
        HashMap hashMap = new HashMap();
        f13062a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f13062a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f13062a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f13062a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f13062a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m25263a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(MetricTracker.Object.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && f13062a.containsKey(string)) {
                String str2 = f13062a.get(string);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
                sb.append(str2);
                sb.append(":");
                sb.append(string2);
                return C5227i.m25323a(sb.toString());
            }
            String valueOf = String.valueOf(str);
            return C5227i.m25323a(valueOf.length() != 0 ? "WEB_INTERNAL_ERROR:".concat(valueOf) : new String("WEB_INTERNAL_ERROR:"));
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            sb2.append("WEB_INTERNAL_ERROR:");
            sb2.append(str);
            sb2.append("[ ");
            sb2.append(localizedMessage);
            sb2.append(" ]");
            return C5227i.m25323a(sb2.toString());
        }
    }

    /* renamed from: b */
    public static void m25262b(Intent intent, Status status) {
        C2919d.m31640d(status, intent, "com.google.firebase.auth.internal.STATUS");
    }
}
