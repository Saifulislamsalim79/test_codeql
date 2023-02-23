package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import java.util.Arrays;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.e */
/* loaded from: classes3.dex */
public final class C12710e extends AbstractC12729o<Character> {
    public C12710e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: c */
    private final String m6919c(char c) {
        return c == '\b' ? "\\b" : c == '\t' ? "\\t" : c == '\n' ? "\\n" : c == '\f' ? "\\f" : c == '\r' ? "\\r" : m6917e(c) ? String.valueOf(c) : "?";
    }

    /* renamed from: e */
    private final boolean m6917e(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: d */
    public AbstractC13010i0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "module");
        AbstractC13010i0 m9868u = interfaceC13305c0.mo4979s().m9868u();
        l.e(m9868u, "module.builtIns.charType");
        return m9868u;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(mo6905b().charValue()), m6919c(mo6905b().charValue())}, 2));
        l.e(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
