package com.google.android.gms.common;

import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C1314k;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC2783k0;
import com.google.android.gms.common.api.internal.C2785l0;
import com.google.android.gms.common.api.internal.InterfaceC2775i;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC2884j0;
import com.google.android.gms.common.internal.C2875g0;
import com.google.android.gms.common.p102o.C2954a;
import com.google.android.gms.common.util.C2971i;
import com.google.android.gms.common.util.C2974l;
import p272h.p286c.p287a.p300b.p306c.C8391a;
import p272h.p286c.p287a.p300b.p306c.C8392b;
import p272h.p286c.p287a.p300b.p307d.p310c.C8415e;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.e */
/* loaded from: classes2.dex */
public class C2832e extends C2834f {

    /* renamed from: d */
    private static final Object f7913d = new Object();

    /* renamed from: e */
    private static final C2832e f7914e = new C2832e();

    /* renamed from: c */
    private String f7915c;

    /* renamed from: o */
    public static C2832e m31864o() {
        return f7914e;
    }

    @Override // com.google.android.gms.common.C2834f
    /* renamed from: b */
    public Intent mo31851b(Context context, int i, String str) {
        return super.mo31851b(context, i, str);
    }

    @Override // com.google.android.gms.common.C2834f
    /* renamed from: c */
    public PendingIntent mo31850c(Context context, int i, int i2) {
        return super.mo31850c(context, i, i2);
    }

    @Override // com.google.android.gms.common.C2834f
    /* renamed from: e */
    public final String mo31848e(int i) {
        return super.mo31848e(i);
    }

    @Override // com.google.android.gms.common.C2834f
    /* renamed from: g */
    public int mo31846g(Context context) {
        return super.mo31846g(context);
    }

    @Override // com.google.android.gms.common.C2834f
    /* renamed from: h */
    public int mo31845h(Context context, int i) {
        return super.mo31845h(context, i);
    }

    @Override // com.google.android.gms.common.C2834f
    /* renamed from: j */
    public final boolean mo31843j(int i) {
        return super.mo31843j(i);
    }

    /* renamed from: l */
    public Dialog m31867l(Activity activity, int i, int i2) {
        return m31866m(activity, i, i2, null);
    }

    /* renamed from: m */
    public Dialog m31866m(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m31861r(activity, i, AbstractDialogInterface$OnClickListenerC2884j0.m31720b(activity, mo31851b(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: n */
    public PendingIntent m31865n(Context context, C2826b c2826b) {
        if (c2826b.m31880l()) {
            return c2826b.m31881k();
        }
        return mo31850c(context, c2826b.m31883f(), 0);
    }

    /* renamed from: p */
    public boolean m31863p(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m31866m = m31866m(activity, i, i2, onCancelListener);
        if (m31866m == null) {
            return false;
        }
        m31858u(activity, m31866m, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: q */
    public void m31862q(Context context, int i) {
        m31857v(context, i, null, m31849d(context, i, 0, "n"));
    }

    /* renamed from: r */
    final Dialog m31861r(Context context, int i, AbstractDialogInterface$OnClickListenerC2884j0 abstractDialogInterface$OnClickListenerC2884j0, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2875g0.m31740d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m31741c = C2875g0.m31741c(context, i);
        if (m31741c != null) {
            builder.setPositiveButton(m31741c, abstractDialogInterface$OnClickListenerC2884j0);
        }
        String m31737g = C2875g0.m31737g(context, i);
        if (m31737g != null) {
            builder.setTitle(m31737g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: s */
    public final Dialog m31860s(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C2875g0.m31740d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m31858u(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: t */
    public final C2785l0 m31859t(Context context, AbstractC2783k0 abstractC2783k0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2785l0 c2785l0 = new C2785l0(abstractC2783k0);
        context.registerReceiver(c2785l0, intentFilter);
        c2785l0.m31954a(context);
        if (m31844i(context, "com.google.android.gms")) {
            return c2785l0;
        }
        abstractC2783k0.mo31955a();
        c2785l0.m31953b();
        return null;
    }

    /* renamed from: u */
    final void m31858u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.i) {
                C2944k.m31586e(dialog, onCancelListener).show(((androidx.fragment.app.i) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2828c.m31870a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: v */
    final void m31857v(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            m31856w(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String m31738f = C2875g0.m31738f(context, i);
            String m31739e = C2875g0.m31739e(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService(IncomingMessage.TYPE_NOTIFICATION);
            com.google.android.gms.common.internal.s.j(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C1314k.C1323e c1323e = new C1314k.C1323e(context);
            c1323e.m36386r(true);
            c1323e.m36398f(true);
            c1323e.m36392l(m31738f);
            C1314k.C1319c c1319c = new C1314k.C1319c();
            c1319c.m36411h(m31739e);
            c1323e.m36380x(c1319c);
            if (C2971i.m31530c(context)) {
                com.google.android.gms.common.internal.s.m(C2974l.m31518e());
                c1323e.m36382v(context.getApplicationInfo().icon);
                c1323e.m36384t(2);
                if (C2971i.m31529d(context)) {
                    c1323e.m36403a(C8391a.common_full_open_on_phone, resources.getString(C8392b.common_open_on_phone), pendingIntent);
                } else {
                    c1323e.m36394j(pendingIntent);
                }
            } else {
                c1323e.m36382v(17301642);
                c1323e.m36379y(resources.getString(C8392b.common_google_play_services_notification_ticker));
                c1323e.m36404B(System.currentTimeMillis());
                c1323e.m36394j(pendingIntent);
                c1323e.m36393k(m31739e);
            }
            if (C2974l.m31515h()) {
                com.google.android.gms.common.internal.s.m(C2974l.m31515h());
                synchronized (f7913d) {
                    str2 = this.f7915c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String m31742b = C2875g0.m31742b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m31742b, 4));
                    } else if (!m31742b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(m31742b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                c1323e.m36396h(str2);
            }
            Notification m36402b = c1323e.m36402b();
            if (i == 1 || i == 2 || i == 3) {
                C2838h.f7922b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, m36402b);
        }
    }

    /* renamed from: w */
    final void m31856w(Context context) {
        new HandlerC2957p(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: x */
    public final boolean m31855x(Activity activity, InterfaceC2775i interfaceC2775i, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m31861r = m31861r(activity, i, AbstractDialogInterface$OnClickListenerC2884j0.m31719c(interfaceC2775i, mo31851b(activity, i, "d"), 2), onCancelListener);
        if (m31861r == null) {
            return false;
        }
        m31858u(activity, m31861r, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: y */
    public final boolean m31854y(Context context, C2826b c2826b, int i) {
        PendingIntent m31865n;
        if (C2954a.m31556a(context) || (m31865n = m31865n(context, c2826b)) == null) {
            return false;
        }
        m31857v(context, c2826b.m31883f(), null, C8415e.m16118a(context, 0, GoogleApiActivity.m32102a(context, m31865n, i, true), C8415e.f20091a | 134217728));
        return true;
    }
}
