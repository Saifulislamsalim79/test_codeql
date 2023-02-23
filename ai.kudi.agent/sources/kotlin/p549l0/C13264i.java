package kotlin.p549l0;

import java.util.regex.Matcher;
/* compiled from: Regex.kt */
/* renamed from: kotlin.l0.i */
/* loaded from: classes3.dex */
public final class C13264i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final InterfaceC13257f m5515c(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C13260g(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final InterfaceC13257f m5514d(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C13260g(matcher, charSequence);
        }
        return null;
    }
}
