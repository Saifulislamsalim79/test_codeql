package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ConfigStorageClient.java */
/* renamed from: com.google.firebase.remoteconfig.internal.o */
/* loaded from: classes2.dex */
public class C6762o {

    /* renamed from: c */
    private static final Map<String, C6762o> f16285c = new HashMap();

    /* renamed from: a */
    private final Context f16286a;

    /* renamed from: b */
    private final String f16287b;

    private C6762o(Context context, String str) {
        this.f16286a = context;
        this.f16287b = str;
    }

    /* renamed from: c */
    public static synchronized C6762o m20812c(Context context, String str) {
        C6762o c6762o;
        synchronized (C6762o.class) {
            if (!f16285c.containsKey(str)) {
                f16285c.put(str, new C6762o(context, str));
            }
            c6762o = f16285c.get(str);
        }
        return c6762o;
    }

    /* renamed from: a */
    public synchronized Void m20814a() {
        this.f16286a.deleteFile(this.f16287b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m20813b() {
        return this.f16287b;
    }

    /* renamed from: d */
    public synchronized C6754k m20811d() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f16286a.openFileInput(this.f16287b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                C6754k m20878b = C6754k.m20878b(new JSONObject(new String(bArr, "UTF-8")));
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return m20878b;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    /* renamed from: e */
    public synchronized Void m20810e(C6754k c6754k) throws IOException {
        FileOutputStream openFileOutput = this.f16286a.openFileOutput(this.f16287b, 0);
        openFileOutput.write(c6754k.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}
