package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: classes2.dex */
public class C6528q0 {

    /* renamed from: e */
    private static C6528q0 f15754e;

    /* renamed from: a */
    private String f15755a = null;

    /* renamed from: b */
    private Boolean f15756b = null;

    /* renamed from: c */
    private Boolean f15757c = null;

    /* renamed from: d */
    private final Queue<Intent> f15758d = new ArrayDeque();

    private C6528q0() {
    }

    /* renamed from: a */
    private int m21717a(Context context, Intent intent) {
        ComponentName startService;
        String str;
        String m21712f = m21712f(context, intent);
        if (m21712f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                if (m21712f.length() != 0) {
                    str = "Restricting intent to a specific service: ".concat(m21712f);
                } else {
                    str = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", str);
            }
            intent.setClassName(context.getPackageName(), m21712f);
        }
        try {
            if (m21713e(context)) {
                startService = C6478a1.m21881e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C6528q0 m21716b() {
        C6528q0 c6528q0;
        synchronized (C6528q0.class) {
            if (f15754e == null) {
                f15754e = new C6528q0();
            }
            c6528q0 = f15754e;
        }
        return c6528q0;
    }

    /* renamed from: f */
    private synchronized String m21712f(Context context, Intent intent) {
        String str = this.f15755a;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.f15755a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.f15755a = serviceInfo.name;
                }
                return this.f15755a;
            }
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            Log.e("FirebaseMessaging", sb.toString());
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent m21715c() {
        return this.f15758d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m21714d(Context context) {
        if (this.f15757c == null) {
            this.f15757c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f15756b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f15757c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m21713e(Context context) {
        if (this.f15756b == null) {
            this.f15756b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f15756b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f15756b.booleanValue();
    }

    /* renamed from: g */
    public int m21711g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f15758d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m21717a(context, intent2);
    }
}
