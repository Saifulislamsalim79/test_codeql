package p201g.p215c.p216b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.C1306f;
import androidx.core.content.C1335a;
import java.util.ArrayList;
/* compiled from: CustomTabsIntent.java */
/* renamed from: g.c.b.a */
/* loaded from: classes2.dex */
public final class C7513a {

    /* renamed from: a */
    public final Intent f17852a;

    /* renamed from: b */
    public final Bundle f17853b;

    /* compiled from: CustomTabsIntent.java */
    /* renamed from: g.c.b.a$a */
    /* loaded from: classes2.dex */
    public static final class C7514a {

        /* renamed from: a */
        private final Intent f17854a;

        /* renamed from: b */
        private ArrayList<Bundle> f17855b;

        /* renamed from: c */
        private Bundle f17856c;

        /* renamed from: d */
        private ArrayList<Bundle> f17857d;

        /* renamed from: e */
        private boolean f17858e;

        public C7514a() {
            this(null);
        }

        /* renamed from: a */
        public C7513a m18525a() {
            ArrayList<Bundle> arrayList = this.f17855b;
            if (arrayList != null) {
                this.f17854a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f17857d;
            if (arrayList2 != null) {
                this.f17854a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f17854a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f17858e);
            return new C7513a(this.f17854a, this.f17856c);
        }

        /* renamed from: b */
        public C7514a m18524b(int i) {
            this.f17854a.putExtra("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", i);
            return this;
        }

        /* renamed from: c */
        public C7514a m18523c(int i) {
            this.f17854a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        public C7514a(C7515b c7515b) {
            this.f17854a = new Intent("android.intent.action.VIEW");
            this.f17855b = null;
            this.f17856c = null;
            this.f17857d = null;
            this.f17858e = true;
            if (c7515b == null) {
                Bundle bundle = new Bundle();
                if (c7515b == null) {
                    C1306f.m36441b(bundle, "android.support.customtabs.extra.SESSION", null);
                    this.f17854a.putExtras(bundle);
                    return;
                }
                c7515b.m18522a();
                throw null;
            }
            c7515b.m18521b();
            throw null;
        }
    }

    C7513a(Intent intent, Bundle bundle) {
        this.f17852a = intent;
        this.f17853b = bundle;
    }

    /* renamed from: a */
    public void m18526a(Context context, Uri uri) {
        this.f17852a.setData(uri);
        C1335a.m36316l(context, this.f17852a, this.f17853b);
    }
}
