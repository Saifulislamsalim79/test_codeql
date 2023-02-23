package com.google.android.play.core.assetpacks;

import java.util.Map;
/* renamed from: com.google.android.play.core.assetpacks.h0 */
/* loaded from: classes2.dex */
final class C4870h0 extends AbstractC4844c {

    /* renamed from: a */
    private final long f12332a;

    /* renamed from: b */
    private final Map<String, AbstractC4839b> f12333b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4870h0(long j, Map<String, AbstractC4839b> map) {
        this.f12332a = j;
        this.f12333b = map;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4844c
    /* renamed from: e */
    public final Map<String, AbstractC4839b> mo26113e() {
        return this.f12333b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4844c) {
            AbstractC4844c abstractC4844c = (AbstractC4844c) obj;
            if (this.f12332a == abstractC4844c.mo26112f() && this.f12333b.equals(abstractC4844c.mo26113e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC4844c
    /* renamed from: f */
    public final long mo26112f() {
        return this.f12332a;
    }

    public final int hashCode() {
        long j = this.f12332a;
        return this.f12333b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f12332a;
        String valueOf = String.valueOf(this.f12333b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
