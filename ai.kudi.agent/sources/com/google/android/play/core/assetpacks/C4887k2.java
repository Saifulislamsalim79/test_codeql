package com.google.android.play.core.assetpacks;
/* renamed from: com.google.android.play.core.assetpacks.k2 */
/* loaded from: classes2.dex */
final class C4887k2 {

    /* renamed from: a */
    private final int f12382a;

    /* renamed from: b */
    private final String f12383b;

    /* renamed from: c */
    private final long f12384c;

    /* renamed from: d */
    private final long f12385d;

    /* renamed from: e */
    private final int f12386e;

    C4887k2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4887k2(int i, String str, long j, long j2, int i2) {
        this();
        this.f12382a = i;
        this.f12383b = str;
        this.f12384c = j;
        this.f12385d = j2;
        this.f12386e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m26100a() {
        return this.f12382a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m26099b() {
        return this.f12383b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public long m26098c() {
        return this.f12384c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public long m26097d() {
        return this.f12385d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m26096e() {
        return this.f12386e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4887k2) {
            C4887k2 c4887k2 = (C4887k2) obj;
            if (this.f12382a == c4887k2.m26100a() && ((str = this.f12383b) != null ? str.equals(c4887k2.m26099b()) : c4887k2.m26099b() == null) && this.f12384c == c4887k2.m26098c() && this.f12385d == c4887k2.m26097d() && this.f12386e == c4887k2.m26096e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f12382a ^ 1000003) * 1000003;
        String str = this.f12383b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f12384c;
        long j2 = this.f12385d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12386e;
    }

    public String toString() {
        int i = this.f12382a;
        String str = this.f12383b;
        long j = this.f12384c;
        long j2 = this.f12385d;
        int i2 = this.f12386e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
