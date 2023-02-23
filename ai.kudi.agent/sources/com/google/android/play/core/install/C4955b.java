package com.google.android.play.core.install;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.install.b */
/* loaded from: classes2.dex */
public final class C4955b extends AbstractC4954a {

    /* renamed from: a */
    private final int f12612a;

    /* renamed from: b */
    private final long f12613b;

    /* renamed from: c */
    private final long f12614c;

    /* renamed from: d */
    private final int f12615d;

    /* renamed from: e */
    private final String f12616e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4955b(int i, long j, long j2, int i2, String str) {
        this.f12612a = i;
        this.f12613b = j;
        this.f12614c = j2;
        this.f12615d = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f12616e = str;
    }

    @Override // com.google.android.play.core.install.AbstractC4954a
    /* renamed from: b */
    public final long mo25965b() {
        return this.f12613b;
    }

    @Override // com.google.android.play.core.install.AbstractC4954a
    /* renamed from: c */
    public final int mo25964c() {
        return this.f12615d;
    }

    @Override // com.google.android.play.core.install.AbstractC4954a
    /* renamed from: d */
    public final int mo25963d() {
        return this.f12612a;
    }

    @Override // com.google.android.play.core.install.AbstractC4954a
    /* renamed from: e */
    public final String mo25962e() {
        return this.f12616e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4954a) {
            AbstractC4954a abstractC4954a = (AbstractC4954a) obj;
            if (this.f12612a == abstractC4954a.mo25963d() && this.f12613b == abstractC4954a.mo25965b() && this.f12614c == abstractC4954a.mo25961f() && this.f12615d == abstractC4954a.mo25964c() && this.f12616e.equals(abstractC4954a.mo25962e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.install.AbstractC4954a
    /* renamed from: f */
    public final long mo25961f() {
        return this.f12614c;
    }

    public final int hashCode() {
        int i = this.f12612a;
        long j = this.f12613b;
        long j2 = this.f12614c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12615d) * 1000003) ^ this.f12616e.hashCode();
    }

    public final String toString() {
        int i = this.f12612a;
        long j = this.f12613b;
        long j2 = this.f12614c;
        int i2 = this.f12615d;
        String str = this.f12616e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
