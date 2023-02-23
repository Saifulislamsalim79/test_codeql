package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.C5988g;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.C5171b;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.remoteconfig.internal.C6751j;
import com.google.firebase.remoteconfig.internal.C6754k;
import com.google.firebase.remoteconfig.internal.C6757l;
import com.google.firebase.remoteconfig.internal.C6759m;
import com.google.firebase.remoteconfig.internal.C6760n;
import com.google.firebase.remoteconfig.internal.C6763p;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes.dex */
public class Frame {

    /* renamed from: a */
    private final C6759m f16190a;

    /* renamed from: b */
    private final C6751j f16191b;

    /* renamed from: c */
    private final Context f16192c;

    /* renamed from: d */
    private final C6751j f16193d;

    /* renamed from: e */
    private final C5171b f16194e;

    /* renamed from: f */
    private final C6757l f16195f;

    /* renamed from: g */
    private final Executor f16196g;

    /* renamed from: i */
    private final C6751j f16197i;

    /* renamed from: l */
    private final C6760n f16198l;

    Frame(Context context, C5988g c5988g, InterfaceC6432h interfaceC6432h, C5171b c5171b, Executor executor, C6751j c6751j, C6751j c6751j2, C6751j c6751j3, C6757l c6757l, C6759m c6759m, C6760n c6760n) {
        this.f16192c = context;
        this.f16194e = c5171b;
        this.f16196g = executor;
        this.f16193d = c6751j;
        this.f16197i = c6751j2;
        this.f16191b = c6751j3;
        this.f16195f = c6757l;
        this.f16190a = c6759m;
        this.f16198l = c6760n;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private com.google.android.gms.tasks.Item m20918a(Map map) {
        try {
            C6754k.C6756b $r2 = C6754k.m20873g();
            $r2.m20871b(map);
            C6754k $r3 = $r2.m20872a();
            C6751j $r4 = this.f16191b;
            com.google.android.gms.tasks.j<C6754k> i = $r4.m20884i($r3);
            C6738f $r6 = C6738f.f16211a;
            com.google.android.gms.tasks.Item $r5 = i.m27796a($r6);
            return $r5;
        } catch (JSONException $r7) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", $r7);
            com.google.android.gms.tasks.Item $r52 = C4469m.m27765f((Object) null);
            return $r52;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static Frame m20925a(C5988g c5988g) {
        Object $r1 = c5988g.m23095g(C6772o.class);
        C6772o $r2 = (C6772o) $r1;
        Frame $r3 = $r2.m20791d();
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public boolean m20927a(com.google.android.gms.tasks.Item item) {
        boolean $z0 = item.m27801a();
        if ($z0) {
            C6751j $r2 = this.f16193d;
            $r2.m20891b();
            Object $r3 = item.get();
            if ($r3 == null) {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                return true;
            }
            Object $r32 = item.get();
            C6754k $r4 = (C6754k) $r32;
            JSONArray $r5 = $r4.m20877c();
            m20917a($r5);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private static boolean m20921a(C6754k c6754k, C6754k c6754k2) {
        if (c6754k2 != null) {
            Date $r2 = c6754k.m20875e();
            Date $r3 = c6754k2.m20875e();
            boolean $z0 = $r2.equals($r3);
            return !$z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.util.List doInBackground(org.json.JSONArray r11) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r11.length()
            if (r1 >= r2) goto L35
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            org.json.JSONObject r4 = r11.getJSONObject(r1)
            java.util.Iterator r5 = r4.keys()
        L19:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2f
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            r8 = r9
            java.lang.String r10 = r4.getString(r8)
            r3.put(r8, r10)
            goto L19
        L2f:
            r0.add(r3)
            int r1 = r1 + 1
            goto L6
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.Frame.doInBackground(org.json.JSONArray):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Frame onCreateViewHolder() {
        C5988g $r0 = C5988g.m23092j();
        Frame $r1 = m20925a($r0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public com.google.android.gms.tasks.Item m20929a() {
        C6751j $r2 = this.f16193d;
        com.google.android.gms.tasks.Item $r3 = $r2.m20890c();
        C6751j $r22 = this.f16197i;
        com.google.android.gms.tasks.Item $r4 = $r22.m20890c();
        com.google.android.gms.tasks.Item[] $r5 = {$r3, $r4};
        com.google.android.gms.tasks.Item $r6 = C4469m.j($r5);
        Executor $r7 = this.f16196g;
        C6734b $r1 = new C6734b(this, $r3, $r4);
        return $r6.m27789c($r7, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public com.google.android.gms.tasks.Item m20928a(int i) {
        Context $r1 = this.f16192c;
        Map $r2 = C6763p.m20809a($r1, i);
        com.google.android.gms.tasks.Item $r3 = m20918a($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* synthetic */ com.google.android.gms.tasks.Item m20926a(com.google.android.gms.tasks.Item item, com.google.android.gms.tasks.Item item2, com.google.android.gms.tasks.Item item3) throws Exception {
        boolean $z0 = item.m27801a();
        if ($z0) {
            Object $r4 = item.get();
            if ($r4 != null) {
                Object $r42 = item.get();
                C6754k $r5 = (C6754k) $r42;
                boolean $z02 = item2.m27801a();
                if ($z02) {
                    Object $r43 = item2.get();
                    C6754k $r6 = (C6754k) $r43;
                    boolean $z03 = m20921a($r5, $r6);
                    if (!$z03) {
                        Boolean $r7 = Boolean.FALSE;
                        com.google.android.gms.tasks.Item $r1 = C4469m.m27765f($r7);
                        return $r1;
                    }
                }
                C6751j $r8 = this.f16197i;
                com.google.android.gms.tasks.j<C6754k> i = $r8.m20884i($r5);
                Executor $r9 = this.f16196g;
                C6733a $r10 = new C6733a(this);
                com.google.android.gms.tasks.Item $r12 = i.m27795a($r9, $r10);
                return $r12;
            }
        }
        Boolean $r72 = Boolean.FALSE;
        com.google.android.gms.tasks.Item $r13 = C4469m.m27765f($r72);
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* synthetic */ com.google.android.gms.tasks.Item m20919a(Void r2) throws Exception {
        com.google.android.gms.tasks.Item $r1 = m20929a();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* synthetic */ Void m20923a(Item item) throws Exception {
        C6760n $r1 = this.f16198l;
        $r1.i(item);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    void m20917a(JSONArray jSONArray) {
        C5171b $r3 = this.f16194e;
        if ($r3 == null) {
            return;
        }
        try {
            List $r1 = doInBackground(jSONArray);
            C5171b $r32 = this.f16194e;
            $r32.m25457k($r1);
        } catch (AbtException $r4) {
            Throwable r6 = $r4;
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", r6);
        } catch (JSONException $r5) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", $r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public com.google.android.gms.tasks.Item m20916b() {
        C6757l $r2 = this.f16195f;
        com.google.android.gms.tasks.j<C6757l.C6758a> d = $r2.m20863d();
        C6735c $r1 = C6735c.f16207a;
        com.google.android.gms.tasks.Item $r3 = d.m27796a($r1);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public com.google.android.gms.tasks.Item m20915b(Item item) {
        Executor $r1 = this.f16196g;
        Callable r5 = new CallableC6736d(this, item);
        Callable r6 = r5;
        com.google.android.gms.tasks.Item $r3 = C4469m.m27768c($r1, r6);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public com.google.android.gms.tasks.Item m20914c() {
        com.google.android.gms.tasks.Item $r3 = m20916b();
        Executor $r1 = this.f16196g;
        C6737e $r2 = new C6737e(this);
        return $r3.m27790a($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public Map m20913d() {
        C6759m $r2 = this.f16190a;
        Map $r1 = $r2.m20838c();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public boolean m20912d(String str) {
        C6759m $r1 = this.f16190a;
        boolean $z0 = $r1.m20837d(str);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getSetting(String str) {
        C6759m $r1 = this.f16190a;
        String $r2 = $r1.m20834g(str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InterfaceC6770l next() {
        C6760n $r2 = this.f16198l;
        InterfaceC6770l $r1 = $r2.m20827c();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void visitMaxs() {
        C6751j $r1 = this.f16197i;
        $r1.m20890c();
        C6751j $r12 = this.f16191b;
        $r12.m20890c();
        C6751j $r13 = this.f16193d;
        $r13.m20890c();
    }
}
