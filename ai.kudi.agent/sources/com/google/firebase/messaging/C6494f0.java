package com.google.firebase.messaging;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.C5988g;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.installations.C6429g;
import com.google.firebase.messaging.p168h1.C6503a;
import com.google.firebase.messaging.p168h1.C6508b;
import java.util.concurrent.ExecutionException;
import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.f0 */
/* loaded from: classes2.dex */
public class C6494f0 {
    /* renamed from: A */
    public static boolean m21855A(Intent intent) {
        if (intent == null || m21836r(intent)) {
            return false;
        }
        return m21854B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m21854B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m21853a() {
        ApplicationInfo applicationInfo;
        try {
            C5988g.m23092j();
            Context m23093i = C5988g.m23092j().m23093i();
            SharedPreferences sharedPreferences = m23093i.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m23093i.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m23093i.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C6503a m21852b(C6503a.EnumC6505b enumC6505b, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C6503a.C6504a m21766p = C6503a.m21766p();
        m21766p.m21753m(m21838p(extras));
        m21766p.m21761e(enumC6505b);
        m21766p.m21760f(m21848f(extras));
        m21766p.m21757i(m21841m());
        m21766p.m21755k(C6503a.EnumC6507d.ANDROID);
        m21766p.m21758h(m21843k(extras));
        String m21846h = m21846h(extras);
        if (m21846h != null) {
            m21766p.m21759g(m21846h);
        }
        String m21839o = m21839o(extras);
        if (m21839o != null) {
            m21766p.m21754l(m21839o);
        }
        String m21851c = m21851c(extras);
        if (m21851c != null) {
            m21766p.m21763c(m21851c);
        }
        String m21845i = m21845i(extras);
        if (m21845i != null) {
            m21766p.m21764b(m21845i);
        }
        String m21849e = m21849e(extras);
        if (m21849e != null) {
            m21766p.m21762d(m21849e);
        }
        long m21840n = m21840n(extras);
        if (m21840n > 0) {
            m21766p.m21756j(m21840n);
        }
        return m21766p.m21765a();
    }

    /* renamed from: c */
    static String m21851c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m21850d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m21849e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m21848f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (TextUtils.isEmpty(string)) {
            try {
                return (String) C4469m.m27770a(C6429g.m22064m(C5988g.m23092j()).mo22049h());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return string;
    }

    /* renamed from: g */
    static String m21847g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m21846h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: i */
    static String m21845i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m21844j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C6503a.EnumC6506c m21843k(Bundle bundle) {
        if (bundle != null && C6502h0.m21788t(bundle)) {
            return C6503a.EnumC6506c.DISPLAY_NOTIFICATION;
        }
        return C6503a.EnumC6506c.DATA_MESSAGE;
    }

    /* renamed from: l */
    static String m21842l(Bundle bundle) {
        return true != C6502h0.m21788t(bundle) ? TransactionBreakDownItemType.DATA : "display";
    }

    /* renamed from: m */
    static String m21841m() {
        return C5988g.m23092j().m23093i().getPackageName();
    }

    /* renamed from: n */
    static long m21840n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C5988g m23092j = C5988g.m23092j();
        String m23066e = m23092j.m23089m().m23066e();
        if (m23066e != null) {
            try {
                return Long.parseLong(m23066e);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String m23068c = m23092j.m23089m().m23068c();
        if (!m23068c.startsWith("1:")) {
            try {
                return Long.parseLong(m23068c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            String[] split = m23068c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    static String m21839o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m21838p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                String.valueOf(valueOf).length();
                Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(valueOf)));
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    static String m21837q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m21836r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m21835s(Intent intent) {
        m21830x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m21834t(Intent intent) {
        m21830x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m21833u(Bundle bundle) {
        m21829y(bundle);
        m21830x("_no", bundle);
    }

    /* renamed from: v */
    public static void m21832v(Intent intent) {
        if (m21855A(intent)) {
            m21830x("_nr", intent.getExtras());
        }
        if (m21828z(intent)) {
            m21831w(C6503a.EnumC6505b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m21922k());
        }
    }

    /* renamed from: w */
    private static void m21831w(C6503a.EnumC6505b enumC6505b, Intent intent, InterfaceC8241g interfaceC8241g) {
        if (interfaceC8241g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C6503a m21852b = m21852b(enumC6505b, intent);
        if (m21852b == null) {
            return;
        }
        try {
            InterfaceC8240f mo16231b = interfaceC8241g.mo16231b("FCM_CLIENT_EVENT_LOGGING", C6508b.class, C8236b.m16444b("proto"), C6491e0.f15661a);
            C6508b.C6509a m21748b = C6508b.m21748b();
            m21748b.m21745b(m21852b);
            mo16231b.mo16230a(AbstractC8237c.m16439e(m21748b.m21746a()));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    /* renamed from: x */
    static void m21830x(String str, Bundle bundle) {
        try {
            C5988g.m23092j();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m21850d = m21850d(bundle);
            if (m21850d != null) {
                bundle2.putString("_nmid", m21850d);
            }
            String m21849e = m21849e(bundle);
            if (m21849e != null) {
                bundle2.putString("_nmn", m21849e);
            }
            String m21845i = m21845i(bundle);
            if (!TextUtils.isEmpty(m21845i)) {
                bundle2.putString("label", m21845i);
            }
            String m21847g = m21847g(bundle);
            if (!TextUtils.isEmpty(m21847g)) {
                bundle2.putString("message_channel", m21847g);
            }
            String m21839o = m21839o(bundle);
            if (m21839o != null) {
                bundle2.putString("_nt", m21839o);
            }
            String m21844j = m21844j(bundle);
            if (m21844j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m21844j));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String m21837q = m21837q(bundle);
            if (m21837q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m21837q));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String m21842l = m21842l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m21842l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String obj = bundle2.toString();
                StringBuilder sb = new StringBuilder(str.length() + 37 + obj.length());
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(obj);
                Log.d("FirebaseMessaging", sb.toString());
            }
            InterfaceC5174a interfaceC5174a = (InterfaceC5174a) C5988g.m23092j().m23095g(InterfaceC5174a.class);
            if (interfaceC5174a != null) {
                interfaceC5174a.mo22587c("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m21829y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            InterfaceC5174a interfaceC5174a = (InterfaceC5174a) C5988g.m23092j().m23095g(InterfaceC5174a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC5174a != null) {
                String string = bundle.getString("google.c.a.c_id");
                interfaceC5174a.mo22584f("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString(TransactionField.TRANSACTION_CHANNEL, "Firebase");
                bundle2.putString("medium", IncomingMessage.TYPE_NOTIFICATION);
                bundle2.putString("campaign", string);
                interfaceC5174a.mo22587c("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    /* renamed from: z */
    public static boolean m21828z(Intent intent) {
        if (intent == null || m21836r(intent)) {
            return false;
        }
        return m21853a();
    }
}
