package p272h.p286c.p287a.p343d.p344a.p345a;

import android.app.PendingIntent;
/* renamed from: h.c.a.d.a.a.u */
/* loaded from: classes2.dex */
final class C9348u extends AbstractC9327a {

    /* renamed from: a */
    private final String f21955a;

    /* renamed from: b */
    private final int f21956b;

    /* renamed from: c */
    private final int f21957c;

    /* renamed from: d */
    private final int f21958d;

    /* renamed from: e */
    private final Integer f21959e;

    /* renamed from: f */
    private final int f21960f;

    /* renamed from: g */
    private final long f21961g;

    /* renamed from: h */
    private final long f21962h;

    /* renamed from: i */
    private final long f21963i;

    /* renamed from: j */
    private final long f21964j;

    /* renamed from: k */
    private final PendingIntent f21965k;

    /* renamed from: l */
    private final PendingIntent f21966l;

    /* renamed from: m */
    private final PendingIntent f21967m;

    /* renamed from: n */
    private final PendingIntent f21968n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9348u(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f21955a = str;
        this.f21956b = i;
        this.f21957c = i2;
        this.f21958d = i3;
        this.f21959e = num;
        this.f21960f = i4;
        this.f21961g = j;
        this.f21962h = j2;
        this.f21963i = j3;
        this.f21964j = j4;
        this.f21965k = pendingIntent;
        this.f21966l = pendingIntent2;
        this.f21967m = pendingIntent3;
        this.f21968n = pendingIntent4;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: a */
    final long mo14999a() {
        return this.f21963i;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: d */
    public final int mo14998d() {
        return this.f21956b;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: e */
    final long mo14997e() {
        return this.f21964j;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9327a) {
            AbstractC9327a abstractC9327a = (AbstractC9327a) obj;
            if (this.f21955a.equals(abstractC9327a.mo14989p()) && this.f21956b == abstractC9327a.mo14998d() && this.f21957c == abstractC9327a.mo14987r() && this.f21958d == abstractC9327a.mo14990m() && ((num = this.f21959e) != null ? num.equals(abstractC9327a.mo14994i()) : abstractC9327a.mo14994i() == null) && this.f21960f == abstractC9327a.mo14986s() && this.f21961g == abstractC9327a.mo14996g() && this.f21962h == abstractC9327a.mo14988q() && this.f21963i == abstractC9327a.mo14999a() && this.f21964j == abstractC9327a.mo14997e() && ((pendingIntent = this.f21965k) != null ? pendingIntent.equals(abstractC9327a.mo14995h()) : abstractC9327a.mo14995h() == null) && ((pendingIntent2 = this.f21966l) != null ? pendingIntent2.equals(abstractC9327a.mo14993j()) : abstractC9327a.mo14993j() == null) && ((pendingIntent3 = this.f21967m) != null ? pendingIntent3.equals(abstractC9327a.mo14992k()) : abstractC9327a.mo14992k() == null)) {
                PendingIntent pendingIntent4 = this.f21968n;
                PendingIntent mo14991l = abstractC9327a.mo14991l();
                if (pendingIntent4 != null ? pendingIntent4.equals(mo14991l) : mo14991l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: g */
    public final long mo14996g() {
        return this.f21961g;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: h */
    final PendingIntent mo14995h() {
        return this.f21965k;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f21955a.hashCode() ^ 1000003) * 1000003) ^ this.f21956b) * 1000003) ^ this.f21957c) * 1000003) ^ this.f21958d) * 1000003;
        Integer num = this.f21959e;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i = this.f21960f;
        long j = this.f21961g;
        long j2 = this.f21962h;
        long j3 = this.f21963i;
        long j4 = this.f21964j;
        int i2 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f21965k;
        int hashCode3 = (i2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f21966l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f21967m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f21968n;
        return hashCode5 ^ (pendingIntent4 != null ? pendingIntent4.hashCode() : 0);
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: i */
    public final Integer mo14994i() {
        return this.f21959e;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: j */
    final PendingIntent mo14993j() {
        return this.f21966l;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: k */
    final PendingIntent mo14992k() {
        return this.f21967m;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: l */
    final PendingIntent mo14991l() {
        return this.f21968n;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: m */
    public final int mo14990m() {
        return this.f21958d;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: p */
    public final String mo14989p() {
        return this.f21955a;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: q */
    public final long mo14988q() {
        return this.f21962h;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: r */
    public final int mo14987r() {
        return this.f21957c;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a
    /* renamed from: s */
    public final int mo14986s() {
        return this.f21960f;
    }

    public final String toString() {
        String str = this.f21955a;
        int i = this.f21956b;
        int i2 = this.f21957c;
        int i3 = this.f21958d;
        String valueOf = String.valueOf(this.f21959e);
        int i4 = this.f21960f;
        long j = this.f21961g;
        long j2 = this.f21962h;
        long j3 = this.f21963i;
        long j4 = this.f21964j;
        String valueOf2 = String.valueOf(this.f21965k);
        String valueOf3 = String.valueOf(this.f21966l);
        String valueOf4 = String.valueOf(this.f21967m);
        String valueOf5 = String.valueOf(this.f21968n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j3);
        sb.append(", assetPackStorageSize=");
        sb.append(j4);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
