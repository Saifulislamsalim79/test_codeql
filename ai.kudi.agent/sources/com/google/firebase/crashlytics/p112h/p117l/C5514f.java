package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import java.util.Arrays;
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* renamed from: com.google.firebase.crashlytics.h.l.f */
/* loaded from: classes2.dex */
final class C5514f extends AbstractC5448a0.AbstractC5454d.AbstractC5456b {

    /* renamed from: a */
    private final String f13565a;

    /* renamed from: b */
    private final byte[] f13566b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.f$b */
    /* loaded from: classes2.dex */
    public static final class C5516b extends AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a {

        /* renamed from: a */
        private String f13567a;

        /* renamed from: b */
        private byte[] f13568b;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5454d.AbstractC5456b mo24647a() {
            String str = "";
            if (this.f13567a == null) {
                str = " filename";
            }
            if (this.f13568b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C5514f(this.f13567a, this.f13568b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a mo24646b(byte[] bArr) {
            if (bArr != null) {
                this.f13568b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a mo24645c(String str) {
            if (str != null) {
                this.f13567a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5456b
    /* renamed from: b */
    public byte[] mo24649b() {
        return this.f13566b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5456b
    /* renamed from: c */
    public String mo24648c() {
        return this.f13565a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5454d.AbstractC5456b) {
            AbstractC5448a0.AbstractC5454d.AbstractC5456b abstractC5456b = (AbstractC5448a0.AbstractC5454d.AbstractC5456b) obj;
            if (this.f13565a.equals(abstractC5456b.mo24648c())) {
                if (Arrays.equals(this.f13566b, abstractC5456b instanceof C5514f ? ((C5514f) abstractC5456b).f13566b : abstractC5456b.mo24649b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13565a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13566b);
    }

    public String toString() {
        return "File{filename=" + this.f13565a + ", contents=" + Arrays.toString(this.f13566b) + "}";
    }

    private C5514f(String str, byte[] bArr) {
        this.f13565a = str;
        this.f13566b = bArr;
    }
}
