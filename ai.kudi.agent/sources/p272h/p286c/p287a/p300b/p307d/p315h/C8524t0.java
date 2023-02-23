package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.Arrays;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.t0 */
/* loaded from: classes2.dex */
public final class C8524t0 {

    /* renamed from: a */
    private final String f20237a;

    /* renamed from: b */
    private final C8522s0 f20238b;

    /* renamed from: c */
    private C8522s0 f20239c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C8524t0(String str, C8520r0 c8520r0) {
        C8522s0 c8522s0 = new C8522s0(null);
        this.f20238b = c8522s0;
        this.f20239c = c8522s0;
        if (str == null) {
            throw null;
        }
        this.f20237a = str;
    }

    /* renamed from: a */
    public final C8524t0 m16000a(String str, Object obj) {
        C8522s0 c8522s0 = new C8522s0(null);
        this.f20239c.f20234c = c8522s0;
        this.f20239c = c8522s0;
        c8522s0.f20233b = obj;
        c8522s0.f20232a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20237a);
        sb.append('{');
        C8522s0 c8522s0 = this.f20238b.f20234c;
        String str = "";
        while (c8522s0 != null) {
            Object obj = c8522s0.f20233b;
            sb.append(str);
            String str2 = c8522s0.f20232a;
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
            c8522s0 = c8522s0.f20234c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
