package kotlin.p476c0.p478k.p479a;

import java.lang.reflect.Field;
import kotlin.e0.d.l;
/* compiled from: DebugMetadata.kt */
/* renamed from: kotlin.c0.k.a.g */
/* loaded from: classes3.dex */
public final class C11740g {
    /* renamed from: a */
    private static final void m10380a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final f m10379b(AbstractC11735a abstractC11735a) {
        return abstractC11735a.getClass().getAnnotation(f.class);
    }

    /* renamed from: c */
    private static final int m10378c(AbstractC11735a abstractC11735a) {
        try {
            Field declaredField = abstractC11735a.getClass().getDeclaredField("label");
            l.e(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC11735a);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m10377d(AbstractC11735a abstractC11735a) {
        String str;
        l.f(abstractC11735a, "$this$getStackTraceElementImpl");
        f m10379b = m10379b(abstractC11735a);
        if (m10379b != null) {
            m10380a(1, m10379b.v());
            int m10378c = m10378c(abstractC11735a);
            int i = m10378c < 0 ? -1 : m10379b.l()[m10378c];
            String m10372b = C11742i.f26466c.m10372b(abstractC11735a);
            if (m10372b == null) {
                str = m10379b.c();
            } else {
                str = m10372b + '/' + m10379b.c();
            }
            return new StackTraceElement(str, m10379b.m(), m10379b.f(), i);
        }
        return null;
    }
}
