package kotlin.p549l0;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Appendable.kt */
/* renamed from: kotlin.l0.k */
/* loaded from: classes3.dex */
public class C13266k {
    /* renamed from: a */
    public static <T> void m5465a(Appendable appendable, T t, InterfaceC11767l<? super T, ? extends CharSequence> interfaceC11767l) {
        l.f(appendable, "$this$appendElement");
        if (interfaceC11767l != null) {
            appendable.append(interfaceC11767l.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
