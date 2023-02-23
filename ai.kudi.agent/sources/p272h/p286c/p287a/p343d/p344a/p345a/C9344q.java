package p272h.p286c.p287a.p343d.p344a.p345a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.C4989o;
import com.google.android.play.core.internal.InterfaceC4978i0;
import com.google.android.play.core.tasks.AbstractC5011c;
import com.google.android.play.core.tasks.C5013e;
import com.google.android.play.core.tasks.C5021m;
import p272h.p286c.p287a.p343d.p344a.p347c.C9357a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h.c.a.d.a.a.q */
/* loaded from: classes2.dex */
public final class C9344q {

    /* renamed from: e */
    private static final C4957a f21945e = new C4957a("AppUpdateService");

    /* renamed from: f */
    private static final Intent f21946f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C4983l<InterfaceC4978i0> f21947a;

    /* renamed from: b */
    private final String f21948b;

    /* renamed from: c */
    private final Context f21949c;

    /* renamed from: d */
    private final C9346s f21950d;

    public C9344q(Context context, C9346s c9346s) {
        this.f21948b = context.getPackageName();
        this.f21949c = context;
        this.f21950d = c9346s;
        if (C4989o.m25903a(context)) {
            this.f21947a = new C4983l<>(C9357a.m14970a(context), f21945e, "AppUpdateService", f21946f, C9340m.f21936a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ Bundle m15009b(C9344q c9344q, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m15003h());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(c9344q.f21949c.getPackageManager().getPackageInfo(c9344q.f21949c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f21945e.m25955e("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: g */
    private static <T> AbstractC5011c<T> m15004g() {
        f21945e.m25955e("onError(%d)", -9);
        return C5013e.m25871a(new InstallException(-9));
    }

    /* renamed from: h */
    private static Bundle m15003h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10800);
        return bundle;
    }

    /* renamed from: e */
    public final AbstractC5011c<AbstractC9327a> m15006e(String str) {
        if (this.f21947a == null) {
            return m15004g();
        }
        f21945e.m25954f("requestUpdateInfo(%s)", str);
        C5021m c5021m = new C5021m();
        this.f21947a.m25937c(new C9341n(this, c5021m, str, c5021m));
        return c5021m.m25859a();
    }
}
