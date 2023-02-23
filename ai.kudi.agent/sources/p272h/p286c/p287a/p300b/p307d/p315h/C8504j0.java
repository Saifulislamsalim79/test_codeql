package p272h.p286c.p287a.p300b.p307d.p315h;

import android.content.Context;
import com.google.android.gms.common.internal.C2900o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.p186b.C6927c;
import com.google.mlkit.common.p186b.C6935g;
import com.google.mlkit.common.p186b.C6944n;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.j0 */
/* loaded from: classes2.dex */
public final class C8504j0 {

    /* renamed from: a */
    private static final AbstractC8507l f20212a = AbstractC8507l.m16019c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: b */
    public static final /* synthetic */ int f20213b = 0;

    public C8504j0(Context context, final C6944n c6944n, InterfaceC8502i0 interfaceC8502i0, final String str) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        C6927c.m20457a(context);
        C6935g.m20453a().m20452b(new Callable() { // from class: h.c.a.b.d.h.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                int i = C8504j0.f20213b;
                return C2900o.m31704a().m31703b(str2);
            }
        });
        C6935g m20453a = C6935g.m20453a();
        c6944n.getClass();
        m20453a.m20452b(new Callable() { // from class: h.c.a.b.d.h.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6944n.this.m20433a();
            }
        });
        if (f20212a.containsKey(str)) {
            DynamiteModule.m31491c(context, (String) f20212a.get(str));
        }
    }
}
