package com.google.firebase.messaging;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.h0 */
/* loaded from: classes2.dex */
public class C6502h0 {

    /* renamed from: a */
    private final Bundle f15681a;

    public C6502h0(Bundle bundle) {
        if (bundle != null) {
            this.f15681a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(TransactionBreakDownItemType.DATA);
    }

    /* renamed from: d */
    private static int m21804d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m21789s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m21788t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m21786v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m21787u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m21786v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m21785w(String str) {
        if (!this.f15681a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m21786v = m21786v(str);
            if (this.f15681a.containsKey(m21786v)) {
                return m21786v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m21782z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m21807a(String str) {
        String m21792p = m21792p(str);
        return "1".equals(m21792p) || Boolean.parseBoolean(m21792p);
    }

    /* renamed from: b */
    public Integer m21806b(String str) {
        String m21792p = m21792p(str);
        if (TextUtils.isEmpty(m21792p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m21792p));
        } catch (NumberFormatException unused) {
            String m21782z = m21782z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m21782z).length() + 38 + String.valueOf(m21792p).length());
            sb.append("Couldn't parse value of ");
            sb.append(m21782z);
            sb.append("(");
            sb.append(m21792p);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m21805c(String str) {
        String m21792p = m21792p(str);
        if (TextUtils.isEmpty(m21792p)) {
            return null;
        }
        try {
            return new JSONArray(m21792p);
        } catch (JSONException unused) {
            String m21782z = m21782z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m21782z).length() + 50 + String.valueOf(m21792p).length());
            sb.append("Malformed JSON for key ");
            sb.append(m21782z);
            sb.append(": ");
            sb.append(m21792p);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m21803e() {
        JSONArray m21805c = m21805c("gcm.n.light_settings");
        if (m21805c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m21805c.length() == 3) {
                iArr[0] = m21804d(m21805c.optString(0));
                iArr[1] = m21805c.optInt(1);
                iArr[2] = m21805c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            String obj = m21805c.toString();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(obj.length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(obj);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String obj2 = m21805c.toString();
            StringBuilder sb2 = new StringBuilder(obj2.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(obj2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: f */
    public Uri m21802f() {
        String m21792p = m21792p("gcm.n.link_android");
        if (TextUtils.isEmpty(m21792p)) {
            m21792p = m21792p("gcm.n.link");
        }
        if (TextUtils.isEmpty(m21792p)) {
            return null;
        }
        return Uri.parse(m21792p);
    }

    /* renamed from: g */
    public Object[] m21801g(String str) {
        JSONArray m21805c = m21805c(String.valueOf(str).concat("_loc_args"));
        if (m21805c == null) {
            return null;
        }
        int length = m21805c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m21805c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m21800h(String str) {
        return m21792p(String.valueOf(str).concat("_loc_key"));
    }

    /* renamed from: i */
    public String m21799i(Resources resources, String str, String str2) {
        String m21800h = m21800h(str2);
        if (TextUtils.isEmpty(m21800h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m21800h, "string", str);
        if (identifier == 0) {
            String m21782z = m21782z(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(m21782z).length() + 49 + String.valueOf(str2).length());
            sb.append(m21782z);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] m21801g = m21801g(str2);
        if (m21801g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m21801g);
        } catch (MissingFormatArgumentException e) {
            String m21782z2 = m21782z(str2);
            String arrays = Arrays.toString(m21801g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m21782z2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(m21782z2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: j */
    public Long m21798j(String str) {
        String m21792p = m21792p(str);
        if (TextUtils.isEmpty(m21792p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m21792p));
        } catch (NumberFormatException unused) {
            String m21782z = m21782z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m21782z).length() + 38 + String.valueOf(m21792p).length());
            sb.append("Couldn't parse value of ");
            sb.append(m21782z);
            sb.append("(");
            sb.append(m21792p);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: k */
    public String m21797k() {
        return m21792p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m21796l() {
        Integer m21806b = m21806b("gcm.n.notification_count");
        if (m21806b == null) {
            return null;
        }
        if (m21806b.intValue() < 0) {
            String obj = m21806b.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 67);
            sb.append("notificationCount is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting notificationCount.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        return m21806b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m21795m() {
        Integer m21806b = m21806b("gcm.n.notification_priority");
        if (m21806b == null) {
            return null;
        }
        if (m21806b.intValue() < -2 || m21806b.intValue() > 2) {
            String obj = m21806b.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 72);
            sb.append("notificationPriority is invalid ");
            sb.append(obj);
            sb.append(". Skipping setting notificationPriority.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        return m21806b;
    }

    /* renamed from: n */
    public String m21794n(Resources resources, String str, String str2) {
        String m21792p = m21792p(str2);
        return !TextUtils.isEmpty(m21792p) ? m21792p : m21799i(resources, str, str2);
    }

    /* renamed from: o */
    public String m21793o() {
        String m21792p = m21792p("gcm.n.sound2");
        return TextUtils.isEmpty(m21792p) ? m21792p("gcm.n.sound") : m21792p;
    }

    /* renamed from: p */
    public String m21792p(String str) {
        return this.f15681a.getString(m21785w(str));
    }

    /* renamed from: q */
    public long[] m21791q() {
        JSONArray m21805c = m21805c("gcm.n.vibrate_timings");
        if (m21805c == null) {
            return null;
        }
        try {
            if (m21805c.length() > 1) {
                int length = m21805c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = m21805c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String obj = m21805c.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m21790r() {
        Integer m21806b = m21806b("gcm.n.visibility");
        if (m21806b == null) {
            return null;
        }
        if (m21806b.intValue() < -1 || m21806b.intValue() > 1) {
            String obj = m21806b.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 53);
            sb.append("visibility is invalid: ");
            sb.append(obj);
            sb.append(". Skipping setting visibility.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        return m21806b;
    }

    /* renamed from: x */
    public Bundle m21784x() {
        Bundle bundle = new Bundle(this.f15681a);
        for (String str : this.f15681a.keySet()) {
            if (!m21789s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m21783y() {
        Bundle bundle = new Bundle(this.f15681a);
        for (String str : this.f15681a.keySet()) {
            if (m21787u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
