package com.google.android.gms.internal.p104firebaseauthapi;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sn */
/* loaded from: classes2.dex */
public final class C3512sn {
    /* renamed from: a */
    public static zzpz m30265a(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(str2).length() + String.valueOf(message).length());
        sb.append("Failed to parse ");
        sb.append(str);
        sb.append(" for string [");
        sb.append(str2);
        sb.append("] with exception: ");
        sb.append(message);
        Log.e(str, sb.toString());
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb2.append("Failed to parse ");
        sb2.append(str);
        sb2.append(" for string [");
        sb2.append(str2);
        sb2.append("]");
        return new zzpz(sb2.toString(), exc);
    }

    /* renamed from: b */
    public static List<String> m30264b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }
}
