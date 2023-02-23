package com.google.android.play.core.assetpacks;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.f0 */
/* loaded from: classes2.dex */
public final class C4860f0 extends AbstractC4834a {

    /* renamed from: a */
    private final int f12303a;

    /* renamed from: b */
    private final String f12304b;

    /* renamed from: c */
    private final String f12305c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4860f0(int i, String str, String str2) {
        this.f12303a = i;
        this.f12304b = str;
        this.f12305c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4834a
    /* renamed from: b */
    public final String mo26125b() {
        return this.f12305c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4834a
    /* renamed from: c */
    public final int mo26124c() {
        return this.f12303a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4834a
    /* renamed from: d */
    public final String mo26123d() {
        return this.f12304b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4834a) {
            AbstractC4834a abstractC4834a = (AbstractC4834a) obj;
            if (this.f12303a == abstractC4834a.mo26124c() && ((str = this.f12304b) != null ? str.equals(abstractC4834a.mo26123d()) : abstractC4834a.mo26123d() == null)) {
                String str2 = this.f12305c;
                String mo26125b = abstractC4834a.mo26125b();
                if (str2 != null ? str2.equals(mo26125b) : mo26125b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f12303a ^ 1000003) * 1000003;
        String str = this.f12304b;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12305c;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f12303a;
        String str = this.f12304b;
        String str2 = this.f12305c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
