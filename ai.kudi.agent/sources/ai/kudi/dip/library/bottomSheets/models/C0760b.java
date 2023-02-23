package ai.kudi.dip.library.bottomSheets.models;

import ai.kudi.dip.library.C0755a;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: KudiOneInputOption.kt */
/* renamed from: ai.kudi.dip.library.bottomSheets.models.b */
/* loaded from: classes2.dex */
public final class C0760b {

    /* renamed from: a */
    private final String f2130a;

    /* renamed from: b */
    private final String f2131b;

    /* renamed from: c */
    private final String f2132c;

    /* renamed from: d */
    private final String f2133d;

    /* renamed from: e */
    private final int f2134e;

    /* renamed from: f */
    private final int f2135f;

    public C0760b(String str, String str2, String str3, String str4, int i, int i2) {
        l.f(str, "titleText");
        l.f(str2, "descText");
        l.f(str3, "hintText");
        l.f(str4, "actionBtnText");
        this.f2130a = str;
        this.f2131b = str2;
        this.f2132c = str3;
        this.f2133d = str4;
        this.f2134e = i;
        this.f2135f = i2;
    }

    /* renamed from: a */
    public final String m38045a() {
        return this.f2133d;
    }

    /* renamed from: b */
    public final String m38044b() {
        return this.f2131b;
    }

    /* renamed from: c */
    public final int m38043c() {
        return this.f2135f;
    }

    /* renamed from: d */
    public final String m38042d() {
        return this.f2132c;
    }

    /* renamed from: e */
    public final String m38041e() {
        return this.f2130a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0760b) {
            C0760b c0760b = (C0760b) obj;
            return l.b(this.f2130a, c0760b.f2130a) && l.b(this.f2131b, c0760b.f2131b) && l.b(this.f2132c, c0760b.f2132c) && l.b(this.f2133d, c0760b.f2133d) && this.f2134e == c0760b.f2134e && this.f2135f == c0760b.f2135f;
        }
        return false;
    }

    /* renamed from: f */
    public final int m38040f() {
        return this.f2134e;
    }

    public int hashCode() {
        return (((((((((this.f2130a.hashCode() * 31) + this.f2131b.hashCode()) * 31) + this.f2132c.hashCode()) * 31) + this.f2133d.hashCode()) * 31) + this.f2134e) * 31) + this.f2135f;
    }

    public String toString() {
        return "KudiOneInputOption(titleText=" + this.f2130a + ", descText=" + this.f2131b + ", hintText=" + this.f2132c + ", actionBtnText=" + this.f2133d + ", titleTextColor=" + this.f2134e + ", descTextColor=" + this.f2135f + ')';
    }

    public /* synthetic */ C0760b(String str, String str2, String str3, String str4, int i, int i2, int i3, g gVar) {
        this(str, str2, str3, str4, (i3 & 16) != 0 ? C0755a.primaryTextColor : i, (i3 & 32) != 0 ? C0755a.kudiGray : i2);
    }
}
