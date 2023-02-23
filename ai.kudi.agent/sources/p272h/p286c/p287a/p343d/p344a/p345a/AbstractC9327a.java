package p272h.p286c.p287a.p343d.p344a.p345a;

import android.app.PendingIntent;
/* renamed from: h.c.a.d.a.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9327a {
    /* renamed from: c */
    public static AbstractC9327a m15027c(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new C9348u(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    /* renamed from: f */
    private final boolean m15026f(AbstractC9330d abstractC9330d) {
        return abstractC9330d.mo14982a() && mo14999a() <= mo14997e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract long mo14999a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final PendingIntent m15028b(AbstractC9330d abstractC9330d) {
        if (abstractC9330d.mo14981b() == 0) {
            if (mo14993j() != null) {
                return mo14993j();
            }
            if (m15026f(abstractC9330d)) {
                return mo14991l();
            }
            return null;
        }
        if (abstractC9330d.mo14981b() == 1) {
            if (mo14995h() != null) {
                return mo14995h();
            }
            if (m15026f(abstractC9330d)) {
                return mo14992k();
            }
        }
        return null;
    }

    /* renamed from: d */
    public abstract int mo14998d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract long mo14997e();

    /* renamed from: g */
    public abstract long mo14996g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract PendingIntent mo14995h();

    /* renamed from: i */
    public abstract Integer mo14994i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract PendingIntent mo14993j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract PendingIntent mo14992k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract PendingIntent mo14991l();

    /* renamed from: m */
    public abstract int mo14990m();

    /* renamed from: n */
    public boolean m15025n(int i) {
        return m15028b(AbstractC9330d.m15022c(i)) != null;
    }

    /* renamed from: o */
    public boolean m15024o(AbstractC9330d abstractC9330d) {
        return m15028b(abstractC9330d) != null;
    }

    /* renamed from: p */
    public abstract String mo14989p();

    /* renamed from: q */
    public abstract long mo14988q();

    /* renamed from: r */
    public abstract int mo14987r();

    /* renamed from: s */
    public abstract int mo14986s();
}
