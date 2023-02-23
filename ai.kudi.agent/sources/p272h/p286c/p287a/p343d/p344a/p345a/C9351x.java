package p272h.p286c.p287a.p343d.p344a.p345a;

import android.content.Context;
import p272h.p286c.p287a.p343d.p344a.p347c.C9357a;
/* renamed from: h.c.a.d.a.a.x */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9351x {

    /* renamed from: a */
    private static C9353z f21973a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C9353z m14980a(Context context) {
        C9353z c9353z;
        synchronized (C9351x.class) {
            if (f21973a == null) {
                C9352y c9352y = new C9352y(null);
                c9352y.m14978b(new C9337j(C9357a.m14970a(context)));
                f21973a = c9352y.m14979a();
            }
            c9353z = f21973a;
        }
        return c9353z;
    }
}
