package com.google.firebase.crashlytics.p112h.p122p.p124j;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.text.TextUtils;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.C5394q;
import com.google.firebase.crashlytics.p112h.p119m.C5567a;
import com.google.firebase.crashlytics.p112h.p119m.C5568b;
import com.google.firebase.crashlytics.p112h.p119m.C5569c;
import com.google.firebase.crashlytics.p112h.p122p.p123i.C5596f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: DefaultSettingsSpiCall.java */
/* renamed from: com.google.firebase.crashlytics.h.p.j.a */
/* loaded from: classes2.dex */
public class C5597a implements InterfaceC5598b {

    /* renamed from: a */
    private final String f13803a;

    /* renamed from: b */
    private final C5568b f13804b;

    /* renamed from: c */
    private final C5335f f13805c;

    public C5597a(String str, C5568b c5568b) {
        this(str, c5568b, C5335f.m25102f());
    }

    /* renamed from: b */
    private C5567a m24359b(C5567a c5567a, C5596f c5596f) {
        m24358c(c5567a, "X-CRASHLYTICS-GOOGLE-APP-ID", c5596f.f13794a);
        m24358c(c5567a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m24358c(c5567a, "X-CRASHLYTICS-API-CLIENT-VERSION", C5394q.m24893i());
        m24358c(c5567a, "Accept", "application/json");
        m24358c(c5567a, "X-CRASHLYTICS-DEVICE-MODEL", c5596f.f13795b);
        m24358c(c5567a, "X-CRASHLYTICS-OS-BUILD-VERSION", c5596f.f13796c);
        m24358c(c5567a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c5596f.f13797d);
        m24358c(c5567a, "X-CRASHLYTICS-INSTALLATION-ID", c5596f.f13798e.mo25073a());
        return c5567a;
    }

    /* renamed from: c */
    private void m24358c(C5567a c5567a, String str, String str2) {
        if (str2 != null) {
            c5567a.m24454d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m24356e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C5335f c5335f = this.f13805c;
            c5335f.m25096l("Failed to parse settings JSON from " + this.f13803a, e);
            C5335f c5335f2 = this.f13805c;
            c5335f2.m25097k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m24355f(C5596f c5596f) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c5596f.f13801h);
        hashMap.put("display_version", c5596f.f13800g);
        hashMap.put(TransactionField.TRANSACTION_CHANNEL, Integer.toString(c5596f.f13802i));
        String str = c5596f.f13799f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.p112h.p122p.p124j.InterfaceC5598b
    /* renamed from: a */
    public JSONObject mo24352a(C5596f c5596f, boolean z) {
        if (z) {
            try {
                Map<String, String> m24355f = m24355f(c5596f);
                C5567a m24357d = m24357d(m24355f);
                m24359b(m24357d, c5596f);
                C5335f c5335f = this.f13805c;
                c5335f.m25106b("Requesting settings from " + this.f13803a);
                C5335f c5335f2 = this.f13805c;
                c5335f2.m25099i("Settings query params were: " + m24355f);
                return m24354g(m24357d.m24455c());
            } catch (IOException e) {
                this.f13805c.m25103e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    protected C5567a m24357d(Map<String, String> map) {
        C5567a m24452a = this.f13804b.m24452a(this.f13803a, map);
        m24452a.m24454d("User-Agent", "Crashlytics Android SDK/" + C5394q.m24893i());
        m24452a.m24454d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return m24452a;
    }

    /* renamed from: g */
    JSONObject m24354g(C5569c c5569c) {
        int m24450b = c5569c.m24450b();
        C5335f c5335f = this.f13805c;
        c5335f.m25099i("Settings response code was: " + m24450b);
        if (m24353h(m24450b)) {
            return m24356e(c5569c.m24451a());
        }
        C5335f c5335f2 = this.f13805c;
        c5335f2.m25104d("Settings request failed; (status: " + m24450b + ") from " + this.f13803a);
        return null;
    }

    /* renamed from: h */
    boolean m24353h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    C5597a(String str, C5568b c5568b, C5335f c5335f) {
        if (str != null) {
            this.f13805c = c5335f;
            this.f13804b = c5568b;
            this.f13803a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
