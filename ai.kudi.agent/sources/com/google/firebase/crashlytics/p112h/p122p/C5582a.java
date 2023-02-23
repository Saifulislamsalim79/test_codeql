package com.google.firebase.crashlytics.p112h.p122p;

import android.content.Context;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.C5373n;
import com.google.firebase.crashlytics.p112h.p120n.C5578i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
/* compiled from: CachedSettingsIo.java */
/* renamed from: com.google.firebase.crashlytics.h.p.a */
/* loaded from: classes2.dex */
public class C5582a {

    /* renamed from: a */
    private final Context f13770a;

    public C5582a(Context context) {
        this.f13770a = context;
    }

    /* renamed from: a */
    private File m24398a() {
        return new File(new C5578i(this.f13770a).mo24405b(), "com.crashlytics.settings.json");
    }

    /* renamed from: b */
    public JSONObject m24397b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C5335f.m25102f().m25106b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m24398a = m24398a();
                if (m24398a.exists()) {
                    fileInputStream = new FileInputStream(m24398a);
                    try {
                        jSONObject = new JSONObject(C5373n.m25002B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        C5335f.m25102f().m25103e("Failed to fetch cached settings", e);
                        C5373n.m24997e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C5335f.m25102f().m25099i("Settings file does not exist.");
                    jSONObject = null;
                }
                C5373n.m24997e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                C5373n.m24997e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C5373n.m24997e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void m24396c(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        C5335f.m25102f().m25099i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(m24398a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                C5373n.m24997e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                C5335f.m25102f().m25103e("Failed to cache settings", e);
                C5373n.m24997e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                C5373n.m24997e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
