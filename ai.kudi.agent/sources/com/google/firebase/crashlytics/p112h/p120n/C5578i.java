package com.google.firebase.crashlytics.p112h.p120n;

import android.content.Context;
import com.google.firebase.crashlytics.p112h.C5335f;
import java.io.File;
/* compiled from: FileStoreImpl.java */
/* renamed from: com.google.firebase.crashlytics.h.n.i */
/* loaded from: classes2.dex */
public class C5578i implements InterfaceC5577h {

    /* renamed from: a */
    private final Context f13761a;

    public C5578i(Context context) {
        this.f13761a = context;
    }

    @Override // com.google.firebase.crashlytics.p112h.p120n.InterfaceC5577h
    /* renamed from: a */
    public String mo24406a() {
        return new File(this.f13761a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    @Override // com.google.firebase.crashlytics.p112h.p120n.InterfaceC5577h
    /* renamed from: b */
    public File mo24405b() {
        return m24404c(new File(this.f13761a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    /* renamed from: c */
    File m24404c(File file) {
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            C5335f.m25102f().m25097k("Couldn't create file");
            return null;
        }
        C5335f.m25102f().m25097k("Null File");
        return null;
    }
}
