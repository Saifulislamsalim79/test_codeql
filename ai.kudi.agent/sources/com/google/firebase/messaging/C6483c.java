package com.google.firebase.messaging;

import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C1314k;
import com.google.android.gms.common.util.C2974l;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.messaging.C6475a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes2.dex */
class C6483c {

    /* renamed from: a */
    private final Executor f15647a;

    /* renamed from: b */
    private final Context f15648b;

    /* renamed from: c */
    private final C6502h0 f15649c;

    public C6483c(Context context, C6502h0 c6502h0, Executor executor) {
        this.f15647a = executor;
        this.f15648b = context;
        this.f15649c = c6502h0;
    }

    /* renamed from: b */
    private boolean m21867b() {
        if (((KeyguardManager) this.f15648b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C2974l.m31517f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f15648b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m21866c(C6475a.C6476a c6476a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f15648b.getSystemService(IncomingMessage.TYPE_NOTIFICATION)).notify(c6476a.f15633b, c6476a.f15634c, c6476a.f15632a.m36402b());
    }

    /* renamed from: d */
    private C6487d0 m21865d() {
        C6487d0 m21859m = C6487d0.m21859m(this.f15649c.m21792p("gcm.n.image"));
        if (m21859m != null) {
            m21859m.m21862I(this.f15647a);
        }
        return m21859m;
    }

    /* renamed from: e */
    private void m21864e(C1314k.C1323e c1323e, C6487d0 c6487d0) {
        if (c6487d0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C4469m.m27769b(c6487d0.m21863F(), 5L, TimeUnit.SECONDS);
            c1323e.m36388p(bitmap);
            C1314k.C1316b c1316b = new C1314k.C1316b();
            c1316b.m36415i(bitmap);
            c1316b.m36416h(null);
            c1323e.m36380x(c1316b);
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c6487d0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            String valueOf = String.valueOf(e.getCause());
            String.valueOf(valueOf).length();
            Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(valueOf)));
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c6487d0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m21868a() {
        if (this.f15649c.m21807a("gcm.n.noui")) {
            return true;
        }
        if (m21867b()) {
            return false;
        }
        C6487d0 m21865d = m21865d();
        C6475a.C6476a m21899d = C6475a.m21899d(this.f15648b, this.f15649c);
        m21864e(m21899d.f15632a, m21865d);
        m21866c(m21899d);
        return true;
    }
}
