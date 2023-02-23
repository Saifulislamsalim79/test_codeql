package kotlin.p474a0;

import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
/* renamed from: kotlin.a0.c */
/* loaded from: classes3.dex */
public class C11704c extends C11703b {
    /* renamed from: b */
    public static <T extends Comparable<? super T>> T m10415b(T t, T t2) {
        l.f(t, "a");
        l.f(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }
}
