package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.C5335f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: MetaDataStore.java */
/* renamed from: com.google.firebase.crashlytics.h.j.e0 */
/* loaded from: classes2.dex */
class C5355e0 {

    /* renamed from: b */
    private static final Charset f13213b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f13214a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetaDataStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.e0$a */
    /* loaded from: classes2.dex */
    public class C5356a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ C5366j0 f13215a;

        C5356a(C5366j0 c5366j0) throws JSONException {
            this.f13215a = c5366j0;
            put("userId", this.f13215a.m25027c());
        }
    }

    public C5355e0(File file) {
        this.f13214a = file;
    }

    /* renamed from: d */
    private static Map<String, String> m25062d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m25057i(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: e */
    private static String m25061e(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    /* renamed from: h */
    private static String m25058h(C5366j0 c5366j0) throws JSONException {
        return new C5356a(c5366j0).toString();
    }

    /* renamed from: i */
    private static String m25057i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m25065a(String str) {
        File file = this.f13214a;
        return new File(file, str + "internal-keys.meta");
    }

    /* renamed from: b */
    public File m25064b(String str) {
        File file = this.f13214a;
        return new File(file, str + "keys.meta");
    }

    /* renamed from: c */
    public File m25063c(String str) {
        File file = this.f13214a;
        return new File(file, str + "user.meta");
    }

    /* renamed from: f */
    public Map<String, String> m25060f(String str) {
        return m25059g(str, false);
    }

    /* renamed from: g */
    Map<String, String> m25059g(String str, boolean z) {
        FileInputStream fileInputStream;
        File m25065a = z ? m25065a(str) : m25064b(str);
        if (!m25065a.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(m25065a);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            Map<String, String> m25062d = m25062d(C5373n.m25002B(fileInputStream));
            C5373n.m24997e(fileInputStream, "Failed to close user metadata file.");
            return m25062d;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            C5335f.m25102f().m25103e("Error deserializing user metadata.", e);
            C5373n.m24997e(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C5373n.m24997e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m25056j(String str, Map<String, String> map, boolean z) {
        String m25061e;
        BufferedWriter bufferedWriter;
        File m25065a = z ? m25065a(str) : m25064b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m25061e = m25061e(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m25065a), f13213b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(m25061e);
            bufferedWriter.flush();
            C5373n.m24997e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            C5335f.m25102f().m25103e("Error serializing key/value metadata.", e);
            C5373n.m24997e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C5373n.m24997e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* renamed from: k */
    public void m25055k(String str, C5366j0 c5366j0) {
        String m25058h;
        BufferedWriter bufferedWriter;
        File m25063c = m25063c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m25058h = m25058h(c5366j0);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m25063c), f13213b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(m25058h);
            bufferedWriter.flush();
            C5373n.m24997e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            C5335f.m25102f().m25103e("Error serializing user metadata.", e);
            C5373n.m24997e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C5373n.m24997e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
