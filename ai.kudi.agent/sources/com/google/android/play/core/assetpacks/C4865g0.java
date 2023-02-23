package com.google.android.play.core.assetpacks;
/* renamed from: com.google.android.play.core.assetpacks.g0 */
/* loaded from: classes2.dex */
final class C4865g0 extends AbstractC4839b {

    /* renamed from: a */
    private final String f12318a;

    /* renamed from: b */
    private final int f12319b;

    /* renamed from: c */
    private final int f12320c;

    /* renamed from: d */
    private final long f12321d;

    /* renamed from: e */
    private final long f12322e;

    /* renamed from: f */
    private final int f12323f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4865g0(String str, int i, int i2, long j, long j2, int i3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f12318a = str;
        this.f12319b = i;
        this.f12320c = i2;
        this.f12321d = j;
        this.f12322e = j2;
        this.f12323f = i3;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4839b
    /* renamed from: c */
    public final long mo26119c() {
        return this.f12321d;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4839b
    /* renamed from: d */
    public final int mo26118d() {
        return this.f12320c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4839b
    /* renamed from: e */
    public final String mo26117e() {
        return this.f12318a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4839b) {
            AbstractC4839b abstractC4839b = (AbstractC4839b) obj;
            if (this.f12318a.equals(abstractC4839b.mo26117e()) && this.f12319b == abstractC4839b.mo26116f() && this.f12320c == abstractC4839b.mo26118d() && this.f12321d == abstractC4839b.mo26119c() && this.f12322e == abstractC4839b.mo26115g() && this.f12323f == abstractC4839b.mo26114h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4839b
    /* renamed from: f */
    public final int mo26116f() {
        return this.f12319b;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4839b
    /* renamed from: g */
    public final long mo26115g() {
        return this.f12322e;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4839b
    /* renamed from: h */
    public final int mo26114h() {
        return this.f12323f;
    }

    public final int hashCode() {
        int hashCode = this.f12318a.hashCode();
        int i = this.f12319b;
        int i2 = this.f12320c;
        long j = this.f12321d;
        long j2 = this.f12322e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12323f;
    }

    public final String toString() {
        String str = this.f12318a;
        int i = this.f12319b;
        int i2 = this.f12320c;
        long j = this.f12321d;
        long j2 = this.f12322e;
        int i3 = this.f12323f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
