package p565l.p566g0.p568f;

import java.net.Proxy;
import p565l.C14116a0;
import p565l.C14231t;
/* compiled from: RequestLine.java */
/* renamed from: l.g0.f.i */
/* loaded from: classes3.dex */
public final class C14176i {
    /* renamed from: a */
    public static String m2704a(C14116a0 c14116a0, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(c14116a0.m2915g());
        sb.append(' ');
        if (m2703b(c14116a0, type)) {
            sb.append(c14116a0.m2913i());
        } else {
            sb.append(m2702c(c14116a0.m2913i()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m2703b(C14116a0 c14116a0, Proxy.Type type) {
        return !c14116a0.m2916f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m2702c(C14231t c14231t) {
        String m2521h = c14231t.m2521h();
        String m2519j = c14231t.m2519j();
        if (m2519j != null) {
            return m2521h + '?' + m2519j;
        }
        return m2521h;
    }
}
