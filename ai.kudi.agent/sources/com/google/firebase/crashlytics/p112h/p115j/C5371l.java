package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: BytesBackedNativeSessionFile.java */
/* renamed from: com.google.firebase.crashlytics.h.j.l */
/* loaded from: classes2.dex */
class C5371l implements InterfaceC5358f0 {

    /* renamed from: a */
    private final byte[] f13241a;

    /* renamed from: b */
    private final String f13242b;

    /* renamed from: c */
    private final String f13243c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5371l(String str, String str2, byte[] bArr) {
        this.f13242b = str;
        this.f13243c = str2;
        this.f13241a = bArr;
    }

    /* renamed from: d */
    private byte[] m25010d() {
        if (m25009e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f13241a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m25009e() {
        byte[] bArr = this.f13241a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5358f0
    /* renamed from: a */
    public String mo24830a() {
        return this.f13243c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5358f0
    /* renamed from: b */
    public InputStream mo24829b() {
        if (m25009e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f13241a);
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5358f0
    /* renamed from: c */
    public AbstractC5448a0.AbstractC5454d.AbstractC5456b mo24828c() {
        byte[] m25010d = m25010d();
        if (m25010d == null) {
            return null;
        }
        AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a m24754a = AbstractC5448a0.AbstractC5454d.AbstractC5456b.m24754a();
        m24754a.mo24646b(m25010d);
        m24754a.mo24645c(this.f13242b);
        return m24754a.mo24647a();
    }
}
