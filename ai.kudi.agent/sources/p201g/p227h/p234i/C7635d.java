package p201g.p227h.p234i;

import android.util.Base64;
import java.util.List;
import p201g.p227h.p237k.C7675h;
/* compiled from: FontRequest.java */
/* renamed from: g.h.i.d */
/* loaded from: classes2.dex */
public final class C7635d {

    /* renamed from: a */
    private final String f18314a;

    /* renamed from: b */
    private final String f18315b;

    /* renamed from: c */
    private final String f18316c;

    /* renamed from: d */
    private final List<List<byte[]>> f18317d;

    /* renamed from: e */
    private final int f18318e;

    /* renamed from: f */
    private final String f18319f;

    public C7635d(String str, String str2, String str3, List<List<byte[]>> list) {
        C7675h.m17866f(str);
        this.f18314a = str;
        C7675h.m17866f(str2);
        this.f18315b = str2;
        C7675h.m17866f(str3);
        this.f18316c = str3;
        C7675h.m17866f(list);
        this.f18317d = list;
        this.f18318e = 0;
        this.f18319f = m17959a(str, str2, str3);
    }

    /* renamed from: a */
    private String m17959a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m17958b() {
        return this.f18317d;
    }

    /* renamed from: c */
    public int m17957c() {
        return this.f18318e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m17956d() {
        return this.f18319f;
    }

    /* renamed from: e */
    public String m17955e() {
        return this.f18314a;
    }

    /* renamed from: f */
    public String m17954f() {
        return this.f18315b;
    }

    /* renamed from: g */
    public String m17953g() {
        return this.f18316c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f18314a + ", mProviderPackage: " + this.f18315b + ", mQuery: " + this.f18316c + ", mCertificates:");
        for (int i = 0; i < this.f18317d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f18317d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f18318e);
        return sb.toString();
    }
}
