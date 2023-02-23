package com.google.android.play.core.assetpacks;

import java.util.Arrays;
/* renamed from: com.google.android.play.core.assetpacks.r2 */
/* loaded from: classes2.dex */
final class C4917r2 {

    /* renamed from: a */
    private final String f12489a;

    /* renamed from: b */
    private final long f12490b;

    /* renamed from: c */
    private final int f12491c;

    /* renamed from: d */
    private final boolean f12492d;

    /* renamed from: e */
    private final boolean f12493e;

    /* renamed from: f */
    private final byte[] f12494f;

    C4917r2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4917r2(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f12489a = str;
        this.f12490b = j;
        this.f12491c = i;
        this.f12492d = z;
        this.f12493e = z2;
        this.f12494f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4917r2 m26027a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C4917r2(str, j, i, z, z2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m26026b() {
        if (m26024d() == null) {
            return false;
        }
        return m26024d().endsWith("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m26025c() {
        return m26022f() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m26024d() {
        return this.f12489a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public long m26023e() {
        return this.f12490b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4917r2) {
            C4917r2 c4917r2 = (C4917r2) obj;
            String str = this.f12489a;
            if (str != null ? str.equals(c4917r2.m26024d()) : c4917r2.m26024d() == null) {
                if (this.f12490b == c4917r2.m26023e() && this.f12491c == c4917r2.m26022f() && this.f12492d == c4917r2.m26021g() && this.f12493e == c4917r2.m26020h()) {
                    if (Arrays.equals(this.f12494f, c4917r2 instanceof C4917r2 ? c4917r2.f12494f : c4917r2.m26019i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m26022f() {
        return this.f12491c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m26021g() {
        return this.f12492d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m26020h() {
        return this.f12493e;
    }

    public int hashCode() {
        String str = this.f12489a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f12490b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f12491c) * 1000003) ^ (true != this.f12492d ? 1237 : 1231)) * 1000003) ^ (true == this.f12493e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f12494f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public byte[] m26019i() {
        return this.f12494f;
    }

    public String toString() {
        String str = this.f12489a;
        long j = this.f12490b;
        int i = this.f12491c;
        boolean z = this.f12492d;
        boolean z2 = this.f12493e;
        String arrays = Arrays.toString(this.f12494f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
