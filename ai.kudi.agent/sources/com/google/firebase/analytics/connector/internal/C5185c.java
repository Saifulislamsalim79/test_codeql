package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2964b;
import com.google.android.gms.measurement.internal.C4164b6;
import com.google.android.gms.measurement.internal.C4316o7;
import com.google.android.gms.measurement.internal.C4430y5;
import com.google.android.gms.measurement.internal.C4441z5;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* loaded from: classes2.dex */
public final class C5185c {

    /* renamed from: a */
    private static final Set<String> f12918a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    private static final List<String> f12919b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final List<String> f12920c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    private static final List<String> f12921d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    private static final List<String> f12922e = Arrays.asList((String[]) C2964b.m31544a(C4164b6.f10034a, C4164b6.f10035b));

    /* renamed from: f */
    private static final List<String> f12923f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static Bundle m25431a(InterfaceC5174a.C5177c c5177c) {
        Bundle bundle = new Bundle();
        String str = c5177c.f12894a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = c5177c.f12895b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = c5177c.f12896c;
        if (obj != null) {
            C4430y5.m27808b(bundle, obj);
        }
        String str3 = c5177c.f12897d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", c5177c.f12898e);
        String str4 = c5177c.f12899f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = c5177c.f12900g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = c5177c.f12901h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = c5177c.f12902i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", c5177c.f12903j);
        String str6 = c5177c.f12904k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = c5177c.f12905l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", c5177c.f12906m);
        bundle.putBoolean("active", c5177c.f12907n);
        bundle.putLong("triggered_timestamp", c5177c.f12908o);
        return bundle;
    }

    /* renamed from: b */
    public static InterfaceC5174a.C5177c m25430b(Bundle bundle) {
        s.j(bundle);
        InterfaceC5174a.C5177c c5177c = new InterfaceC5174a.C5177c();
        String str = (String) C4430y5.m27809a(bundle, "origin", String.class, null);
        s.j(str);
        c5177c.f12894a = str;
        String str2 = (String) C4430y5.m27809a(bundle, "name", String.class, null);
        s.j(str2);
        c5177c.f12895b = str2;
        c5177c.f12896c = C4430y5.m27809a(bundle, "value", Object.class, null);
        c5177c.f12897d = (String) C4430y5.m27809a(bundle, "trigger_event_name", String.class, null);
        c5177c.f12898e = ((Long) C4430y5.m27809a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        c5177c.f12899f = (String) C4430y5.m27809a(bundle, "timed_out_event_name", String.class, null);
        c5177c.f12900g = (Bundle) C4430y5.m27809a(bundle, "timed_out_event_params", Bundle.class, null);
        c5177c.f12901h = (String) C4430y5.m27809a(bundle, "triggered_event_name", String.class, null);
        c5177c.f12902i = (Bundle) C4430y5.m27809a(bundle, "triggered_event_params", Bundle.class, null);
        c5177c.f12903j = ((Long) C4430y5.m27809a(bundle, "time_to_live", Long.class, 0L)).longValue();
        c5177c.f12904k = (String) C4430y5.m27809a(bundle, "expired_event_name", String.class, null);
        c5177c.f12905l = (Bundle) C4430y5.m27809a(bundle, "expired_event_params", Bundle.class, null);
        c5177c.f12907n = ((Boolean) C4430y5.m27809a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        c5177c.f12906m = ((Long) C4430y5.m27809a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        c5177c.f12908o = ((Long) C4430y5.m27809a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return c5177c;
    }

    /* renamed from: c */
    public static String m25429c(String str) {
        String m27804a = C4441z5.m27804a(str);
        return m27804a != null ? m27804a : str;
    }

    /* renamed from: d */
    public static String m25428d(String str) {
        String m27803b = C4441z5.m27803b(str);
        return m27803b != null ? m27803b : str;
    }

    /* renamed from: e */
    public static void m25427e(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: f */
    public static boolean m25426f(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (Character.isLetter(codePointAt) || codePointAt == 95) {
            int length = str.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m25425g(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (Character.isLetter(codePointAt)) {
            int length = str.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m25424h(String str, String str2, Bundle bundle) {
        char c;
        if ("_cmp".equals(str2)) {
            if (m25420l(str) && bundle != null) {
                for (String str3 : f12921d) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m25423i(InterfaceC5174a.C5177c c5177c) {
        String str;
        if (c5177c == null || (str = c5177c.f12894a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = c5177c.f12896c;
        if ((obj == null || C4316o7.m28010a(obj) != null) && m25420l(str) && m25419m(str, c5177c.f12895b)) {
            String str2 = c5177c.f12904k;
            if (str2 == null || (m25422j(str2, c5177c.f12905l) && m25424h(str, c5177c.f12904k, c5177c.f12905l))) {
                String str3 = c5177c.f12901h;
                if (str3 == null || (m25422j(str3, c5177c.f12902i) && m25424h(str, c5177c.f12901h, c5177c.f12902i))) {
                    String str4 = c5177c.f12899f;
                    if (str4 != null) {
                        return m25422j(str4, c5177c.f12900g) && m25424h(str, c5177c.f12899f, c5177c.f12900g);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m25422j(String str, Bundle bundle) {
        if (f12919b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f12921d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m25421k(String str) {
        return !f12918a.contains(str);
    }

    /* renamed from: l */
    public static boolean m25420l(String str) {
        return !f12920c.contains(str);
    }

    /* renamed from: m */
    public static boolean m25419m(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (f12922e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f12923f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
