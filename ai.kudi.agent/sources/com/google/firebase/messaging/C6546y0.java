package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p201g.p218e.C7521a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: classes2.dex */
public class C6546y0 {

    /* renamed from: i */
    private static final long f15799i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f15800a;

    /* renamed from: b */
    private final C6498g0 f15801b;

    /* renamed from: c */
    private final C6481b0 f15802c;

    /* renamed from: d */
    private final FirebaseMessaging f15803d;

    /* renamed from: f */
    private final ScheduledExecutorService f15805f;

    /* renamed from: h */
    private final C6542w0 f15807h;

    /* renamed from: e */
    private final Map<String, ArrayDeque<C4465k<Void>>> f15804e = new C7521a();

    /* renamed from: g */
    private boolean f15806g = false;

    private C6546y0(FirebaseMessaging firebaseMessaging, C6498g0 c6498g0, C6542w0 c6542w0, C6481b0 c6481b0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15803d = firebaseMessaging;
        this.f15801b = c6498g0;
        this.f15807h = c6542w0;
        this.f15802c = c6481b0;
        this.f15800a = context;
        this.f15805f = scheduledExecutorService;
    }

    /* renamed from: a */
    private static <T> void m21676a(com.google.android.gms.tasks.j<T> jVar) throws IOException {
        try {
            C4469m.m27769b(jVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: b */
    private void m21675b(String str) throws IOException {
        m21676a(this.f15802c.m21870j(this.f15803d.m21930c(), str));
    }

    /* renamed from: c */
    private void m21674c(String str) throws IOException {
        m21676a(this.f15802c.m21869k(this.f15803d.m21930c(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static com.google.android.gms.tasks.j<C6546y0> m21673d(final FirebaseMessaging firebaseMessaging, final C6498g0 c6498g0, final C6481b0 c6481b0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C4469m.m27768c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6546y0.m21669h(context, scheduledExecutorService, firebaseMessaging, c6498g0, c6481b0);
            }
        });
    }

    /* renamed from: f */
    static boolean m21671f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ C6546y0 m21669h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C6498g0 c6498g0, C6481b0 c6481b0) throws Exception {
        return new C6546y0(firebaseMessaging, c6498g0, C6542w0.m21681a(context, scheduledExecutorService), c6481b0, context, scheduledExecutorService);
    }

    /* renamed from: i */
    private void m21668i(C6540v0 c6540v0) {
        synchronized (this.f15804e) {
            String m21682e = c6540v0.m21682e();
            if (this.f15804e.containsKey(m21682e)) {
                ArrayDeque<C4465k<Void>> arrayDeque = this.f15804e.get(m21682e);
                C4465k<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m27775c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f15804e.remove(m21682e);
                }
            }
        }
    }

    /* renamed from: m */
    private void m21664m() {
        if (m21670g()) {
            return;
        }
        m21661p(0L);
    }

    /* renamed from: e */
    boolean m21672e() {
        return this.f15807h.m21680b() != null;
    }

    /* renamed from: g */
    synchronized boolean m21670g() {
        return this.f15806g;
    }

    /* renamed from: j */
    boolean m21667j(C6540v0 c6540v0) throws IOException {
        char c;
        try {
            String m21685b = c6540v0.m21685b();
            int hashCode = m21685b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && m21685b.equals("U")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (m21685b.equals("S")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                m21675b(c6540v0.m21684c());
                if (m21671f()) {
                    String m21684c = c6540v0.m21684c();
                    StringBuilder sb = new StringBuilder(String.valueOf(m21684c).length() + 31);
                    sb.append("Subscribe to topic: ");
                    sb.append(m21684c);
                    sb.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb.toString());
                }
            } else if (c != 1) {
                if (m21671f()) {
                    String obj = c6540v0.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 24);
                    sb2.append("Unknown topic operation");
                    sb2.append(obj);
                    sb2.append(".");
                    Log.d("FirebaseMessaging", sb2.toString());
                }
            } else {
                m21674c(c6540v0.m21684c());
                if (m21671f()) {
                    String m21684c2 = c6540v0.m21684c();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(m21684c2).length() + 35);
                    sb3.append("Unsubscribe from topic: ");
                    sb3.append(m21684c2);
                    sb3.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb3.toString());
                }
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e;
            }
            String message = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
            sb4.append("Topic operation failed: ");
            sb4.append(message);
            sb4.append(". Will retry Topic operation.");
            Log.e("FirebaseMessaging", sb4.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m21666k(Runnable runnable, long j) {
        this.f15805f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized void m21665l(boolean z) {
        this.f15806g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m21663n() {
        if (m21672e()) {
            m21664m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (m21671f() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return true;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m21662o() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.w0 r0 = r2.f15807h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.v0 r0 = r0.m21680b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m21671f()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m21667j(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.w0 r1 = r2.f15807h
            r1.m21678d(r0)
            r2.m21668i(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2e:
            throw r0
        L2f:
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6546y0.m21662o():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m21661p(long j) {
        m21666k(new RunnableC6548z0(this, this.f15800a, this.f15801b, Math.min(Math.max(30L, j + j), f15799i)), j);
        m21665l(true);
    }
}
