package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.android.gms.tasks.InterfaceC4454e;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p201g.p218e.C7534g;
import p272h.p286c.p287a.p300b.p307d.p311d.C8417a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.d */
/* loaded from: classes2.dex */
public class C2704d {

    /* renamed from: h */
    private static int f7631h;

    /* renamed from: i */
    private static PendingIntent f7632i;

    /* renamed from: j */
    private static final Executor f7633j = ExecutorC2705d0.f7642c;

    /* renamed from: k */
    private static final Pattern f7634k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f7636b;

    /* renamed from: c */
    private final C2725x f7637c;

    /* renamed from: d */
    private final ScheduledExecutorService f7638d;

    /* renamed from: f */
    private Messenger f7640f;

    /* renamed from: g */
    private C2710i f7641g;

    /* renamed from: a */
    private final C7534g<String, C4465k<Bundle>> f7635a = new C7534g<>();

    /* renamed from: e */
    private Messenger f7639e = new Messenger(new HandlerC2707f(this, Looper.getMainLooper()));

    public C2704d(Context context) {
        this.f7636b = context;
        this.f7637c = new C2725x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7638d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ com.google.android.gms.tasks.j m32139b(Bundle bundle) throws Exception {
        if (m32131j(bundle)) {
            return C4469m.m27765f(null);
        }
        return C4469m.m27765f(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m32137d(C2704d c2704d, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2709h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C2710i) {
                        c2704d.f7641g = (C2710i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c2704d.f7640f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("Rpc", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            c2704d.m32132i(str, intent2.putExtra(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                        return;
                    }
                    synchronized (c2704d.f7635a) {
                        for (int i = 0; i < c2704d.f7635a.size(); i++) {
                            c2704d.m32132i(c2704d.f7635a.m18452k(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f7634k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c2704d.m32132i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final com.google.android.gms.tasks.j<Bundle> m32135f(Bundle bundle) {
        final String m32134g = m32134g();
        final C4465k<Bundle> c4465k = new C4465k<>();
        synchronized (this.f7635a) {
            this.f7635a.put(m32134g, c4465k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f7637c.m32108b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m32133h(this.f7636b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(m32134g).length() + 5);
        sb.append("|ID|");
        sb.append(m32134g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f7639e);
        if (this.f7640f != null || this.f7641g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f7640f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f7641g.m32129b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f7638d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (C4465k.this.m27774d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c4465k.m27777a().c(f7633j, new InterfaceC4454e() { // from class: com.google.android.gms.cloudmessaging.a0
                @Override // com.google.android.gms.tasks.InterfaceC4454e
                /* renamed from: a */
                public final void mo21856a(com.google.android.gms.tasks.j jVar) {
                    C2704d.this.m32136e(m32134g, schedule, jVar);
                }
            });
            return c4465k.m27777a();
        }
        if (this.f7637c.m32108b() == 2) {
            this.f7636b.sendBroadcast(intent);
        } else {
            this.f7636b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f7638d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (C4465k.this.m27774d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c4465k.m27777a().c(f7633j, new InterfaceC4454e() { // from class: com.google.android.gms.cloudmessaging.a0
            @Override // com.google.android.gms.tasks.InterfaceC4454e
            /* renamed from: a */
            public final void mo21856a(com.google.android.gms.tasks.j jVar) {
                C2704d.this.m32136e(m32134g, schedule2, jVar);
            }
        });
        return c4465k.m27777a();
    }

    /* renamed from: g */
    private static synchronized String m32134g() {
        String num;
        synchronized (C2704d.class) {
            int i = f7631h;
            f7631h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m32133h(Context context, Intent intent) {
        synchronized (C2704d.class) {
            if (f7632i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f7632i = C8417a.m16117a(context, 0, intent2, C8417a.f20092a);
            }
            intent.putExtra("app", f7632i);
        }
    }

    /* renamed from: i */
    private final void m32132i(String str, Bundle bundle) {
        synchronized (this.f7635a) {
            C4465k<Bundle> remove = this.f7635a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.m27775c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m32131j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public com.google.android.gms.tasks.j<Bundle> m32140a(final Bundle bundle) {
        if (this.f7637c.m32109a() < 12000000) {
            if (this.f7637c.m32108b() != 0) {
                return m32135f(bundle).j(f7633j, new InterfaceC4450c() { // from class: com.google.android.gms.cloudmessaging.y
                    @Override // com.google.android.gms.tasks.InterfaceC4450c
                    /* renamed from: a */
                    public final Object mo20893a(com.google.android.gms.tasks.j jVar) {
                        return C2704d.this.m32138c(bundle, jVar);
                    }
                });
            }
            return C4469m.m27766e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C2724w.m32115b(this.f7636b).m32113d(1, bundle).i(f7633j, C2727z.f7681a);
    }

    /* renamed from: c */
    public final /* synthetic */ com.google.android.gms.tasks.j m32138c(Bundle bundle, com.google.android.gms.tasks.j jVar) throws Exception {
        return (jVar.p() && m32131j((Bundle) jVar.l())) ? m32135f(bundle).r(f7633j, C2700b0.f7628a) : jVar;
    }

    /* renamed from: e */
    public final /* synthetic */ void m32136e(String str, ScheduledFuture scheduledFuture, com.google.android.gms.tasks.j jVar) {
        synchronized (this.f7635a) {
            this.f7635a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
