package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C1314k;
import androidx.core.content.C1335a;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes2.dex */
public final class C6475a {

    /* renamed from: a */
    private static final AtomicInteger f15631a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes2.dex */
    public static class C6476a {

        /* renamed from: a */
        public final C1314k.C1323e f15632a;

        /* renamed from: b */
        public final String f15633b;

        /* renamed from: c */
        public final int f15634c = 0;

        C6476a(C1314k.C1323e c1323e, String str, int i) {
            this.f15632a = c1323e;
            this.f15633b = str;
        }
    }

    /* renamed from: a */
    private static PendingIntent m21902a(Context context, C6502h0 c6502h0, String str, PackageManager packageManager) {
        Intent m21897f = m21897f(str, c6502h0, packageManager);
        if (m21897f == null) {
            return null;
        }
        m21897f.addFlags(67108864);
        m21897f.putExtras(c6502h0.m21783y());
        if (m21886q(c6502h0)) {
            m21897f.putExtra("gcm.n.analytics_data", c6502h0.m21784x());
        }
        return PendingIntent.getActivity(context, m21896g(), m21897f, m21891l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m21901b(Context context, C6502h0 c6502h0) {
        if (m21886q(c6502h0)) {
            return m21900c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c6502h0.m21784x()));
        }
        return null;
    }

    /* renamed from: c */
    private static PendingIntent m21900c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m21896g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m21891l(1073741824));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C6476a m21899d(Context context, C6502h0 c6502h0) {
        Bundle m21893j = m21893j(context.getPackageManager(), context.getPackageName());
        return m21898e(context, context.getPackageName(), c6502h0, m21892k(context, c6502h0.m21797k(), m21893j), context.getResources(), context.getPackageManager(), m21893j);
    }

    /* renamed from: e */
    public static C6476a m21898e(Context context, String str, C6502h0 c6502h0, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        C1314k.C1323e c1323e = new C1314k.C1323e(context, str2);
        String m21794n = c6502h0.m21794n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(m21794n)) {
            c1323e.m36392l(m21794n);
        }
        String m21794n2 = c6502h0.m21794n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(m21794n2)) {
            c1323e.m36393k(m21794n2);
            C1314k.C1319c c1319c = new C1314k.C1319c();
            c1319c.m36411h(m21794n2);
            c1323e.m36380x(c1319c);
        }
        c1323e.m36382v(m21890m(packageManager, resources, str, c6502h0.m21792p("gcm.n.icon"), bundle));
        Uri m21889n = m21889n(str, c6502h0, resources);
        if (m21889n != null) {
            c1323e.m36381w(m21889n);
        }
        c1323e.m36394j(m21902a(context, c6502h0, str, packageManager));
        PendingIntent m21901b = m21901b(context, c6502h0);
        if (m21901b != null) {
            c1323e.m36390n(m21901b);
        }
        Integer m21895h = m21895h(context, c6502h0.m21792p("gcm.n.color"), bundle);
        if (m21895h != null) {
            c1323e.m36395i(m21895h.intValue());
        }
        c1323e.m36398f(!c6502h0.m21807a("gcm.n.sticky"));
        c1323e.m36386r(c6502h0.m21807a("gcm.n.local_only"));
        String m21792p = c6502h0.m21792p("gcm.n.ticker");
        if (m21792p != null) {
            c1323e.m36379y(m21792p);
        }
        Integer m21795m = c6502h0.m21795m();
        if (m21795m != null) {
            c1323e.m36384t(m21795m.intValue());
        }
        Integer m21790r = c6502h0.m21790r();
        if (m21790r != null) {
            c1323e.m36405A(m21790r.intValue());
        }
        Integer m21796l = c6502h0.m21796l();
        if (m21796l != null) {
            c1323e.m36385s(m21796l.intValue());
        }
        Long m21798j = c6502h0.m21798j("gcm.n.event_time");
        if (m21798j != null) {
            c1323e.m36383u(true);
            c1323e.m36404B(m21798j.longValue());
        }
        long[] m21791q = c6502h0.m21791q();
        if (m21791q != null) {
            c1323e.m36378z(m21791q);
        }
        int[] m21803e = c6502h0.m21803e();
        if (m21803e != null) {
            c1323e.m36387q(m21803e[0], m21803e[1], m21803e[2]);
        }
        c1323e.m36391m(m21894i(c6502h0));
        return new C6476a(c1323e, m21888o(c6502h0), 0);
    }

    /* renamed from: f */
    private static Intent m21897f(String str, C6502h0 c6502h0, PackageManager packageManager) {
        String m21792p = c6502h0.m21792p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m21792p)) {
            Intent intent = new Intent(m21792p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m21802f = c6502h0.m21802f();
        if (m21802f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m21802f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m21896g() {
        return f15631a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m21895h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C1335a.m36324d(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: i */
    private static int m21894i(C6502h0 c6502h0) {
        boolean m21807a = c6502h0.m21807a("gcm.n.default_sound");
        ?? r0 = m21807a;
        if (c6502h0.m21807a("gcm.n.default_vibrate_timings")) {
            r0 = (m21807a ? 1 : 0) | true;
        }
        return c6502h0.m21807a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    /* renamed from: j */
    private static Bundle m21893j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e.toString()));
        }
        return Bundle.EMPTY;
    }

    /* renamed from: k */
    public static String m21892k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb.toString());
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    if (notificationManager.getNotificationChannel(string2) != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: l */
    private static int m21891l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    /* renamed from: m */
    private static int m21890m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m21887p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m21887p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m21887p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e.toString()));
            }
        }
        if (i == 0 || !m21887p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m21889n(String str, C6502h0 c6502h0, Resources resources) {
        String m21793o = c6502h0.m21793o();
        if (TextUtils.isEmpty(m21793o)) {
            return null;
        }
        if (!"default".equals(m21793o) && resources.getIdentifier(m21793o, "raw", str) != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(m21793o).length());
            sb.append("android.resource://");
            sb.append(str);
            sb.append("/raw/");
            sb.append(m21793o);
            return Uri.parse(sb.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }

    /* renamed from: o */
    private static String m21888o(C6502h0 c6502h0) {
        String m21792p = c6502h0.m21792p("gcm.n.tag");
        if (TextUtils.isEmpty(m21792p)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder(37);
            sb.append("FCM-Notification:");
            sb.append(uptimeMillis);
            return sb.toString();
        }
        return m21792p;
    }

    /* renamed from: p */
    private static boolean m21887p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i, null) instanceof AdaptiveIconDrawable) {
                StringBuilder sb = new StringBuilder(77);
                sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(i);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* renamed from: q */
    static boolean m21886q(C6502h0 c6502h0) {
        return c6502h0.m21807a("google.c.a.e");
    }
}
