package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import io.intercom.android.sdk.metrics.MetricTracker;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hl */
/* loaded from: classes2.dex */
public final class C3220hl implements InterfaceC3030ak<C3220hl> {

    /* renamed from: d */
    private static final String f8550d = "com.google.android.gms.internal.firebase-auth-api.hl";

    /* renamed from: c */
    private String f8551c;

    /* renamed from: a */
    public final C3220hl m31046a(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR));
            jSONObject.getInt("code");
            this.f8551c = jSONObject.getString(MetricTracker.Object.MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e) {
            String str2 = f8550d;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(message).length());
            sb.append("Failed to parse error for string [");
            sb.append(str);
            sb.append("] with exception: ");
            sb.append(message);
            Log.e(str2, sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 35);
            sb2.append("Failed to parse error for string [");
            sb2.append(str);
            sb2.append("]");
            throw new zzpz(sb2.toString(), e);
        }
    }

    /* renamed from: b */
    public final String m31045b() {
        return this.f8551c;
    }

    /* renamed from: c */
    public final boolean m31044c() {
        return !TextUtils.isEmpty(this.f8551c);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3030ak
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C3220hl mo29936e(String str) throws zzpz {
        m31046a(str);
        return this;
    }
}
