package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p549l0.C13276s;
/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.j0.o.c.p0.h.m */
/* loaded from: classes3.dex */
public enum EnumC12661m {
    PLAIN { // from class: kotlin.j0.o.c.p0.h.m.b
        @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.EnumC12661m
        /* renamed from: b */
        public String mo7082b(String str) {
            l.f(str, "string");
            return str;
        }
    },
    HTML { // from class: kotlin.j0.o.c.p0.h.m.a
        @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.EnumC12661m
        /* renamed from: b */
        public String mo7082b(String str) {
            String m5451A;
            String m5451A2;
            l.f(str, "string");
            m5451A = C13276s.m5451A(str, "<", "&lt;", false, 4, null);
            m5451A2 = C13276s.m5451A(m5451A, ">", "&gt;", false, 4, null);
            return m5451A2;
        }
    };

    /* synthetic */ EnumC12661m(g gVar) {
        this();
    }

    /* renamed from: b */
    public abstract String mo7082b(String str);
}
