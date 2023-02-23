package kotlin.p487f0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
/* renamed from: kotlin.f0.c */
/* loaded from: classes3.dex */
public class C11819c extends C11818b {
    /* renamed from: a */
    public static int m10302a(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }
}
