package p565l.p566g0.p568f;
/* compiled from: HttpMethod.java */
/* renamed from: l.g0.f.f */
/* loaded from: classes3.dex */
public final class C14173f {
    /* renamed from: a */
    public static boolean m2714a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m2713b(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: c */
    public static boolean m2712c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m2711d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m2710e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
