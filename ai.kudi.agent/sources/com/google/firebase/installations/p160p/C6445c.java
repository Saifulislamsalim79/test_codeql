package com.google.firebase.installations.p160p;

import com.google.firebase.C5988g;
import com.google.firebase.installations.p160p.AbstractC6447d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PersistedInstallation.java */
/* renamed from: com.google.firebase.installations.p.c */
/* loaded from: classes2.dex */
public class C6445c {

    /* renamed from: a */
    private final File f15566a;

    /* renamed from: b */
    private final C5988g f15567b;

    /* compiled from: PersistedInstallation.java */
    /* renamed from: com.google.firebase.installations.p.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC6446a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C6445c(C5988g c5988g) {
        File filesDir = c5988g.m23093i().getFilesDir();
        this.f15566a = new File(filesDir, "PersistedInstallation." + c5988g.m23088n() + ".json");
        this.f15567b = c5988g;
    }

    /* renamed from: b */
    private JSONObject m22016b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f15566a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public AbstractC6447d m22017a(AbstractC6447d abstractC6447d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC6447d.mo22011d());
            jSONObject.put("Status", abstractC6447d.mo22008g().ordinal());
            jSONObject.put("AuthToken", abstractC6447d.mo22013b());
            jSONObject.put("RefreshToken", abstractC6447d.mo22009f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC6447d.mo22007h());
            jSONObject.put("ExpiresInSecs", abstractC6447d.mo22012c());
            jSONObject.put("FisError", abstractC6447d.mo22010e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f15567b.m23093i().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f15566a)) {
            return abstractC6447d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: c */
    public AbstractC6447d m22015c() {
        JSONObject m22016b = m22016b();
        String optString = m22016b.optString("Fid", null);
        int optInt = m22016b.optInt("Status", EnumC6446a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m22016b.optString("AuthToken", null);
        String optString3 = m22016b.optString("RefreshToken", null);
        long optLong = m22016b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m22016b.optLong("ExpiresInSecs", 0L);
        String optString4 = m22016b.optString("FisError", null);
        AbstractC6447d.AbstractC6448a m22014a = AbstractC6447d.m22014a();
        m22014a.mo21991d(optString);
        m22014a.mo21988g(EnumC6446a.values()[optInt]);
        m22014a.mo21993b(optString2);
        m22014a.mo21989f(optString3);
        m22014a.mo21987h(optLong);
        m22014a.mo21992c(optLong2);
        m22014a.mo21990e(optString4);
        return m22014a.mo21994a();
    }
}
