package org.org.org.org.org;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.content.SharedPreferences;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.menu.C14608i;
import org.org.org.org.asm.menu.MenuItem;
/* renamed from: org.org.org.org.org.f */
/* loaded from: classes.dex */
public final class C14705f implements Context {

    /* renamed from: a */
    public static final C14705f f32765a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14705f $r0 = new C14705f();
        f32765a = $r0;
    }

    private C14705f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final SharedPreferences get() {
        C14598f $r1 = C14598f.f32351c;
        android.content.Context $r2 = $r1.getContext();
        SharedPreferences $r3 = $r2.getSharedPreferences("SMART_LOOK_SDK", 0);
        Log_OC.loadImage($r3, "ContextExtractorUtil.app…ME, Context.MODE_PRIVATE)");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m691a() {
        String $r1 = toString("SDK_FRAMEWORK_PLUGIN_VERSION");
        return $r1;
    }

    /* renamed from: a */
    public final void m690a(String str) {
        remove(str, "SDK_FRAMEWORK");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public Object add(String str, MenuItem menuItem) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(menuItem, "deserializable");
        C14608i $r3 = C14608i.f32364b;
        SharedPreferences $r4 = get();
        String $r2 = $r4.getString(str, "");
        Object $r5 = $r3.m1083a($r2, menuItem);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void add(long j, String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putLong(str, j).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void add(Object obj, String str) {
        Log_OC.getArray(obj, TransactionBreakDownItemType.DATA);
        Log_OC.getArray(str, "key");
        SharedPreferences $r4 = get();
        SharedPreferences.Editor $r5 = $r4.edit();
        C14608i $r2 = C14608i.f32364b;
        String $r6 = $r2.get(obj);
        $r5.putString(str, $r6).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 != null) goto L5;
     */
    @Override // org.org.org.org.org.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void add(java.util.Map r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "toSave"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            java.lang.String r0 = "key"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            org.org.org.org.asm.menu.f r1 = org.org.org.org.asm.menu.C14607f.f32363c
            org.json.JSONObject r2 = r1.getEntry(r6)
            if (r2 == 0) goto L1a
            java.lang.String r3 = r2.toString()
            r4 = r3
            if (r3 == 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r4 = ""
        L1c:
            java.lang.String r0 = "JsonUtil.mapToJSONObject(toSave)?.toString() ?: \"\""
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
            r5.remove(r4, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.C14705f.add(java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final byte m689b() {
        Integer $r1 = get("EVENT_TRACKING_MODE");
        if ($r1 != null) {
            int $i0 = $r1.intValue();
            byte $b1 = (byte) $i0;
            return $b1;
        }
        EventTrackingMode $r2 = EventTrackingMode.FULL_TRACKING;
        byte $b12 = $r2.getCode();
        return $b12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final String m688c() {
        String $r1 = toString("SDK_FRAMEWORK");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void clear() {
        SharedPreferences $r1 = get();
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.clear().apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void clear(String... strArr) {
        Log_OC.getArray(strArr, "keys");
        SharedPreferences $r3 = get();
        SharedPreferences.Editor $r4 = $r3.edit();
        for (String $r2 : strArr) {
            $r4.remove($r2);
        }
        $r4.apply();
    }

    /* renamed from: d */
    public final void m687d(String str) {
        remove(str, "SDK_FRAMEWORK_PLUGIN_VERSION");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m686e() {
        String $r1 = toString("SDK_FRAMEWORK_VERSION");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public int get(String str, int i) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        int $i0 = $r2.getInt(str, i);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public long get(String str, long j) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        long $l0 = $r2.getLong(str, j);
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public Integer get(String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        int $i0 = $r2.getInt(str, -1);
        if ($i0 == -1) {
            return null;
        }
        Integer $r3 = Integer.valueOf($i0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public boolean get(String str, boolean z) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        boolean $z0 = $r2.getBoolean(str, z);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public String getProperty(String str, String str2) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(str2, "default");
        SharedPreferences $r3 = get();
        String $r2 = $r3.getString(str, str2);
        Log_OC.append($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Long getValue(String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        long $l0 = $r2.getLong(str, -1L);
        if ($l0 == -1) {
            return null;
        }
        Long $r3 = Long.valueOf($l0);
        return $r3;
    }

    /* renamed from: l */
    public final void m685l(String str) {
        remove(str, "SDK_FRAMEWORK_VERSION");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0022 */
    @Override // org.org.org.org.org.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map load(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r10 = r9.toString(r10)
            if (r10 == 0) goto L3f
            r1.<init>(r10)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r3 = r1.keys()
            java.lang.String r0 = "json.keys()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r3, r0)
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3e
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r10 = r6
            java.lang.String r0 = "key"
            kotlin.p483e0.p485d.Log_OC.loadImage(r10, r0)
            java.lang.String r7 = r1.getString(r10)
            java.lang.String r0 = "json.getString(key)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r0)
            r2.put(r10, r7)
            goto L1e
        L3e:
            return r2
        L3f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.C14705f.load(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void remove(int i, String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putInt(str, i).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void remove(String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.remove(str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void remove(String str, String str2) {
        Log_OC.getArray(str2, "key");
        SharedPreferences $r3 = get();
        SharedPreferences.Editor $r4 = $r3.edit();
        $r4.putString(str2, str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public void remove(boolean z, String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putBoolean(str, z).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.Context
    public String toString(String str) {
        Log_OC.getArray(str, "key");
        SharedPreferences $r2 = get();
        String $r1 = $r2.getString(str, null);
        return $r1;
    }
}
