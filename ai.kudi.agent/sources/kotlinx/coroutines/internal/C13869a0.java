package kotlinx.coroutines.internal;
/* compiled from: SystemProps.kt */
/* renamed from: kotlinx.coroutines.internal.a0 */
/* loaded from: classes3.dex */
final /* synthetic */ class C13869a0 {

    /* renamed from: a */
    private static final int f30340a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m3558a() {
        return f30340a;
    }

    /* renamed from: b */
    public static final String m3557b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
