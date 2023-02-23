package kotlin.p549l0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Char.kt */
/* renamed from: kotlin.l0.c */
/* loaded from: classes3.dex */
public class C13253c extends C13252b {
    /* renamed from: f */
    public static final boolean m5544f(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    /* renamed from: g */
    public static String m5543g(char c) {
        return C13284x.m5367a(c);
    }
}
