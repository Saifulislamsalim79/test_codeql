package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.C1342b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p227h.C7600b;
/* compiled from: NotificationCompat.java */
/* renamed from: androidx.core.app.k */
/* loaded from: classes2.dex */
public class C1314k {

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$a */
    /* loaded from: classes2.dex */
    public static class C1315a {

        /* renamed from: a */
        final Bundle f4093a;

        /* renamed from: b */
        private IconCompat f4094b;

        /* renamed from: c */
        private final C1329o[] f4095c;

        /* renamed from: d */
        private final C1329o[] f4096d;

        /* renamed from: e */
        private boolean f4097e;

        /* renamed from: f */
        boolean f4098f;

        /* renamed from: g */
        private final int f4099g;

        /* renamed from: h */
        private final boolean f4100h;
        @Deprecated

        /* renamed from: i */
        public int f4101i;

        /* renamed from: j */
        public CharSequence f4102j;

        /* renamed from: k */
        public PendingIntent f4103k;

        public C1315a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m36217c(null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m36426a() {
            return this.f4103k;
        }

        /* renamed from: b */
        public boolean m36425b() {
            return this.f4097e;
        }

        /* renamed from: c */
        public C1329o[] m36424c() {
            return this.f4096d;
        }

        /* renamed from: d */
        public Bundle m36423d() {
            return this.f4093a;
        }

        /* renamed from: e */
        public IconCompat m36422e() {
            int i;
            if (this.f4094b == null && (i = this.f4101i) != 0) {
                this.f4094b = IconCompat.m36217c(null, "", i);
            }
            return this.f4094b;
        }

        /* renamed from: f */
        public C1329o[] m36421f() {
            return this.f4095c;
        }

        /* renamed from: g */
        public int m36420g() {
            return this.f4099g;
        }

        /* renamed from: h */
        public boolean m36419h() {
            return this.f4098f;
        }

        /* renamed from: i */
        public CharSequence m36418i() {
            return this.f4102j;
        }

        /* renamed from: j */
        public boolean m36417j() {
            return this.f4100h;
        }

        public C1315a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        C1315a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1329o[] c1329oArr, C1329o[] c1329oArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f4098f = true;
            this.f4094b = iconCompat;
            if (iconCompat != null && iconCompat.m36211i() == 2) {
                this.f4101i = iconCompat.m36215e();
            }
            this.f4102j = C1323e.m36400d(charSequence);
            this.f4103k = pendingIntent;
            this.f4093a = bundle == null ? new Bundle() : bundle;
            this.f4095c = c1329oArr;
            this.f4096d = c1329oArr2;
            this.f4097e = z;
            this.f4099g = i;
            this.f4098f = z2;
            this.f4100h = z3;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$b */
    /* loaded from: classes2.dex */
    public static class C1316b extends AbstractC1325g {

        /* renamed from: e */
        private Bitmap f4104e;

        /* renamed from: f */
        private IconCompat f4105f;

        /* renamed from: g */
        private boolean f4106g;

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.k$b$a */
        /* loaded from: classes2.dex */
        private static class C1317a {
            /* renamed from: a */
            static void m36414a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m36413b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.k$b$b */
        /* loaded from: classes2.dex */
        private static class C1318b {
            /* renamed from: a */
            static void m36412a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: b */
        public void mo36374b(InterfaceC1313j interfaceC1313j) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(interfaceC1313j.mo36368a()).setBigContentTitle(this.f4158b).bigPicture(this.f4104e);
                if (this.f4106g) {
                    IconCompat iconCompat = this.f4105f;
                    if (iconCompat == null) {
                        C1317a.m36414a(bigPicture, null);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        C1318b.m36412a(bigPicture, this.f4105f.m36203q(interfaceC1313j instanceof C1326l ? ((C1326l) interfaceC1313j).m36363f() : null));
                    } else if (iconCompat.m36211i() == 1) {
                        C1317a.m36414a(bigPicture, this.f4105f.m36216d());
                    } else {
                        C1317a.m36414a(bigPicture, null);
                    }
                }
                if (this.f4160d) {
                    C1317a.m36413b(bigPicture, this.f4159c);
                }
            }
        }

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: c */
        protected String mo36373c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public C1316b m36416h(Bitmap bitmap) {
            this.f4105f = bitmap == null ? null : IconCompat.m36218b(bitmap);
            this.f4106g = true;
            return this;
        }

        /* renamed from: i */
        public C1316b m36415i(Bitmap bitmap) {
            this.f4104e = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$c */
    /* loaded from: classes2.dex */
    public static class C1319c extends AbstractC1325g {

        /* renamed from: e */
        private CharSequence f4107e;

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: a */
        public void mo36375a(Bundle bundle) {
            super.mo36375a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f4107e);
            }
        }

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: b */
        public void mo36374b(InterfaceC1313j interfaceC1313j) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC1313j.mo36368a()).setBigContentTitle(this.f4158b).bigText(this.f4107e);
                if (this.f4160d) {
                    bigText.setSummaryText(this.f4159c);
                }
            }
        }

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: c */
        protected String mo36373c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C1319c m36411h(CharSequence charSequence) {
            this.f4107e = C1323e.m36400d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$d */
    /* loaded from: classes2.dex */
    public static final class C1320d {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.k$d$a */
        /* loaded from: classes2.dex */
        public static class C1321a {
            /* renamed from: a */
            static Notification.BubbleMetadata m36407a(C1320d c1320d) {
                if (c1320d == null) {
                    return null;
                }
                c1320d.m36410a();
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.k$d$b */
        /* loaded from: classes2.dex */
        public static class C1322b {
            /* renamed from: a */
            static Notification.BubbleMetadata m36406a(C1320d c1320d) {
                if (c1320d == null) {
                    return null;
                }
                c1320d.m36409b();
                throw null;
            }
        }

        /* renamed from: c */
        public static Notification.BubbleMetadata m36408c(C1320d c1320d) {
            if (c1320d == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C1322b.m36406a(c1320d);
            }
            if (i == 29) {
                return C1321a.m36407a(c1320d);
            }
            return null;
        }

        /* renamed from: a */
        public PendingIntent m36410a() {
            throw null;
        }

        /* renamed from: b */
        public String m36409b() {
            throw null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$f */
    /* loaded from: classes2.dex */
    public static class C1324f extends AbstractC1325g {

        /* renamed from: e */
        private ArrayList<CharSequence> f4156e = new ArrayList<>();

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: b */
        public void mo36374b(InterfaceC1313j interfaceC1313j) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC1313j.mo36368a()).setBigContentTitle(this.f4158b);
                if (this.f4160d) {
                    bigContentTitle.setSummaryText(this.f4159c);
                }
                Iterator<CharSequence> it = this.f4156e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        @Override // androidx.core.app.C1314k.AbstractC1325g
        /* renamed from: c */
        protected String mo36373c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: h */
        public C1324f m36377h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f4156e.add(C1323e.m36400d(charSequence));
            }
            return this;
        }

        /* renamed from: i */
        public C1324f m36376i(CharSequence charSequence) {
            this.f4158b = C1323e.m36400d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1325g {

        /* renamed from: a */
        protected C1323e f4157a;

        /* renamed from: b */
        CharSequence f4158b;

        /* renamed from: c */
        CharSequence f4159c;

        /* renamed from: d */
        boolean f4160d = false;

        /* renamed from: a */
        public void mo36375a(Bundle bundle) {
            if (this.f4160d) {
                bundle.putCharSequence("android.summaryText", this.f4159c);
            }
            CharSequence charSequence = this.f4158b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo36373c = mo36373c();
            if (mo36373c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo36373c);
            }
        }

        /* renamed from: b */
        public abstract void mo36374b(InterfaceC1313j interfaceC1313j);

        /* renamed from: c */
        protected abstract String mo36373c();

        /* renamed from: d */
        public RemoteViews m36372d(InterfaceC1313j interfaceC1313j) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m36371e(InterfaceC1313j interfaceC1313j) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m36370f(InterfaceC1313j interfaceC1313j) {
            return null;
        }

        /* renamed from: g */
        public void m36369g(C1323e c1323e) {
            if (this.f4157a != c1323e) {
                this.f4157a = c1323e;
                if (c1323e != null) {
                    c1323e.m36380x(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m36427a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C1327m.m36358c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.k$e */
    /* loaded from: classes2.dex */
    public static class C1323e {

        /* renamed from: A */
        boolean f4108A;

        /* renamed from: B */
        boolean f4109B;

        /* renamed from: C */
        String f4110C;

        /* renamed from: D */
        Bundle f4111D;

        /* renamed from: E */
        int f4112E;

        /* renamed from: F */
        int f4113F;

        /* renamed from: G */
        Notification f4114G;

        /* renamed from: H */
        RemoteViews f4115H;

        /* renamed from: I */
        RemoteViews f4116I;

        /* renamed from: J */
        RemoteViews f4117J;

        /* renamed from: K */
        String f4118K;

        /* renamed from: L */
        int f4119L;

        /* renamed from: M */
        String f4120M;

        /* renamed from: N */
        C1342b f4121N;

        /* renamed from: O */
        long f4122O;

        /* renamed from: P */
        int f4123P;

        /* renamed from: Q */
        boolean f4124Q;

        /* renamed from: R */
        C1320d f4125R;

        /* renamed from: S */
        Notification f4126S;

        /* renamed from: T */
        boolean f4127T;

        /* renamed from: U */
        Icon f4128U;
        @Deprecated

        /* renamed from: V */
        public ArrayList<String> f4129V;

        /* renamed from: a */
        public Context f4130a;

        /* renamed from: b */
        public ArrayList<C1315a> f4131b;

        /* renamed from: c */
        public ArrayList<C1328n> f4132c;

        /* renamed from: d */
        ArrayList<C1315a> f4133d;

        /* renamed from: e */
        CharSequence f4134e;

        /* renamed from: f */
        CharSequence f4135f;

        /* renamed from: g */
        PendingIntent f4136g;

        /* renamed from: h */
        PendingIntent f4137h;

        /* renamed from: i */
        RemoteViews f4138i;

        /* renamed from: j */
        Bitmap f4139j;

        /* renamed from: k */
        CharSequence f4140k;

        /* renamed from: l */
        int f4141l;

        /* renamed from: m */
        int f4142m;

        /* renamed from: n */
        boolean f4143n;

        /* renamed from: o */
        boolean f4144o;

        /* renamed from: p */
        AbstractC1325g f4145p;

        /* renamed from: q */
        CharSequence f4146q;

        /* renamed from: r */
        CharSequence f4147r;

        /* renamed from: s */
        CharSequence[] f4148s;

        /* renamed from: t */
        int f4149t;

        /* renamed from: u */
        int f4150u;

        /* renamed from: v */
        boolean f4151v;

        /* renamed from: w */
        String f4152w;

        /* renamed from: x */
        boolean f4153x;

        /* renamed from: y */
        String f4154y;

        /* renamed from: z */
        boolean f4155z;

        public C1323e(Context context, String str) {
            this.f4131b = new ArrayList<>();
            this.f4132c = new ArrayList<>();
            this.f4133d = new ArrayList<>();
            this.f4143n = true;
            this.f4155z = false;
            this.f4112E = 0;
            this.f4113F = 0;
            this.f4119L = 0;
            this.f4123P = 0;
            Notification notification = new Notification();
            this.f4126S = notification;
            this.f4130a = context;
            this.f4118K = str;
            notification.when = System.currentTimeMillis();
            this.f4126S.audioStreamType = -1;
            this.f4142m = 0;
            this.f4129V = new ArrayList<>();
            this.f4124Q = true;
        }

        /* renamed from: d */
        protected static CharSequence m36400d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: e */
        private Bitmap m36399e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f4130a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7600b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7600b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d = dimensionPixelSize;
                double max = Math.max(1, bitmap.getWidth());
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double d3 = dimensionPixelSize2;
                double max2 = Math.max(1, bitmap.getHeight());
                Double.isNaN(d3);
                Double.isNaN(max2);
                double min = Math.min(d2, d3 / max2);
                double width = bitmap.getWidth();
                Double.isNaN(width);
                double height = bitmap.getHeight();
                Double.isNaN(height);
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
            return bitmap;
        }

        /* renamed from: o */
        private void m36389o(int i, boolean z) {
            if (z) {
                Notification notification = this.f4126S;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f4126S;
            notification2.flags = (i ^ (-1)) & notification2.flags;
        }

        /* renamed from: A */
        public C1323e m36405A(int i) {
            this.f4113F = i;
            return this;
        }

        /* renamed from: B */
        public C1323e m36404B(long j) {
            this.f4126S.when = j;
            return this;
        }

        /* renamed from: a */
        public C1323e m36403a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f4131b.add(new C1315a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification m36402b() {
            return new C1326l(this).m36366c();
        }

        /* renamed from: c */
        public Bundle m36401c() {
            if (this.f4111D == null) {
                this.f4111D = new Bundle();
            }
            return this.f4111D;
        }

        /* renamed from: f */
        public C1323e m36398f(boolean z) {
            m36389o(16, z);
            return this;
        }

        /* renamed from: g */
        public C1323e m36397g(String str) {
            this.f4110C = str;
            return this;
        }

        /* renamed from: h */
        public C1323e m36396h(String str) {
            this.f4118K = str;
            return this;
        }

        /* renamed from: i */
        public C1323e m36395i(int i) {
            this.f4112E = i;
            return this;
        }

        /* renamed from: j */
        public C1323e m36394j(PendingIntent pendingIntent) {
            this.f4136g = pendingIntent;
            return this;
        }

        /* renamed from: k */
        public C1323e m36393k(CharSequence charSequence) {
            this.f4135f = m36400d(charSequence);
            return this;
        }

        /* renamed from: l */
        public C1323e m36392l(CharSequence charSequence) {
            this.f4134e = m36400d(charSequence);
            return this;
        }

        /* renamed from: m */
        public C1323e m36391m(int i) {
            Notification notification = this.f4126S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: n */
        public C1323e m36390n(PendingIntent pendingIntent) {
            this.f4126S.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: p */
        public C1323e m36388p(Bitmap bitmap) {
            this.f4139j = m36399e(bitmap);
            return this;
        }

        /* renamed from: q */
        public C1323e m36387q(int i, int i2, int i3) {
            Notification notification = this.f4126S;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.f4126S;
            notification2.flags = i4 | (notification2.flags & (-2));
            return this;
        }

        /* renamed from: r */
        public C1323e m36386r(boolean z) {
            this.f4155z = z;
            return this;
        }

        /* renamed from: s */
        public C1323e m36385s(int i) {
            this.f4141l = i;
            return this;
        }

        /* renamed from: t */
        public C1323e m36384t(int i) {
            this.f4142m = i;
            return this;
        }

        /* renamed from: u */
        public C1323e m36383u(boolean z) {
            this.f4143n = z;
            return this;
        }

        /* renamed from: v */
        public C1323e m36382v(int i) {
            this.f4126S.icon = i;
            return this;
        }

        /* renamed from: w */
        public C1323e m36381w(Uri uri) {
            Notification notification = this.f4126S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: x */
        public C1323e m36380x(AbstractC1325g abstractC1325g) {
            if (this.f4145p != abstractC1325g) {
                this.f4145p = abstractC1325g;
                if (abstractC1325g != null) {
                    abstractC1325g.m36369g(this);
                }
            }
            return this;
        }

        /* renamed from: y */
        public C1323e m36379y(CharSequence charSequence) {
            this.f4126S.tickerText = m36400d(charSequence);
            return this;
        }

        /* renamed from: z */
        public C1323e m36378z(long[] jArr) {
            this.f4126S.vibrate = jArr;
            return this;
        }

        @Deprecated
        public C1323e(Context context) {
            this(context, null);
        }
    }
}
