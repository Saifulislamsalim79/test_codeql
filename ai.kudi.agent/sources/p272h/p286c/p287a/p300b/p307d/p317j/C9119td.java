package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.td */
/* loaded from: classes2.dex */
public final class C9119td {

    /* renamed from: a */
    private final String f21495a;

    /* renamed from: b */
    private final C9104sd f21496b;

    /* renamed from: c */
    private C9104sd f21497c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C9119td(String str, C9075qd c9075qd) {
        C9104sd c9104sd = new C9104sd(null);
        this.f21496b = c9104sd;
        this.f21497c = c9104sd;
        this.f21495a = str;
    }

    /* renamed from: e */
    private final C9119td m15536e(String str, Object obj) {
        C9089rd c9089rd = new C9089rd(null);
        this.f21497c.f21486c = c9089rd;
        this.f21497c = c9089rd;
        c9089rd.f21485b = obj;
        c9089rd.f21484a = str;
        return this;
    }

    /* renamed from: a */
    public final C9119td m15540a(String str, float f) {
        m15536e(str, String.valueOf(f));
        return this;
    }

    /* renamed from: b */
    public final C9119td m15539b(String str, int i) {
        m15536e(str, String.valueOf(i));
        return this;
    }

    /* renamed from: c */
    public final C9119td m15538c(String str, Object obj) {
        C9104sd c9104sd = new C9104sd(null);
        this.f21497c.f21486c = c9104sd;
        this.f21497c = c9104sd;
        c9104sd.f21485b = obj;
        c9104sd.f21484a = str;
        return this;
    }

    /* renamed from: d */
    public final C9119td m15537d(String str, boolean z) {
        m15536e("trackingEnabled", String.valueOf(z));
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f21495a);
        sb.append('{');
        C9104sd c9104sd = this.f21496b.f21486c;
        String str = "";
        while (c9104sd != null) {
            Object obj = c9104sd.f21485b;
            sb.append(str);
            String str2 = c9104sd.f21484a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c9104sd = c9104sd.f21486c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
