package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.C2704d;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.firebase.C5988g;
import com.google.firebase.installations.AbstractC6435k;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.p181q.InterfaceC6732i;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.b0 */
/* loaded from: classes2.dex */
public class C6481b0 {

    /* renamed from: a */
    private final C5988g f15640a;

    /* renamed from: b */
    private final C6498g0 f15641b;

    /* renamed from: c */
    private final C2704d f15642c;

    /* renamed from: d */
    private final InterfaceC6560b<InterfaceC6732i> f15643d;

    /* renamed from: e */
    private final InterfaceC6560b<InterfaceC6555f> f15644e;

    /* renamed from: f */
    private final InterfaceC6432h f15645f;

    C6481b0(C5988g c5988g, C6498g0 c6498g0, C2704d c2704d, InterfaceC6560b<InterfaceC6732i> interfaceC6560b, InterfaceC6560b<InterfaceC6555f> interfaceC6560b2, InterfaceC6432h interfaceC6432h) {
        this.f15640a = c5988g;
        this.f15641b = c6498g0;
        this.f15642c = c2704d;
        this.f15643d = interfaceC6560b;
        this.f15644e = interfaceC6560b2;
        this.f15645f = interfaceC6432h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6481b0(C5988g c5988g, C6498g0 c6498g0, InterfaceC6560b<InterfaceC6732i> interfaceC6560b, InterfaceC6560b<InterfaceC6555f> interfaceC6560b2, InterfaceC6432h interfaceC6432h) {
        this(c5988g, c6498g0, new C2704d(c5988g.m23093i()), interfaceC6560b, interfaceC6560b2, interfaceC6432h);
    }

    /* renamed from: a */
    private static String m21879a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private com.google.android.gms.tasks.j<String> m21878b(com.google.android.gms.tasks.j<Bundle> jVar) {
        return jVar.i(ExecutorC6477a0.f15635c, new InterfaceC4450c() { // from class: com.google.firebase.messaging.z
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(com.google.android.gms.tasks.j jVar2) {
                return C6481b0.this.m21873g(jVar2);
            }
        });
    }

    /* renamed from: c */
    private String m21877c() {
        try {
            return m21879a(MessageDigest.getInstance("SHA-1").digest(this.f15640a.m23090l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m21875e(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String obj = bundle.toString();
            Log.w("FirebaseMessaging", "Unexpected response: ".concat(obj), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m21874f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: h */
    private void m21872h(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        InterfaceC6555f.EnumC6556a mo21645a;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f15640a.m23089m().m23068c());
        bundle.putString("gmsv", Integer.toString(this.f15641b.m21821d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f15641b.m21824a());
        bundle.putString("app_ver_name", this.f15641b.m21823b());
        bundle.putString("firebase-app-name-hash", m21877c());
        try {
            String mo22047b = ((AbstractC6435k) C4469m.m27770a(this.f15645f.mo22050a(false))).mo22047b();
            if (!TextUtils.isEmpty(mo22047b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo22047b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C4469m.m27770a(this.f15645f.mo22049h()));
        bundle.putString("cliv", "fcm-23.0.0");
        InterfaceC6555f interfaceC6555f = this.f15644e.get();
        InterfaceC6732i interfaceC6732i = this.f15643d.get();
        if (interfaceC6555f == null || interfaceC6732i == null || (mo21645a = interfaceC6555f.mo21645a("fire-iid")) == InterfaceC6555f.EnumC6556a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo21645a.m21644a()));
        bundle.putString("Firebase-Client", interfaceC6732i.mo20931a());
    }

    /* renamed from: i */
    private com.google.android.gms.tasks.j<Bundle> m21871i(String str, String str2, Bundle bundle) {
        try {
            m21872h(str, str2, bundle);
            return this.f15642c.m32140a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C4469m.m27766e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public com.google.android.gms.tasks.j<String> m21876d() {
        return m21878b(m21871i(C6498g0.m21822c(this.f15640a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public /* synthetic */ String m21873g(com.google.android.gms.tasks.j jVar) throws Exception {
        return m21875e((Bundle) jVar.m(IOException.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public com.google.android.gms.tasks.j<?> m21870j(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str2);
        return m21878b(m21871i(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public com.google.android.gms.tasks.j<?> m21869k(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str2);
        return m21878b(m21871i(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
