package kotlin.p492io;

import java.io.File;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileTreeWalk.kt */
/* renamed from: kotlin.io.k */
/* loaded from: classes3.dex */
public class C11858k extends C11857j {
    /* renamed from: g */
    public static final C11846e m10234g(File file, EnumC11854g enumC11854g) {
        l.f(file, "$this$walk");
        l.f(enumC11854g, "direction");
        return new C11846e(file, enumC11854g);
    }

    /* renamed from: h */
    public static /* synthetic */ C11846e m10233h(File file, EnumC11854g enumC11854g, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC11854g = EnumC11854g.TOP_DOWN;
        }
        return m10234g(file, enumC11854g);
    }

    /* renamed from: i */
    public static final C11846e m10232i(File file) {
        l.f(file, "$this$walkBottomUp");
        return m10234g(file, EnumC11854g.BOTTOM_UP);
    }
}
