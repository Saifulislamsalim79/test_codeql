package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p058os.C1375d;
import com.google.android.gms.common.C2836g;
import com.google.android.gms.common.C2942j;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2971i;
import java.util.Locale;
import p201g.p218e.C7534g;
import p272h.p286c.p287a.p300b.p306c.C8392b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.g0 */
/* loaded from: classes2.dex */
public final class C2875g0 {

    /* renamed from: a */
    private static final C7534g<String, String> f7989a = new C7534g<>();

    /* renamed from: b */
    private static Locale f7990b;

    /* renamed from: a */
    public static String m31743a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2956c.m31548a(context).m31552d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m31742b(Context context) {
        return context.getResources().getString(C8392b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m31741c(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(C8392b.common_google_play_services_enable_button);
            }
            return resources.getString(C8392b.common_google_play_services_update_button);
        }
        return resources.getString(C8392b.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m31740d(Context context, int i) {
        Resources resources = context.getResources();
        String m31743a = m31743a(context);
        if (i != 1) {
            if (i == 2) {
                return C2971i.m31529d(context) ? resources.getString(C8392b.common_google_play_services_wear_update_text) : resources.getString(C8392b.common_google_play_services_update_text, m31743a);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return m31736h(context, "common_google_play_services_api_unavailable_text", m31743a);
                                    case 17:
                                        return m31736h(context, "common_google_play_services_sign_in_failed_text", m31743a);
                                    case 18:
                                        return resources.getString(C8392b.common_google_play_services_updating_text, m31743a);
                                    default:
                                        return resources.getString(C2942j.common_google_play_services_unknown_issue, m31743a);
                                }
                            }
                            return m31736h(context, "common_google_play_services_restricted_profile_text", m31743a);
                        }
                        return resources.getString(C8392b.common_google_play_services_unsupported_text, m31743a);
                    }
                    return m31736h(context, "common_google_play_services_network_error_text", m31743a);
                }
                return m31736h(context, "common_google_play_services_invalid_account_text", m31743a);
            } else {
                return resources.getString(C8392b.common_google_play_services_enable_text, m31743a);
            }
        }
        return resources.getString(C8392b.common_google_play_services_install_text, m31743a);
    }

    /* renamed from: e */
    public static String m31739e(Context context, int i) {
        if (i != 6 && i != 19) {
            return m31740d(context, i);
        }
        return m31736h(context, "common_google_play_services_resolution_required_text", m31743a(context));
    }

    /* renamed from: f */
    public static String m31738f(Context context, int i) {
        String m31737g;
        if (i == 6) {
            m31737g = m31735i(context, "common_google_play_services_resolution_required_title");
        } else {
            m31737g = m31737g(context, i);
        }
        return m31737g == null ? context.getResources().getString(C8392b.common_google_play_services_notification_ticker) : m31737g;
    }

    /* renamed from: g */
    public static String m31737g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C8392b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C8392b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C8392b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m31735i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m31735i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m31735i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m31735i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m31736h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m31735i = m31735i(context, str);
        if (m31735i == null) {
            m31735i = resources.getString(C2942j.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m31735i, str2);
    }

    /* renamed from: i */
    private static String m31735i(Context context, String str) {
        String str2;
        String str3;
        synchronized (f7989a) {
            Locale m36165c = C1375d.m36169a(context.getResources().getConfiguration()).m36165c(0);
            if (!m36165c.equals(f7990b)) {
                f7989a.clear();
                f7990b = m36165c;
            }
            String str4 = f7989a.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources m31839e = C2836g.m31839e(context);
            if (m31839e == null) {
                return null;
            }
            int identifier = m31839e.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = m31839e.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f7989a.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                str2 = "Got empty resource: ".concat(str);
            } else {
                str2 = new String("Got empty resource: ");
            }
            Log.w("GoogleApiAvailability", str2);
            return null;
        }
    }
}
